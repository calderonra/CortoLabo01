/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import aritmetico.aritmetico;
import conversor.conversor;

/**
 *
 * @author Raul Calderon
 */
public interface fabricaAbs {
   aritmetico getaritmetico(String tipo);
   conversor getconversor(String tipo) ;
    //
}
