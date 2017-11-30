package com.example.cristobal.microcuentoslista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EligeCuentoActivity extends AppCompatActivity {

    ArrayList<Cuento> cuentos = new ArrayList<Cuento>();
    ListView lv;
    TextView textoTitulo;
    TextView textoTexto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elige_cuento);
        lv = findViewById(R.id.lvLista);
        cuentos = new ArrayList<Cuento>();
        cargarCuento();
        CuentoApapter cuentoAdapter = new CuentoApapter(cuentos, R.layout.cuento_item, this);
        lv.setAdapter(cuentoAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int i, long id) {
                textoTitulo = (TextView) findViewById(R.id.idTituloFinal);
                textoTexto = (TextView) findViewById(R.id.idTextoFinal);
                Cuento itemSeleccionado =  (Cuento) adapterView.getItemAtPosition(i);

                Intent intent = new Intent(EligeCuentoActivity.this, LeeCuentoActivity.class);
                intent.putExtra("Titulo", itemSeleccionado.getTitulo());
                intent.putExtra("Texto", itemSeleccionado.getTexto());


                String nombreTitular = getIntent().getStringExtra("NombreTitular");
                intent.putExtra("NombreTitular", nombreTitular);


                startActivity(intent);

            }
        });



    }

    private void cargarCuento() {
        cuentos.add(new Cuento(getString(R.string.NombreVengazaHormiga),
                getString(R.string.IntroVenganzaHormiga),getString(R.string.TextoVenganzaHormiga)));
        cuentos.add(new Cuento(getString(R.string.NombreAmoresFugaces),
                getString(R.string.IntroAmoresFugaces), getString(R.string.TextoAmoresFugaces)));
        cuentos.add(new Cuento(getString(R.string.NombreAmorGriego),
                getString(R.string.IntroAmorGriego),getString(R.string.TextoAmorGriego)));
        cuentos.add(new Cuento(getString(R.string.NombreDeseoCumpleaños),
                getString(R.string.IntroDeseoCumpleaños),getString(R.string.TextoDeseoCumpleaños)));
        cuentos.add(new Cuento(getString(R.string.NombreElDeseoDinosaurio),
                getString(R.string.IntroElDeseoDinosaurio),getString(R.string.TextoDeseoCumpleaños)));
        cuentos.add(new Cuento(getString(R.string.NombreElInviernoEterno),
                getString(R.string.IntroElInviernoEterno),getString(R.string.TextoElInviernoEterno)));
        cuentos.add(new Cuento(getString(R.string.NombreElMochilero),
                getString(R.string.IntroElMochilero),getString(R.string.TextoElMochilero)));
        cuentos.add(new Cuento(getString(R.string.NombreEscritorVampiro),
                getString(R.string.IntroEscritorVampiro),getString(R.string.TextoEscritorVampiro)));
        cuentos.add(new Cuento(getString(R.string.NombreLaNube),
                getString(R.string.IntroLaNube),getString(R.string.TextoLaNube)));
    }
}
