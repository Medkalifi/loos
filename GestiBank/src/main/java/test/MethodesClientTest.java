package test;


import java.util.List;

import javax.xml.bind.ParseConversionEvent;

import dao.GestibankIMPL;
import entities.Client;
import metier.ImetierIMPL;



public class MethodesClientTest {

	public static void main(String[] args) {
		
		ImetierIMPL metier = new ImetierIMPL();
		
		Client client1= new Client("cyril", "pirez", "1234", "cyrili@gmail.com", "euratech", "06102457", "M", 2, 200.00);
		Client client2= new Client("joud", "moha", "543", "abdel@hotmail.fr", "21 rue curie", "0687605487", "M", 0, 0.00);
		Client client3 =  new Client("Hind", "tigh", "4587", "hind@tigh.fr", "20 rue Amiens", "0214578", "M", 100, 7000.00);
		
		//creation Clients OK
		System.out.println("*** Persist - start ***");
		metier.persist(client1);
		metier.persist(client2);
		metier.persist(client3);
		
		
		//Affichage Liste Clients OK
		List<Client> clients = metier.findAll();
		System.out.println("clients Persisted are :");
		for (Client c : clients) {
			System.out.println("-" + c.toString());}
		System.out.println("*** Persist - end ***");

		
		//mise à jour Client KO
		/*System.out.println("*** Update - start ***");
		client1.setSalaire(8000);
		metier.update(client1);
		System.out.println("*** Update - end ***");*/
		
		
		//Chercher Client KO
		/*System.out.println("*** Find - start ***");
		Long id1 = client1.getId();
		Client another = metier.findById(id1);
		System.out.println("client found with id " + id1 + " is =>" + another.toString());
		System.out.println("*** Find - end ***");*/
		
		
		//Supprimer Client KO
		
		/*System.out.println("*** Delete - start ***");
		 client3.getId();
		metier.delete(client3);
		System.out.println("Deleted client with id " + client3 + ".");
		//System.out.println("Now all clients are " + metier.findAll().size() + ".");
		System.out.println("*** Delete - end ***");*/
		
		
		
		
		//chercher tous les clients    OK
		System.out.println("*** FindAll - start ***");
		List<Client> clientss = metier.findAll();
		System.out.println("customers found are :");
		for (Client c : clientss) {
			System.out.println("-" + c.toString());	}
		System.out.println("*** FindAll - end ***");
		
		//Supprimer tous les clienst  OK
		System.out.println("*** FindAll - end ***");
		System.out.println("*** DeleteAll - start ***");
		metier.deleteAll();
		System.out.println("clients found are now " + metier.findAll().size());
		System.out.println("*** DeleteAll - end ***");
		 System.exit(0);
		

		
	}
}
