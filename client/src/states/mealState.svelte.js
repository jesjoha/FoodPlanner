
import * as mealsApi from "../apis/meals-api.js";

let mealState = $state([]);

const useMealState = () => {
    
    return {
        get meals() {
            return mealState;
        },
        readAll: async () => {
            mealState = await mealsApi.readMeals();
        },
        add: async (meal) => {
            const newMeal = await mealsApi.postMeal(meal);
            mealState.push(newMeal);
        },
        readOne: async (id) => {
            const meal = await mealsApi.readMeal(id);
            return meal;
        },
        update: async (id, meal) => {
            const updatedMeal = await mealsApi.updateMeal(id, meal);
            mealState.filter((meal) => meal.id === id);
            mealState.push(updatedMeal);
        },
    }
}

export { useMealState };