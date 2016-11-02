package com.example.atack08.prom;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    private LinearLayout fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        fondo = (LinearLayout)findViewById(R.id.layout_actividad3);
    }

    public void fondoAmarillo(View v){

        fondo.setBackgroundColor(Color.YELLOW);
        Toast.makeText(this, "FONDO CAMBIADO", Toast.LENGTH_SHORT).show();
    }

    public void fondoGris(View v){
        fondo.setBackgroundColor(Color.GRAY);
        Toast.makeText(this, "FONDO CAMBIADO", Toast.LENGTH_SHORT).show();
    }
}
