<template>
    <v-layout row justify-center id="modal">
        <v-dialog v-model="dialog" persistent max-width="600px">
            <template v-slot:activator="{ on }">
                <v-btn color="primary" v-on="on">
                    <v-icon color='#020062'>edit</v-icon>
                </v-btn>
            </template>
            <form @submit.prevent="enviaMensagem">
                <v-card>
                    <v-card-title>
                        <span class="headline">Atualizar Produto</span>
                    </v-card-title>
                    <v-card-text>
                        <v-container grid-list-md>
                            <v-layout wrap>
                                <v-flex xs12>
                                    <v-text-field label="Produto" required v-model="produtoClone.produto"
                                    ></v-text-field>
                                </v-flex>
                                <v-flex xs12>
                                    <v-text-field label="Preço" required v-model="produtoClone.preco"></v-text-field>
                                </v-flex>
                            </v-layout>
                        </v-container>
                        <small>campos obrigatórios</small>
                    </v-card-text>
                    <v-card-actions>
                        <v-spacer></v-spacer>
                        <v-btn color="blue darken-1" flat @click="dialog = false" v-on:click="manterInformacao()">Fechar
                        </v-btn>
                        <ModalConfirmacao
                                v-on:close="confirmacao(produtoClone)">
                            Atualizar
                        </ModalConfirmacao>
                    </v-card-actions>
                </v-card>
            </form>
        </v-dialog>
    </v-layout>
</template>
<script>
    import _ from 'lodash'
    import ModalConfirmacao from './ModalDeConfirmacao'

    export default {
        components: {ModalConfirmacao},
        name: 'modal',
        data() {
            return {
                dialog: false,
                produtoClone: _.clone(this.produto)
            }
        },
        props: {
            produto: {
                type: Object,
                requered: true
            }
        },
        methods: {
            confirmacao(produtoClone) {
                this.$emit('atualizar', produtoClone);
                this.dialog = false
            },
            manterInformacao() {
                this.produtoClone = _.clone(this.produto)
            }
        }
    }
</script>