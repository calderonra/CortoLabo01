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
public class fabricaAritmetica extends fabricaAbs{

    @Override
    aritmetico getaritmetico(String tipo) {
        if(tipo== null){
            return null;
        }
        if(tipo.equalsIgnoreCase("suma")){
            return new sumar();
        }else if(tipo.equalsIgnoreCase("resta")){
            return new restar();
        }else if(tipo.equalsIgnoreCase("dividir")){
            return new dividir();
        }else if(tipo.equalsIgnoreCase("multiplicar")){
            return new multiplicar();
        }
            return null;
    }   
}
