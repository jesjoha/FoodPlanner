package me.jesjoha.foodplannerserver.meal;

import java.util.List;

public interface MealRepository {

    List<Meal> getAll();

    Meal getById(int id);

    Meal addMeal(Meal meal);

    Meal updateMeal(int id, Meal meal);

    Meal deleteMeal(int id);
}
