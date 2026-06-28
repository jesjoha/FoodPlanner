package me.jesjoha.foodplannerserver.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/api/v1/meals")
@RestController
public class MealController {

    private MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping
    public List<Meal> getAllMeals() {
        return mealService.getAll();
    }

    @GetMapping("/{id}")
    public Meal getMealById(@PathVariable int id) {
        return mealService.getById(id);
    }

    @PostMapping
    public Meal saveMeal(@RequestBody Meal meal) {
        return mealService.addMeal(meal);
    }

    @PutMapping("/{id}")
    public Meal updateMeal(@PathVariable int id, @RequestBody Meal meal) {
        return mealService.updateMeal(id, meal);
    }

    @DeleteMapping("/{id}")
    public Meal deleteMeal(@PathVariable int id) {
        return mealService.deleteMeal(id);
    }
}
