package com.example.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros= getIntent().getExtras();
        String nombre=parametros.getString(getResources().getString(R.string.pnombre));
        String telefono=parametros.getString(getResources().getString(R.string.ptelefono));
        String email=parametros.getString(getResources().getString(R.string.pemail));

        TextView tvNombre= findViewById(R.id.tvNombre);
        TextView tvTelefono= findViewById(R.id.tvTelefono);
        TextView tvEmail= findViewById(R.id.tvEmail);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);


    }
}
