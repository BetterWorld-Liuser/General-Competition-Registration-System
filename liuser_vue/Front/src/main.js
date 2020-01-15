import Vue from "vue";
import App from "./App.vue";
import Element from "element-ui";
import "element-ui/lib/theme-chalk/index.css";
import "./custom.css";
import axios from "axios";
import VueRouter from "vue-router";
import router from "./Router/router";

Vue.config.productionTip = false;
Vue.prototype.$axios = axios;

Vue.use(VueRouter);
Vue.use(Element);

new Vue({
  router: router,
  render: h => h(App)
}).$mount("#app");
