<template>
  <div id="app">
    
    <!--
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    -->
    <HomePage></HomePage>
  </div>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'
import HomePage from './components/HomePage.vue'


export default {
  name: 'app',
  components: {
    HomePage
  }
}
</script>

<style>
#app {
  height: 100%;
  width: 100%;
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;
}
</style>
