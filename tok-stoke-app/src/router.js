import Vue from 'vue'
import VueRouter from 'vue-router'
import listaDeProduto from './views/buscaProdutos/ListaDeProdutos'
import cadastroDeProduto from './views/cadastroProduto/CadastroDeProduto'
import editarProduto from './views/atualizaProduto/AtualizaProduto'
import home from './views/home/Home'

Vue.use(VueRouter)

export default new VueRouter({
    routes: [
        {path: '/produtos/lista', component: listaDeProduto},
        {path: '/produtos/cadastro', component: cadastroDeProduto},
        {path: '/produtos/editar', component: editarProduto},
        {path: '/', component: home}
    ]
})