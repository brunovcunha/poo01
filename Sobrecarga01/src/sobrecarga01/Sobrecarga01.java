/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Sobrecarga01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        Dados1 dados = new Dados1(s.nextInt(), s.nextInt());
        int a = dados.getA();
        int b = dados.getB();
        Adicao1 exibe = new Adicao1();
        int soma = exibe.addInt(a, b);
        System.out.println(exibe.exibeInt(a, b, soma));


        dados = new Dados1(s.nextFloat(), s.nextFloat());
        float c = dados.getC(), d = dados.getD();
        
        float somaF = exibe.addFloat(c, d);
        System.out.println(exibe.exibeFloat(c, d, somaF));

    }

}

//Ler 2 números inteiros, soma-lôs e exibir os resultados.
// A leitura será feita para que ocorra a instanciação da classe Dados1.
        // A soma e a exibição serão feitas por meio da instanciação da classe Adicao1.
