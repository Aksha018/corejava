package com.chainsys.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class FileOperations {
	    public static void main(String[] args) throws IOException {
	        Create();
	        Rename();
	    	append();
	    	Modify();
	    	ReadData();
	        Move();
	        Copy();
	    	Delete();
	    }
		public static void Create() 
	        {
	             
	            File FileTest=new File("D:\\Java Training SW\\FileTest.txt"); 
	            try {
	                FileTest.createNewFile();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
	 public static void Rename() {
	   
	     File oldfile=new File("D:\\Java Training SW\\FileTest.txt");
	     File newfile=new File("D:\\Java Training SW\\TestFile.txt");
	     
	     if(oldfile.renameTo(newfile)) {
	         System.out.println("Old filename was renamed");
	     }
	     else {
	         System.out.println("Old filename was not renamed");
	     }
	 }
	 private static void append() 
	 {
		    
		   try {
		     FileWriter Writer = new FileWriter("D:\\Java Training SW\\TestFile.txt", true);
		     Writer.append("This is TestFile");
		     Writer.close();
		 }
		 catch(IOException e) {
		     System.out.println(e);
		 
		 }
		}
	 public static void Modify() throws IOException {
	        FileWriter fw = new FileWriter("D:\\Java Training SW\\TestFile.txt");
	        try (FileWriter filewriter = new FileWriter("D:\\Java Training SW\\TestFile.txt");)
	        {
	            fw.write("HI Java Batch");
	            fw.close();
	            System.out.println("Modify the file");
	        } catch (Exception e) {
	            System.out.println("Error");
	        }

	    }
	 public static void ReadData() {
         try {
               File FileTest = new File("TestFile.txt");
               Scanner Reader = new Scanner(FileTest);
               while (Reader.hasNextLine()) {
                 String data = Reader.nextLine();
                 System.out.println(data);
               }
               Reader.close();
             } catch (FileNotFoundException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
             }
     }
	 public static void Move() {
         
         File SourceFile=new File("D:\\Java Training SW\\TestFile.txt");
         File DestinationFile=new File("D:\\Java Training SW\\New folder"); 
         try {
             Files.copy(SourceFile.toPath(),DestinationFile.toPath() ,StandardCopyOption.REPLACE_EXISTING);
             System.out.println("File copied Successfully");
         } catch(IOException e) {
             e.printStackTrace();
         }
          }
	  public static void Copy()
	     {
	    	 File FileTest=new File("D:\\Java Training SW\\FileTest.txt"); 
	    	 File FileTest2=new File("D:\\Java Training SW\\FileTest_Copy.txt"); 
	    	 FileInputStream fileInputStream = null;
	    	 FileOutputStream fileOutputStream = null;
	    	 	 
	    	 	
	    	 try {
	    		 fileInputStream = new FileInputStream(FileTest);
	    		 fileOutputStream = new FileOutputStream(FileTest2);
	    	 } catch (IOException e) {
	    		 e.printStackTrace();
	    	 }
	     }
	     public static void Delete()
	        {
	    	 File FileTest=new File("D:\\Java Training SW\\FileTest.txt");
	            System.out.println(FileTest.delete());
	        }
}
	
		      
		    
