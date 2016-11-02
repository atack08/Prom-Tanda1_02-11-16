package com.example.atack08.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button botonActividad1,botonActividad2,botonActividad3,botonActividad4
            ,botonActividad5,botonActividad6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonActividad1 = (Button) findViewById(R.id.botonActividad1);
        botonActividad2 = (Button) findViewById(R.id.botonActividad2);
        botonActividad3 = (Button) findViewById(R.id.botonActividad3);
        botonActividad4 = (Button) findViewById(R.id.botonActividad4);
        botonActividad5 = (Button) findViewById(R.id.botonActividad5);
        botonActividad6 = (Button) findViewById(R.id.botonActividad6);

        botonActividad1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent = new Intent(MainActivity.this,Actividad1.class);
                //Bundle b = new Bundle();
                startActivity(intent);
                /*b.putString("NOMBRE", txtNombre.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
                if(visible){
                    txtNombre.setVisibility(View.INVISIBLE);
                    visible = false;
                }
                else{
                    txtNombre.setVisibility(View.VISIBLE);
                    visible = true;
                }
                */
            }

        });

        botonActividad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Actividad2.class);
                startActivity(intent);
            }
        });

        botonActividad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Actividad3.class);
                startActivity(intent);
            }
        });

        botonActividad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Actividad4.class);
                startActivity(intent);
            }
        });

        botonActividad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Actividad5.class);
                startActivity(intent);
            }
        });

        botonActividad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Actividad6.class);
                startActivity(intent);
            }
        });

    }
}
