package org.javaCore.jdbcCrud.repository;

import lombok.extern.log4j.Log4j2;
import org.javaCore.jdbc.conn.ConnectionFactory;
import org.javaCore.jdbcCrud.conn.ConnectionFactoryCrud;
import org.javaCore.jdbcCrud.domain.AnimeCrud;
import org.javaCore.jdbcCrud.domain.ProducerCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepositoryCrud {
    public static List<AnimeCrud> findByName(String name) {
        log.info("Finding Animes by name '{}'.", name);
        List<AnimeCrud> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ProducerCrud producer = ProducerCrud.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();

                AnimeCrud anime = AnimeCrud
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producerCrud(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find anime", e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a INNER JOIN
                anime_store.producer p on a.producer_id = p.id WHERE a.name like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<AnimeCrud> findById(Integer id) {
        log.info("Finding animes by id '{}'.", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) {
                return Optional.empty();
            }

            ProducerCrud producer = ProducerCrud.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();

            AnimeCrud anime = AnimeCrud
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producerCrud(producer)
                    .build();

            return Optional.of(anime);

        } catch (SQLException e) {
            log.error("Error while trying to find anime", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a INNER JOIN
                anime_store.producer p on a.producer_id = p.id WHERE a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted anime '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(AnimeCrud anime) {
        log.info("Saving anime '{}'", anime);
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, AnimeCrud anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducerCrud().getId());
        return ps;
    }

    public static void update(AnimeCrud anime) {
        log.info("Updating anime '{}'.", anime.getId());
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, AnimeCrud anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
