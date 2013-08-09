package com.cybergen.specmatcher.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cybergen.specmatcher.HWComponents.HDD;
import com.cybergen.specmatcher.enums.HDDType;
import com.cybergen.specmatcher.enums.Quality;

/**
 * This class is to access the database
 * 
 * @author asanka
 * 
 */
public class SpecMatcherDAO {
	public static Connection dbConnection;
	private static final String SEARCH_QUERY_FOR_XPATHS = "SELECT corrProps FROM corrTable WHERE ServiceName=?;";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/rms";
	private static final String SERVICE_NAME = "testService";

	public static void createDatabaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbConnection = DriverManager.getConnection(DB_URL, DB_USER,
					DB_PASSWORD);

		} catch (SQLException e) {
			System.out
					.println("Error occured while creating the Databse connection");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found com.mysql.jdbc.Driver");
		}
	}

	public static String getData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String result = "";
			PreparedStatement st = (PreparedStatement) dbConnection
					.prepareStatement(SEARCH_QUERY_FOR_XPATHS);
			st.setString(1, SERVICE_NAME);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				result = rs.getString("CorrProps");
			}
			dbConnection.close();
			return result;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static HDD[] getHDDbyQuality(Quality pQuality) {
		List<HDD> result = new ArrayList<HDD>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			PreparedStatement st = (PreparedStatement) dbConnection
					.prepareStatement("SELECT * FROM hdd WHERE quality=?");
			st.setString(1, Integer.toString(pQuality.ordinal()));
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				result.add(new HDD(rs));
			}
			return result.toArray(new HDD[result.size()]);

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found com.mysql.jdbc.Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured while executing SQL ");
		}
		return null;

	}

}
