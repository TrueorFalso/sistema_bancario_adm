
package com.unincor.poo.sistema_bancario_admin.model.domain;

import java.time.LocalDate;

/**
 *
 * @author mathe
 */
public class Cliente extends Pessoa {
        
    
        private Long idCliente;
      

    public Cliente() {
    }

        public Cliente(Long idCliente, String nome, String cpf, LocalDate dataNascimento, String email, String telefone, String senhaHash) {
            this.idCliente = idCliente;
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
            this.email = email;
            this.telefone = telefone;
            this.senhaHash = senhaHash;
        }

    
        
   

    public Long getId() {
        return idCliente;
    }

    public void setId(Long id) {
        this.idCliente = id;
    }

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }
    
 
    
        
}
