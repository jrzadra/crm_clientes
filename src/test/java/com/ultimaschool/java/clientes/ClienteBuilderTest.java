package com.ultimaschool.java.clientes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteBuilderTest {
   
    private ClienteBuilder clienteBuilder; 
    private ClienteBuilder clienteBuilder2;

    @Before
    public void setUp() {
       clienteBuilder = new ClienteBuilder().comIdentificacao("Maria",
       "do Rocio", "Conceição", "123.456.789-00",
       "12/04/1978", 'F');
       clienteBuilder2 = new ClienteBuilder();
    }
   
    
    @Test
    public void testGetCpf() {
        assertEquals(clienteBuilder.getCpf(), "123.456.789-00");
        assertNull(clienteBuilder2.getCpf());
    }

    @Test
    public void testSetCpf() {
        clienteBuilder.setCpf("111.111.111-11");
        assertEquals(clienteBuilder.getCpf(), "111.111.111-11");
        clienteBuilder2.setCpf("222.222.222-22");
        assertEquals(clienteBuilder2.getCpf(), "222.222.222-22");
    }

    @Test
    public void testGetNomeCompleto() {
        assertEquals(clienteBuilder.getNomeCompleto(), "Maria do Rocio Conceição");
        assertNull(clienteBuilder2.getNomeCompleto());
    }

    @Test
    public void testSetNomeCompleto() {
        clienteBuilder.setNomeCompleto("Carlos Nascimento Gomez");
        assertEquals(clienteBuilder.getNomeCompleto(), "Carlos Nascimento Gomez");       
        clienteBuilder2.setNomeCompleto("Eduardo Moreira Vieira");
        assertEquals(clienteBuilder2.getNomeCompleto(), "Eduardo Moreira Vieira");
    }

    @Test
    public void testToStringIdentificacao() {
        assertEquals(clienteBuilder.toStringIdentificacao(),
         "Os dados pessoais são: Sra. Maria do Rocio Conceição, com CPF 123.456.789-00, data de nascimento 12/04/1978 com idade de 45 anos.");
        clienteBuilder.setGenero('M');
        assertEquals(clienteBuilder.toStringIdentificacao(),
        "Os dados pessoais são: Sr. Maria do Rocio Conceição, com CPF 123.456.789-00, data de nascimento 12/04/1978 com idade de 45 anos.");
        clienteBuilder.setGenero(' ');
        assertEquals(clienteBuilder.toStringIdentificacao(),
         "Os dados pessoais são:  Maria do Rocio Conceição, com CPF 123.456.789-00, data de nascimento 12/04/1978 com idade de 45 anos.");
         clienteBuilder.setGenero('@');
         assertEquals(clienteBuilder.toStringIdentificacao(),
          "Os dados pessoais são:  Maria do Rocio Conceição, com CPF 123.456.789-00, data de nascimento 12/04/1978 com idade de 45 anos.");
        

    }

    @After
    public void tearDown() {
        clienteBuilder = null;
        clienteBuilder2 = null;
    }
}
