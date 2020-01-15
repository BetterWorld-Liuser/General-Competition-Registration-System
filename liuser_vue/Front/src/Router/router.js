import VueRouter from "vue-router";
import Home from "../components/Home.vue";
import Register from "../components/Register";
import GetScore from "../components/GetScore";
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
    }
  ]
});

export default router;
