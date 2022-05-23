package br.edu.iftm.poo.calculadora.testes;

import br.edu.iftm.poo.calculadora.classes.Calculadora;
import br.edu.iftm.poo.calculadora.classes.CalculadoraBasica;
import br.edu.iftm.poo.calculadora.classes.CalculadoraEstatica;

public class CalculadoraTeste {

    public static void main(String[] args) {
        //polimorfismo
//        Calculadora c = new CalculadoraBasica();
        int x = 10;
        int y = 5;
//        System.out.printf("\n %d + %d = %d \n",x, y, c.somar(x,y));
//        System.out.printf("\n %d - %d = %d \n",x, y, c.subtrair(x,y));
//        System.out.printf("\n %d * %d = %d \n",x, y, c.multiplicar(x,y));
//        System.out.printf("\n %d / %d = %.4f \n",x, y, c.dividir(x,y));

        System.out.printf("\n %d + %d = %d \n",x, y, CalculadoraEstatica.somar(x,y));
        System.out.printf("\n %d - %d = %d \n",x, y, CalculadoraEstatica.subtrair(x,y));
        System.out.printf("\n %d * %d = %d \n",x, y, CalculadoraEstatica.multiplicar(x,y));
        System.out.printf("\n %d / %d = %.4f \n",x, y, CalculadoraEstatica.dividir(x,y));



    }
}
