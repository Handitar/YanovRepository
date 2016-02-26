/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.yanov.kirill.shenanigans;

/**
 *
 * @author IT_School
 */
public class Lessonnumbersix {
    public static void main(String[] args){    
      
int count = 0;
for (int i = 0; i < args.length; i++){ 
System.out.print(args[i] + "\t");  
count++;
} 

System.out.println(); 

for (int i = args.length - 1; i >= 0; i-- ){ 
System.out.print(args[i] + "\t"); 
} 
} 
}