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
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
class min{    
   public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E s;       
        ArrayList min=new ArrayList();
        Collections.sort(list);
        s=list.get(0);
        return s;
    }  
}
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,s;
        char s2;
        double s1;
        min a1=new min();
        String m,m1,s3;      
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
        m=input.nextLine();
        m1=input.nextLine();
        String [] n=m1.split(" ");
        if("Integer".equals(m)){         
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(i=0;i<n.length;i++){
                s=Integer.parseInt(n[i]);
                a.add(s);
            }
            System.out.println(a1.min(a));           
        }
        if("Double".equals(m)){
           ArrayList<Double> a=new ArrayList<Double>(); 
            for(i=0;i<n.length;i++){
                s1=Double.parseDouble(n[i]);
                a.add(s1);
            }
            System.out.printf("%.3f",a1.min(a));
            System.out.println();
        }     
        if("Character".equals(m)){
            ArrayList<Character> a=new ArrayList<Character>();
             for(i=0;i<n.length;i++){
                s2=n[i].charAt(0);
                a.add(s2);
            }
            System.out.println(a1.min(a));           
        }
        if("String".equals(m)){           
            int j,sum=0;
            char k;
            String g;
            ArrayList<String> a=new ArrayList<String>();    
        for(i=0;i<n.length;i++){
          a.add(n[i]);            
        }            
      System.out.println(a1.min(a));
        }
        }
    }
    } 