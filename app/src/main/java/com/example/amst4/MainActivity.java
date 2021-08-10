package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ingresar(View view) {
        EditText et1 = (EditText) findViewById(R.id.user);
        EditText et2 = (EditText) findViewById(R.id.clave);
        String nom = et1.getText().toString();
        String matric = et2.getText().toString();
        if(!nom.isEmpty() && !matric.isEmpty()){
            Intent i = new Intent(this, VentanaHome.class );
            i.putExtra("usuario", nom);
            i.putExtra("contraseña", matric);
            startActivity(i);
        }else{
            Toast.makeText(this, "Llene los campos", Toast.LENGTH_SHORT).show();
        }

    }

}