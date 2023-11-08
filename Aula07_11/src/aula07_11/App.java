/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class App {
    
  public static final String SENHA = "1234";
    
    
  public static void validaSenha(String senha) throws Exception
  {
       

      if(!senha.equals(SENHA))
          throw new Exception("Senha inválida digite novamente");  
      
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //faça um progama em java que leia do usuario uma senha, 
        //crie uma constante global contendo uma senha valida
        //crie uma funcao que ira verificar a senha. Se ela for invalida 
        //lance uma exceção do tipo Exception indicando uma mensagem explicativa
        Scanner s = new Scanner(System.in);
        
        boolean validador = true;
        do {            
            try {
            System.out.println("Digite a senha: ");
            String senha = s.nextLine();
            validaSenha(senha);
            System.out.println("Senha correta, bem-vindo!");
            validador = false;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        } while (validador);
        
        
        
        
        
    }
    
}
