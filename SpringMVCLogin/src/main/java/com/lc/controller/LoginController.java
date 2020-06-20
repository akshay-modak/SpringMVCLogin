package com.lc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.dao.UserDAO;
import com.lc.dao.UserDAOImpl;
import com.lc.dao.UserLoginDAOImpl;
import com.lc.dao.UserLoginDAOImplFactory;
import com.lc.dto.UserDTO;
import com.lc.dto.UserLoginBean;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginPage() {
		
		return "login";
	}
	@RequestMapping("/newuser")
	public String newUser() {
		
		return "register";
	}
	@RequestMapping("/register")
	public String userRegister(HttpServletRequest req) {
		UserDTO userDTO=new UserDTO();
		userDTO.setuId(req.getParameter("uId"));
		userDTO.setuName(req.getParameter("uName"));
		userDTO.setpWord(req.getParameter("pWord"));
		UserDAO userDAO =new UserDAOImpl();
		
		int k=userDAO.insert(userDTO);
		if(k!=0)
			return "success";
		else
			return "fail";
	}
	@RequestMapping("/log")
	public String userLogin(HttpServletRequest req,Model model) {
		
		
		
		UserLoginBean userLoginBean=new UserLoginBean();
		userLoginBean.setuName(req.getParameter("uName"));
		userLoginBean.setpWord(req.getParameter("pWord"));
		UserLoginDAOImpl uld=UserLoginDAOImplFactory.getUserLoginDAOImpl();
		
		UserDTO userDTO=uld.login(userLoginBean);
		if(userDTO!=null) {
			
			HttpSession hs=req.getSession();
			hs.setAttribute("username",userDTO.getuName());
			hs.setAttribute("userDTO",userDTO);
			
			return "loginSuccess";
		}
		else {
			
			
			return "login";
		}
		
		
	}

}
