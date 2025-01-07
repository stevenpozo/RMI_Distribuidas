/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverrmi;

import shared.IHelloService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author steve
 */
public class HelloServiceImplement extends UnicastRemoteObject implements IHelloService{

    public HelloServiceImplement() throws RemoteException {
        super();    
    }
    
    @Override
    public String sayHello(String name) throws RemoteException{
        return "Hola jaja, "+name+"!";
    }
    
}
