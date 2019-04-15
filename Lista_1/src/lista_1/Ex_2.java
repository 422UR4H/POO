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
public class Ex_2 {
    public void imprimirDivisores(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                System.out.println(i);
            }
        }
        if (primo) {
            System.out.println("O número é primo!");
        }
    }
}
