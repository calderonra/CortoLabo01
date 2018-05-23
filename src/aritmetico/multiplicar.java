/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;

/**
 *
 * @author Raul Calderon
 */
public class multiplicar implements aritmetico{

    @Override
    public float calcular(float a, float b) {
        float aux;
        aux=a*b;
        return aux;
    }

   
}
