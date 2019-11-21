<template>
  <div class="app-homepage">
    <el-container style="display:flex">
      <el-header style="width:100%;overflow:hidden;height:80px">
        <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          @select="handleSelect"
          style="font-size:10vh;width:100%"
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

      <el-main style="margin: 0 auto;">
        <div class="el-main-div">
          <div class="img-main-div">
            <img class="img-main" src="../assets/1.jpg" />
            <div class="title-name">
              <p>
                <font style="font-size:30px">大学生先进成图技术和产品信息建模创新大赛</font>
              </p>
              <div style="margin-top:70px">
                <el-button class="button-first" style="height:50px;width:160px;font-size:17px;background-color:#fff">报名</el-button>
                <el-button type="danger" style="height:50px;width:160px;background-color:#FF7043;font-size:17px">了解更多</el-button>
              </div>
            </div>
          </div>

          <div class="three-button">
            <el-row style="height:100%">
              <el-col style="height:100%;display:flex;justify-content:center;align-items:center" :span="8">
                <div style="width:190px;height:65px;display:flex;justify-content:center">
                <img src="../assets/find.png" alt="" style="width:65px;height:65px;display:inline;float:left">
                <div style="float:left;margin:17px;color:#fff">
                  <h2 style="margin:0;font-size:20px">成绩查询</h2>
                  <p style="margin:0 0 0 0; padding: -1 0 0 0;font-size:14px;line-height:9px">Score query</p>
                </div>
                </div>
              </el-col>
              <el-col style="height:100%;display:flex;justify-content:center;align-items:center" :span="8">
                <div style="width:190px;height:65px;display:flex;justify-content:center">
                <img src="../assets/new.png" alt="" style="width:65px;height:65px;display:inline;float:left">
                <div style="float:left;margin:17px;color:#fff">
                  <h2 style="margin:0;font-size:20px">新闻公告</h2>
                  <p style="margin:0 0 0 0; padding: -1 0 0 0;font-size:14px;line-height:9px">News</p>
                </div>
                </div>
              </el-col>
              <el-col style="height:100%;display:flex;justify-content:center;align-items:center" :span="8">
                <div style="width:190px;height:65px;display:flex;justify-content:center">
                <img src="../assets/document.png" alt="" style="width:65px;height:65px;display:inline;float:left">
                <div style="float:left;margin:17px;color:#fff">
                  <h2 style="margin:0;font-size:20px">资料下载</h2>
                  <p style="margin:0 0 0 0; padding: -1 0 0 0;font-size:10px;line-height:9px">Data Download</p>
                </div>
                </div>
              </el-col>
            </el-row>
          </div>

          <div class="introduce" style="height:400px;display:flex;justify-content:center;align-items:center">
            <div>
              
              <div style="width:600px">
                <h2 style="font-size:24px">全国大学生先进成图技术与产品信息建模创新大赛</h2>
                <p style="font-size:14px;color:#898989">全国大学生先进成图技术与产品信息建模创新大赛是由教育部高等学校工程图学课程教学指导委员会、中国图学学会制图技术专业委员会、中国图学学会产品信息建模专业委员会联合主办的图学类课程最高级别的国家级赛事</p>
              </div>
            
            </div>
          </div>

          <div class="directed-department" style="height:700px;overflow:hidden">
            <el-row style="height:100%">
              <el-col :span="12" style="height:100%;display:flex;justify-content:center;align-items:center">
                <img src="../assets/background1.png" alt="" style="width:600px">
              </el-col>
              <el-col :span="12" style="height:100%;display:flex;justify-content:center;align-items:center">
                <div >
                  <h2 style="font-size:24px">1.指导单位</h2>
                <div style="font-size:17px;line-height:17px;color:#898989">
                  <p>中华共和国教育部</p>
                <p>中华科学技术协会</p>
                <p>中国图学学会</p>
                </div>
                
                  <h2 style="font-size:24px">2.主办单位</h2>
                <div style="font-size:17px;line-height:17px;color:#898989">
                <p>教育部高等学校工程图学教学指导委员会</p>
                <p>中国图学学会制图技术专业委员会</p>
                <p>中国图学学会产品信息建模专业委员会</p>
                </div>
                
                  <h2 style="font-size:24px">1.指导单位</h2>
                <div style="font-size:17px;line-height:17px;color:#898989">
                <p>高等教育出版社等</p>
                </div>
                </div>
              </el-col>
            </el-row>
          </div>

          <div class="news-side" style="height:400px;overflow:hidden">
            <el-row style="height:100%">
              <el-col :span="6" v-for="o in 4" :key="o" >
                <el-card :body-style="{ padding: '2px' }" style="margin:50px">
                  <img
                    src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                    style="overflow:hidden;height:70%"
                  />
                  <div style="padding: 3%;">
                    <span><font style="font-size:14px">新闻</font></span>
                    <div class="bottom clearfix">
                      <time class="time">{{ currentDate }}</time>
                      <el-button type="text" class="button" style="float:right;color:#FF855F">查看详细</el-button>
                    </div>
                  </div>
                </el-card>
              </el-col>
            </el-row>
          </div>

          <div class="sign-up" style="background-color: #ff7043;height:300px;overflow:hidden">
            <el-row style="height:100%">
              <el-col style="height:100%;display:flex;justify-content:center;align-items:center" :span="24">
                <img style="width:150px;height:95px;margin:10px" src="../assets/icon-cloud_brief.png" alt="">
                <div style="width:150px">
                  <h2 style="font-size:24px;color:#fff">报名入口</h2>
                <p style="font-size:14px;color:#fff;line-height:14px">sign up entance</p>
                <el-button style="background:none">
                  <font style="color:#fff">报名</font>
                </el-button>
                </div>
              </el-col>

            </el-row>
          </div>    

          <div class="file-dowload-title" style="position:relative; height:300px; overflow:hidden" >
            <img src="../assets/2.jpg" alt="" style="width:100%">
            <p style="position:absolute;top:210px;left:12px;color:white;font-size:40px">资料下载</p>
          </div>


          <div class="file-dowload" style="position:relative; height:70%; overflow:hidden" >
            
            <el-row style="height:100%;text-align:left">
              <el-col style="height:100%" :span="12" v-for="k in 2" :key="k">
                <div v-for="o in 3" :key="o" style="margin-left:10%;height:33%">
                  <h2>标题</h2>
                  <p>内容</p>
                </div>
              </el-col>
            </el-row>

          </div>
        </div>
      </el-main>

      <el-footer style="background-color:#FF7043;height:3%">
        <el-row style="height:100%;text-align:left">
              <el-col style="height:100%" :span="12">
                <p style="color:white;margin:0 0 0 0;">Copyright 2019.All rights reserved.</p>
              </el-col>

              <el-col style="height:100%;text-align:right;" :span="12">
                <p style="color:white; margin:0 0 0 0;">China: +86 13772032723    US: +11 222 333 444    support@shark.com</p>
              </el-col>

            </el-row>
      </el-footer>
    </el-container>
  </div>
</template>


<script>
export default {
  name: "HomePage"
}
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
  height: 100%;
  overflow: auto;
  
}
.el-main-div::-webkit-scrollbar {display:none}

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
</style>



