const PUBLIC_API_URL = import.meta.env.PUBLIC_API_URL;

/**
 * Function for retrieving a list of all meals from the database.
 */
const readMeals = async () => {
    const response = await fetch(`${PUBLIC_API_URL}/meals`);
    const data = await response.json();
    return data;
};

/**
 * Function for adding a meal to the database.
 * @param {*} meal The meal to add.
 * @returns The added meal.
 */
const postMeal = async (meal) => {
    const response = await fetch(`${PUBLIC_API_URL}/meals`, {
        headers: {
            "Content-Type": "application/json",
        },
        method: "POST",
        body: JSON.stringify(meal),
    });
    const data = await response.json();
    return data;
};

/**
 * Function for getting a meal by id from the database.
 * @param {*} mealId The id of the meal.
 * @returns The meal with the corresponding id.
 */
const readMeal = async (mealId) => {
    const response = await fetch(`${PUBLIC_API_URL}/meals/${mealId}`);
    const data = response.json();
    return data;
};

/**
 * Function for updating a meal in the database.
 * @param {*} mealId The id of the meal.
 * @param {*} meal The updated meal.
 * @returns the updated meal.
 */
const updateMeal = async (mealId, meal) => {
    const response = await fetch(`${PUBLIC_API_URL}/meals/${mealId}`, {
        headers: {
            "Content-Type": "application/json",
        },
        method: "PUT",
        body: JSON.stringify(meal),
    });
    const data = await response.json();
    return data;
};

/**
 * Function for removing a meal from the database.
 * @param {*} id The id of the meal to remove.
 * @returns the deleted meal.
 */
const removeMeal = async (id) => {
    const response = await fetch(`${PUBLIC_API_URL}/meals/${id}`, {
        method: "DELETE",
    });
    const data = await response.json();
    return data;
};

export {readMeals, postMeal, readMeal, updateMeal, removeMeal }

