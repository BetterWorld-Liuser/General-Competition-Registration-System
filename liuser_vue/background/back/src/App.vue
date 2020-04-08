<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
//import Frame from './components/frame.vue'

export default {
  name: 'App',
  components: {
//    Frame
  }
}
</script>

<style scoped>
#app{
  background-color: #fff7e6;
  width: 100%;
  height: 100%;
}
</style>