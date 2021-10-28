/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datasecurity.server.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author arwinder
 */
public interface ServerInterface extends Remote {
    	void print(String filename, String printer, ClientInterface client) throws RemoteException; 
	// prints file filename on the specified printer
	
	void queue(String printer, ClientInterface client) throws RemoteException;   
	// lists the print queue for a given printer on the user's display in lines of the form <job number>   <file name>
	
	void topQueue(String printer, int job, ClientInterface client) throws RemoteException;   
	// moves job to the top of the queue
	
	void start(ClientInterface client) throws RemoteException;   
	// starts the print server
	
	void stop(ClientInterface client) throws RemoteException;   
	// stops the print server
	
	void restart(ClientInterface client) throws RemoteException;   
	// stops the print server, clears the print queue and starts the print server again
	
	void status(String printer, ClientInterface client) throws RemoteException;  
	// prints status of printer on the user's display
	
	void readConfig(String parameter, ClientInterface client) throws RemoteException;   
	// prints the value of the parameter on the user's display
	
	void setConfig(String parameter, String value, ClientInterface client) throws RemoteException;  
	// sets the parameter to value
    
    
}