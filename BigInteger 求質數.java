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
import java.math.BigInteger;
public class Main {  
    /** 
     * @param args the command line arguments 
     */     
static int p(BigInteger x){  //yes  
    int p=1;   
    BigInteger i=new BigInteger("7");
    BigInteger one=new BigInteger("1");   
    BigInteger zero=new BigInteger("0");
    BigInteger five=new BigInteger("5");
    BigInteger d;
    d=x.divide(five);   
    boolean e;    
    while(i.compareTo(d)==-1){  
        e=x.mod(i).equals(zero);
        if(e==true){  
          p=0; 
          return p;
        }    
         i=i.add(one);
    }
    return p;  
}  
public static void main(String[] args) {  
        // TODO code application logic here  
        int count=1;
        BigInteger i=new BigInteger("1000001");
        BigInteger j=new BigInteger("10000000"); 
        BigInteger one=new BigInteger("1");     
        BigInteger two=new BigInteger("2");
        BigInteger three=new BigInteger("3");
        BigInteger zero=new BigInteger("0");
        BigInteger five=new BigInteger("5");
        boolean e,r,q;
        while(count<=10){
            e=i.mod(two).equals(zero);
            r=i.mod(three).equals(zero);
            q=i.mod(five).equals(zero);
          if(e==false&&r==false&&q==false){  
          if(p(i)==1){              
              count++;
              System.out.println(i);                                                 
          }
          }
          i=i.add(one);
      }
           }  
    }  