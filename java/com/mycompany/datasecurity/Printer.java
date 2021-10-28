/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datasecurity;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author arwinder
 */
public class Printer extends UnicastRemoteObject implements Service
{
    protected Printer() throws RemoteException{
    super();}
            

    @Override
    public String echo(String input) throws RemoteException {
        return "From Server:" + input; 
    }
    
}
