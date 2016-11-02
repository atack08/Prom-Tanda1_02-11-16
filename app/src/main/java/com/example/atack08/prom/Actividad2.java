package com.example.atack08.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    private EditText num1,num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        num1 = (EditText)findViewById(R.id.t1A2);
        num2 = (EditText)findViewById(R.id.t2A2);
        resultado = (TextView)findViewById(R.id.result2);

    }

    public void sumar2(View v){

        Double n1 = Double.parseDouble(num1.getText().toString());
        Double n2 = Double.parseDouble(num2.getText().toString());

        resultado.setText("Resultado: " + String.valueOf(n1+n2));
        Toast.makeText(this, "Suma realizada", Toast.LENGTH_SHORT).show();

    }

    public void restar2(View v){
        Double n1 = Double.parseDouble(num1.getText().toString());
        Double n2 = Double.parseDouble(num2.getText().toString());

        resultado.setText("Resultado: " + String.valueOf(n1-n2));
        Toast.makeText(this, "Resta realizada", Toast.LENGTH_SHORT).show();
    }

    public void multiplicar2(View v){
        Double n1 = Double.parseDouble(num1.getText().toString());
        Double n2 = Double.parseDouble(num2.getText().toString());

        resultado.setText("Resultado: " + String.valueOf(n1*n2));
        Toast.makeText(this, "Multiplicación realizada", Toast.LENGTH_SHORT).show();
    }

    public void dividir2(View v){

        Double n1 = Double.parseDouble(num1.getText().toString());
        Double n2 = Double.parseDouble(num2.getText().toString());

        resultado.setText("Resultado: " + String.valueOf(n1/n2));
        Toast.makeText(this, "División realizada", Toast.LENGTH_SHORT).show();
    }


}
