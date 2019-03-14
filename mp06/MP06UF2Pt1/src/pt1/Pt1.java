/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1;

import mp06.util.HibernateUtil;
import java.util.Iterator;
import mp06.entity.Vehiculos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author mirokshi
 */
public class Pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SessionFactory instancia = HibernateUtil.getSessionFactory();
       Session session = instancia.openSession();
       Query q = session.createQuery("from Vehiculos");
       
       Iterator<Vehiculos> it = q.iterate();
       Vehiculos v;
       
        while (it.hasNext()) {
            v = it.next();
            System.out.println(v);
        }
        
        
        session.close();
        System.exit(0);
    }
    
}
