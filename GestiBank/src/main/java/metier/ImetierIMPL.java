
package metier;

import java.util.List;



import dao.GestibankIMPL;
import entities.Client;

public class ImetierIMPL {
	
	private static GestibankIMPL dao;
	
	public ImetierIMPL() {
		dao = new GestibankIMPL();
	}

	
	

	public void persist(Client entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}
		


	public void update(Client entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Client findById(String id) {
		dao.openCurrentSession();
		Client client = dao.findById(id);
		dao.closeCurrentSession();
		return client;
	}

	public void delete(String id) {
		dao.openCurrentSessionwithTransaction();
		Client client = dao.findById(id);
		dao.delete(client);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Client> findAll() {
		dao.openCurrentSession();
		List<Client> clients = dao.findAll();
		dao.closeCurrentSession();
		return clients;
	}

	public void deleteAll() {
		dao.openCurrentSessionwithTransaction();
		dao.deleteAll();
		dao.closeCurrentSessionwithTransaction();
	}
	
	public GestibankIMPL dao () {
		return dao;
	}
	
	
}

	