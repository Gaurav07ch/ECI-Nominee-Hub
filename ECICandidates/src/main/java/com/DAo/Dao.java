package com.DAo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Entity.Candidate;

public class Dao {

	Scanner sc = new Scanner(System.in);
	String url = "jdbc:mysql://localhost:3307/advecidb";
	String uname = "root";
	String pwd = "root";
	Connection con = null;
	ResultSet rs = null;

	String query = "SELECT * FROM advecidb.candidates";
	String insert = "INSERT INTO advecidb.candidates(cid, name, partyname, state, assembly, gender, age) Values (?,?,?,?,?,?,?)";
	String updatequery = "UPDATE advecidb.candidates SET  name =?, partyname=?, state=?, assembly=?, gender=? , age=? where cid=?";
	String Deletequery = "DELETE FROM advecidb.candidates WHERE cid = ?";

	public List<Candidate> getAllCandidate() {

		List<Candidate> l1 = new ArrayList<Candidate>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pwd);
			PreparedStatement st = con.prepareStatement(query);
			rs = st.executeQuery();

			while (rs.next()) {
				l1.add(new Candidate(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l1;

	}

	public List<Candidate> Insert() {
		System.out.println("Enter the Candidate Id : ");
		int cid = sc.nextInt();

		System.out.println("Enter the Candidate Name : ");
		String name = sc.next();

		System.out.println("Enter the Party Name : ");
		String partyname = sc.next();

		System.out.println("Enter the State : ");
		String assembly = sc.next();

		System.out.println("Enter the Assembly : ");
		String state = sc.next();

		System.out.println("Enter the Gender : ");
		String gender = sc.next();

		System.out.println("Enter the Age : ");
		int age = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pwd);
			PreparedStatement st = con.prepareStatement(insert);

			st.setInt(1, cid);
			st.setString(2, name);
			st.setString(3, partyname);
			st.setString(4, state);
			st.setString(5, assembly);
			st.setString(6, gender);
			st.setInt(7, age);

			int rs = st.executeUpdate();
			if (rs > 0)
				System.out.println("Data Inserted Successfully...");
			else
				System.err.println("Failed to Insert Data...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public List<Candidate> Update() {
		System.out.println("Enter the Candidate Id : ");
		int cid = sc.nextInt();

		System.out.println("Enter the Candidate Name : ");
		String name = sc.next();

		System.out.println("Enter the Party Name : ");
		String partyname = sc.next();

		System.out.println("Enter the State : ");
		String assembly = sc.next();

		System.out.println("Enter the Assmebly : ");
		String state = sc.next();

		System.out.println("Enter the Gender : ");
		String gender = sc.next();

		System.out.println("Enter the Age : ");
		int age = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pwd);
			PreparedStatement st = con.prepareStatement(updatequery);

			st.setString(1, name);
			st.setString(2, partyname);
			st.setString(3, state);
			st.setString(4, assembly);
			st.setString(5, gender);
			st.setInt(6, age);
			st.setInt(7, cid);
			int rs = st.executeUpdate();
			if (rs > 0)
				System.out.println("Data Updated Successfully...");
			else
				System.err.println("Failed to Update Data...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Candidate> Deletequery() {

		System.out.println("Enter the Candidate Id : ");
		int cid = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pwd);
			PreparedStatement st = con.prepareStatement(Deletequery);
			st.setInt(1, cid);
			int rs = st.executeUpdate();
			if (rs > 0)
				System.out.println("Data Deleted Successfully...");
			else
				System.err.println("Invalid Data... ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}