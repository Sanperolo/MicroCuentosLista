package com.example.cristobal.microcuentoslista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cristobal on 29/11/2017.
 */



public class CuentoApapter extends BaseAdapter {

    private ArrayList<Cuento> lista;
    private int idView;
    private Context contexto;

    public CuentoApapter(ArrayList<Cuento> lista, int idView, Context contexto) {
        this.lista = lista;
        this.idView = idView;
        this.contexto = contexto;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //Esta clase se crea!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private class Item {
        TextView textoTitulo;
        TextView textoAvance;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item cuento;
        if (convertView == null) {
            convertView = LayoutInflater.from(contexto).inflate(idView, null);
            cuento = new Item();
            cuento.textoTitulo = (TextView) convertView.findViewById(R.id.idTitulo);
            cuento.textoAvance = (TextView) convertView.findViewById(R.id.idAvence);
            convertView.setTag(cuento);
        } else {
            cuento = (Item) convertView.getTag();
        }
            cuento.textoTitulo.setText(lista.get(position).getTitulo());
            cuento.textoAvance.setText(lista.get(position).getAvance());
            return convertView;
        }
    }
