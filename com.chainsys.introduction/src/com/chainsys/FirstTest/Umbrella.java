package com.chainsys.FirstTest;
import java.util.Scanner;
public class Umbrella{

        public static void main(String[] args) {
      
        //temperature();
        neededThings(); 
        }
        
        public static void temperature()
        {
                Scanner u1=new Scanner(System.in);
                System.out.println("Enter raining or Not");
                String rain=u1.nextLine();
                u1.close();
            System.out.println("To get Umbrella");
           
        }
        public static void neededThings()
        {
                Scanner u2=new Scanner(System.in);
                System.out.println("Enter the Temperature");
                double degree=u2.nextDouble();
                u2.close();
                
                if(degree<32)
        {
                System.out.println("To Bring Heavy Jacket");
        }
        else if(degree>=32 && degree<=50)
        {
         System.out.println("To bring Light Jacket");        
        }
        else 
        {
                System.out.println("No Need to Bring Jacket");
        }
                        
        }
}
