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
    public int convertir(int x) {
        int[] binaryNum = new int[1000];
        int i = 0;
        int convertido=0;
        String y = null;
        while (x > 0) {
            binaryNum[i] = x % 2;
            x = x / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            y=y+String.valueOf(binaryNum[j]);
            y=y.replace("null","");
        }
        convertido=Integer.parseInt(y);
        return convertido;
    }

   
}
