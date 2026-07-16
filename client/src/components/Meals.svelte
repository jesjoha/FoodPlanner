<script>

    import { useMealState } from "../states/mealState.svelte.js";
    import MealItem from "./MealItem.svelte";

    let mealState = useMealState();

    const getMeals = async () => {
        await mealState.readAll();
    }

    /*
    $effect(() => {
        getMeals();
    });
    */
   if (!import.meta.env.SSR) {
    getMeals();
   };

</script>

<h2>Meals:</h2>

{#if mealState.meals}
    <ul>
        {#each mealState.meals as meal}
            <MealItem {meal} />
        {/each}
    </ul>
{/if}