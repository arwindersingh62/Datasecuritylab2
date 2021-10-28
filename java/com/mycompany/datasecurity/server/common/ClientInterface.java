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
public interface ClientInterface extends Remote{
	String[] authenticate() throws RemoteException;
	void functionFinish() throws RemoteException;
	void functionFailed() throws RemoteException;
}

