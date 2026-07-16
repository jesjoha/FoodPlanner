package me.jesjoha.foodplannerserver.weekList;

import me.jesjoha.foodplannerserver.meal.Meal;

import java.util.List;

public class WeekList {
    private int id;
    private List<Meal> meals;
    private int week;
    private int year;

    public WeekList(List<Meal> meals, int week, int year) {
        this.meals = meals;
        this.week = week;
        this.year = year;
    }

    public WeekList(int id, List<Meal> meals, int week, int year) {
        this.id = id;
        this( meals, week, year );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
