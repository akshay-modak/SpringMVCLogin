package com.lc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lc.dto.UserDTO;
import com.lc.mysqlFactory.DBConnection;

public class UserDAOImpl implements UserDAO {

	private static final String insertQuery="INSERT INTO LOGINTEST VALUES(?,?,?)";
	private Connection con=null;
	private int k=0;
	@Override
	public int insert(UserDTO userDTO) {
		
	try {
		
	
	con=DBConnection.getConn();
	PreparedStatement ps=con.prepareStatement(insertQuery);
	ps.setString(1, userDTO.getuId());
	ps.setString(2, userDTO.getuName());
	ps.setString(3, userDTO.getpWord());
	
	k=ps.executeUpdate();
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return k;	}

}
