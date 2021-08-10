package com.example.amst4;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.maquinaT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMaquina();
            }
        });
        findViewById(R.id.vuelta_mundo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarVuelta_mundo();
            }
        });
    }
    private void mostrarMaquina(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        builder.setTitle("Descripción");
        builder.setMessage("El autor narra la historia de cómo un científico de finales del siglo XIX" +
                " viajó a través del tiempo con la intención de conocer el futuro de la humanidad," +
                " se desplazó hasta el año 802701, pero lejos de encontrar una sociedad en la plenitud " +
                "de su desarrollo, ve un mundo en decadencia habitado en su superficie por unos seres " +
                "hedonistas, los Eloi, sin escritura, ni inteligencia ni fuerza física.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setCancelable(false)
                .show();
    }
    private void mostrarVuelta_mundo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        builder.setTitle("Descripción");
        builder.setMessage("El señor Phileas Fogg, un misterioso y solitario caballero inglés, " +
                "abandonará su vida disciplinada para cumplir una apuesta con los miembros del Reform " +
                "Club, en la que arriesgará una parte de su fortuna comprometiéndose a dar la vuelta" +
                " al mundo en ochenta días utilizando los medios disponibles en la época")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setCancelable(false)
                .show();
    }

}