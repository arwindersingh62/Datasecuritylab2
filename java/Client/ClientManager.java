/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author arwinder
 */
public class ClientManager {
    public static void main(String[] args) throws RemoteException, NotBoundException{
        ClientClass client = new ClientClass();
        client.print();
    }
    
}
