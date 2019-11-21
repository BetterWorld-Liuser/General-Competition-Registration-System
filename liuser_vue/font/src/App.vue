<template>
  <div id="AppMain">
    
    <!--
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <Register></Register>
    -->
    <GetScore></GetScore>
  </div>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'
//import HomePage from './components/HomePage.vue'
//import Register from './components/Register.vue'
import GetScore from './components/GetScore.vue'

export default {
  name: 'app',
  components: {
//    HomePage,
//    Register,
      GetScore
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
