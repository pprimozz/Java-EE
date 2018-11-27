package com.telusko.demoHib2;
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
    	
      Laptop laptop = new Laptop();
      laptop.setLid(101);
      laptop.setLname("Dell");
      
      
      Student s = new Student();
      s.setName("Navin");
      s.setRollno(1);
      s.setMarks(50);
      s.getLaptop().add(laptop);
      
      laptop.getStudent().add(s);  // samo za ManyToMany !
      
       Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
       SessionFactory sf = config.buildSessionFactory();
       Session session= sf.openSession();
       session.beginTransaction();
       
       session.save(laptop);
       session.save(s);

       session.getTransaction().commit();
       
  
    }
}
