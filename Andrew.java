
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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.util.Stack;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.math.*;  
import java.io.*; 
public class Andrew {  
    /** 
     * @param args the command line arguments 
     */     
     
        // TODO code application logic here 
    public static void main(String args[]) {
    //List<String>al=new ArrayList<String>();    
   Stack st = new Stack();
  // st.push(A);  
   Object a2;
   int i,j;
   ArrayDeque ADeque = new ArrayDeque();
		ADeque.add("A");
        ArrayList<String> min=new ArrayList<String>();
        Collections.sort(min); 
        int g=34;
        char k=(char)g;
     
        BigInteger k3=new BigInteger("-1"),g9=new BigInteger("-1");
           if(k3.compareTo(g9)==0){
              // System.out.println("fuck");
           }
           int[][] matrix=new int[3][8];
           int maco=0,count=0;
           int[] var=new int[3];
           int key=2;
           int lol;
           for(i=0;i<3;i++){
               var[i]=0;
               for(j=0;j<8;j++){
                   matrix[i][j]=0;
               }
           }
           
           for (lol = 6; lol >= 0; lol--){
                    matrix[maco][lol + 1] = matrix[maco][lol];
	matrix[maco][0] = key;
                    var[maco] = var[maco] * 10 + key;
	
                    System.out.println(matrix[0][lol]+" "+lol);
                    if(count<3){
                    System.out.println(var[count]+" "+count);}
                    count++;
        }
    }
      }      
     