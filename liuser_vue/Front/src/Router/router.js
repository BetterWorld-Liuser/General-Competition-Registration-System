import VueRouter from "vue-router";
import Home from "../components/Home.vue";
import Register from "../components/Register";
import GetScore from "../components/GetScore";
import Information from "../components/Information";
import login from '../components/login'
const router = new VueRouter({
  mode: "history",
  routes: [
    {
      path: "/",
      name: "home",
      component: Home
    },
    {
      path: "/register",
      name: "register",
      component: Register
    },
    {
      path: "/getscore",
      name: "GetScore",
      component: GetScore
    },
    {
      path: "/information",
      name: "Information",
      component: Information
    },
    {
      path: "/login",
      name: "login",
      component: login
    }
  ]
});

export default router;
