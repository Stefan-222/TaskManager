package instrDB_Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.User;
 
public class Test {
 
    public static void main(String[] args) {
 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        User student = new User();
        student.setUser("Mukesh");
        
 
        Transaction tx = session.beginTransaction();
        session.save(student);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
}
