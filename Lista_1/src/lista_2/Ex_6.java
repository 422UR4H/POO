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
public class Ex_6 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato contato = new Contato();
        
        contato.setNome("Claudio");
        contato.setNumero("+55 (21) 99191-7180");
        agenda.contatos.put(contato.getNome(), contato);
        
        System.out.println(agenda.contatos.get(contato.getNome()).getNome());
        System.out.println(agenda.contatos.get(contato.getNome()).getNumero());
    }
}
