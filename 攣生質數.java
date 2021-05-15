/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author andrewhuang
 */
import java.util.Scanner;
public class Main1 {
static int p(int x){
    int p=1,i;//yes
    for(i=2;i<x;i++){
        if(x==2){
            p=1;
        }
        if(x%i==0&&x!=2){
            p=0;//no
        }
        else{}
    }
    if(x==1){
        p=0;
    }
    return p;
}
static int q(int x,int y){
    int p=1;
            if(x-y==2){
               p=0; 
            }
            return p;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j=0,i,m,k;
        int [] q={};
        int [] p=new int[883];
            for(i=1;i<884;i++){
                if(p(i)==1){                    
                    p[j]=i;
                    
                //    System.out.println(p[j]);               
                j++;
            }
            }
            for(k=0;k<j;k++){
                if(k<j-1){
                if(p[k+1]-p[k]==2){
                        System.out.print("(");
                        System.out.print(p[k]);
                         System.out.print(", ");
                        System.out.print(p[k+1]);
                         System.out.print(")");
                         System.out.println();
                    }
                }
            }
            
            }
    }
