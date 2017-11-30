package com.example.cristobal.microcuentoslista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnEmpezar;
    String mensaToastNombreVacio;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEmpezar = (Button) findViewById(R.id.btnEmpezar);
        mensaToastNombreVacio = getResources().getString(R.string.toastNombreVacio);
        nombre = (EditText) findViewById(R.id.introNombre);

    }

    public void empezar(View view){
        String name = nombre.getText().toString();
        if(name.length() == 0){
            Toast toast = Toast.makeText(getApplicationContext(),
                    mensaToastNombreVacio, Toast.LENGTH_LONG);
            toast.show();
        } else {
            Intent intent = new Intent(this, EligeCuentoActivity.class);
            intent.putExtra("NombreTitular", name);
            startActivity(intent);
        }

    }
}
