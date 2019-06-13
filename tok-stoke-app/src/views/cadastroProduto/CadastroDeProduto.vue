<template>
    <v-form id="form" @submit.prevent="validateBeforeSubmit">
        <v-container>
            <v-layout row wrap>
                <v-flex xs12 sm6>
                    <v-text-field
                            autofocus
                            label="Produto"
                            v-model="produto.produto"
                            type="text"
                            name="name"
                            v-validate="'required'"
                    ></v-text-field>
                    <span v-show="errors.has('name')">
                       O campo Produto é obrigatorio
                    </span>
                </v-flex>
                <v-flex xs12 sm6>
                    <v-text-field
                            v-validate="'required'"
                            type="number"
                            name="preco"
                            label="Preço"
                            single-line
                            v-model="produto.preco"
                    ></v-text-field>
                    <span v-show="errors.has('preco')">
                       O campo Preço é obrigatorio
                    </span>
                </v-flex>
            </v-layout>
            <div class="text-xs-center">
                <v-btn round color="teal darken-1" dark type="submit">Cadastrar Produto</v-btn>
            </div>
        </v-container>
    </v-form>
</template>

<style lang="stylus">
    #form
        margin-top 15%
</style>

<script>
    import {actionTypes} from '@/commons/constants'

    export default {
        data() {
            return {
                produto: {
                    produto: '',
                    preco: ''
                },
                produtos: []
            }
        },
        methods: {
            validateBeforeSubmit() {
                this.$validator.validateAll().then((result) => {
                    if (result) {
                        this.salvar(),
                            alert(this.produto.produto + ' cadastrado com sucesso! ')
                    }
                });
            },
            async salvar() {
                await this.$store.dispatch(actionTypes.CADASTRAR_PRODUTO, this.produto)
            }
        }
    }
</script>