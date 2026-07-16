package me.jesjoha.foodplannerserver.weekList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres-week-list")
public class PostgresWeekListRepository implements WeekListRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PostgresWeekListRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<WeekList> getAll() {
        return List.of();
    }

    @Override
    public WeekList getById(int id) {
        return null;
    }

    @Override
    public WeekList addWeekList(WeekList weekList) {
        return null;
    }

    @Override
    public WeekList updateWeekList(int id, WeekList weekList) {
        return null;
    }

    @Override
    public WeekList deleteWeekList(int id) {
        return null;
    }
}
