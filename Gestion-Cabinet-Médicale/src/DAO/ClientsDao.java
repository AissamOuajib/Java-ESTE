package DAO;

import java.sql.SQLException;
import java.util.List;

import Models.Client;

public interface ClientDao {
	public List<Client> ListClients() throws SQLException;

	public void addClient(Client c);

	public void DeleteClient(int _id);
}
