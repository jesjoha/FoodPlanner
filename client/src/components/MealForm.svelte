<script>
    const PUBLIC_API_URL = import.meta.env.PUBLIC_API_URL;

    let name = $state("");
    let description = $state("");

    const postMeal = async () => {
        const response = await fetch(`${PUBLIC_API_URL/meals}`, {
            headers: "Content-Type: application/json",
            body: {
                name,
                description
            }
        })
    }
</script>