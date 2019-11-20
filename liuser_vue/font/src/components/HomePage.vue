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
          <el-menu-item index="1"  class="mechanic-logo">
            <a id="logo" href="/">
              <img class="img-logo" src="https://cn.vuejs.org/images/logo.png" alt="mechanic logo" />
            </a>
          </el-menu-item>
        
          <el-menu-item index="2" class = "load">首页</el-menu-item>
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
          <div style="dispaly=block;width=100%;height=30%;overflow=hidden;">
            <a href="https://sm.ms/image/CWPorO2QEMGc4bm" target="_blank"><img src="https://i.loli.net/2019/11/20/CWPorO2QEMGc4bm.jpg" ></a>
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
.app-homepage {
  width: 100%;
  height: 100%;
}
.el-container {
  width: 100%;
  height: 100%;
}
.el-main {
    padding-top:1px;
    
}
.load{
    width:100px;
}
.img-logo {
    vertical-align: middle;
    margin-right: 6px;
    width: 40px;
    height: 40px;
}

.FirstPage{
    float: right;
}

a{text-decoration:none}
a:hover{
    text-decoration: none;
}

.mechanic-logo{
    float:none;
}

</style>



