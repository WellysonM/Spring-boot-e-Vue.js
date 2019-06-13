<template>
    <v-card height="200px" flat>
        <router-link tag="span" to="/">
            <v-img id="pagina"
                   :gradient="gradient"
                   dark
                   src="https://cdn.vuetifyjs.com/images/parallax/material2.jpg"
            >
                <div class="headline text-xs-center pa-5">
                    <div id="fonte">Tok&Stok: {{ bottomNav }}</div>
                </div>
            </v-img>
        </router-link>
        <v-bottom-nav
                :active.sync="bottomNav"
                :value="true"
                absolute
                color="transparent">
            <v-btn router-link to="/produtos/cadastro"
                   color="teal"
                   flat
                   value="Cadastro de produtos">
                <span>Cadastro de produtos</span>
                <v-icon>home</v-icon>
            </v-btn>
            <v-btn router-link to="/produtos/lista"
                   color="teal"
                   flat
                   value="Lista de produtos cadastrados">
                <span>Produtos cadastrados</span>
                <v-icon>info</v-icon>
            </v-btn>
            <v-btn router-link to="/produtos/editar"
                   color="teal"
                   flat
                   value="Editar produtos">
                <span>Editar produtos</span>
                <v-icon>edit</v-icon>
            </v-btn>
        </v-bottom-nav>
    </v-card>
</template>
<script>

    export default {
        data() {
            return {
                bottomNav: 'Bem Vindo',
                gradient: 'to top right, rgba(63,81,181, .7), rgba(25,32,72, .7)'
            }
        }
    }
</script>
<style lang="stylus">
    #pagina
        height 72%
        cursor pointer

    #fonte
        font-size 40px
        color aliceblue
</style>