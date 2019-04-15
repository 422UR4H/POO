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
public class Ex_5 {
    public static void main(String[] args) {
        // parte 1
        Pessoa pessoa = new Pessoa("Claudio");
        Universidade universidade = new Universidade("UFF");
        pessoa.universidade = universidade;
        
        System.out.println(pessoa.nome);
        System.out.println(pessoa.universidade.getNome());
        System.out.println(universidade.getNome());
        
        // parte 2
        Departamento departamento = new Departamento();
        departamento.nome = "Civil";
        pessoa.departamento = departamento;
        
        System.out.println(pessoa.departamento.nome);
    }
}
