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
public class Ex_6 {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count++;
            if (e1.count < 5) {
                e2.count++;
            }
            if (x < 3) {
                e2.count += e1.count;
            }
            x++;
        }
        System.out.println(e2.count);
    }
}
