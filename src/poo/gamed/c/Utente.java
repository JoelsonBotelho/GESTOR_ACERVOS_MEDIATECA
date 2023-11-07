package poo.gamed.c;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import poo.gamed.enumerado.Situacao;

public class Utente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declaracao de atributos 
    private int numero;
    private String email;
    private String nome;
    private Situacao situacao;
	static ObjectOutputStream saida;

    public Utente(int numero) {
        this.numero += numero;
    }
    
    //Abetura do ficheiro para leitura
    public void openfileUtente (){
        try
        {
            saida = new ObjectOutputStream(
                    new FileOutputStream("utente.ser")
            );
            System.out.println("ficheiro aberto com sucesso");
        } catch (IOException ex) {
            System.err.println("erro na abertura do ficheiro utente");
        }
    }
    
    //Méodo para gravar os dados do UTENTE no ficheiro
    public boolean gravarDados(ArrayList<Utente> listaUtente)
    {
      return true;  
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

     public void setEmail(String Email) {
        this.email = Email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    
//    public int getIDUtente()
//    {
//        return Utente.numero++;
//    }

}
