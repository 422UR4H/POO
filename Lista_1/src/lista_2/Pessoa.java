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
public class Pessoa {
    String nome;
    Universidade universidade;
    Departamento departamento;
    
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void imprimirPerfil() {
        System.out.println("Nome: " + nome +
                "; Universidade " + universidade.getNome());
    }
}
