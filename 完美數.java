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
public class Main {

    /**
     * @param args the command line arguments
     */
    static int p(int x){
        int i,sum=0;
        for(i=1;i<x;i++){
            if(x%i==0){
               sum=sum+i; 
            }
        }
        return sum;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for(i=1;i<10000;i++){
            if(p(i)==i){
                System.out.println(i);
            }
            
        }
    }
    
}
