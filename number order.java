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
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.Scanner;      
    public class Main {        
        /**   
         * @param args the command line arguments   
         */      
    static int[] p (int [] x,int [] y){  
        int z[]=new int[x.length+y.length];  
        int i,j,l=x.length;;  
        for(i=0;i<x.length;i++){  
            z[i]=x[i];                            
        }  
        for(j=0;j<y.length;j++){             
            z[l]=y[j];  
            l++;  
        }  
          
        return z;  
    }  
    static int min(int[] x){  
        int min=1000,i;  
        for(i=0;i<x.length;i++){  
            if(min>=x[i]){  
                min=x[i];  
            }  
        }  
        return min;  
    }  
    static int zero(int[] x){  
        int i,count=0;  
        for(i=0;i<x.length;i++){  
            if(x[i]==0){  
                count++;  
            }  
        }  
        return count;  
    }  
public static void main(String[] args) {      
            // TODO code application logic here      
            int i,j,k,s,s1,k1,count=0;         
            String p,q;  
            char p2,q2;  
            int [] z;   
            Scanner a=new Scanner(System.in);      
            while(a.hasNext()){  
               p=a.nextLine();  
               q=a.nextLine();             
               String [] p1=p.split(" ");  
               String [] q1=q.split(" ");           
               int n[]=new int[p1.length];  
                int m[]=new int[q1.length];  
                  
                for(i=0;i<n.length;i++){  
                    s=Integer.parseInt(p1[i]);  
                    n[i]=s;                       
                }               
                for(j=0;j<m.length;j++){                    
                    s1=Integer.parseInt(q1[j]);  
                    m[j]=s1;                       
                }         
          z=p(n,m);    
          z[0]=' ';     
          z[n.length]=' ';  
          if(min(z)==0){  
            System.out.print(min(z));  
            for(k=1;k<zero(z);k++){               
                System.out.print(" 0");  
            }  
          }  
             
        
             Arrays.sort(z);  
             if(min(z)!=0){  
            System.out.print(min(z));}  
            for(k=0;k<z.length;k++){                 
                if(z[k]!=32&&z[k]!=min(z)){  
            System.out.print(" "+z[k]);  
                }  
          }  
            System.out.println();  
                        }     
        }      
    }