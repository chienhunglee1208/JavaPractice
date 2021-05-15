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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*; 
public class Main {
    /**
     * @param args the command line arguments
     */
static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
   int j,i;
   E k;
   for(j=0;j<list.size()-1;j++){
   for(i=j+1;i<list.size();i++){
       k=list.get(j);
       if(list.get(i).equals(k)){
           list.remove(i);
       }
   }
   }
   return list;
}
    public static void main(String[] args) {
        // TODO code application logic here
        String m,m1;
        int i,k1,j;
        Scanner imput=new Scanner(System.in);        
        while(imput.hasNext()){         
            try{
                m1=imput.nextLine();
                m=imput.nextLine();        
             String []n=m.split(" ");    
             if("Integer".equals(m1)){
            ArrayList<Integer> k=new ArrayList<Integer>();
            for(i=0;i<n.length;i++){              
                k1=Integer.parseInt(n[i]);
                k.add(k1);
            }
            for(j=0;j<removeDuplicates(k).size();j++){
                if(j==0){
                    System.out.print(removeDuplicates(k).get(0));
                }
                else{
               System.out.print(" "+removeDuplicates(k).get(j));
                }
            }  
            System.out.println();
            k.clear();
             }
             if("Double".equals(m1)){
            ArrayList<Double> k=new ArrayList<Double>();
            for(i=0;i<n.length;i++){
                double k2;
                k2=Double.parseDouble(n[i]);
                k.add(k2);
            }
            
            for(j=0;j<removeDuplicates(k).size();j++){
               if(j==0){                  
                    System.out.printf("%.3f",removeDuplicates(k).get(0));
                }
                else{
               System.out.printf("% .3f",removeDuplicates(k).get(j));
                }
            } 
            System.out.println();
            k.clear();
             }
            if("Charactor".equals(m1)){
            ArrayList<Character> k=new ArrayList<Character>();
            for(i=0;i<n.length;i++){
                char k3;
                k3=n[i].charAt(0);
                k.add(k3);
            }
            for(j=0;j<removeDuplicates(k).size();j++){
                if(j==0){
                    System.out.print(removeDuplicates(k).get(0));
                }
                else{
               System.out.print(" "+removeDuplicates(k).get(j));
                }
            }  
            System.out.println();
            k.clear();
             } 
            if("String".equals(m1)){
            ArrayList<String> k=new ArrayList<String>();
            for(i=0;i<n.length;i++){             
                k.add(n[i]);
            }
            for(j=0;j<removeDuplicates(k).size();j++){
                if(j==0){
                    System.out.print(removeDuplicates(k).get(0));
                }
                else{
               System.out.print(" "+removeDuplicates(k).get(j));
                }
            }  
            System.out.println();
            k.clear();
             }    
             throw new EOFException();
        }
        catch(EOFException ex){
            
        }
        }
    }
}
