package com.example.aplicacionmaestroclientes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnEnviar;
    private EditText etRut, etNombre, etApellido, etFecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.vTyc);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        referencias();
        eventos();
    }

    public void eventos(){
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rut, nombre, apellido, fecha;
                rut = etRut.getText().toString();
                nombre = etNombre.getText().toString();
                apellido = etApellido.getText().toString();
                fecha = etFecha.getText().toString();

                Intent i = new Intent(MainActivity.this, MostrarActivity.class);
                i.putExtra("elrut", rut);
                i.putExtra("elnombre", nombre);
                i.putExtra("elapellido", apellido);
                i.putExtra("lafecha", fecha);
                startActivity(i);
            }
        });



    }
    public void Cerrar (View view){
        finishAffinity();
    }
    public void referencias(){
        btnEnviar = findViewById(R.id.btnEnviar);
        etRut = findViewById(R.id.etRut);
        etNombre = findViewById(R.id.eNombre);
        etApellido = findViewById(R.id.etApellido);
        etFecha = findViewById(R.id.etFecha);
    }
}