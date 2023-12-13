package pacote.primeiro.javaprojeto.javanced.Ithreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
    //queue é feito para segurar elementos antes do processamento.
    private final Queue<String> emails = new ArrayBlockingQueue<>(5);
    private boolean aberto = true;

    public boolean isAberto(){
        return aberto;
    }

    public int emailsPendentes(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void adicionarMembros(String email){
        synchronized (emails){
            System.out.println("E-mail adicionado por: " +
                    Thread.currentThread().getName());
            this.emails.add(email);
            //Voltar quando a thread estiver esperando (notify)
            this.emails.notifyAll(); //Avisa todas as threads.
        }
    }

    public String reterEmail(){
        System.out.println("Checagem da existencia de e-mails por: " +
                Thread.currentThread().getName());
        synchronized (this.emails){
            while (this.emails.isEmpty()){
                if(!aberto) return null;
                System.out.println("Não há e-mails disponíveis para: " +
                        Thread.currentThread().getName() + ", modo de espera");
                try{
                    //Wait só pode ser chamado se: a exceção for tratada e houver o lock, ou
                    //seja, deve-se estar dentro de um synchronized.
                    this.emails.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return this.emails.poll(); //Remove o primeiro da fila.
        }
    }

    public void fechar(){
        aberto = false;
        synchronized (this.emails){
            System.out.println("Notificando a thread " + Thread.currentThread().getName()
                + "que seus e-mails não estão sendo mais recolhidos.");
            this.emails.notifyAll();
        }
    }
}
