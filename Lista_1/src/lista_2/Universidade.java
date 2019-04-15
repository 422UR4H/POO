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
public class Universidade {
    String nome;
    Departamento departamento;
    
    public Universidade(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
