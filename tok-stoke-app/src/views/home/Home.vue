<template>
    <div>
        <Carousels/>
        <ListaDeProdutos/>
    </div>
</template>

<script>
    import Carousels from './Carousels'
    import ListaDeProdutos from '../buscaProdutos/ListaDeProdutos'

    export default {
        components: {Carousels, ListaDeProdutos},
        name: "Home"
    }
</script>

<style scoped>

</style>