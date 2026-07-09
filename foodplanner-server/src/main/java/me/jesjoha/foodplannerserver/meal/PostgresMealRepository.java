package me.jesjoha.foodplannerserver.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres-meals")
public class PostgresMealRepository implements MealRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PostgresMealRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Meal> getAll() {
        String sql = "SELECT id, name, description FROM meals";
        return jdbcTemplate.query(sql, new MealRowMapper());
    }

    @Override
    public Meal getById(int id) {
        String sql = "SELECT id, name, description FROM meals WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new MealRowMapper(), id);
    }

    @Override
    public Meal addMeal(Meal meal) {
        String sql = "INSERT INTO meals (name, description) VALUES (?, ?) RETURNING *";
        return jdbcTemplate.query(sql, new MealRowMapper(), meal.getName(), meal.getDescription()).getFirst();
    }

    @Override
    public Meal updateMeal(int id, Meal updatedMeal) {
        String sql = "UPDATE meals SET name = ?, description = ? WHERE id = ? RETURNING *";
        return jdbcTemplate.query(sql, new MealRowMapper(), updatedMeal.getName(), updatedMeal.getDescription(), id).getFirst();
    }

    @Override
    public Meal deleteMeal(int id) {
        String sql = "DELETE FROM meals WHERE id = ? RETURNING *";
        return jdbcTemplate.query(sql, new MealRowMapper(), id).getFirst();
    }
}
