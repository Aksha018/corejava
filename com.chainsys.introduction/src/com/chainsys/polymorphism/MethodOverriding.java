package com.chainsys.polymorphism;

public class MethodOverriding {
	
	class Parent {
		  void Print()
		{
		System.out.println("parent class");
		    }
		}
		 
		// Class 2

		class subclass1 extends Parent {
		 void Print() { 
		System.out.println("subclass1");
		 }
		}
		 
		// Class 3

		class subclass2 extends Parent {
		   void Print()
		    {
		  System.out.println("subclass2");
		    }
		}
		 
}
