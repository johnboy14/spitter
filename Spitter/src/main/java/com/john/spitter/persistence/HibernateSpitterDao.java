package com.john.spitter.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.john.spitter.domain.Spitter;

@Repository
public class HibernateSpitterDao implements SpitterDao{
	
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateSpitterDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addSpitter(Spitter spitter) {
		currentSession().save(spitter);
		
	}

	@Override
	public Spitter getSpitterById(long id) {
		return (Spitter) currentSession().get(Spitter.class, id);
	}

	@Override
	public void saveSpitter(Spitter spitter) {
		currentSession().save(spitter);	
	}

}
