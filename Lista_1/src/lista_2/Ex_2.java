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
public class Ex_2 {
    public String inverterString(String linha) {
        String invertida = new String();
        for (int i = linha.length(); i >= 0; i++) {
            invertida += linha.charAt(i);
        }
        return invertida;
    }
}
