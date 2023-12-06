/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.List;

/**
 *
 * @author brutj
 */
public class Validacao {
      public boolean validaSenha(String senha, List<String> senhas){
        for(String s : senhas){
            if(s.equals(senha)){
                return true;
            }
        }
        return false;
    }
}

