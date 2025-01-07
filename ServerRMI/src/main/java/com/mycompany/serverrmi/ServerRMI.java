/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serverrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author steve
 */
public class ServerRMI {

    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            
            HelloServiceImplement helloService = new HelloServiceImplement();
            
            Naming.rebind("HelloService", helloService);
            
            System.out.println("Servidor listo y escuchando uwu");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
