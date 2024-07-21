package com.myproj.ServiceImpl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproj.ConfigJava.ServiceLocator;
import com.myproj.DAO.LoginRegisterDAO;
import com.myproj.DTOs.LoginRegisterDTO;
import com.myproj.DaoImpl.LoginRegisterDaoImpl;
import com.myproj.service.LoginRegisterService;
@Service
public class LoginRegisterServiceImpl implements LoginRegisterService {

	@Autowired
	LoginRegisterDAO dao;  // = (LoginRegisterDAO) ServiceLocator.getXMLBean("LoginRegisterDaoIpl");



	@Override
	public LoginRegisterDTO login(LoginRegisterDTO dto) throws Exception {
	LoginRegisterDTO logindto = null;
	logindto=dao.login(dto);
	
		if(logindto!=null && dto.getUsername().equalsIgnoreCase(logindto.getUsername())) {
			logindto.setFlag(true);
		}
		return logindto;
	}

	@Override
	public boolean adduser(LoginRegisterDTO dto) throws Exception {
		boolean flag=dao.adduser(dto);
		return flag;
	}

	@Override
	public LoginRegisterDTO CheckExistingUser(LoginRegisterDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return dao.CheckExistingUser(dto);
	}

}
