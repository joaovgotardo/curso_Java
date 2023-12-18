package pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio;

import lombok.extern.log4j.Log4j2;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2 //Usado para substituir o sout, sendo de melhor performance e fornecendo mais dados.
public class DiretorRepositorio {
    public static void salvar(Diretor diretor) {
        String sql = String.format("INSERT INTO `filme_streaming`.`diretor` (`nome`) VALUES ('%s');",
                diretor.getNome()); //Recebe um sql.

        //Esse try with resources é feito pois o Connection é um closeable.
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement()) { //Cria um objeto para adicionar dados com o Statement.
            int i = smt.executeUpdate(sql);
            //O update é usado para modificações dentro do banco, e pode ter um insert, update e um
            //delete. Ele retorna o número de linhas afetadas no banco.

            log.info("Colunas afetadas: {}, após inserção de {}", i, diretor.getNome());

            //Outros métodos do log incluem debug, warn, error e trace. Para usá-los, deve-se
            //modificar seu respectivo xml.
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", diretor.getNome(), e);
        }
    }

    public static void deletar(int id) {
        String sql = String.format("DELETE FROM `filme_streaming`.`diretor` WHERE (`id` = '%d');",
                id);
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement()) {
            int i = smt.executeUpdate(sql);
            log.info("Colunas afetadas: {}, após remoção de {}", i, id);
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", id, e);
        }
    }

    public static void atualizar(Diretor diretor) {
        String sql = String.format("UPDATE `filme_streaming`.`diretor` SET `nome` = '%s' WHERE (`id` = '%d');",
                diretor.getNome(), diretor.getId());
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement()) {
            int i = smt.executeUpdate(sql);
            log.info("Colunas afetadas: {}, após atualização de {}", i, diretor.getId());
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", diretor.getId(), e);
        }
    }

    //O findAll geralmente não é feito em bancos de dados reais, em fase de produção.
    public static List<Diretor> buscarTodos() {
        log.info("Buscando produtores");
        return buscaPorNome("");
        //Feito para economizar código.
    }

    public static List<Diretor> buscaPorNome(String nome) {
        log.info("Buscando por Nome");
        String sql = "SELECT * FROM filme_streaming.diretor where nome like '%%%s%%';";
        List<Diretor> diretores = new ArrayList<>(); //Virará um objeto dentro do Java.
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement();
             ResultSet rs = smt.executeQuery(sql) //O RS precisa de um statement.
        ) {
            while (rs.next()) {
                Diretor diretor = Diretor
                        .builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .build();
                diretores.add(diretor);
            }
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return diretores;
    }

    public static void mostrarMetadadosDiretor() {
        log.info("Mostrando metadados do diretor.");
        String sql = "SELECT * FROM filme_streaming.diretor";
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            ResultSetMetaData rsmd = rs.getMetaData(); //Pega os metadados (inclui número, tipo e propriedades.)
            int columnCount = rsmd.getColumnCount();
            log.info("Quantidade de colunas: {}", columnCount);
            for (int i = 0; i < columnCount; i++) {
                log.info("Nome da coluna: {}", rsmd.getColumnName(i));
                log.info("Nome da tabela: {}", rsmd.getTableName(i));
                log.info("Tipo da coluna: {}", rsmd.getColumnType(i));
            }
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
    }

    public static void mostrarMetadadosDriver() {
        //Para mostrar os metadados do driver, precisa-apenas do try with resources.
        try (Connection con = ConexaoFactory.getConnection()) {
            DatabaseMetaData dbmd = con.getMetaData();
            //TYPE_FORWARD_ONLY - Indica o tipo para um objeto ResultSet no qual o cursor só pode se mover adiante.
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suporta TYPE_FORWARD_ONLY");
                //Se o banco suporta o tipo de concorrência em conjunto com o tipo de set.
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suporta CONCUR_UPDATABLE");
                }
            }
            //Scroll_Insensitive - Suporta navegação debaixo para cima. Não atualiza dados em tempo real.
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suporta CONCUR_UPDATABLE");
                }
            }

            //Atualiza em tempo real. Poucos drivers suportam Scroll_Sensitive.
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suporta CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
    }

    public static void mostrarTipoScroll() {
        log.info("Buscando por Nome");
        //A ordem que aparece é baseado na query.
        String sql = "SELECT * FROM filme_streaming.diretor";
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)
        ) {
            log.info("Primeira coluna: '{}", rs.first());
            log.info("Tipo da coluna: '{}'", rs.getType());
            log.info(Diretor.builder().id(rs.getInt("id")).nome(rs.getString("nome")).build());

            log.info("Última coluna: '{}'", rs.last());
            log.info("Número da última coluna: '{}'", rs.getRow());
            log.info(Diretor.builder().id(rs.getInt("id")).nome(rs.getString("nome")).build());

            //RowAbsolute - Aceita números positivos para número da coluna. Relative aceita negativos também.
            //isLast e isFirst - Mostra se o cursor está nessas posições.
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
    }

    public static List<Diretor> buscaPorNomeParaLowercase(String nome) {
        log.info("Buscando por Nome");
        String sql = "SELECT * FROM filme_streaming.diretor where nome like '%%%s%%';";
        List<Diretor> diretores = new ArrayList<>();
        //O Statement usado deve utilizar um ResultSet pois executará uma atualização no banco.
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql) //O RS precisa de um statement.
        ) {
            while (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toLowerCase());
                rs.updateRow(); //Agora a coluna será atualizada, e não apenas a String.
                Diretor diretor = Diretor
                        .builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .build();
                diretores.add(diretor);
            }
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return diretores;
    }

    public static List<Diretor> buscaPorNomeInserir(String nome) {
        log.info("Buscando por Nome");
        String sql = "SELECT * FROM filme_streaming.diretor where nome like '%%%s%%';";
        List<Diretor> diretores = new ArrayList<>();
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement();
             ResultSet rs = smt.executeQuery(sql) //O RS precisa de um statement.
        ) {
            if (rs.next()) return diretores;
            //O código abaixo poderia ser refatorado, criando outros métodos.
            rs.moveToInsertRow(); //Move o cursor para uma linha temporária.
            rs.updateString("nome", nome);
            rs.insertRow();
            rs.beforeFirst(); //Antes que o primeiro tenha um query feito.
            rs.next();
            Diretor diretor = Diretor
                    .builder()
                    .id(rs.getInt("id"))
                    .nome(rs.getString("nome"))
                    .build();
            diretores.add(diretor);
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return diretores;
    }

    public static List<Diretor> buscaPorNomeDeletar(String nome) {
        //Esse método deletará por nome e não por id.
        log.info("Buscando por Nome");
        String sql = "SELECT * FROM filme_streaming.diretor where nome like '%%%s%%';";
        List<Diretor> diretores = new ArrayList<>();
        try (Connection con = ConexaoFactory.getConnection();
             Statement smt = con.createStatement();
             ResultSet rs = smt.executeQuery(sql)
        ) {
            while (rs.next()) {
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return diretores;
    }

}
