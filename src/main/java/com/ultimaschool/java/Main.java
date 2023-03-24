package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main( String[] args ) {
        
        Cliente clienteF = new Cliente("123.456.789-00", "carmensilva@gmail.com",
         "Carmen Silva Vieira", 'F');
       
        System.out.println(clienteF.toString() + "\n");
        
        Cliente clienteM = new Cliente("999.888.777-66", "rogergraciotto98@gmail.com",
        "Roger Graciotto Moreira", 'M');
        System.out.println(clienteM.toString());
    }
}
