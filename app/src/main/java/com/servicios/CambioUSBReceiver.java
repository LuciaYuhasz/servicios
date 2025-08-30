package com.servicios;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CambioUSBReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean usbConctado = intent.getBooleanExtra("connected", false);
        if (usbConctado) {


            Toast.makeText(context, "El usb se conecto", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "El usb se desconecto", Toast.LENGTH_LONG).show();
        }
    }
}