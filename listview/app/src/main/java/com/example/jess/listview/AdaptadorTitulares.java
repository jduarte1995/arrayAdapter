package com.example.jess.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jesús on 21/12/2016.
 */

class AdaptadorTitulares extends ArrayAdapter<titular> {

    titular[] datos;

    public AdaptadorTitulares(Context context, titular[] datos) {
        super(context, R.layout.listitem_titular, datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listitem_titular, null);

        TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(datos[position].getTitulo());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(datos[position].getSubtitulo());

        ImageView img = (ImageView) item.findViewById(R.id.img);

        switch (datos[position].getFoto()){
            case "boli":
                img.setImageResource(R.drawable.boli);
                break;
            case "lapiz":
                img.setImageResource(R.drawable.lapiz);
                break;
            case "rotulador":
                img.setImageResource(R.drawable.rotulador);
                break;
            case "tijeras":
                img.setImageResource(R.drawable.tijeras);
                break;
            case "goma":
                img.setImageResource(R.drawable.goma);
                break;

        }

        return(item);
    }
}