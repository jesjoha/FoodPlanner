package me.jesjoha.foodplannerserver.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    private MealRepository mealRepository;

    @Autowired
    public MealService(@Qualifier("postgres-meals") MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> getAll() {
        return mealRepository.getAll();
    }

    public Meal getById(int id) {
        return mealRepository.getById(id);
    }

    public Meal updateMeal(int id, Meal meal) {
        return mealRepository.updateMeal(id, meal);
    }

    public Meal addMeal(Meal meal) {
        return mealRepository.addMeal(meal);
    }

    public Meal deleteMeal(int id) {
        return mealRepository.deleteMeal(id);
    }
}
