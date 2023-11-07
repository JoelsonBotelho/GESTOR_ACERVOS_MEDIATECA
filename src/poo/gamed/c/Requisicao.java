/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.gamed.c;

import java.io.Serializable;

/**
 *
 * @author JoelsonBotelho
 */
public class Requisicao implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String data_devolucao;
    private String data_requisicao;
    private Utente utente;
    private Obra obra;
    
    public Requisicao (){
        
       
        
    }

    public String getDatadevolucao() {
        return data_devolucao;
    }

    public void setDatadevolucao(String datadevolucao) {
        this.data_devolucao = datadevolucao;
    }

    public String getDatarequisicao() {
        return data_requisicao;
    }

    public void setDatarequisicao(String datarequisicao) {
        this.data_requisicao = datarequisicao;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setutente(Utente utente) {
        this.utente = utente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
}

