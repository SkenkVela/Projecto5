package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button calcularSalario;
    EditText salario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcularSalario = findViewById(R.id.btn_calcularSalario);
        salario = findViewById(R.id.salario);

        calcularSalario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double _salario = Double.parseDouble(salario.getText().toString());
                CalculoSalario calSalario = new CalculoSalario();

                Toast.makeText(MainActivity.this,String.valueOf(calSalario.novoSalario(_salario)),Toast.LENGTH_SHORT).show();
            }
        });
    }
}