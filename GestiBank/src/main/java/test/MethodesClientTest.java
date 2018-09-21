package test;


import java.util.List;


import dao.GestibankIMPL;
import entities.Client;
import metier.ImetierIMPL;



public class MethodesClientTest {

	public static void main(String[] args) {
		
		ImetierIMPL metier = new ImetierIMPL();
		
		Client client1= new Client("cyril", "pirez", "1234", "cyrili@hotmail.fr", "21 rue des etoies", "06102457", "M", 2, 200.00);
		Client client2= new Client("joud", "moha", "543", "abdel@hotmail.fr", "21 rue curie", "0687605487", "M", 0, 0.00);
		
		System.out.println("*** Persist - start ***");
		
		metier.persist(client1);
		metier.persist(client2);

		List<Client> clients = metier.findAll();
		
		System.out.println("clients Persisted are :");
		for (Client c : clients) {
			System.out.println("-" + c.toString());
		}
		System.out.println("*** Persist - end ***");
		
		
		
		
	}
	

}
