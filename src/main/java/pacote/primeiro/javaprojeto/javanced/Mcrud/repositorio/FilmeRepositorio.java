package pacote.primeiro.javaprojeto.javanced.Mcrud.repositorio;


import lombok.extern.log4j.Log4j2;
import pacote.primeiro.javaprojeto.javanced.Mcrud.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Mcrud.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Mcrud.dominio.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class FilmeRepositorio {
    public static List<Filme> buscaPorNome(String nome) {
        log.info("Buscando por Nome de Filme(a) {}", nome);
        List<Filme> filmes = new ArrayList<>();
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement pst = PreparedStatementPorNome(con, nome);
             ResultSet rs = pst.executeQuery();
        ) {
            while (rs.next()) {
                Diretor diretor = Diretor.builder()
                        .nome(rs.getString("nome_diretor"))
                        .id(rs.getInt("diretor_id"))
                        .build();
                Filme filme = Filme
                        .builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .duracao(rs.getString("duracao"))
                        .id_diretor(diretor)
                        .build();
                filmes.add(filme);
            }
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return filmes;
    }

    private static PreparedStatement PreparedStatementPorNome(Connection con, String nome) throws SQLException{
        //O sql seleciona todas essas colunas, faz um innerJoin do id do diretor no id_diretor do filme.
        String sql = "SELECT f.id, f.nome, f.duracao, f.diretor_id, d.nome as 'nome_diretor' from filme_streaming.filme f inner join\n" +
                "filme_streaming.diretor d on f.diretor_id = d.id\n" +
                "where f.nome like ?;";
        //"""
        //                SELECT f.id, f.nome, f.diretor_id, d.nome as 'nome_diretor' from filme_streaming.filme f inner join
        //                filme_streaming.diretor d on f.diretor_id = d.id
        //                where f.nome like '%%';
        //                """;
        //A partir do JDK15+, pode-se usar esse tipo de formatação para evitar concatenações.
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, String.format("%%%s%%", nome));
        return pst;
    }

    public static Filme buscaPorId(Integer id) {
        log.info("Buscando pelo Id de Filme(a) {}", id);
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement pst = PreparedStatementPorId(con, id);
             ResultSet rs = pst.executeQuery();
        ) {
            if(!rs.next()) throw new IllegalArgumentException("ID não existe.");
            Diretor diretor = Diretor.builder()
                    .nome(rs.getString("nome_diretor"))
                    .id(rs.getInt("diretor_id"))
                    .build();
            return Filme
                    .builder()
                    .id(rs.getInt("id"))
                    .nome(rs.getString("nome"))
                    .duracao(rs.getString("duracao"))
                    .id_diretor(diretor)
                    .build();
        } catch (SQLException e) {
            log.info("Exceção ocorreu ao tentar buscar", e);
        }
        return null;
    }

    private static PreparedStatement PreparedStatementPorId(Connection con, Integer id) throws SQLException{
        String sql = "SELECT f.id, f.nome, f.duracao, f.diretor_id, d.nome as 'nome_diretor' from filme_streaming.filme f inner join\n" +
                "filme_streaming.diretor d on f.diretor_id = d.id\n" +
                "where f.id = ?;";        PreparedStatement pst = con.prepareStatement(sql);
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
        String sql = "DELETE FROM `filme_streaming`.`filme` WHERE (`id` = ?);";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        return pst;
    }

    public static void salvar(Filme filme) {
        log.info("Salvando filme {}", filme);
        try (Connection con = ConexaoFactory.getConnection();
             PreparedStatement smt = preparedStatementSalvar(con, filme)) {
            smt.execute();
            log.info("Filme {} salvo", filme.getId());
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", filme.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementSalvar(
            Connection con, Filme filme) throws SQLException {
        String sql = String.format(
                "INSERT INTO `filme_streaming`.`filme` (`nome`, `duracao`, `diretor_id`) " +
                        "VALUES (?, ?, ?);");
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, filme.getNome());
        pst.setString(2, filme.getDuracao());
        pst.setInt(3, filme.getId());
        return pst;
    }

    public static void atualizar(Filme filme) {
        log.info("Atualizando filme '{}'", filme);
        try (Connection con = pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory.getConnection();
             PreparedStatement smt = preparedStatementAtualizar(con, filme)) {
            int i = smt.executeUpdate();
            log.info("Colunas afetadas: {}, após atualização de {}", i, filme.getId());
        } catch (SQLException e) {
            log.info("Exceção ocorreu para {}", filme.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementAtualizar(Connection con, Filme filme) throws SQLException {
        String sql = String.format(
                "UPDATE `filme_streaming`.`filme` SET `nome` = ?, `duracao` = ?" +
                        "WHERE (`id` = ?);");
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, filme.getNome());
        pst.setString(2, filme.getDuracao());
        pst.setInt(3, filme.getId());
        return pst;
    }
}
