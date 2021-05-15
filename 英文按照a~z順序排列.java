/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew;
/**
 *
 * @author andrewhuang
 */
import java.util.Scanner;
public class Andrew {
    /**
     * @param args the command line arguments
     */
    static char p(String x){
        int i;
        char n,min='z';
        for(i=0;i<x.length();i++){
            n=x.charAt(i);
            if(n<=min){
                min=n;
            }
        }
       
        return min;
    }
    static int num(String x){
       int  i,n,min=1000,x1=0;
        for(i=0;i<x.length();i++){
            n=x.charAt(i)-48;
            if(n<=min){
                min=n;
                x1=i;             
            }
        }
       
        return x1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String m,p;
        int i,n,j,k,u;
        char s,min;        
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
            m=a.next();
            System.out.print("Sorted string is ");           
            for(i=0;i<m.length();i++){                        
               System.out.print(p(m));
               s=m.charAt(num(m));
               p=String.valueOf(s);
               
               m=m.replaceFirst(p,"|");              
        }
           
            System.out.println();
       }
    } 
}