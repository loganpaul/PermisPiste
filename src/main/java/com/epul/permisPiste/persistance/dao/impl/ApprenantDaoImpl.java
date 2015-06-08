package com.epul.permisPiste.persistance.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.epul.permisPiste.modele.Apprenant;
import com.epul.permisPiste.persistance.dao.IApprenantDao;
import com.epul.permisPiste.utils.SessionHibernate;

public class ApprenantDaoImpl implements IApprenantDao {

	@Override
	public List<Apprenant> getAllApprenant() {

		Session currentSession = new SessionHibernate().openSession();
		Query query = currentSession.createQuery("from Apprenant");
		List<Apprenant> apprenants = query.list();
		System.out.println(apprenants);
		SessionHibernate.closeSession();

		return apprenants;
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
