<template>
    <div id="app">
        <Layout/>
        <router-view/>
        <Footer/>
    </div>
</template>

<script>
    import Layout from './Nav'
    import Footer from './Footer'

    export default {
        name: 'app',
        components: {
            Layout,
            Footer
        }
    }
</script>
<style lang="stylus">
    #app
        background-color #D3D3D3
</style>