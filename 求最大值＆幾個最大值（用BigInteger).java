

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
import java.math.BigInteger;
import java.math.BigDecimal;
class max{
    BigInteger maxnum(String x){
        int q,i;
        BigInteger max=new BigInteger("-1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        BigInteger p=new BigInteger("0");
        String []n=x.split(" ");
        for(i=0;i<n.length;i++){
            p=p.add(new BigInteger(n[i]));
            if(max.compareTo(p)==-1){
                max=p;
            }
           p=p.subtract(new BigInteger(n[i]));
        }
        return max;
    }
    int maxtime(String x){
        int i,q,count=0;
        max a=new max();
        String [] n=x.split(" ");
        for(i=0;i<n.length;i++){
            BigInteger p=new BigInteger("0");
            p=p.add(new BigInteger(n[i]));
            if(a.maxnum(x).equals(p)){
                count++;
            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        String m;
        int num,i,k;
        Scanner imput=new Scanner(System.in);
        while(imput.hasNext()){
            max a=new max();
            m=imput.nextLine();
            System.out.print(a.maxnum(m)+" "+a.maxtime(m));
            System.out.println();               
        }
    }
    
}


