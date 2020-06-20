package com.lc.dao;

public class UserLoginDAOImplFactory {
	
	static private UserLoginDAOImpl userLoginDAOImpl=null;
	
	public static UserLoginDAOImpl getUserLoginDAOImpl() {
		userLoginDAOImpl=new UserLoginDAOImpl();
		
		return userLoginDAOImpl;
	}
	
	

}
