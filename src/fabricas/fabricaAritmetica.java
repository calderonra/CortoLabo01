/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;
import aritmetico.aritmetico;
import aritmetico.dividir;
import aritmetico.sumar;
import aritmetico.restar;
import aritmetico.multiplicar;

/**
 *
 * @author Raul Calderon
 */
public class fabricaAritmetica implements fabricaAbs{
    @Override
  
        public aritmetico getaritmetico(String tipo){
        switch(tipo){
            case "Suma":
                return new sumar();
            case "Resta":
                return new restar();
            case "Multiplicacion":
                return new multiplicar();
            case "Division":
                return new dividir();
        }
        return null;
        }


  
}
