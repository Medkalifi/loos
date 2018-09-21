package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Utilisateur;

public class UtilisateurTest {

	public static void main(String[] args) {
		//Utilisateur user= new Utilisateur("moha", "SonPrenom", "787","kksk@ho.fr", "rue 5");
		Client client =new Client("kalifi", "moha", "1234", "kalifi@hotmail.fr", "21 rue curie", "06105487", "M", 2, 0.00);
		Agent agent = new Agent("conseiller1", "paul", "poau", "lloaj@gdd.fr", "5 rue de la rue");
		Administrateur admin = new Administrateur("mars", "hamid","EREEAA", "maail@fr","partout");
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("banqueProject" );
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//em.persist(user);
		em.persist(client);
		em.persist(agent);
		em.persist(admin);
		em.getTransaction().commit();
		em.close();
		
		
		
	}

}
