<template>
<div>
  <div class="header">
    <a class="shouye" href="">报名网站后台</a>
  </div>
  <div class="contain">
    <div class="aside">
      <div class='asideItem first'><router-link :to="{name:'students'}">学生管理</router-link></div>
      <el-divider></el-divider>
            <div class='asideItem'><router-link :to="{name:'fileupload'}">资料上传</router-link></div>
            <el-divider></el-divider>

    </div>
    <div class="main">
      <router-view></router-view>
    </div>
  </div>





</div>
</template>

<script>
export default {
  name: 'frame',
  props: {
    msg: String
  }
  
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.header{
  width: 100%;
  height: 60px;
  background: #212121;
}
.contain{
  width: 100%;
  height: 90vh;
  display: flex;
  flex-direction: row;
}
.main{
  flex-grow:10;
  height: 100%;
  background-color: white;
  overflow-y: scroll;
}
.aside{
  width: 10%;
  height: 100%;
  background-color:white;
  display: flex;
  flex-direction: column;
  position: relative;
  flex-grow: 1;
  border-right: #d9d9d9 1px solid;
  padding:0 20px 0 10px;
}
.shouye{
  text-decoration: none;
  color:white;
  font-size: 20px;
  font-weight: bold;
  position: relative;
  top:15px;
  left: 20px;
}
.asideItem{
  position: relative;
  text-align: center;
  width: 100%;
  font-weight: bold;
}
.first{
  margin-top:20px;
}
</style>
