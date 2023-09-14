/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.qck;

/**
 *
 * @author lab
 */
public class quickSort {

    public static void quicksort(Double A[], int izq, int der) {

        Double pivote = A[izq]; 
        int i = izq;         
        int j = der;         
        Double aux;

        while (i < j) {                                                          
            while (A[i] <= pivote && i < j) {
                i++; 
            }
            while (A[j] > pivote) {
                j--;          
            }
            if (i < j) {                                         
                aux = A[i];                     
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];                                        
        A[j] = pivote;     
        if (izq < j - 1) {
            quicksort(A, izq, j - 1);          
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);         
        }
    }


    quickSort() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
}
