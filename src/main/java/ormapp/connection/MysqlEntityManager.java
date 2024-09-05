package ormapp.connection;

import java.sql.Connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MysqlEntityManager {
	
	
	public static EntityManager  em;
	
	public static EntityManager getEntityManager() {
		
		if(em == null) {
		EntityManagerFactory emf =   Persistence.createEntityManagerFactory("MysqlPersistence");
		
		
	       em = emf.createEntityManager();
		}
		
		return em;
	}

}
