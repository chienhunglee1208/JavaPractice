/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author Jiang-Shiou Hwang
 */

public class Main1 {    
    /**  
     * @param args the command line arguments  
     */ 
       static int reverse(int [] x){
        double [] y=new double[x.length];
        int i,sum=0,j,count;
        for(i=0;i<x.length;i++){    
            y[i]=x[x.length-1-i];
        }        
        for(j=0;j<y.length;j++){
           sum+=y[y.length-1-j]*Math.pow(10,j);         
        }
        return sum;
}
    static int digit(int num){
        int i,count=0,num1;
        num1=num;
        for(i=0;i<num1;i++){
            num=num/10;           
            ++count;
            if(num==0){
                break;
            }
        }
        return count;
    }
    static int prime(int x){  
    int p=1,i;//yes
      for(i=2;i<x;i++){       
        if(x%i==0){
            p=0;//no
        }      
    }
        return p;
}  
    public static void main(String[] args) {    
        // TODO code application logic here    
      int i,count=0,j,n,mod;   
        for(j=12;j<3372;j++){                  
           n=j;
           int []x=new int[digit(j)];
        for(i=0;i<digit(j);i++){
            if(prime(j)==1){
               mod=n%10;
                n=n/10;               
               x[digit(j)-1-i]=mod;
                if(n<10){
                    x[0]=n;           
                    break;
                }           
        }     
        }
        if(prime(j)==1&&prime(reverse(x))==1&&reverse(x)!=j){
           System.out.print(j);
           ++count;    
                if(count%10!=0){    
                    System.out.print(" ");    
                }     
                else{    
                    System.out.println();    
                }                                   
           }    
                }  
    }
            }                        