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
public class Main {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here 
        int rows,i,j,sum=0,q=1,count=0,k,t;  
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            rows=input.nextInt();      
            for(i=0;i<rows;i++){
                int num=1;
                System.out.format("%"+(rows-i)*2+"s"," ");
                for(j=0;j<=i;j++){                    
                    System.out.format("%4d",num);
                    num=num*(i-j)/(j+1);    
                    
                    if(i==rows-1){
                        sum=num+sum;
                        if(j==i){
                            System.out.println();
                            System.out.println(sum+1);
                            break;
                        }
                    }
                }
                    System.out.println();
                }                              
            }
        }
    }