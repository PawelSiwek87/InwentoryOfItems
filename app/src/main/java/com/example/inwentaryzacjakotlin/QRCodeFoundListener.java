package com.example.inwentaryzacjakotlin;

public interface QRCodeFoundListener {

    void onQRCodeFound(String qrCode);
    void qrCodeNotFound();
}
