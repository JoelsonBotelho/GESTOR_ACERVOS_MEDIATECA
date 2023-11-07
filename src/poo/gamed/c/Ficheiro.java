/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.gamed.c;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author JoelsonBotelho
 */
public class Ficheiro {
    
    static ObjectOutputStream saida;
    
    
    
    public void openfileObra (){
        try
        {
            saida = new ObjectOutputStream(
                    new FileOutputStream("obra.obr")
            );
            System.out.println("ficheiro aberto com sucesso");
        } catch (IOException ex) {
            System.err.println("erro na abertura do ficheiro obra");
        }
    }
    
    public void openfileRequisicao (){
        try
        {
            saida = new ObjectOutputStream(
                    new FileOutputStream("requisicao.req")
            );
            System.out.println("ficheiro aberto com sucesso");
        } catch (IOException ex) {
            System.err.println("erro na abertura do ficheiro requisicao");
        }
    }
}
