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
import java.util.Scanner;    
public class Main {    
    /**  
     * @param args the command line arguments  
     */    
    public static void main(String[] args) {    
        // TODO code application logic here    
      int m,i,count=0,j,p;         
      Scanner a=new Scanner(System.in);         
      while(a.hasNext()){    
        m=a.nextInt();            
       for(j=2;j<94050;j++){  
           p=1;  
            String q=String.valueOf(j);    
        for(i=0;i<q.length()/2;i++){    
            if(q.charAt(i)!=q.charAt(q.length()-1-i)){     
                p=0;    
            }    
        }     
         if(p==1){         
           if(j==2){   
        }    
            for(i=2;i<j;i++){           
        if(j%i==0&&j!=2){    
            p=0;//no    
        }          
    }    
         }  
           if(p==1){         
           ++count;    
           System.out.print(j);    
                if(count%10!=0){    
                    System.out.print(" ");    
                }     
                else{    
                    System.out.println();    
                }                  
                if(count==m){    
                    break;    
                }    
           }    
                }      
            }               
       }    
        }  