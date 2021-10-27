package rmiauthentication;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class printer extends UnicastRemoteObject implements PrintService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected printer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String echo(String input) throws RemoteException {
		return "From Server:" + input;
	}
	
	
}
