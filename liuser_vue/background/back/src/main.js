import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import VueRouter from 'vue-router'
import routes from './router/router'
import http from './request/http'

Vue.use(ElementUI)
Vue.use(VueRouter)
Vue.config.productionTip = true


const router = new VueRouter({
  routes,
  mode:"history"
})


//登陆拦截器
/*router.beforeEach((to, from, next) => {
  let validator = typeof to.meta.auth == "undefined" || !to.meta.auth || sessionStorage.getItem(Token);
  let result = validator ? {} : {
      name: "login",//跳转到命名路由
      query: {
          url: to.fullPath //做一个来源页面，用于登陆成功之后跳转
      }
  };
  next(result);
});*/

Vue.prototype.$http = http  //加入网络请求模块


new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
