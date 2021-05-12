package com.example.myapplication;

import android.widget.Toast;

public class CalculoSalario {
    public double novoSalario(double salario) {
        double aumento = (salario * 5)/100;
        salario += aumento;
        double desconto = (salario * 7)/100;
        salario -= desconto;
        return salario;
    }
}
