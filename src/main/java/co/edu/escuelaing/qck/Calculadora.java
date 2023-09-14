/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.escuelaing.qck;

import co.edu.escuelaing.qck.quickSort;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lab
 */
public class Calculadora {

    private quickSort ordenado;
    
    public Calculadora(){
        ordenado = new quickSort();
    }

    public Double[] Ordenar(String nNumeros){
        List<String> nums = Arrays.asList(nNumeros.split(","));
        Double[] numsLength = new Double[nums.size()];
        for(int i=0;i<nums.size();i++){
            numsLength[i]=(Double.valueOf(nums.get(i)));
            
        }
        /*
        Comparable[] numeros = ordenado.quickSort(numsLength);
        for (int j=0; j<numeros.length;j++){
            numsLength[j]=Double.valueOf(String.valueOf(numeros[j]));
        }*/
        
        return numsLength;
    }

}
