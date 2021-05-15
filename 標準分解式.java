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
public class Main {
    /**
     * @param args the command line arguments
     */
   static int p(int x){
        int i,p=1;//yes
        for(i=2;i<x;i++){
            if(x%i==0){
                p=0;//not
            }          
        }
        return p;
    }
    public static void main(String[] args) {
        // TODO code application logic here       
        int i,m,n;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
            m=a.nextInt();
            n=m;
            if(p(m)==0){
            for(i=2;i<n;i++){
                if(p(i)==1){ 
                    while(m%i==0){
                        m=m/i;                        
                        if(m==1){
                            System.out.println(i);
                            break;
                        }
                        System.out.print(i+" ");
                    }
                }                
            }
        }
            else if(p(m)==1){
                if(m==1){
                    System.out.println(m);
                }
                else{
                System.out.println("1 "+m);
                }
            }
            
    }
    
}
}