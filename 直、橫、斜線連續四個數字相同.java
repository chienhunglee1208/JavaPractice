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
import java.util.Scanner;
public class Main {
static boolean isConsecutiveFour(int[][] values){
    boolean b=false,a=true,s=true;
    int i,j,count=0;
    for(i=0;i<values.length;i++){
        for(j=0;j<values[0].length;j++){
            if(j<values[0].length-1){
            if(values[i][j]==values[i][j+1]){
                j++;
                count++;
                if(count==3){
                    b=s;
                    return a;
                }
            }
            }
            if(i<values.length-1){
            if(values[i][j]==values[i+1][j]){
                i++;
                count++;
                if(count==3){
                    b=s;
                    return a;                   
                }       
            }
            }
        }
    }
    return b;
}
static boolean line(int x,int y,int [][]z){
    boolean a=true,b=false,s=true; 
    int count=0,i,r,q;   
           r=x;
           q=y;
       for(i=1;i<4;i++){   
           if(z.length==4&&z[0].length==4){
               if(y==3&&x==0){
                   if(z[r][q]==z[r+1][q-1]){
                       r++;
                       q--;
                       count++;
                       if(count==3){
                           b=s;
                           return a;
                       }
                   }
               }
           }
           else{
           if(y>=3&&x<z[0].length-3){   
           if(z[r][q]==z[r+1][q-1]){          
                 r++;
                 q--;
                 count++;
                 if(count==3){
                     b=s;
                    return a;
                 }                   
            }
           }
           }
           if(z.length==4&&z[0].length==4){
               if(x==0&&y==0){
                   if(z[r][q]==z[r+1][q+1]){
                       r++;
                       q++;
                       count++;
                       if(count==3){
                           b=s;
                           return a;
                       }
                   }
               }
           }
           else{
            if(x<z.length-4&&y<z[0].length-4){
            if(z[x][y]==z[x+1][y+1]){
                x++;
                y++;
                count++;
                if(count==3){ 
                    b=s;
                    return a;
                }                
            }
            }
           }
       }      
        return b;  
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        // TODO code application logic here       
        int i,j,s,s1,k;
        boolean a=false,a1,result;
        String p,q,r;
         Scanner b=new Scanner(System.in);      
            while(b.hasNext()){  
               p=b.nextLine();  
               String [] p1=p.split(" ");  
               s=Integer.parseInt(p1[0]);
               s1=Integer.parseInt(p1[1]);  
               int [][]x=new int[s][s1];
               for(i=0;i<s;i++){ 
                   r=b.nextLine();
                   String [] r1=r.split(" ");
                for(j=0;j<s1;j++){  
                    k=Integer.parseInt(r1[j]);
                      x[i][j]=k;                    
                }         
               }
          
         for(i=0;i<x.length;i++){
            for(j=0;j<x[0].length;j++){
         
                 if(j>=3&&i<x.length-3){
                     a=line(i,j,x);
                     if(line(i,j,x)==true){
                          a=true;
                     }               
                     else{                        
                     }
                      if(j==x[0].length-1&&i==x.length-4){             
                        if(isConsecutiveFour(x)==true){
                         a1=true;                      
                     }
                     else{
                         a1=false;
                     }
                     if((a1||a)==true){
                         result=true;
                         System.out.println(result);
                         //System.out.print(a1);
                     }
                     else{
                         result=false;
                         System.out.println(result);
                         //System.out.println(a1);
                     }
                 } 
                 }               
            }
        }
    }
    }
}
