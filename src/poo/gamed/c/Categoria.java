package poo.gamed.c;

public class Categoria {
    
    //Declaracao e inicializacao de um array
    
    String[] descricao = { "obra de referencia", "obra de ficção", "obra tecnicas e cientificas"};  
  
    //retorna a categoria em uma terminada posicao

    public String requestCategoria(int pos){ 
        return descricao[pos];
    }
 }  
