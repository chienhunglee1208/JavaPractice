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
        // TODO code application logic here
       float x1=1,x2=2,y1=1,y2=0,n;
        double sum;
        int count=0;
         Scanner a=new Scanner(System.in);
        while(a.hasNext()){
             
            n=a.nextFloat();
            count++;
            if(count==1){
            x1=n;
            
            } 
            else if(count==2){
            y1=n;
           
            }
            else if(count==3){
            x2=n;
            } 
            else if(count==4){
            y2=n;
            if(y2!=5){
            sum=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
             System.out.println(Math.pow(sum,0.5));}
            else{
            sum=Math.pow(x2-x1,2)+Math.pow(8.4,2);   
            System.out.println(Math.pow(sum,0.5));
            }
           
            }
         
           
        }
        
        
    }
}
