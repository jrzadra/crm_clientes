package com.ultimaschool.java;

import com.ultimaschool.java.clients.ClientBuilder;
import com.ultimaschool.java.domain.Client;
import com.ultimaschool.java.domain.Product;
import com.ultimaschool.java.repository.ClientRepository;
import com.ultimaschool.java.repository.DatabaseConnection;
import com.ultimaschool.java.repository.ProductRepository;

import java.sql.SQLException;

public class Main {
    public static void main( String[] args ) throws SQLException {

        /* Client clientF = new Client("Maria", "do Rocio",
        "Conceição", "123.456.789-00", "12/04/1978",
        'F', "mariadorocio78@gmail.com",
        "Rua Manoel Gallardo, nº 134, Labra - São Paulo",
        "(11) 99999-0000");
        System.out.println(clientF.toString() + "\n");
        
        Client clientM = new Client("Danilo", "",
        "Graciotto", "098.765.432-10", "22/07/1997",
        'M', "dangraciotto@outlook.com", 
        "Rua Augusta, nº 539, Centro - São Paulo",
        "(11) 11111-2222");
        System.out.println(clientM.toString() + "\n");

        ClientBuilder clientFCompleto = new ClientBuilder().withIdentification("Maria",
        "do Rocio", "Conceição", "123.456.789-00",
        "12/04/1978", 'F').withContacts("mariadorocio78@gmail.com",
        "Rua Manoel Gallardo, nº 134, Labra - São Paulo",
        "(11) 99999-0000");
        System.out.println(clientFCompleto.toString() + "\n");

        ClientBuilder clientMContacts = new ClientBuilder().withContacts(
        "dangraciotto@outlook.com", 
        "Rua Augusta, nº 539, Centro - São Paulo",
        "(11) 11111-2222");
        System.out.println(clientMContacts.toStringContacts() + "\n");

         ClientBuilder clientMIdentification = new ClientBuilder().withIdentification(
        "Danilo", "", "Graciotto", "098.765.432-10",
        "22/07/1997", 'M');
        System.out.println(clientMIdentification.toStringIdentification() + "\n"); */

       /*DatabaseConnection connection = DatabaseConnection.getInstance();
         DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection3 = DatabaseConnection.getInstance();
        DatabaseConnection connection4 = DatabaseConnection.getInstance();

        System.out.println(connection);
        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);
        System.out.println(connection4); */

        /* ClientRepository clientRepository = new ClientRepository();

        ClientRepository.findAll().forEach(System.out::println);

        Client client = clientRepository.findById(1);
            if (client != null) {
                System.out.println(client);
            } else {
                System.out.println("Cliente não encontrado");
            } */

         ProductRepository productRepository = new ProductRepository();

        // productRepository.insert(new Product(154.90f,"Teclado Bluetooth Preto"));

        // productRepository.findAll().forEach(System.out::println);

        // System.out.println("================================");

        /* Product productToUpdate = new Product(51, 154.90f,"Teclado Bluetooth Preto Multilaser");

        productRepository.update(productToUpdate);

        productRepository.findAll().forEach(System.out::println); */

        productRepository.delete(53);

        productRepository.findAll().forEach(System.out::println);

    }

}
