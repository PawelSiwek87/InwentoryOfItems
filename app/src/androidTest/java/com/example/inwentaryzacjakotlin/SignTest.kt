package com.example.inwentaryzacjakotlin

import androidx.recyclerview.widget.RecyclerView
import org.junit.Before
import android.os.Handler
import android.os.Looper
import android.provider.ContactsContract
import android.util.Log.i
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign.*
import org.w3c.dom.Text
import java.lang.reflect.Type
import java.nio.file.Files.find

import org.junit.Assert.*
import org.junit.Test

class SignTest : AppCompatActivity() {

    val fullname : RecyclerView =  findViewById(R.id.fullname)



    @Before
    fun setUp() {
    }

    @Test
    fun shoutBeOk(){
        fullname.toString().equals("full")
    }
}