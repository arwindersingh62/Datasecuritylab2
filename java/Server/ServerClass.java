/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Client.ClientClass;
import com.mycompany.datasecurity.server.common.ClientInterface;
import com.mycompany.datasecurity.server.common.ServerInterface;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

/**
 *
 * @author arwinder
 */
public class ServerClass implements ServerInterface {
    
    private static final Logger LOGGER = Logger.getLogger("ServerLog");
    public ServerClass() throws NoSuchAlgorithmException,IOException {
        int PORT = 6002;
        UnicastRemoteObject.exportObject(this, PORT);
    }
    
    @Override
    public void print(String filename, String printer, ClientInterface client) throws RemoteException {
        System.out.println("Calling clinet authh");
        String[] authdata = client.authenticate();
        System.out.println("auht called");
        LOGGER.info("At Server: Print called by "+ authdata[0] +"for printer"+ printer + "to print file:"+filename);
    }

    @Override
    public void queue(String printer, ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void topQueue(String printer, int job, ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start(ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop(ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restart(ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void status(String printer, ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readConfig(String parameter, ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setConfig(String parameter, String value, ClientInterface client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


