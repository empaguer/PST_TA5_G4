package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ingresar,registrar;
    EditText usuario,contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar = (Button) findViewById(R.id.buttonIngresar);
        usuario = (EditText) findViewById(R.id.Textusuario);
        contrasena = (EditText) findViewById(R.id.Textcontra);
    }
    public void ingresar (View v){
        String user = usuario.getText().toString();
        String password = contrasena.getText().toString();
        if (user.equals("admin") && password.equals("1234")){
            Intent menu1 = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(menu1);
        }else{
            Toast.makeText(getApplicationContext(),"Usuario o cantraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

}
