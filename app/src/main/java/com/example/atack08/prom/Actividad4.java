package com.example.atack08.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Actividad4 extends AppCompatActivity {

    private EditText num,letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        num = (EditText)findViewById(R.id.textoNumeroDni);
        letra = (EditText) findViewById(R.id.textoLetraDni);
    }

    public void validar(View v){
        String dni = num.getText().toString();
        String letraIntroducida = letra.getText().toString();
        Toast.makeText(this, dni + "-" + letraIntroducida, Toast.LENGTH_SHORT).show();

        if(dni.length()!=8)
            Toast.makeText(this, "Formato de DNI incorrecto", Toast.LENGTH_SHORT).show();
        else {

            String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
            int modulo = Integer.parseInt(dni);
            char letra = juegoCaracteres.charAt(modulo % 23);
  
            if (letraIntroducida.equalsIgnoreCase(String.valueOf(letra)))
                Toast.makeText(this, "DNI CORRECTO", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Letra incorrecta, letra correcta " + letra, Toast.LENGTH_SHORT).show();
        }
    }
}

