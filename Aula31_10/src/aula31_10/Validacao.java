/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula31_10;

/**
 *
 * @author aluno
 */
public class Validacao {
    
    public static boolean valida(double x1, double x2, double y1, double y2){
        if(x1 <= 0 || x2 <= 0 || y1 <= 0 || y2 <=0){
            return false;
        } else{
            return true;
           
        }
    }
}
