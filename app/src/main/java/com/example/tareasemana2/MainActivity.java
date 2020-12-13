package com.example.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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




    }
}
