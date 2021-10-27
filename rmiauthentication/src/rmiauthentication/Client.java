package rmiauthentication;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		PrintService service = (PrintService) Naming.lookup("rmi://localhost:6091/hello");
		System.out.println("---"+service.echo("Hello Server"));
	}
}
