package com.telusko.demoHibCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a = null;
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session1= sf.openSession();
        session1.beginTransaction();
        
        a = (Alien) session1.get(Alien.class, 101);
        System.out.print(a);
        
        session1.getTransaction().commit();
        session1.close();
        
        Session session2= sf.openSession();
        session2.beginTransaction();
        
        a = (Alien) session2.get(Alien.class, 101);
        System.out.print(a);
        
        session2.getTransaction().commit();
        session2.close();

        
    }
}
