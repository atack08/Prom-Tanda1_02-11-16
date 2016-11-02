package com.example.atack08.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PruebaCuadroTexto extends AppCompatActivity {

    private Button boton1;
    private EditText textoACopiar,textoCopiado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_cuadro_texto);

        this.boton1 = (Button) findViewById(R.id.botonCopiarTexto);
        this.textoACopiar = (EditText) findViewById(R.id.introduceTexto);
        this.textoCopiado = (EditText) findViewById(R.id.textoCopiado);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textoCopiado.append(textoACopiar.getText().toString());
                Toast.makeText(PruebaCuadroTexto.this, "Texto Copiado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
