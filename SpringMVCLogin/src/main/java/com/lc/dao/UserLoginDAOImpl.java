package com.lc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.lc.dto.UserDTO;
import com.lc.dto.UserLoginBean;
import com.lc.mysqlFactory.DBConnection;

public class UserLoginDAOImpl implements UserLoginDAO {

	private Connection con=null;
	private UserDTO userDTO =null;
	private static final String fetchQuery ="SELECT USERID,USERNAME,PASS FROM LOGINTEST WHERE USERNAME=? AND PASS=?"; 
	
	@Override
	public UserDTO login(UserLoginBean userLoginBean) {
		
		try {
			
		con=DBConnection.getConn();
		PreparedStatement ps=con.prepareStatement(fetchQuery);
		ps.setString(1, userLoginBean.getuName());
		ps.setString(2, userLoginBean.getpWord());
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			userDTO=new UserDTO();
			userDTO.setuId(rs.getString("USERID"));
			userDTO.setuName(rs.getString("USERNAME"));
			userDTO.setpWord(rs.getString("PASS"));
			
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return userDTO;
	}

}
