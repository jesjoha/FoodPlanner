package me.jesjoha.foodplannerserver.meal;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MealRowMapper implements RowMapper<Meal> {
    @Override
    public Meal mapRow(ResultSet rs, int rowNum) throws SQLException {

        Meal meal = new Meal();

        meal.setId(rs.getInt("id"));
        meal.setName(rs.getString("name"));
        meal.setDescription(rs.getString("description"));

        return meal;
    }
}
