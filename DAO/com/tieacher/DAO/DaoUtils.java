package com.tieacher.DAO;

import java.sql.Connection;

import java.sql.DriverManager;

public class DaoUtils {
	
	public static Connection queroConexao() throws Exception{
		String url = "jdbc:postgresql://ec2-174-129-252-228.compute-1.amazonaws.com/daghmjbhddh9o7?user=thiwvshxgsinbs&password=c051aa26fa65488ad5018f7fe3c19e2653970b969f5527a8fdd0e9c73817d9f5&ssl=true";
		return DriverManager.getConnection(url);
	}
}
