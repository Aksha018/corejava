package com.chainsys.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class JdbcSample {
   public static void main(String[] args) {
    try {
           Connection myCon  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","akshacsys18"); 
           java.sql.Statement mystat = myCon.createStatement();
           ResultSet myRs  = mystat.executeQuery("select * from help");
           while(myRs.next()) {
               System.out.println(myRs.getString("topic") + ", " +myRs.getString("seq"));
           }
           myCon.close();
       }catch(Exception err) {
           err.printStackTrace();
       }
}
}



