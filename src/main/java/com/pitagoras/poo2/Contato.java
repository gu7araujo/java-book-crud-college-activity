package com.pitagoras.poo2;

/**
 *
 * @author Gustavo Araujo Santos
 */
public class Contato {
    private String name;
    private String telefone;
    private String email;
    private String endereco;

    public Contato(String name, String telefone, String email, String endereco) {
        this.name = name;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    @Override
    public String toString() {
        return name;
    }  
}
