package com.example.inwentaryzacjakotlin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Sign extends AppCompatActivity {

    TextInputEditText textInputEditFullname, textInputEditUsername,
            textInputEditPassword, textInputEditEmail;
    Button buttonSing;
    TextView textViewLog;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        textInputEditFullname = findViewById(R.id.fullname);
        textInputEditUsername = findViewById(R.id.username);
        textInputEditPassword = findViewById(R.id.password);
        textInputEditEmail = findViewById(R.id.email);
        buttonSing = findViewById(R.id.buttonSignUp);
        textViewLog = findViewById(R.id.loginText);
        progressBar = findViewById(R.id.progress);

        textViewLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Logging.class);
                startActivity(intent);
                finish();
            }
        });

        buttonSing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String fullnameString, usernameString,passwordString,emailString;

                fullnameString = String.valueOf(textInputEditFullname.getText());
                usernameString = String.valueOf(textInputEditUsername.getText());
                passwordString = String.valueOf(textInputEditPassword.getText());
                emailString = String.valueOf(textInputEditEmail.getText());

                if(!fullnameString.equals("") && !usernameString.equals("")
                        && !passwordString.equals("") && !emailString.equals("")) {

                    progressBar.setVisibility(View.VISIBLE);

                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            String[] field = new String[4];
                            field[0] = "fullname";
                            field[1] = "username";
                            field[2] = "password";
                            field[3] = "email";
                            String[] data = new String[4];
                            data[0] = fullnameString;
                            data[1] = usernameString;
                            data[2] = passwordString;
                            data[3] = emailString;
                            PutData putData = new PutData("http://192.168.1.101/LogInSignUp/signup.php",
                                    "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {

                                    String result = putData.getResult();
                                    progressBar.setVisibility(View.GONE);
                                    // porównuje echo z PHP
                                    if(result.equals("Konto zalozone")){
                                        // Wyświetlenie dymku z echo PHP po udanym założeniu konta
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                                        Intent intent = new Intent(getApplicationContext(), Logging.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                    else {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        }
                    });
                }
                else  {
                    Toast.makeText(getApplicationContext(), "Wszystkie pola wymagane", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}