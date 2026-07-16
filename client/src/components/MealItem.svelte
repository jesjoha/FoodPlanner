<script>
    import { useMealState } from "../states/mealState.svelte.js";

    let mealState = useMealState();

    let { meal } = $props();


</script>

<div>
    <span>{meal.id}</span><br>
    <span><a href="/meals/{meal.id}">{meal.name}</a></span><br>
    <span>{meal.description}</span><br>
    <button onclick={() => mealState.remove(meal.id)}>🗑</button>
</div>