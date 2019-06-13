import {mutationTypes} from '@/commons/constants'
import Vue from 'vue'

export default {

    [mutationTypes.SET_PRODUTOS](state, produtos) {
        Vue.set(state, 'produtos', produtos)
    }
}
