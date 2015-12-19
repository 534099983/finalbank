package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RateDAL {


	public static double getRate(double GivenCreditScore) {
		
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			double  tblRateGet = (Double) null;		
			
			try {
				tx = session.beginTransaction();	
										
				Query query = session.createQuery("from RateDomainModel  where GivenCreditScore = : ");
				query.setParameter("GivenCreditScore", GivenCreditScore);
				
				List<?> list = query.list();
				tblRateGet = (Double) list.get(0);
				
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return tblRateGet;
				
	}
	
}