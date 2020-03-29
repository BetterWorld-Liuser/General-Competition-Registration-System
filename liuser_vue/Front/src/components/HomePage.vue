<template>
  <div class="app-homepage">
    <el-container style="display:flex">
      <el-header style="width:100%;overflow:hidden;height:80px">
        <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          style="font-size:10vh;width:100%"
          :router="routerSwitch"
        >
          <el-menu-item index="1" class="mechanic-logo">
            <a id="logo" href="/">
              <img
                class="img-logo"
                src="../assets/gear.png"
                alt="mechanic logo"
              />
            </a>
          </el-menu-item>

          <el-menu-item index="/" class="load">首页</el-menu-item>
          <el-menu-item index="/register">报名</el-menu-item>
          <el-menu-item index="/GetScore">获奖查询</el-menu-item>
          <el-menu-item index="/login">组织者登录</el-menu-item>
        </el-menu>
        <div class="line"></div>
      </el-header>

      <el-main style="margin: 0 auto;height:auto;">
        <router-view></router-view>
      </el-main>
      <Footer></Footer>
    </el-container>
  </div>
</template>

<script>
import Footer from "./HomeComponent/Footer";
export default {
  name: "HomePage",
  components: {
    Footer
  },
  data(){
    return{
      activeIndex:'',
      routerSwitch:true
    }
  },
  method:{
  }
  
};
</script>

<style>
.three-button {
  width: auto;
  background-color: #ff7043;
  height: 150px;
}

.title-name {
  z-index: 2;
  position: absolute;
  text-align: start;
  top: 225px;
  left: 92px;
  color: white;
}

.el-main-div {
  width: 100%;
  height: auto;
  overflow: auto;
}
.el-main-div::-webkit-scrollbar {
  display: none;
}

.img-main-div {
  width: 100%;
  height: 500px;
  overflow: hidden;

  position: relative;
}

.app-homepage {
  width: 100%;
  height: 100%;
}
.el-container {
  width: 100%;
  height: 100%;
}
el-main {
  padding: 0px;
}
.img-main {
  width: 100%;
  z-index: 0;
  position: absolute;
  top: 0;
  left: 0;
}
.load {
  width: 100px;
}
.img-logo {
  vertical-align: middle;
  margin-right: 6px;
  width: 40px;
  height: 40px;
}

.FirstPage {
  float: right;
}

a {
  text-decoration: none;
}
a:hover {
  text-decoration: none;
}

.mechanic-logo {
  float: none;
}
.el-menu-item:hover{
  font-size: 17px;
  font-weight: bold;
  

}
</style>
