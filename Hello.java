package com.assignment;

import java.io.PrintWriter;

public class Hello {
    public static void main(String[] args) {
       new Hello().print();
    }
    
    private void print(){
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Hello,World!");
        writer.flush();
        writer.close();
     }   
}

