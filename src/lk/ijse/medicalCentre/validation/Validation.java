/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.validation;

import javax.swing.JOptionPane;

/**
 *
 * @author pasindu
 */

public class Validation {

    public Validation() {
        
    }
    
    
    public static boolean validateDOB(String DOB){
        try{
        if(DOB.equals("")){
            return false;
        }if(DOB.length()== 10){
            if(checkDashes(DOB)){
                if(checkNumbers(DOB)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    public static boolean validateMobile(String telephone){
    try{
    if(telephone.length()==11){
            if(telephone.substring(3,4).equals("-")){   
                if(checkMobile(telephone)){
                    return true;
                }else{
                    return false;
                }
            }else{
                    return false;
            }
        }else{
                    return false;
        }
    }catch(NumberFormatException ex){
        return false;
        }
    }
    
    public static boolean validateText(String name){
         if (name.trim().isEmpty()) {
             return true;
        }else{
           return false;
       }
    }
    public static boolean checkTimeText(String time){
        try{
            if(time.length()==5){
                if(time.substring(2,3).equals(":") ){
                return true;
            }else{
             return false;
            }
            }else{
                return false;
            }
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    public static boolean checkCount(String time){
        try{
            int count=Integer.parseInt(time);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    private static boolean checkDashes(String dob){
        String firstDash=dob.substring(4,5);
        String secondDash=dob.substring(7,8);
        if(firstDash.equals("-") && secondDash.equals("-")){
            return true;
        }else{
            return false;
        } 
    }
    private static boolean checkNumbers(String dob){
        try{
        int year=Integer.parseInt(dob.substring(0, 4));
        int month=Integer.parseInt(dob.substring(5,7));
         int day=Integer.parseInt(dob.substring(8,10));
         return true;
    }catch(NumberFormatException ex){
        return false;
        }
    }
    
    private static boolean checkMobile(String number){
        try{
            Integer.parseInt(number.substring(0,3));
            Integer.parseInt(number.substring(4,11));
        return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
}
