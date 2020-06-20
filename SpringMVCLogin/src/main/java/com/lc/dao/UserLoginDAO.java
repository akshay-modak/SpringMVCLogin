package com.lc.dao;

import com.lc.dto.UserDTO;
import com.lc.dto.UserLoginBean;

public interface UserLoginDAO {
	
	public UserDTO login(UserLoginBean userLoginBean);

}
