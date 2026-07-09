<script>
    import { useMealState } from "../states/mealState.svelte.js";

    let mealState = useMealState();

    let { meal } = $props();


</script>

<div>
    <span>{meal.id}</span><br>
    <span class="text-xl">{meal.name}</span><br>
    <span>{meal.description}</span><br>
    <button onclick={() => mealState.remove(meal.id)}>🗑</button>
</div>