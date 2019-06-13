import {actionTypes, mutationTypes} from '@/commons/constants'
import axios from 'axios';

const http = axios.create({
    baseURL: 'http://localhost:8081/api/'
})

export default {
    async [actionTypes.CADASTRAR_PRODUTO](context, produto) {
        return await http.post('produtos', produto)
    },
    async [actionTypes.ATUALIZAR_PRODUTO](context, produto) {
        return await http.put('produtos', produto)
    },
    async [actionTypes.BUSCAR_PRODUTOS]({commit}) {
        const {data} = await http.get('produtos')
        commit(mutationTypes.SET_PRODUTOS, data)
    },
    async [actionTypes.REMOVER_PRODUTO](context, produtoId) {
        return await http.delete(`produtos/${produtoId}`)
    }
}