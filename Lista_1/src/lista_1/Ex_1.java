/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_1;

/**
 *
 * @author 422UR4H
 */
public class Ex_1 {
    //A. Imprima todos os números de 150 a 300.
    public void imprimirSequencia() {
        for (int i = 150; i < 301; i++){
            System.out.println(i);
        }
    }
     
    //B. Imprima a soma de 1 até 1000.
    public void imprimirSomatorio() {
        int soma = 0;
        for (int i = 1; i < 1001; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
    
    //C. Imprima todos os múltiplos de 3, entre 1 a 100.
    public void imprimirMultiplo() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    
    //D. Imprima os fatoriais de 0 a 10. O fatorial de n é n ∙ (n − 1) ∙ (n − 2) ∙ 1. O
    public void imprimirFatoriais() {
        for (int i = 0; i < 11; i++) {
            int fat = 1;
            for (int j = 2; j <= i; j++) {
                fat *= j;
            }
            System.out.println(fat);
        }
    }
    //E. No código do exercício anterior, aumente a quantidade de números que terão os
    //fatoriais impressos até 20, 30, 40. Em um determinado momento, além desse
    //cálculo demorar, vai começar a mostrar respostas completamente erradas. Por
    //quê? Procure modificar de int para long para ver alguma mudança.
    public void imprimirMuitosFatoriais() {
        for (int i = 0; i < 31; i++) {
            int fat = 1;
            long fat2 = 1;
            for (int j = 2; j <= i; j++) {
                fat *= j;
                fat2 *= j;
            }
            System.out.println(i + ":" + fat);
            System.out.println(i + ":" + fat2);
        }
    }
    
    //F. Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
    //Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro
    //elemento é 0, o segundo é 1, o n-ésimo é (𝑛 − 1) somado ao (𝑛 − 2). Por
    public void imprimirFibonacci(int n) {
        int x = 0;
        int y = 1;
        int z = 1;
        if (n < 1) {
            System.out.println("Não existem termos menores que o primeiro!");
        } else if (n == 1) {
            System.out.println(x);
        }
        for (int i = 3; i <= n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println(z);
    }
    
    //G. Escreva um programa que, dada uma variável x com algum valor inteiro, temos
    //um novo x de acordo com a seguinte regra:
    //• Se x é par, x = x / 2
    //• Se x é impar, x = 3 * x + 1
    //• Imprime x
    //• O programa deve parar quando x tiver o valor final de 1.
    public void imprimirX(int x) {
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.println(x);
        }
    }
}
