/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import aritmetico.aritmetico;

/**
 *
 * @author Raul Calderon
 */
public class FabricaDeFabricas {
   public static fabricaAbs getfabrica(String tipo){
       if(tipo.equalsIgnoreCase("aritmetica")){
           return new fabricaAritmetica();
       }else if(tipo.equalsIgnoreCase("conversor")){
           return new Fabricadeconversor();
       }
       return null;
   } 
}
