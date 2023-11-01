/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula31_10;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static double leCoordenada(int n) {
        Scanner s = new Scanner(System.in);
        double x1, x2, y1, y2;
        if (n == 1) {
            System.out.println("x1");
            return x1 = s.nextDouble();

        } else if (n == 2) {
            System.out.println("x2");
            return x2 = s.nextDouble();
        } else if (n == 3) {
            System.out.println("y1");
            return y1 = s.nextDouble();
        } else {
            System.out.println("x2");
            return y2 = s.nextDouble();
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double x1, x2, y1, y2;
        
        String menu = "s";


        while (menu.equals("s")) {
            x1 = leCoordenada(1);
            x2 = leCoordenada(2);
            y1 = leCoordenada(3);
            y2 = leCoordenada(4);
           

            
            
            if(Validacao.valida(x1, x2, y1, y2) == true){
                Retas reta = new Retas(x1, x2, y1, y2);
               System.out.println(reta.exibe());
                System.out.println("Você tem " + Retas.cont + " reta(s)");
            } else{
                System.out.println("Sua reta é torta animal");
                System.out.println("Você tem " + Retas.cont + " reta(s)");
            }
            
            System.out.println("");
            System.out.println("Informar nova reta? s/n");
            menu = s.nextLine();
        }

    }

}
