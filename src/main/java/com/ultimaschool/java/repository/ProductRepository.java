package com.ultimaschool.java.repository;

import com.ultimaschool.java.domain.Product;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private DatabaseConnection connection;

    public ProductRepository() {
        this.connection = DatabaseConnection.getInstance();
    }

    public List<Product> findAll() throws SQLException {
        List<Product> productsList = new ArrayList<>();

        String sql = "SELECT * FROM crm_aula.produto";

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setPreco(resultSet.getFloat("preco"));
            product.setNome(resultSet.getString("nome"));
            productsList.add(product);
        }

        return productsList;
    }

    public boolean insert(Product product) throws SQLException {
        boolean inserted;

        String sql = "INSERT INTO produto (preco, nome) VALUES (?,?)";

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement(sql);

        preparedStatement.setFloat(1, product.getPreco());
        preparedStatement.setString(2, product.getNome());

    inserted = preparedStatement.execute();

        return false;
    }

}
