package maisonHotesServlet;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ClientsManager {
	
	private final static ClientsManager INSTANCE = new ClientsManager();
	private final Map<String, Client> listeClients = new HashMap<String, Client>();
	
	private ClientsManager(){
	}
	
	public static ClientsManager getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Client> getListeClients(){
		return listeClients;
	}
	
	public void addClient (Client client) {
		client.setDateResa (new Date());
		listeClients.put(client.getResaId(), client);
	}

}
