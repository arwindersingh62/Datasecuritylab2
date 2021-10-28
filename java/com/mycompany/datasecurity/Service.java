/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datasecurity;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author arwinder
 */
public interface Service extends Remote{
    public String echo(String input) throws RemoteException;
    
}
