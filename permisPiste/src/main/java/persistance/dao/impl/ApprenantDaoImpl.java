package persistance.dao.impl;

import java.util.List;

import modele.Apprenant;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import persistance.dao.IApprenantDao;


public class ApprenantDaoImpl implements IApprenantDao{

	private SessionFactory	sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Apprenant> getAllApprenant() {
		
		Session currentSession = this.sessionFactory.openSession();
		Query query = currentSession.createQuery("from Apprenant");
		List<Apprenant> apprenants = query.list();
		currentSession.close();

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

}
