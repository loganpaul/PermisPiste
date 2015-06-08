package com.epul.permisPiste.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by Pierre on 27/05/2015.
 */
public class SessionHibernate {
    private static SessionFactory sessionFactory;

    public SessionHibernate(){
        sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
    }

    public static Session openSession(){
        return sessionFactory.openSession();
    }

    public static void closeSession(){
        sessionFactory.close();
    }
}
