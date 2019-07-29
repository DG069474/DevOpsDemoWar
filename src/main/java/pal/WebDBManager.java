package pal;

import java.sql.*;  // for standard JDBC programs
import java.math.*;
import java.util.*;
import org.postgresql.*;

public class WebDBManager{
	String url;
	Properties props = new Properties();
	
	public WebDBManager(String dbName){
		url = "jdbc:postgresql://localhost/" + dbName;
		Properties props = new Properties();
		props.put("user","test");
		props.put("pass","test");
		props.put("ssl","true");
		
	}
	
	public void connect(){
		try{
			Connection conn = DriverManager.getConnection(url, props);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void basicQuery(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url, "test","test");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM actor");
			int count = 1;
			while (rs.next()){
		
				System.out.print("The name on row "+ count +" is: ");
				System.out.print(rs.getString(2) + ", " + rs.getString(3)+"\n");
				count++;
			}
			rs.close();
			st.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		} 
	}
	
}
