<template>
    <div>
        <v-layout row id="lista" style="max-height: 600px"
                  class="scroll-y">
            <v-flex xs12 sm6 offset-sm3>
                <v-card>
                    <v-toolbar color="teal" dark>

                        <v-toolbar-title class="text-xs-center">Produtos</v-toolbar-title>

                        <v-spacer></v-spacer>

                        <v-btn icon>
                            <v-icon>search</v-icon>
                        </v-btn>
                    </v-toolbar>

                    <v-list subheader>
                        <v-subheader>Lista De Produtos</v-subheader>
                        <v-list-tile
                                v-for="produto of produtos"
                                :key="produto.id">
                            <v-list-tile-avatar>
                                <img src='https://abrilvejasp.files.wordpress.com/2018/11/produtos-mercado-dia.jpg'>
                            </v-list-tile-avatar>
                            <v-list-tile-content>
                                <span>{{produto.produto}} - {{produto.preco}} reais</span>
                            </v-list-tile-content>
                            <v-list-tile-action>
                                <Model
                                        :produto="produto"
                                        @atualizar="atualizar"
                                />
                            </v-list-tile-action>
                            <v-list-tile-action>
                                <v-btn v-on:click="removerProduto(produto)">
                                    <v-icon color='#8b0000'>delete</v-icon>
                                </v-btn>
                            </v-list-tile-action>
                        </v-list-tile>

                    </v-list>
                </v-card>
            </v-flex>
        </v-layout>
    </div>
</template>

<script>
    import Model from './ModalDeAtualizaProduto'
    import {actionTypes} from '@/commons/constants'
    import {mapState} from 'vuex'

    export default {
        components: {Model},

        data() {
            return {
                produto: {
                    id: '',
                    produto: '',
                    preco: '',
                }
            }
        },
        computed: {
            ...mapState(['produtos'])
        },
        mounted() {
            this.buscarProdutos()
        },
        methods: {
            async buscarProdutos() {
                await this.$store.dispatch(actionTypes.BUSCAR_PRODUTOS)
            },
            async atualizar(produto) {
                await this.$store.dispatch(actionTypes.ATUALIZAR_PRODUTO, produto)
                alert(this.produto.produto + ' atualizado com sucesso! ')
                this.buscarProdutos()
            },
            async removerProduto(produto) {
                if (confirm('Deseja excluir o produto ' + produto.produto + '?')) {
                    await this.$store.dispatch(actionTypes.REMOVER_PRODUTO, produto.id);
                    alert(' excluido com sucesso! ');
                    this.buscarProdutos()
                }
            }
        }
    }
</script>

<style lang="stylus">
    #lista
        margin-top 5%
</style>