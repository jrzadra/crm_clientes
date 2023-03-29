package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;
import com.ultimaschool.java.clientes.ClienteBuilder;

public class Main {
    public static void main( String[] args ) {

        Cliente clienteF = new Cliente("Maria", "do Rocio",
        "Conceição", "123.456.789-00", "12/04/1978",
        'F', "mariadorocio78@gmail.com",
        "Rua Manoel Gallardo, nº 134, Labra - São Paulo",
        "(11) 99999-0000");
        System.out.println(clienteF.toString() + "\n");
        
        Cliente clienteM = new Cliente("Danilo", "",
        "Graciotto", "098.765.432-10", "22/07/1997",
        'M', "dangraciotto@outlook.com", 
        "Rua Augusta, nº 539, Centro - São Paulo",
        "(11) 11111-2222");
        System.out.println(clienteM.toString() + "\n");

        ClienteBuilder clienteFCompleto = new ClienteBuilder().comIdentificacao("Maria",
        "do Rocio", "Conceição", "123.456.789-00",
        "12/04/1978", 'F').comContatos("mariadorocio78@gmail.com",
        "Rua Manoel Gallardo, nº 134, Labra - São Paulo",
        "(11) 99999-0000");
        System.out.println(clienteFCompleto.toString() + "\n");

        ClienteBuilder clienteMContatos = new ClienteBuilder().comContatos(
        "dangraciotto@outlook.com", 
        "Rua Augusta, nº 539, Centro - São Paulo",
        "(11) 11111-2222");
        System.out.println(clienteMContatos.toStringContatos() + "\n");

        ClienteBuilder clienteMIdentificacao = new ClienteBuilder().comIdentificacao(
        "Danilo", "", "Graciotto", "098.765.432-10",
        "22/07/1997", 'M');
        System.out.println(clienteMIdentificacao.toStringIdentificacao() + "\n");
    }
}
