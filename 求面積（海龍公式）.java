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
        int count=0;
        double side1,side2,side3,x1=1,x2=1,x3=1,y1=1,y2=1,y3=1,s,S;
        String n;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
        n=a.nextLine();
         String []  m=n.split(" ");
         if(count==0){
        x1=Float.parseFloat(m[0]);
        y1=Float.parseFloat(m[1]);
         }
         else if (count==1){
        x2=Float.parseFloat(m[0]);
        y2=Float.parseFloat(m[1]);
         }
         else if (count==2){
        x3=Float.parseFloat(m[0]);
        y3=Float.parseFloat(m[1]);
        side1=Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5);
      side2=Math.pow(Math.pow(x2-x3,2)+Math.pow(y2-y3,2),0.5);
      side3=Math.pow(Math.pow(x3-x1,2)+Math.pow(y3-y1,2),0.5);
      if(side1+side2>side3&&side2+side3>side1&&side2+side3>side1)
      {
      s=(side1+side2+side3)/2;
      S=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
      System.out.printf("%.3f",S);
      System.out.println();
      }
      else{
      System.out.println("Not Triangle");
      }
      
         }
        count++;
        
        
      
       
      
        }
    }
    
}
