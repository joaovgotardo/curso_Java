package pacote.primeiro.javaprojeto.javanced.Ithreads.servico;

import pacote.primeiro.javaprojeto.javanced.Ithreads.dominio.Membros;

public class EntregaEmail implements Runnable {
    //Classe para enviar e-mails.
    private final Membros membros;

    public EntregaEmail(Membros membros) {
        this.membros = membros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + "começou a mandar e-mails.");
        //E-mails pendentes foi criado para não liberar o acesso para os members pelo get
        while(membros.isAberto() || membros.emailsPendentes() > 0){
            try{
                String m = membros.reterEmail();
                if(m == null) continue; //Se a queue com os membros for nula, ele continuará
                //esperando.
                System.out.println(Thread.currentThread().getName() + "enviando e-mail para: "
                    + m);
                Thread.sleep(1500);
                System.out.println("E-mail enviado.");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("E-mails enviados.");
    }
}
