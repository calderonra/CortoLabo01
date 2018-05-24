/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import aritmetico.aritmetico;
import conversor.binario;
import conversor.conversor;

/**
 *
 * @author Raul Calderon
 */
public class Fabricadeconversor implements fabricaAbs {

    @Override
    public aritmetico getaritmetico(String tipo) {
        return null;
    }

    @Override
    public conversor getconversor(String tipo) {
            
        switch(tipo){
            case "conversor":
                return new binario();
        }
        
       return null;
    
    }
    
}
