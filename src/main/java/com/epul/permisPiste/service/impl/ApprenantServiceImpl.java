package com.epul.permisPiste.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epul.permisPiste.modele.Apprenant;
import com.epul.permisPiste.persistance.dao.IApprenantDao;
import com.epul.permisPiste.service.IApprenantService;

public class ApprenantServiceImpl implements IApprenantService {

	@Autowired
	private IApprenantDao apprenantDAO;

	
	
//	public IApprenantDao getApprenantDAO() {
//		return apprenantDAO;
//	}

	public void setApprenantDAO(IApprenantDao apprenantDAO) {
		this.apprenantDAO = apprenantDAO;
	}

	@Override
	public List<Apprenant> getAllApprenant() {
		return apprenantDAO.getAllApprenant();
	}

	@Override
	public Apprenant getApprenant(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean suppressApprenant(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addApprenant(Apprenant apprenant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyApprenant(Apprenant apprenant) {
		// TODO Auto-generated method stub
		return false;
	}

}
