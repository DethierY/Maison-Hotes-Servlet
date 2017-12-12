package maisonHotesServlet;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ClientsManager {
	
	private final static ClientsManager INSTANCE = new ClientsManager();
	private final Map<String, Client> listeResas = new HashMap<String, Client>();
	
	private ClientsManager(){
	}
	
	public static ClientsManager getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Client> getListeResas(){
		return listeResas;
	}
	
	public void addClient (Client client) {
		client.setDateResa (new Date());
		listeResas.put(client.getResaId(), client);
	}

}
