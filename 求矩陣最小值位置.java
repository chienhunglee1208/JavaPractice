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
static int[] min(double [][] x){
    int i,j;  
    int [] n=new int[2];
    double m,min=1000;
    for(i=0;i<x.length;i++){ 
        for(j=0;j<x[0].length;j++){
            if(x[i][j]<=min){
                min=x[i][j];
                n[0]=i;
                n[1]=j;
            }
        }
    }  
    return n;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        String m;                
        double k;
        int num1,num,i,j,y,min;
        while(a.hasNext()){
            m=a.nextLine();
            num=m.charAt(0)-48;
            num1=m.charAt(2)-48;        
            String n[]=new String[num];
            double sum[][]=new double[num][num1];
            for(i=0;i<num;i++){                
                n[i]=a.nextLine();
                String [] r=n[i].split(" ");
                for(j=0;j<num1;j++){  
                    k=Double.parseDouble(r[j]);      
                    sum[i][j]=k;                                         
                    if(i==num-1&&j==num1-1){
                         int S[]=new int[2];
                                 S=min(sum);                                        
                           System.out.println("The location of the smallest element is at ("+S[0]+", "+S[1]+")");                        
                                }             
                }
            }              
                }
    }    
    }
