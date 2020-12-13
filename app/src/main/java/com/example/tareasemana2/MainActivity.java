package com.example.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contactos> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos = new ArrayList<Contactos>();

        contactos.add(new Contactos("Mateo Gomez", "2435678", "mateo@hotmail.com"));
        contactos.add(new Contactos("Luis Gonzales", "4356789", "luis@hotmail.com"));
        contactos.add(new Contactos("Pedro Ospina", "2343245", "pedro@hotmail.com"));

        ArrayList<String> nombresContacto=new ArrayList<>();
        for (Contactos contacto: contactos) {

            nombresContacto.add(contacto.getNombre());
            
        }
        
        ListView lstContactos=  findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(position).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), contactos.get(position).getEmail());



                startActivity(intent);
            }
        });



    }
}
