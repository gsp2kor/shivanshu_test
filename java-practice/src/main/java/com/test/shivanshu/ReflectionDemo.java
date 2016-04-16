package com.test.shivanshu;

import java.lang.reflect.Method; 
import java.util.Scanner;
public class ReflectionDemo {
    
    public static void main(String args[]) {
        
        try{
            String s =new String();
            System.out.println("Pleez gimme the Class Name :"); 
            Scanner sc = new Scanner(System.in); 
            String className = sc.next(); 
            Class c = Class.forName(className); 
            Method m[] = c.getDeclaredMethods(); 
            for(int i = 0; i<m.length; i++) 
            System.out.println(m[i].toString()); 
            }
            catch(Throwable e) { 
                System.err.println(e); 
                } 
                } 
                }
