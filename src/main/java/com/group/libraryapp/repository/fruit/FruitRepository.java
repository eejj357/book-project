package com.group.libraryapp.repository.fruit;

import com.group.libraryapp.dto.fruit.response.FruitResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class FruitRepository {
    private final JdbcTemplate jdbcTemplate;

    public FruitRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveFruitInfo(String name, LocalDate warehousingDate, long price) {
        String sql = "INSERT INTO fruit (name, warehosingDate, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, name, warehousingDate, price);
    }

    public void saveSoldFruit(long id) {
        String sql = "UPDATE fruit SET isSold = 1 WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public List<FruitResponse> showSalesAmount(String name) {
        String sql = "SELECT " +
                "SUM(CASE WHEN isSold = 1 THEN price ELSE 0 END) AS salesAmount, " +
                "SUM(CASE WHEN isSold = 0 THEN price ELSE 0 END) AS nonSalesAmount " +
                "FROM fruit WHERE name = ? GROUP BY name";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            int salesAmount = rs.getInt("salesAmount");
            int nonSalesAmount = rs.getInt("nonSalesAmount");
            return new FruitResponse(salesAmount, nonSalesAmount);
        }, name);
    }
}