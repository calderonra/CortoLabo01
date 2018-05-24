/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Raul Calderon
 */
public class binario implements conversor {

    @Override
    public int convertir(int a) {
        int residuo,aux;
        String binario="",binarioaux;
        while(a >0){
            residuo=(a%2);
            a=a/2;            
            binario=""+residuo;
        }
        binario+=a;
        StringBuilder builder;
        builder= new StringBuilder(binario);
        binarioaux=builder.reverse().toString();
        aux=Integer.parseInt(binarioaux);
        return aux;
    }

   
}
