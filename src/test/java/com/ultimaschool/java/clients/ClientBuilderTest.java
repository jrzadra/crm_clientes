package com.ultimaschool.java.clients;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientBuilderTest {

    private ClientBuilder clientBuilder;
    private ClientBuilder clientBuilder2;

    @Before
    public void setUp() {
        clientBuilder = new ClientBuilder().withIdentification("Maria",
                "do Rocio", "Conceição", "123.456.789-00",
                "12/04/1978", 'F');
        clientBuilder2 = new ClientBuilder();
    }


    @Test
    public void testGetCpf() {
        assertEquals(clientBuilder.getCpf(), "123.456.789-00");
        assertNull(clientBuilder2.getCpf());
    }

    @Test
    public void testSetCpf() {
        clientBuilder.setCpf("111.111.111-11");
        assertEquals(clientBuilder.getCpf(), "111.111.111-11");
        clientBuilder2.setCpf("222.222.222-22");
        assertEquals(clientBuilder2.getCpf(), "222.222.222-22");
    }

    @Test
    public void testGetFullName() {
        assertEquals(clientBuilder.getFullName(), "Maria do Rocio Conceição");
        assertNull(clientBuilder2.getFullName());
    }

    @Test
    public void testSetFullName() {
        clientBuilder.setFullName("Carlos Nascimento Gomez");
        assertEquals(clientBuilder.getFullName(), "Carlos Nascimento Gomez");
        clientBuilder2.setFullName("Eduardo Moreira Vieira");
        assertEquals(clientBuilder2.getFullName(), "Eduardo Moreira Vieira");
    }

    @Test //Teste de gênero
    public void testToStringIdentification() {
        assertEquals(clientBuilder.toStringIdentification(),
                "Os dados pessoais são: Sra. Maria do Rocio Conceição, com CPF 123.456.789-00," +
                        " data de nascimento 12/04/1978 com idade de 45 anos.");
        clientBuilder.setGender('M');
        assertEquals(clientBuilder.toStringIdentification(),
                "Os dados pessoais são: Sr. Maria do Rocio Conceição, com CPF 123.456.789-00," +
                        " data de nascimento 12/04/1978 com idade de 45 anos.");
        clientBuilder.setGender(' ');
        assertEquals(clientBuilder.toStringIdentification(),
                "Os dados pessoais são:  Maria do Rocio Conceição, com CPF 123.456.789-00," +
                        " data de nascimento 12/04/1978 com idade de 45 anos.");
        clientBuilder.setGender('@');
        assertEquals(clientBuilder.toStringIdentification(),
                "Os dados pessoais são:  Maria do Rocio Conceição, com CPF 123.456.789-00," +
                        " data de nascimento 12/04/1978 com idade de 45 anos.");

    }

    @Test
    public void testGetBirthDate() {
        assertEquals(clientBuilder.getBirthDate(),"12/04/1978");
        assertNull(clientBuilder2.getBirthDate());
    }

    @Test
    public void testSetBirthDate() {
        clientBuilder.setBirthDate("22/11/1989");
        assertEquals(clientBuilder.getBirthDate(), "22/11/1989");
        clientBuilder.setBirthDate("02/06/2004");
        assertEquals(clientBuilder.getBirthDate(), "02/06/2004");
    }

    @After
    public void tearDown() {
        clientBuilder = null;
        clientBuilder2 = null;
    }
}