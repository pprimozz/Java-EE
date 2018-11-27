package com.telusko.demoHQL;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
       SessionFactory sf = config.buildSessionFactory();
       Session session= sf.openSession();
       session.beginTransaction();
    //   Random r = new Random();
     
       /*
       for(int i=1;i<=50;i++) {
    	   Student s = new Student();
    	   s.setRollno(i);
    	   s.setName("Name " + i);
    	   s.setMarks(r.nextInt(100));
    	   session.save(s);
    	   }
    	  */
       Query q = session.createQuery("from Student where marks=50");
       List<Student> students =  q.list();
       
       //Student student= (Student)q.uniqueResult();  samo za 1 Rezultat!
       
       for(Student s : students) {
    	   
    	   System.out.println(s);
       }
       
       session.getTransaction().commit();
       
  
    }
}
