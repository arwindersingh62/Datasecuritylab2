package rmiauthentication;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationServer {
	public static void main(String[] args) throws RemoteException {
		Registry registry = LocateRegistry.createRegistry(6002);
		registry.rebind("hello", new printer());
	}

}
