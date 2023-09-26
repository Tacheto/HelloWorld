package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Sergio Silva Ortega
 * @version 1.0
 * <ul>Aplicacion que muestra el tipico ejemplo de Hola Mundo</ul>
 * <ol>
 *    <ul>Hemos visto como se crean los recursos en XML</ul>
 *    <ul>Hemos intanciado en Java un objeto TextView</ul>
 *     <ul>Se ha personalizado la imagen de la aplicacion</ul>
 * </ol>
 */
//TODO


public class MainActivity extends AppCompatActivity {

    private TextView tvMessageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvMessageStart = findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.white));
        tvMessageEnd.setText(R.string.messageOptimist);
        tvMessageEnd.setTextColor(getColor(R.color.black));
    }

}