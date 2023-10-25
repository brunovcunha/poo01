/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24_10;

/**
 *
 * @author aluno
 */
public class FichaPessoal {

    /**
     * @return the quantidade
     */
    
    
    private String nome;
    private int idade;
    private static int quantidade;

    public FichaPessoal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int aQuantidade) {
        quantidade = aQuantidade;
    }
    
}
