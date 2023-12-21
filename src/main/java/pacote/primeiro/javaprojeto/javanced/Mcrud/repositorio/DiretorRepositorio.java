package pacote.primeiro.javaprojeto.javanced.Mcrud.repositorio;


import lombok.extern.log4j.Log4j2;
import pacote.primeiro.javaprojeto.javanced.Mcrud.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Mcrud.dominio.Diretor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class DiretorRepositorio {
    public static List<Diretor> buscaPorNome(String nome) {
        log.info("Buscando por Nome de Diretor(a) {}", nome);
        List<Diretor> diretores = new ArrayList<>();
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement pst = PreparedStatementPorNome(con, nome);
             ResultSet rs = pst.executeQuery();
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

    private static PreparedStatement PreparedStatementPorNome(Connection con, String nome) throws SQLException{
        String sql = "SELECT * FROM filme_streaming.diretor where nome like ?;";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, String.format("%%%s%%", nome));
        return pst;
    }

    //Pode-se fazer retornando um Optional também. Então, uma mensagem de não existência
    //de ID poderia ser verificada dentro do serviço.
    public static Diretor buscaPorId(Integer id) {
        log.info("Buscando pelo Id de Diretor(a) {}", id);
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement pst = PreparedStatementPorId(con, id);
             ResultSet rs = pst.executeQuery();
        ) {
            if(!rs.next()) throw new IllegalArgumentException("ID não existe.");
            return Diretor
                    .builder()
                    .id(rs.getInt("id"))
                    .nome(rs.getString("nome"))
                    .build();
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return null;
    }

    private static PreparedStatement PreparedStatementPorId(Connection con, Integer id) throws SQLException{
        String sql = "SELECT * FROM filme_streaming.diretor where id = ?;";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst;
    }

    public static void deletar(int id) {
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement pst = preparedStatementDeletar(con, id)) {
            pst.execute();
            log.info("Remoção de {} completa", id);
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", id, e);
        }
    }

    private static PreparedStatement preparedStatementDeletar(
            Connection con, Integer id) throws SQLException{
        //Excluir por id é mais recomendado.
        String sql = "DELETE FROM `filme_streaming`.`diretor` WHERE (`id` = ?);";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst;
    }

    public static void salvar(Diretor diretor) {
        log.info("Salvando diretor {}", diretor);
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement smt = preparedStatementSalvar(con, diretor)) {
            smt.execute();
            log.info("Diretor {} salvo", diretor.getId());
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", diretor.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementSalvar(
            Connection con, Diretor diretor) throws SQLException {
        String sql = String.format(
                "INSERT INTO `filme_streaming`.`diretor` (`nome`) VALUES (?);");
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, diretor.getNome());
        return pst;
    }

    public static void atualizar(Diretor diretor) {
        log.info("Atualizando diretor '{}'", diretor);
        try (Connection con = pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory.getConnection();
             PreparedStatement smt = preparedStatementAtualizar(con, diretor)) {
            int i = smt.executeUpdate();
            log.info("Colunas afetadas: {}, após atualização de {}", i, diretor.getId());
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", diretor.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementAtualizar(Connection con, Diretor diretor) throws SQLException {
        String sql = String.format(
                "UPDATE `filme_streaming`.`diretor` SET `nome` = ? WHERE (`id` = ?);");
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, diretor.getNome());
        pst.setInt(2, diretor.getId());
//        pst.setString(1, String.format("%%%s%%", nome));
        return pst;
    }
}
