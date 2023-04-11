package com.ultimaschool.java.clientes;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteBuilderTest {
   
    private ClienteBuilder clienteBuilder; 

    @Before
    public void setUp() {
       clienteBuilder = new ClienteBuilder().comIdentificacao("Maria",
       "do Rocio", "Conceição", "123.456.789-00",
       "12/04/1978", 'F');
    }
   
    
    @Test
    public void testGetCpf() {
        assertEquals(clienteBuilder.getCpf(), "123.456.789-00");
    }

    @Test
    public void testSetCpf() {
        clienteBuilder.setCpf("111.111.111-11");
        assertEquals(clienteBuilder.getCpf(), "111.111.111-11");
    }

    @Test
    public void testName() {
        
    }

   
    @After
    public void tearDown() {
        clienteBuilder = null;
    }
}
