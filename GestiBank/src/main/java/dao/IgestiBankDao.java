package dao;

import java.io.Serializable;
import java.util.List;

import javax.management.Notification;
import javax.persistence.Id;

//import com.mysql.cj.protocol.Message;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Demande;
import entities.Document;
import entities.Transaction;
import entities.Utilisateur;

public interface IgestiBankDao<T, Id extends Serializable> {

public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();


	  
		
		
		
		

			

		}