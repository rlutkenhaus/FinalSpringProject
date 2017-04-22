package edu.dmacc.spring.finalspringproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeDao {
	
	public void insertEmployee(Employee employeeToAdd){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("FinalSpringProject");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(employeeToAdd);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
		
	}
	
	public List<Employee> getAllEmployees(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("FinalSpringProject");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select e from Employee e";
		TypedQuery<Employee> typedQuery = em.createQuery(q, Employee.class);
		List<Employee> all = typedQuery.getResultList();
		return all;
	}
	
}
