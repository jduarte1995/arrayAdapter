package com.example.jess.listview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     titular[] datos =
            new titular[]{
                    new titular("Bolis", "Esto es un Boli", "boli"),
                    new titular("Lapiz", "Esto es un Lapiz", "lapiz"),
                    new titular("Rotuladores", "Esto es un Rotulador","rotulador"),
                    new titular("Tijeras", "Esto es una Tijera","tijeras"),
                    new titular("Goma", "Esto es una Goma","goma")
            };

    AdaptadorTitulares adaptador = new AdaptadorTitulares(this, datos);



    ListView lstOpciones = (ListView) findViewById(R.id.LstOpciones);

    lstOpciones.setAdapter(adaptador);
        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                titular t = (titular) parent.getAdapter().getItem(position);
                Context c = getApplicationContext();
                CharSequence text = t.getTitulo();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(c,t,duration);
                toast.show();
            }
        });
}
}
