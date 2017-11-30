package com.example.cristobal.microcuentoslista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LeeCuentoActivity extends AppCompatActivity {

    String titulo;
    String texto;
    TextView titu;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lee_cuento);
        titulo = getIntent().getStringExtra("Titulo");
        texto = getIntent().getStringExtra("Texto");
        titu = (TextView) findViewById(R.id.idTituloFinal);
        text = (TextView) findViewById(R.id.idTextoFinal);
        String nombreTitular = getIntent().getStringExtra("NombreTitular");
        titu.setText(titulo);
        text.setText(String.format(texto,nombreTitular));

    }
}
