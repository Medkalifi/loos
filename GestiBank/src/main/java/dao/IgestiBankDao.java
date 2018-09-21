package dao;

import java.io.Serializable;
import java.util.List;

import javax.management.Notification;
import javax.persistence.Id;

//import com.mysql.cj.protocol.Message;



public interface IgestiBankDao<T, Id extends Serializable> {

public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Long id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();


	  
		
		
		
		

			

		}