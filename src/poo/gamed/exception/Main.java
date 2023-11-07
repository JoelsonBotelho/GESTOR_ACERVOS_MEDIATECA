package poo.gamed.exception;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import poo.gamed.c.Ficheiro;
import poo.gamed.c.Obra;
import poo.gamed.c.Requisicao;
import poo.gamed.c.Utente;
import poo.gamed.enumerado.Situacao;

public class Main {
    
    static  Ficheiro ficheiro = new Ficheiro();
    static Utente utente;
    static Obra   obra = new Obra ();
    static Requisicao requisicao = new Requisicao ();
    static ArrayList<Utente> listaUtente = new ArrayList<Utente>();
//    static Situacao sitacao;
    
   
//Metodo que apresenta o menu princepal
    
    public  static void  menuPrincipal(){
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "-------------------------------------------------------------------------\n"
                    + "    GESTOR DE ACERVOS DE MEDIATECA - GAMED                               \n"
                    + "-------------------------------------------------------------------------\n"
                    + "               MENU PRINCIPAL                                            \n"
                    + "-------------------------------------------------------------------------\n"
                    + "      1. Abrir                                 \n"
                    + "      2. Guardar                               \n"
                    + "      3. Menu de Gestao de Utente              \n"
                    + "      4. Menu de Gestao de Obras               \n"
                    + "      5. Menu de Gestao de Requisicao          \n"
                    + "      6. Sair                                  \n"
                    + "-------------------------------------------------------------------------"));
            
            switch(opcao){
                case 1: ficheiro.openfileObra();
                        ficheiro.openfileRequisicao();
                        utente.openfileUtente();
                        break;
                case 2: break;
                case 3: menuUtente (); break;
                case 4: menuObra (); break;
                case 5: menuRequisicao  (); break;
                case 6: JOptionPane.showMessageDialog(null, "a fechar o sistema...\n\n\nsistema fechado"); break;
                default : break;
               
                }
        }while(opcao!=6);
        
        }//fim do menu principal
    
    
    
     
    //Metodo que apresenta o menu do utente
    public  static void  menuUtente(){
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "-------------------------------------------------------------------------\n"
                    + "    GESTOR DE ACERVOS DE MEDIATECA - GAMED                               \n"
                    + "-------------------------------------------------------------------------\n"
                    + "               MENU UTENTE                                               \n"
                    + "-------------------------------------------------------------------------\n"
                    + "      1. Registar utente                                                 \n"
                    + "      2. Mostrar utente                                                  \n"
                    + "      3. Mostrar utentes                                                 \n"
                    + "      4. Pagar multa                                                   \n"
                    + "      5. Sair                                                            \n"
                    + "-------------------------------------------------------------------------"));
            
            switch(opcao){
                case 1: 
                    registar(utente);
                    break;
                    
                case 2: 
                    utente = new Utente(1);
                    utente.setEmail(JOptionPane.showInputDialog("Informe o email do uetente, por favor!"));
                    mostrarUtente(utente, listaUtente); // nao consegui pegar a ideia de como mostrar o  nome, email, e situacao
                    break;
                     
                case 3:
                      utente = new Utente(3);
                      
                        
                case 4: 
                    break;
                    
                case 5: break;
                default : JOptionPane.showMessageDialog(null, "ops, opcao invalida");  break;
               
                }
        }while(opcao!=5);
        
        }//fim do menu utente
    
    
    
 
      public  static void  menuObra (){
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "-------------------------------------------------------------------------\n"
                    + "    GESTOR DE ACERVOS DE MEDIATECA - GAMED                               \n"
                    + "-------------------------------------------------------------------------\n"
                    + "                MENU OBRA                                                \n"
                    + "-------------------------------------------------------------------------\n"
                    + "      1. Registar obra                                                   \n"
                    + "      2. Mostrar obra                                                   \n"
                    + "      3. Mostrar obras                                                   \n"
                    + "      4. Efectuar pesquisa                                               \n"
                    + "      5. Sair                                                            \n"
                    + "-------------------------------------------------------------------------"));
            
            switch(opcao){
                    case 1:
                        String numero =JOptionPane.showInputDialog("digite o numero da obra");
                          obra.setNumero(numero);
                    
                        String titulo =JOptionPane.showInputDialog("digite o titulo da obra");
                            obra.setTitulo(titulo);
                     
                        // o numero do utente da class utente esta com o tipo dedo int e no msin ele nao esta aceitar int tentao bem te string
                    
                        String tipo =JOptionPane.showInputDialog("digite o tipo da obra");
                           obra.setTipo(tipo);
                    
                        //tem que se rever esse codigo nao entende porque que set gerou uma sitacao ativa
                    
                        String exemplares =JOptionPane.showInputDialog("digita o numero do exemplares");
                           obra.setExemplares(exemplares);
                           
                        String preco =JOptionPane.showInputDialog("digita o numero o preco");
                           obra.setPreco(preco);
                
                          break;
                    
                    case 2:  
                    case 3: 
                    case 4:
                    case 5: break;
                    default  : JOptionPane.showMessageDialog(null, "ops, opcao invalida"); break;
               
                }
        }while(opcao!=5);
        
        }//fim do menu obra
    
      
      
    public  static void  menuRequisicao(){
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "-------------------------------------------------------------------------\n"
                    + "    GESTOR DE ACERVOS DE MEDIATECA - GAMED                               \n"
                    + "-------------------------------------------------------------------------\n"
                    + "               MENU REQUISICAO                                           \n"
                    + "-------------------------------------------------------------------------\n"
                    + "      1. Requisitar obra                                                 \n"
                    + "      2. Devolver obra                                                   \n"
                    + "      3. Sair                                                            \n"
                    + "-------------------------------------------------------------------------"));
            
            switch(opcao){
                case 1: 
//                    String data_devolucao = JOptionPane.showInputDialog("digita a data devolucao");
//                    requisicao.setDatadevolucao(datadevolucao);
//                        
//                    
//                    String datarequisicao =JOptionPane.showInputDialog("digite a data de requisicao");
//                        requisicao.getDatarequisicao(datarequisicao)
                
                    break;
                case 2: break;
                case 3: break;
                default : JOptionPane.showMessageDialog(null, "ops, opcao invalida"); break;
               
                }
        }while(opcao!=3);
        
        }//fim do menu riquisicao
      
    public static void registar(Utente utente)
    {
        utente = new Utente(1);
        
//        utente.setNumero(());
        utente.setNome(requestName());
        utente.setEmail(requestEmail());
        utente.setSituacao(Situacao.getACTIVO());
        
        listaUtente.add(utente);
        
        JOptionPane.showMessageDialog(null, "Utente registado com SUCESSO! "+listaUtente.get(0).getEmail());
        
    }//Fim do método regtrar
    
    //Método que mostre dados de um utente
    public static void mostrarUtente(Utente utente, ArrayList<Utente> listaUtente)
    {
        boolean existe = false;
        if(listaUtente.isEmpty())
            JOptionPane.showMessageDialog(null, "Lista vazia");
        else{
            for(int k=0; k<listaUtente.size(); k++)
            {
                //Verifica se o utente existe, ou seja, pesquisa o utente na lista
               if(listaUtente.get(k).getEmail().compareTo(utente.getEmail()) == 0)
               {
                   JOptionPane.showMessageDialog(null, "\n================================================"
                                                     + "\n                Dados do Utente                 "
                                                     + "\n================================================"
                                                     + "\n Número: "+listaUtente.get(k).getNumero()     +""
                                                     + "\n Nome: "+listaUtente.get(k).getNome()         +""
                                                     + "\n Email: "+listaUtente.get(k).getEmail()       +""
                                                     + "\n Situação: "+listaUtente.get(k).getSituacao() +""
                                                     + "\n================================================");
                   existe = true;
                   break; 
               }
            }

            if(!existe)
                JOptionPane.showMessageDialog(null, "Utente não econtrado");
        }
    }
    
    
    
    //Leitura do nome
    public static String requestName()
    {
        String name = JOptionPane.showInputDialog("Nome do Utente");
        return name;
    }
    
    //Leitura do email
    public static String requestEmail()
    {
        String email = JOptionPane.showInputDialog("Email do Utente");
        return email;
    }
    
    public static void main(String grupo[]){
        menuPrincipal();
    }
    
}    
   
    

