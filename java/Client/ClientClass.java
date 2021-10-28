/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import com.mycompany.datasecurity.server.common.ClientInterface;
import com.mycompany.datasecurity.server.common.ServerInterface;
import java.io.Serializable;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author arwinder
 */
public class ClientClass implements ClientInterface ,Serializable{
    private ServerInterface server;
    public ClientClass() throws RemoteException, NotBoundException{
    Registry registry = LocateRegistry.getRegistry("localhost",6002);
    server = (ServerInterface) registry.lookup("print_server");
    System.out.println("Client Started!!");}
    
    public void print() throws RemoteException{
        System.out.println("Calling server");
        server.print("hello", "printer", this);
    }
    
    @Override
    public String[] authenticate() throws RemoteException {
        String[] authdata = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
	String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        authdata[0] = username;
        authdata[1] = password;
        return authdata;
        
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void functionFinish() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void functionFailed() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
