<script>
    import { useMealState } from "../states/mealState.svelte.js";

    const { meal } = $props();

    let mealState = useMealState();

    const updateMeal = async (e) => {
        e.preventDefault();
        const updatedMeal = Object.fromEntries(new FormData(e.target));
        await mealState.update(meal.id, updatedMeal);
        e.target.reset();
    };

</script>

<h4>Make changes to meal</h4>

<form class="space-y-4" onsubmit={updateMeal}>
    <label class="label" for="name">
        <span class="label-text">Meal name</span>
        <input
        class="input"
        id="name"
        name="name"
        type="text"
        defaultValue="{meal.name}"
        />
    </label>
    <label class="label" for="description">
    <span class="label-text">Meal description</span>
    <input
        class="input"
        id="description"
        name="description"
        type="text"
        defaultValue="{meal.description}"
    />
    </label>
    <button type="submit">Update meal</button>
</form>
