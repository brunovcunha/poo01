/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_10;

/**
 *
 * @author aluno
 */
public class FigurasGeometricas {
    
    private double xc;
    private double yc;
    private double raio;
    private double base;
    private double altura;
    private double lado;

    public FigurasGeometricas(double xc, double yc, double raio) {
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;
   
    }
    
    public FigurasGeometricas(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public FigurasGeometricas(double lado){
        this.lado = lado;
    }
    
    public double areaQuadrado(){
        return Math.pow(lado, 2);
                
    }
    
    public double areaCirculo(){
        return Math.PI * Math.pow(raio, 2);
    }
    
    public double areaTriangulo(){
        return (base * altura) / 2;
    }
    
    public String exibeQuadrado(){
        return "Lado:" + lado;
    }
    
     public String exibeCirculo(){
        return "xc: " + xc + "\nyc: " + yc + "\nraio: " + raio;
    }
     
      public String exibeTriangulo(){
        return "Base:" + base + "\nAltura: " + altura;
    }
    
    
    
    
}
