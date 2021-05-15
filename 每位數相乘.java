/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author PC2015
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int c,n,i,A,sum=1;
        Scanner a=new Scanner(System.in);
      n=a.nextInt();
      c=n;
       // TODO code application logic here
      for(i=1;i<=1000;i++){
          A=n%10;
          if(n==1000){
          sum=0;
          break;
          }
          n=n/10;
          
          if(A!=0){
          sum=sum*A;
          
          }
       
      }
      System.out.print(sum);
      System.out.println();
      
             
           
    
    }
}

    
   
