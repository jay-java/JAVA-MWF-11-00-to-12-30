package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Seller;

public class SellerDao {
	public static void sellerRegister(Seller s) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql ="insert into seller(name,contact,address,email,password,cpass) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddres());
			pst.setString(4, s.getEmail());
			pst.setString(5, s.getPass());
			pst.setString(6, s.getCpass());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
