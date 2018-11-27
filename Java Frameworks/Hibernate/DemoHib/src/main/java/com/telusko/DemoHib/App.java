package com.telusko.DemoHib;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an = new AlienName();
    	an.setFname("NavinKumarReddy");
    	an.setLname("Thatipalli");
    	an.setMname("BapReddy");
    	
       Alien telusko = new Alien();
       telusko.setAid(101);
       telusko.setColor("Green");
       telusko.setAname(an);
      
    	
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       
       SessionFactory sf = con.buildSessionFactory();
       
       Session session= sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
      // telusko = (Alien) session.get(Alien.class, 109);
       
       session.save(telusko);
       
      // session.save(telusko);
       
       tx.commit();
       
       System.out.println(telusko);
    }
}
