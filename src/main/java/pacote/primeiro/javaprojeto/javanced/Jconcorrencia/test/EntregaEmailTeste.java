package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Membros;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.EntregaEmail;

import javax.swing.*;

public class EntregaEmailTeste {
    public static void main(String[] args) {
        Membros membros = new Membros();
        Thread elias = new Thread(new EntregaEmail(membros), "Elias");
        Thread eliseu = new Thread(new EntregaEmail(membros), "Eliseu");
        elias.start();
        eliseu.start();

        while(true){
            String s = JOptionPane.showInputDialog("Digite o e-mail: ");
            if(s.isEmpty() || s == null){
                membros.fechar();
                break;
            }
            membros.adicionarMembros(s);
            //O synchronized poderia ser usado sem problemas nesse caso; é recomendado um
            //benchmark para verificar qual teria melhor desempenho.
        }
    }

}
