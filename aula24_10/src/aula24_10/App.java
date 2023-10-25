/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24_10;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nome;
        int idade;

        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));

        FichaPessoal pessoa1 = new FichaPessoal(nome, idade);

        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade() + 1);
        exibe(pessoa1);

        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));

        FichaPessoal pessoa2 = new FichaPessoal(nome, idade);

        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade() + 1);
        exibe(pessoa2);

    }

    public static void exibe(FichaPessoal ficha) {
        JOptionPane.showMessageDialog(null, "Seu nome é " + ficha.getNome());
        JOptionPane.showMessageDialog(null, "Sua idade é " + ficha.getIdade() + " anos");
        JOptionPane.showMessageDialog(null, "Pessoas cadastradas " + FichaPessoal.getQuantidade());
    }

}
