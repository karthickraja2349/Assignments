package com.assignment;
//if there is an N number of classes in a single java file , there will be N number of class files will be generated
//But usually we need to prepare or place a single class in a single javafile.
// In this , There are 3 classes are present. So, there should be 3 .class file will be generated
//The class which is named as public , should be the file name. otherwise 
//There should be atmost one public file in java

public class MultipleClasses {
    public static void main(String[] args) {
        System.out.println("This is the main class: MultipleClasses.");
        
        
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        
        a.display();
        b.display();
    }
}

// Package-private class (default access)
class ClassA {
    void display() {
        System.out.println("This is Class A.");
    }
}

// Package-private class (default access)
class ClassB {
    void display() {
        System.out.println("This is Class B.");
    }
}

