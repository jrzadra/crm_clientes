package com.ultimaschool.java.clientes;

public class Cliente {
    
    private String nomeCompleto;

    private String primeiroNome;

    private String nomeDoMeio;

    private String sobrenome;

    private String cpf;

    private String dataDeNascimento;

    private int idadeAtual;

    private char genero;

    private String email;

    private String endereco;

    private String telefone;

    
    public Cliente(String nomeCompleto, String primeiroNome, String nomeDoMeio, String sobrenome,
     String cpf, String dataDeNascimento, int idadeAtual, char genero, String email, 
     String endereco, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.primeiroNome = primeiroNome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.idadeAtual = idadeAtual;
        this.genero = genero;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdadeAtual() {
        return idadeAtual;
    }

    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    private String tratamentoGenero() {
        if(getGenero() == 'M') {
            return "Sr. ";
        } else if(getGenero() == 'F') {
            return "Sra. ";
        } else {
            return "";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    @Override
    public String toString() {
        return tratamentoGenero() + getNomeCompleto() + ", com CPF " + getCpf() + " e Email " 
        + getEmail() + " ";
    }
}

