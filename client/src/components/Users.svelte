<script>
    const API_URL = "http://localhost:8000/api/v1";

    let users = $state([]);

    const getUsers = async () => {
        const response = await fetch(`${API_URL}/users`);
        users = await response.json();
    }


    $effect(() => {
        getUsers();
    })

</script>

<h3>Users:</h3>

{#if users}
    <ul>
        {#each users as user}
            <li>{user.email}</li>
        {/each}
    </ul>
{/if}