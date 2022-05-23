package br.edu.iftm.poo.calculadora.classes;

public class CalculadoraBasica extends Calculadora{
    @Override

    public int somar(int valorA, int valorB) {
        return valorA + valorB;
    }

    @Override
    public int subtrair(int valorA, int valorB) {
        return valorA - valorB;
    }

    @Override
    public int multiplicar(int valorA, int valorB) {
        return valorA * valorB;
    }

    @Override
    public double dividir(int valorA, int valorB) {
        return (double) valorA / valorB;
    }
}
