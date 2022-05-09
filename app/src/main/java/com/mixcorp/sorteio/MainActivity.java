package com.mixcorp.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view){

        TextView numeroSorteado = findViewById(R.id.numero);
        int saida = new Random().nextInt(10);
        numeroSorteado.setText("Número: " + saida);
    }
}
