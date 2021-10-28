/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datasecurity;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



/**
 *
 * @author arwinder
 */
public class Client {
  public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Service service = (Service) Naming.lookup("rmi://localhost:6002/hello");
		System.out.println("---"+service.echo("Hello Server"));
	}  
}
