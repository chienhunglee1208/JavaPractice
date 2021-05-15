/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jiang-Shiou Hwang
 */
import java.util.Scanner;
class BinaryFormatException extends Exception{
    boolean judge(String s){
        int k,i,count=0;
        for(i=0;i<s.length();i++){
            k=s.charAt(i)-48;
            if(k!=1&&k!=0){
               return false;
            }
    }       
        return true;    
    }
    int todecimal(String s){
        String decimal="";
        int i,dec=0,k;
        for(i=0;i<s.length();i++){
            k=s.charAt(i)-48;
            dec=dec*2+k;
        }
        return dec;
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m;
        int i;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
            for(i=0;a.hasNext();i++){
                m=a.next();               
               BinaryFormatException g=new BinaryFormatException();
                try{
                    if(g.judge(m)==true){                        
                        System.out.println(g.todecimal(m));                        
                    }
                    else{
                        throw new BinaryFormatException();
                    }
                }
                catch(BinaryFormatException e){
                    System.out.println("String no Binary");  
                    System.exit(1);
                }
            }
        }
    }
    
}
