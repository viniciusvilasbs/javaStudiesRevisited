package org.javaCore.jdbcCrud.repository;

import lombok.extern.log4j.Log4j2;
import org.javaCore.jdbc.conn.ConnectionFactory;
import org.javaCore.jdbcCrud.conn.ConnectionFactoryCrud;
import org.javaCore.jdbcCrud.domain.ProducerCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepositoryCrud {
    public static List<ProducerCrud> findByName(String name) {
        log.info("Finding Producers by name '{}'.", name);
        List<ProducerCrud> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ProducerCrud producer = ProducerCrud
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producer", e);
        }
        return producers;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<ProducerCrud> findById(Integer id) {
        log.info("Finding Producers by id '{}'.", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) {
                return Optional.empty();
            }

            return Optional.of(ProducerCrud
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

        } catch (SQLException e) {
            log.error("Error while trying to find producer", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(ProducerCrud producer) {
        log.info("Saving Producer '{}'", producer);
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, ProducerCrud producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(ProducerCrud producer) {
        log.info("Updating Producer '{}'.", producer.getId());
        try (Connection conn = ConnectionFactoryCrud.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, ProducerCrud producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
