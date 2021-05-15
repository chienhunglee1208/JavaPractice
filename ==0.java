/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Mac
 */
import java.util.Scanner;
public class Main {  
  
    /** 
     * @param args the command line arguments 
     */  
      
    public static void main(String[] args) {  
        int i; 
       // TODO code application logic here  
       String n;
     
      
      Scanner a=new Scanner(System.in);
      for(i=0;a.hasNext();i++){
          int odd=0,even=0,c;
          n=a.next();
             for(i=0;i<n.length();i++){
               if(i%2==0){
                 odd=n.charAt(i)-48+odd; 
               }
               else {
              even=n.charAt(i)-48+even;
               }
             } 
             c=n.charAt(0)-48;
          if(c!=0){
           if(Math.abs(even-odd)%11==0){
                 System.out.println(n+" is a multiple of 11.");
                        }
            if(Math.abs(even-odd)%11!=0)  {
                 System.out.println(n+" is not a multiple of 11.");
                 
            }    }
      if(c==0){
              break;
          }    
      }
           
     }
    }
                 
              
   
    