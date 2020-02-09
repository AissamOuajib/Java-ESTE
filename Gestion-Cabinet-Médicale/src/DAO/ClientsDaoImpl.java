package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ConnectionBD.ConnectionBd;
import Models.Client;

public class ClientsDaoImpl implements ClientsDao {

	@Override
	public List<Client> ListClients() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = (Connection) ConnectionBd.GetConnecttion();
		List<Client> clients = new ArrayList<>();

		String query = "SELECT *  FROM clients";
		PreparedStatement pr = (PreparedStatement) connection.prepareStatement(query);
		ResultSet resultSet = pr.executeQuery();

		while (resultSet.next()) {
			Client client = new Client();
			client.setId(resultSet.getInt("id"));
			client.setVersion(resultSet.getInt("version"));
			client.setTitre(resultSet.getString("titre"));
			client.setNom(resultSet.getString("nom"));
			client.setPrenom(resultSet.getString("prenom"));
			clients.add(client);
		}
		pr.close();
		return clients;
	}

	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		Connection connection = (Connection) ConnectionBd.GetConnecttion();
		String query = "INSERT INTO Clients (id,version,titre,nom,prenom) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, client.getId());
			preparedStatement.setInt(2, client.getVersion());
			preparedStatement.setString(3, client.getTitre());
			preparedStatement.setString(4, client.getNom());
			preparedStatement.setString(5, client.getPrenom());

			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Added successfully!");
	}

	@Override
	public void DeleteClient(int _id) {
		// TODO Auto-generated method stub
		Connection connection = (Connection) ConnectionBd.GetConnecttion();
		String query = "delete from Clients where id=" + _id;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Deleted Succefully!");
	}

}
