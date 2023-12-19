package pacote.primeiro.javaprojeto.javanced.Ljdbc.listener;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

@Log4j2
public class ARowSetListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Comando ativado");
    }

//    @SneakyThrows //Quando o código é compilado, ele é posto dentro de um try-catch.
    //Não recomendado em produção.
    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Coluna modificada");
        if(event.getSource() instanceof RowSet){
            try {
                ((RowSet) event.getSource()).execute(); //Dá um cast no RowSet e executa.
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("Cursor foi movido");
    }
}
