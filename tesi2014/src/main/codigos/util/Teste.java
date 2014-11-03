package util;

import org.hibernate.Session;

import entity.Carro;

public class Teste {

	public static void main(String[] args) {

		Carro c = new Carro();
		c.setIdCarro(1);
		c.setAno(2014);
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(c);
		s.getTransaction().commit();
		s.close();
	}

}
