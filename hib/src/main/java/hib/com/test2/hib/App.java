package hib.com.test2.hib;

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
        System.out.println( "Hello World!" );
        
        Alien niku = new Alien();
        niku.setAid(1);
        niku.setAname("dum");
        niku.setCid(101);
        niku.setcName("blue");
        
        Configuration con = new Configuration();
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
         session.save(niku);
        
    }
}
