package com.example.atack08.prom;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PruebasBotones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas_botones);

        FloatingActionButton fabButton = (FloatingActionButton)findViewById(R.id.btnFlotante);
        fabButton.setBackgroundTintList(getResources().getColorStateList(R.color.fab_color));
    }


}
