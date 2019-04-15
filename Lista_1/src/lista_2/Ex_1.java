/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_2;

/**
 *
 * @author 422UR4H
 */
public class Ex_1 {
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }
    
    public void imprimirStatus(double p1, double p2) {
        double media = calcularMedia(p1, p2);
        if (media < 4) {
            System.out.println("Reprovado!");
        } else if (media < 6) {
            System.out.println("Verificação Suplementar (VS)!");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
