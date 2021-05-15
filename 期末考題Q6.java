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
import java.util.Arrays;
public class Main {
    /**
     * @param args the command line arguments
     */
    static int first(String m){
        int i,r,c1=0,div,target1;
        String []n1=m.split(" ");
        target1=Integer.parseInt(n1[0]);
        int [] a1=new int[n1.length-1];
        for(i=1;i<=a1.length;i++){
                r=Integer.parseInt(n1[i]);
                a1[c1]=r;
                ++c1;
            }
            Arrays.sort(a1);
            for(i=a1.length-1;i>0;i--){
                div=target1/a1[i];
                if(div!=0){
                   return a1[i];
                }
                target1=target1-div*a1[i];             
            }
            return 0;
    }
    static int time(String m){
         int i,r,c1=0,div,target1;
        String []n1=m.split(" ");
        target1=Integer.parseInt(n1[0]);
        int [] a1=new int[n1.length-1];
        for(i=1;i<=a1.length;i++){
                r=Integer.parseInt(n1[i]);
                a1[c1]=r;
                ++c1;
            }
            Arrays.sort(a1);
            for(i=a1.length-1;i>0;i--){
                div=target1/a1[i];
                if(div!=0){
                  return div;
                }
                target1=target1-div*a1[i];             
            }
            return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String m,m1;
        int target,i,r,c,div,target1,c1;
        Scanner imput=new Scanner(System.in);
        while(imput.hasNext()){
            c=0;
            c1=0;
            m1=imput.nextLine();
            m=imput.nextLine();       
            String []n=m.split(" ");
            String []n1=m1.split(" ");
            target1=Integer.parseInt(n1[0]);
            target=Integer.parseInt(n[0]);           
            int []a=new int[n.length-1];
            int []a1=new int[n1.length-1];
            for(i=1;i<=a1.length;i++){
                r=Integer.parseInt(n1[i]);
                a1[c1]=r;
                ++c1;
            }
            Arrays.sort(a1);      
            if(target==target1){
            if(first(m)>first(m1)||first(m)==first(m1)){              
            for(i=a1.length-1;i>0;i--){
                div=target1/a1[i];                
                if(div!=0){
                    System.out.print(a1[i]+"*"+div);
                }
                if(i!=1&&div!=0){
                    System.out.print(" ");
                }
                target1=target1-div*a1[i];
            }       
            System.out.println();               
            }
            }                         
            for(i=1;i<=a.length;i++){               
                r=Integer.parseInt(n[i]);
                a[c]=r;
                ++c;
            }
            Arrays.sort(a);
            if(target==target1){
            if(first(m1)>first(m)||first(m1)==first(m)){ 
            for(i=a.length-1;i>0;i--){
                div=target/a[i];
                if(div!=0){
                    System.out.print(a[i]+"*"+div);    //
                }
                if(i!=1&&div!=0){
                    System.out.print(" ");
                }
                target=target-div*a[i];              
            }
            System.out.println();
                }       
            }
        }  
    }   
}
