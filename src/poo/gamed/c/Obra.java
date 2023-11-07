package poo.gamed.c;

import java.io.Serializable;
import poo.gamed.enumerado.Tipo;

public class Obra implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declaracao de atributos 
    private String numero;       
    private String titulo;
    private Tipo tipo;
    private int exemplares;
    private float preco;
    
    public Obra (){
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setPreco(String preco) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setExemplares(String exemplares) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }        
}