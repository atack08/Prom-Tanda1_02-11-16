package com.example.atack08.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Actividad5 extends AppCompatActivity implements Button.OnClickListener{

    private ImageView imagen;
    private Button boton3,boton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad5);
        imagen = (ImageView) findViewById(R.id.imagenBuscador);
        boton3 = (Button)findViewById(R.id.botonGoogle);
        boton3.setOnClickListener(this);

        boton2 = (Button)findViewById(R.id.botonBing);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen.setImageResource(R.drawable.bin_logo);
                mostrarInfo("Bing seleccionado");
            }
        });
    }

    public void irayahoo(View v){
        imagen.setImageResource(R.drawable.yahoo);
        mostrarInfo("Yahoo seleccionado");

    }

    public void mostrarInfo(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == findViewById(R.id.botonGoogle).getId()){
            imagen.setImageResource(R.drawable.google);
            mostrarInfo("Google seleccionado");
        }
    }
}
