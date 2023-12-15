package pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio;

import lombok.extern.log4j.Log4j2;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2 //Usado para substituir o sout, sendo de melhor performance e fornecendo mais dados.
public class DiretorRepositorio {
    public static void salvar(Diretor diretor){
        String sql = String.format("INSERT INTO `filme_streaming`.`diretor` (`nome`) VALUES ('%s');",
                diretor.getNome()); //Recebe um sql.

        //Esse try with resources é feito pois o Connection é um closeable.
        try(Connection con = ConexaoFactory.getConnection();
            Statement smt = con.createStatement()){ //Cria um objeto para adicionar dados com o Statement.
            int i = smt.executeUpdate(sql);
            //O update é usado para modificações dentro do banco, e pode ter um insert, update e um
            //delete. Ele retorna o número de linhas afetadas no banco.

            log.info("Colunas afetadas: {}, após inserção de {}", i, diretor.getNome());

            //Outros métodos do log incluem debug, warn, error e trace. Para usá-los, deve-se
            //modificar seu respectivo xml.
        }catch(SQLException e){
            log.info("Exceção ocorreu para {}", diretor.getNome(), e);
        }
    }

    public static void deletar(int id){
        String sql = String.format("DELETE FROM `filme_streaming`.`diretor` WHERE (`id` = '%d');",
                id);
        try(Connection con = ConexaoFactory.getConnection();
            Statement smt = con.createStatement()){
            int i = smt.executeUpdate(sql);
            log.info("Colunas afetadas: {}, após remoção de {}", i, id);
        }catch(SQLException e){
            log.info("Exceção ocorreu para {}", id, e);
        }
    }

    public static void atualizar(Diretor diretor){
        String sql = String.format("UPDATE `filme_streaming`.`diretor` SET `nome` = '%s' WHERE (`id` = '%d');",
                diretor.getNome(), diretor.getId());
        try(Connection con = ConexaoFactory.getConnection();
            Statement smt = con.createStatement()){
            int i = smt.executeUpdate(sql);
            log.info("Colunas afetadas: {}, após atualização de {}", i, diretor.getId());
        }catch(SQLException e){
            log.info("Exceção ocorreu para {}", diretor.getId(), e);
        }
    }

    //O findAll geralmente não é feito em bancos de dados reais, em fase de produção.
    public static List<Diretor> buscarTodos(){
        log.info("Buscando produtores");
        return buscaPorNome("");
        //Feito para economizar código.
    }

    public static List<Diretor> buscaPorNome(String nome){
        log.info("Buscando por Nome");
        String sql = "SELECT * FROM filme_streaming where name like '%%%s%%';";
        List<Diretor> diretores = new ArrayList<>(); //Virará um objeto dentro do Java.
        try(Connection con = ConexaoFactory.getConnection();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql) //O RS precisa de um statement.
        ){
            while(rs.next()){
                Diretor diretor = Diretor
                        .builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .build();
                diretores.add(diretor);
            }
        }catch(SQLException e){
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return diretores;
    }
}
