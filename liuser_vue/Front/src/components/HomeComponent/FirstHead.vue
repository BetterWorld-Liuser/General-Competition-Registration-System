<template>
  <div class="img-main-div">
    <img class="img-main" src="../../assets/1.jpg" />
    <div class="title-name">
      <p style="position:relative;bottom:2rem;">
        <font style="font-size:2.5rem;font-weight:bold"
          >大学生先进成图技术和产品信息建模创新大赛</font
        >
      </p>
      <div style="margin-top:50px">
        <router-link
          to="/register"
          style="
        padding-right:10px
        "
          ><el-button
            class="button-first"
            style="height:50px;width:160px;background-color:#fff"
            >报名</el-button
          ></router-link
        >

        <router-link to="/information"
          ><el-button
            type="danger"
            style="height:50px;width:160px;background-color:#FF7043;"
            >了解更多</el-button
          ></router-link
        >
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.el-button{
  font-size: 1.2rem;
}
.el-button:hover{
  font-weight: bold;
}
</style>
