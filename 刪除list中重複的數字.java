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
import java.util.*;
import java.util.Scanner;
public class Main {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
    String m;
    int i,j,count,k=0,p,q,count1=0;
    Scanner a=new Scanner(System.in);
    List <String>al=new ArrayList<String>();      
    while(a.hasNext()){
        count=0;
        m=a.nextLine();             
        String []n=m.split(" "); 
        for(i=0;i<n.length;i++){      
            al.add(n[i]);
                }
        for(i=0;i<n.length;i++){
            k=Integer.parseInt(n[i]);
            for(j=0;j<n.length;j++){
            p=Integer.parseInt(n[j]);
                if(k==p){
                    ++count;          
                    }                             
               if(count==1&&j==n.length-1){ 
                   ++count1;
                   if(count1==1){
                    al.remove(i);
                   }
      }                
                }           
            count=0;
            }       
            String []n1=al.toArray(new String[al.size()]);            
           
            System.out.print("The same integers are:");
            if(count1==1){
            for(q=0;q<n1.length;q++){           
            System.out.print(" "+n1[q]);
            }
            }
            else{
                System.out.print(" ");
            }
            System.out.println();
            }                                
         }
    }