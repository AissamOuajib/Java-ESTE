package Main;

import java.sql.SQLException;
import java.util.List;

import DAO.ClientsDao;
import DAO.ClientsDaoImpl;
import Models.Client;

public class Test {
	public static void main(String[] args) throws SQLException {
		ClientsDao clientsDao = new ClientsDaoImpl();

		clientsDao.addClient(new Client(5, 1, "Titre", "Ouajib", "Aissam"));

		List<Client> clients = clientsDao.ListClients();
		for (Client c : clients) {
			System.out.println(c.toString());
		}
		clientsDao.DeleteClient(2);
	}
}
