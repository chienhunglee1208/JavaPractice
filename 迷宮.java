/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author andrewhuang
 */
import java.util.Scanner;
public class Main1{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n,s,j,k,sum=0;
        String m;
      char g;
        Scanner a=new Scanner(System.in);       
        while(a.hasNext()){
            m=a.nextLine();          
        for(i=0;i<m.length();i++){          
            n=m.charAt(i)-48;              
            g=m.charAt(i);  
            if(n>=0&&n<=9){
            sum=sum+n;
        }       
            else if(n<0||n>9){
                if(g!='!'){
               for(k=1;k<=sum;k++){
                   if(g=='b'){
                       System.out.print(" ");
                   }
                   else{
                       System.out.print(g);
                   }                   
               }
                }
                else{
                    System.out.println("");
                }
           sum=0;
            }               
            }
        System.out.println();
            }             
        } 
       } 