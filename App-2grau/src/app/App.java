package app;

import java.util.Scanner;

public class App {

    public static double le(int n) {
        Scanner s = new Scanner(System.in);
        double valor = 0.0;

        switch (n) {
            case 1:
                System.out.print("Digite o valor de 'a': ");
                valor = s.nextDouble();
                break;
            case 2:
                System.out.print("Digite o valor de 'b': ");
                valor = s.nextDouble();
                break;
            case 3:
                System.out.print("Digite o valor de 'c': ");
                valor = s.nextDouble();
                break;
        }
        
        return valor; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EGrau2 equacao = new EGrau2();

        System.out.println("Para realizar uma equação do 2° grau digite 1, para encerrar digite 2");
        int cont = s.nextInt();

        while (cont == 1) {
            equacao.a = le(1); 
            while(equacao.a == 0){
                equacao.a = le(1); 
            }
            equacao.b = le(2); 
            equacao.c = le(3); 

            double delta = equacao.delta();

            if (delta > 0) {
                equacao.exibe(equacao.calculaX1(delta), equacao.calculaX2(delta));
                System.out.println(equacao.exibe(equacao.calculaX1(delta), equacao.calculaX2(delta)));
            } else if (delta == 0) {
                System.out.println("A equação tem uma raiz real: x = " + equacao.calculaX1(delta));
                break;
            } else {
                System.out.println("A equação não tem solução real.");
            }

            System.out.println("Para realizar uma equação do 2° grau digite 1, para encerrar digite 2");
            cont = s.nextInt();
        }

        System.out.println("Programa encerrado.");
    }
}
