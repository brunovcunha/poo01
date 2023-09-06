/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        Circulo raio = new Circulo();
        Cilindro cilindro = new Cilindro();

        System.out.println("----Menu:----\n" + "Digite  1-Circulo 2-Cilindro 3-SAIR");
        int opcao = s.nextInt();

        while (opcao == 1 || opcao == 2);
        switch (opcao) {
            case 1:
                System.out.println("----Menu Circulo----");
                System.out.println(" 1-Dados do Circulo\n 2-Área do Circulo\n 3-Comprimento do Circulo\n 4-VOLTAR");
                int menuCilindro = s.nextInt();
                switch(menuCilindro){
                    case 1:
                        String cilindro = cilindro
                        System.out.println(exibeTexto());
        }
    }

    public static double leCoordenada(int n) {
        Scanner s = new Scanner(System.in);
        Circulo raio = new Circulo();
        double coordenada = 0.0;
        switch (n){
            case 1:
                coordenada = raio.xc;
                break;
            case 2:
                coordenada = raio.yc;
                break;
        }
        return coordenada;
    }

    public static double leRaio() {
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();
        return raio;
    }

    public static double leAltura() {
        Scanner s = new Scanner(System.in);
        double altura = s.nextDouble();
        return altura;
    }

    public static void exibeTexto(String geo) {
        Circulo raio = new Circulo();
        Cilindro cilindro = new Cilindro();
         switch(geo){
           case "circulo":
           System.out.println(raio.exibeCirculo());
           break;
           case "cilindro":
           System.out.println(cilindro.exibeCilindro());
           break;
    }
}

