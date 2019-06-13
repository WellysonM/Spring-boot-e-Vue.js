<template>
    <v-layout row justify-center>
        <v-dialog v-model="dialog" persistent max-width="350">
            <template v-slot:activator="{ on }">
                <v-btn color="blue darken-1" flat v-on="on">Atualizar</v-btn>
            </template>
            <v-card>
                <v-card-title class="headline">Atualização de produtos</v-card-title>
                <v-card-text>
                </v-card-text>
                <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="red darken-1" flat @click="dialog = false">Recusar</v-btn>
                    <v-btn color="green darken-1" flat v-on:click="confirmacao()">Aceitar
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-dialog>
    </v-layout>
</template>

<script>
    export default {
        name: 'modalConfirmacao',
        data() {
            return {
                dialog: false
            }
        },
        methods: {
            confirmacao() {
                this.$emit('close'),
                    this.dialog = false
            }
        }
    }
</script>