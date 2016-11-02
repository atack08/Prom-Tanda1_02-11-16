package com.example.atack08.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    private EditText num1,num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        num1 = (EditText)findViewById(R.id.textoNum1A1);
        num2 = (EditText)findViewById(R.id.textoNum2A1);
        resultado = (TextView)findViewById(R.id.labelResultado);


    }

       public void sumar(View v){
        Double n1 = Double.parseDouble(num1.getText().toString());
        Double n2 = Double.parseDouble(num2.getText().toString());

        resultado.setText("LA SUMA ES " + (n1+n2));
        Toast.makeText(this, "Operación realizada", Toast.LENGTH_SHORT).show();

    }
}
