package com.telusko.hibtest;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
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
        
        List<ALien> list = new ArrayList<ALien>();
        
        for (int x=1; x<=100; x++){
            ALien y= new ALien();
            y.setId(x);
            y.setName("Alien - "+x);
            y.setLastName("last name: "+x);
            list.add(y);
        }
        
        
      Configuration con = new Configuration().configure().addAnnotatedClass(ALien.class);
       
       SessionFactory sf = con.buildSessionFactory();
       
       Session session= sf.openSession();
       
       Transaction tx = session.beginTransaction();
      
       
      for (ALien x : list){
       session.save(x);
      }
  //  Query q = session.createQuery("from alien");

      // List<ALien> aliens =  q.list();
      ALien result = new ALien();
      
      result = (ALien) session.get(ALien.class, 1);
       
       //Student student= (Student)q.uniqueResult();  samo za 1 Rezultat!
       tx.commit();
     //  for(ALien s : aliens) {
    	   
    	   System.out.println(result);
  //     }
       
    }
}
