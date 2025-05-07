/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.poo.sistema_bancario_admin.model.domain;



/**
 *
 * @author mathe
 */
public class Gerente extends Pessoa {
    
        private Long idGerente;
        private Agencia agencia;

    public Gerente() {
    }

    public Gerente(Long idGerente) {
        this.idGerente = idGerente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

}