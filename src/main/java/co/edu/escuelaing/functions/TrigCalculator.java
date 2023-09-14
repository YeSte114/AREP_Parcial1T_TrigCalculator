/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.functions;

/**
 *
 * @author lab
 */
public class TrigCalculator {
    public static String getResult(String function,String number){
        System.out.println(function);
        System.out.println(number);
        String res= null;
        if(function.equals("cos")){
            res= '{'+"\"result\":"+Math.cos(Double.parseDouble(number))+'}';
        }else if(function.equals("sin")){
            res= '{'+"\"result\":"+Math.sin(Double.parseDouble(number))+'}';
        }else{
            res= '{'+"\"result\":"+Math.tan(Double.parseDouble(number))+'}';
        }
        return res;
    }
    
}
