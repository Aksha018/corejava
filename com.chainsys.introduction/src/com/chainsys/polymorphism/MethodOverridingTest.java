package com.chainsys.polymorphism;


public class MethodOverridingTest {
	
	public static  void main(String[] args)
    {
        Parent a;
        a = new subclass1();
        a.Print();
        
        a = new subclass2();
        a.Print();
    }
}


