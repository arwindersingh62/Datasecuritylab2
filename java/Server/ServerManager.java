/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Client.ClientClass;
import com.mycompany.datasecurity.server.common.ClientInterface;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author arwinder
 */
public class ServerManager {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, RemoteException, AlreadyBoundException{
    ServerClass server = new ServerClass();
    Registry registry = LocateRegistry.createRegistry(6002);
    registry.bind("print_server", server);
    System.out.println("Print Server Started!!!");
    
  
    }
    
}
