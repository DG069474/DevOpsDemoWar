package pal;

import java.sql.*;  // for standard JDBC programs
import java.math.*;
import java.util.*;
import org.postgresql.*;

public class WebDBManager{
	String url;
	Properties props = new Properties();
	
	public WebDBManager(String dbName){
		url = "jdbc:postgresql://127.0.0.1:5432/" + dbName;
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
	
		public ArrayList<String> basicQueryReturn(){
		ArrayList<String> list = new ArrayList();
		try{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url, "test","test");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM actor");
			int count = 1;
			while (rs.next()){
		
				list.add("The name on row "+ count +" is: " + rs.getString(2) + ", " + rs.getString(3));
				count++;
			}
			rs.close();
			st.close();
			return list;
		}
		catch(Exception ex){
			System.out.println(ex);
			list.add(ex.getMessage());
		} 
			return list;
	}
	
}
