<template>
    <div>
        <v-carousel id="carousel">
            <v-carousel-item
                    v-for="(item,i) in items"
                    :key="i"
                    :src="item.src"
            ></v-carousel-item>
        </v-carousel>
    </div>
</template>
<script>

    export default {
        data() {
            return {
                items: [
                    {
                        src: 'https://vivariomarrecife.com.br/wp-content/uploads/2018/09/6818cc25a53cf93f290d85c334d8a3b8_capa.jpg'
                    },
                    {
                        src: 'http://www.maistokstok.com.br/wp-content/uploads/2015/09/lojarecife_01.jpg'
                    },
                    {
                        src: 'https://www.moveisdevalor.com.br/portal/cache/image/11935-TokStok-770x499.jpg'
                    },
                    {
                        src: 'http://larconstrutora.com.br/wp-content/uploads/2017/04/sliderTokStok.png'
                    }
                ]
            }
        }
    }
</script>
<style lang="stylus">
    #carousel
        margin-top 3%
        width 70%
        margin-left 16%
</style>