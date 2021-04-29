package com.TUPB.imc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private EditText altura;
    private EditText peso;
    private TextView resultado;
    private TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        altura = findViewById(R.id.editaltura);
        peso = findViewById(R.id.editpeso);
        resultado = findViewById(R.id.textresultado);
        resultado2 = findViewById(R.id.textresultado2);
    }
    public void CalcularIMC (View view){
        Double res = Double.parseDouble(peso.getText().toString()) / (Double.parseDouble(altura.getText().toString()) * Double.parseDouble(altura.getText().toString()));
        resultado.setText(Math.round(res*100.0)/100.0+"");
        if(res<18.5){
            resultado2.setText("Bajo en peso");
        }else{
            if(res<25){
                resultado2.setText("Peso Normal");
            }else{
                if(res<30){
                    resultado2.setText("Sobre peso");
                }else{
                    resultado2.setText("Obesidad");

                }

            }
        }
    }

    public void InFlecha(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}