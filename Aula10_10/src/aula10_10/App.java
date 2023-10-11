/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_10;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static FigurasGeometricas le(int i){
        Scanner s = new Scanner(System.in);
        
        switch(i){
            case 1:
                System.out.print("Informe a coordenada xc: ");
                double xc = s.nextDouble();
                System.out.print("Informe a coordenada yc: ");
                double yc = s.nextDouble();
                System.out.print("Informe o raio: ");
                double raio = s.nextDouble();
                
                 FigurasGeometricas circulo =  new FigurasGeometricas(xc, yc, raio);
                 return circulo;
                 
                 
            case 2:
                System.out.println("Informe a base: ");
                double base = s.nextDouble();
                System.out.println("Informe a altura: ");
                double altura = s.nextDouble();
                
                FigurasGeometricas triangulo = new FigurasGeometricas(base, altura);
                return triangulo;
                
            case 3:
                System.out.println("Informe o lado: ");
                double lado = s.nextDouble();
                FigurasGeometricas quadrado = new FigurasGeometricas(lado);
                return quadrado;
                
                default:
            System.out.println("Opção inválida.");
            return null;
        } 
    }
    
    public static void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("          $$------Menu------$$");
        System.out.println("1-Circulo --- 2-Triangulo --- 3-Quadrado --- 4-Sair");
        int i = s.nextInt();
        
        while (i != 4){
            switch(i){
            case 1:
                FigurasGeometricas circulo = le(i);
                 System.out.println("                  ---Menu Circulo---");
                System.out.println("1-Exibir Circulo --- 2-Area Circulo --- 3-Voltar");
                int menCirculo = s.nextInt();
                
                while(menCirculo != 3){
                    switch(menCirculo){
                        case 1:
                            System.out.println(circulo.exibeCirculo());
                            break;
                        
                        case 2:
                            System.out.printf("Area: %.2f\n", circulo.areaCirculo());
                            break;    
                    }
                    System.out.println("                  ---Menu Circulo---");
                    System.out.println("1-Exibir Circulo --- 2-Area Circulo --- 3-Voltar");
                    menCirculo = s.nextInt();
                } break;
                
                case 2:
                FigurasGeometricas triangulo = le(i);
                System.out.println("                    ---Menu Triangulo---");
                System.out.println("1-Exibir Triangulo --- 2-Area Triangulo --- 3-Voltar");
                int menTriangulo = s.nextInt();
                
                while(menTriangulo != 3){
                    switch(menTriangulo){
                        case 1:
                            System.out.println(triangulo.exibeTriangulo());
                            break;
                        
                        case 2:
                            System.out.printf("Area: %.2f\n", triangulo.areaTriangulo());
                            break;    
                    }
                    
                System.out.println("                    ---Menu Triangulo---");
                System.out.println("1-Exibir Triangulo --- 2-Area Triangulo --- 3-Voltar");
                menTriangulo = s.nextInt();
                }
                break;
                
                case 3:
                FigurasGeometricas quadrado = le(i);
                System.out.println("              ---Menu Quadrado---");
                System.out.println("1-Exibir Quadrado --- 2-Area Quadrado --- 3-Voltar");
                int menQuadrado = s.nextInt();
                
                while(menQuadrado != 3){
                    switch(menQuadrado){
                        case 1:
                            System.out.println(quadrado.exibeQuadrado());
                            break;
                        
                        case 2:
                            System.out.printf("Area: %.2f\n", quadrado.areaQuadrado());
                            break;    
                    }
                    
                System.out.println("              ---Menu Quadrado---");
                System.out.println("1-Exibir Quadrado --- 2-Area Quadrado --- 3-Voltar");
                menQuadrado = s.nextInt();
                }
                 break;
                
        }
           
            
        System.out.println("          $$------Menu------$$");
        System.out.println("1-Circulo --- 2-Triangulo --- 3-Quadrado --- 4-Sair");
        i = s.nextInt();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
}
