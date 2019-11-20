<template>
  <div class="app-homepage">
    <el-container>
      <el-header>
        <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          @select="handleSelect"
        >
          <el-menu-item index="1" class="mechanic-logo">
            <a id="logo" href="/">
              <img class="img-logo" src="../assets/1.jpg" alt="mechanic logo" />
            </a>
          </el-menu-item>

          <el-menu-item index="2" class="load">首页</el-menu-item>
          <el-menu-item index="3" class="FirstPage">资料下载</el-menu-item>
          <el-menu-item index="4">大赛介绍</el-menu-item>
          <el-menu-item index="5">报名</el-menu-item>
          <el-menu-item index="6">联系我们</el-menu-item>
          <el-menu-item index="7">获奖查询</el-menu-item>
          <el-menu-item index="8">登录</el-menu-item>
        </el-menu>
        <div class="line"></div>
      </el-header>

      <el-main>
        <div class="el-main-div">
          <div class="img-main-div">
            <img class="img-main" src="../assets/1.jpg" />
            <div class="title-name">
              <p>
                <font>大学生先进成图技术和产品信息建模创新大赛</font>
              </p>
              <div style="margin-top:100px">
                <el-button class="button-first">报名</el-button>
              <el-button type="danger">了解更多</el-button>
              </div>
            </div>
          </div>

          <div class="three-button" >
            
          </div>
        </div>
      </el-main>

      <el-footer></el-footer>
    </el-container>
  </div>
</template>


<script>
export default {
  name: "HomePage",
  props: {}
};
</script>

<style>


.three-button{
  width: 100%;
  background-color: #F56C6C;
  height: 20%;
}


.title-name {
  z-index: 2;
  position: absolute;
  text-align: start;
  top: 40%;
  left: 7%;
  color: white;
}

.el-main-div {
  width: 100%;
  height: 100%;
  overflow: auto;
}

.img-main-div {
  width: 100%;
  height: 600px;
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
</style>



