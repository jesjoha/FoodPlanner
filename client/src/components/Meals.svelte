<script>
    const PUBLIC_API_URL = import.meta.env.PUBLIC_API_URL;

    let meals = $state([]);

    const getMeals = async () => {
        const response = await fetch(`${PUBLIC_API_URL}/meals`);
        meals = await response.json();
    }

    $effect(() => {
        getMeals();
    });

</script>

<h2>Meals:</h2>

{#if meals}
    <ul>
        {#each meals as meal}
            <li>ID: {meal.id} | Name: {meal.name} | Description: {meal.description}</li>
        {/each}
    </ul>
{/if}