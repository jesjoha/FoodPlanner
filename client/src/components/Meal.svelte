<script>
    import { useMealState } from "../states/mealState.svelte.js";
    import MealUpdateForm from "./MealUpdateForm.svelte";
    
    let mealState = useMealState();
    let data = $props();
    let meal = $state();

    const getMeal = async () => {
        meal = await mealState.readOne(data.id);
    }

    if(!import.meta.env.SSR) {
        getMeal();
    }

</script>

{#if meal}
    <h1>{meal.name}</h1>
    <h3>{meal.description}</h3>
    <MealUpdateForm {meal} />
{/if}
