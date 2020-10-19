package test;

import sn.forage.dao.ClientImpl;
import sn.forage.dao.IClient;
import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Client;
import sn.forage.entities.Village;

public class Test {

	public static void main(String[] arg) {
		IVillage villagedao = new VillageImpl();
		IClient clientdao = new ClientImpl();
		
		
		
		Client client = new Client();
		client.setPrenom("Mor");
		client.setNom("Diop");
		client.setAdress("Pire");
		client.setTelephone("772442688");
		//client.setVillage("Niany");
		
		Village village = new Village();
		village.setLibelle("Pire");
		
		int ok = clientdao.add(client);
		int osk = villagedao.add(village);
		System.out.println(ok);
		System.out.println(osk);
	}
}
