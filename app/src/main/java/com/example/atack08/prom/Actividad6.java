package com.example.atack08.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Actividad6 extends AppCompatActivity {

    private Switch switchC1,switchL1;
    private ToggleButton toggleC2, toggleL2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad6);

        switchC1 = (Switch)findViewById(R.id.switchCamara1);
        switchL1 = (Switch)findViewById(R.id.switchLuz1);
        toggleC2 = (ToggleButton)findViewById(R.id.toggleCamara2);
        toggleL2 = (ToggleButton)findViewById(R.id.toggleLuz2);

        switchC1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                ImageView img = (ImageView)findViewById(R.id.imagenCamara1);
                if(switchC1.isChecked()) {
                    img.setVisibility(View.VISIBLE);
                    Toast.makeText(Actividad6.this, "ENCENDIDA CÁMARA 1", Toast.LENGTH_SHORT).show();
                }
                else {
                    img.setVisibility(View.INVISIBLE);
                    Toast.makeText(Actividad6.this, "APAGADA CÁMARA 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        switchL1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                ImageView img = (ImageView)findViewById(R.id.imagenLuz1);
                if(switchL1.isChecked()) {
                    img.setVisibility(View.VISIBLE);
                    Toast.makeText(Actividad6.this, "ENCENDIDA LUZ 1", Toast.LENGTH_SHORT).show();
                }
                else {
                    img.setVisibility(View.INVISIBLE);
                    Toast.makeText(Actividad6.this, "APAGADA LUZ 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toggleC2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                ImageView img = (ImageView)findViewById(R.id.imagenCamara2);
                if(toggleC2.isChecked()) {
                    img.setVisibility(View.VISIBLE);
                    Toast.makeText(Actividad6.this, "ENCENDIDA CÁMARA 2", Toast.LENGTH_SHORT).show();
                }
                else {
                    img.setVisibility(View.INVISIBLE);
                    Toast.makeText(Actividad6.this, "APAGADA CÁMARA 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toggleL2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                ImageView img = (ImageView)findViewById(R.id.imagenLuz2);
                if(toggleL2.isChecked()){
                    img.setVisibility(View.VISIBLE);
                    Toast.makeText(Actividad6.this, "ENCENDIDA LUZ 2", Toast.LENGTH_SHORT).show();
                }
                else{
                    img.setVisibility(View.INVISIBLE);
                    Toast.makeText(Actividad6.this, "APAGADA LUZ 2", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
