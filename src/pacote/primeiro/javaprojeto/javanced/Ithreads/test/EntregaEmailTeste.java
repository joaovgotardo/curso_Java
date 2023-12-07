package pacote.primeiro.javaprojeto.javanced.Ithreads.test;

import pacote.primeiro.javaprojeto.javanced.Ithreads.dominio.Membros;
import pacote.primeiro.javaprojeto.javanced.Ithreads.servico.EntregaEmail;

import javax.swing.*;

public class EntregaEmailTeste {
    public static void main(String[] args) {
        Membros membros = new Membros();
        Thread primeiro = new Thread(new EntregaEmail(membros), "Primeiro");
        Thread segundo = new Thread(new EntregaEmail(membros), "Segundo");
        primeiro.start();
        segundo.start();
        //Essas são as threads que vão enviar os e-mails.

        //Criação de e-mais:
        while(true){
            //Para digitar o e-mail;
            String s = JOptionPane.showInputDialog("Digite o e-mail: ");
            if(s.isEmpty() || s == null){
                membros.fechar();
                break;
            }
            membros.adicionarMembros(s);
        }
    }
}
