<template>
    <ul>
        <div v-for="produto of produtos" :key="produto.id">
            <v-layout id="css">
                <v-flex d-flex xs12 sm6 md3>
                    <v-card>
                        <div id="card">
                            <img id="img"
                                 class="white--text"
                                 height="200px"
                                 src="http://www.flexor.ind.br/wp-content/uploads/2014/07/icone-produtos.png"
                            >
                            <v-card-title>
                                <div>
                                    <span class="grey--text"></span><br>
                                    <span id="produto">{{produto.produto}}</span><br>
                                    <span>{{produto.preco}} Reais</span>
                                </div>
                            </v-card-title>
                        </div>
                    </v-card>
                </v-flex>
            </v-layout>
        </div>
    </ul>
</template>

<script>
    import {actionTypes} from '@/commons/constants'
    import {mapState} from 'vuex'

    export default {
        name: 'lista-produtos',

        computed: {
            ...mapState(['produtos'])
        },
        async mounted() {
            await this.buscarProdutos()
        },
        methods: {
            async buscarProdutos() {
                await this.$store.dispatch(actionTypes.BUSCAR_PRODUTOS)
            }
        }
    }
</script>

<style lang="stylus">
    #texto
        text-shadow 1px 2px black

    #css
        margin 5%
        position relative
        float left
        width 150px

    #img
        background-color black


</style>