<template>
  <div class="img-main-div">
    <img class="img-main" src="../../assets/1.jpg" />
    <div class="title-name">
      <p>
        <font style="font-size:30px"
          >大学生先进成图技术和产品信息建模创新大赛</font
        >
      </p>
      <div style="margin-top:70px">
        <router-link
          to="/register"
          style="
        padding-right:10px
        "
          ><el-button
            class="button-first"
            style="height:50px;width:160px;font-size:17px;background-color:#fff"
            >报名</el-button
          ></router-link
        >

        <router-link to="/information"
          ><el-button
            type="danger"
            style="height:50px;width:160px;background-color:#FF7043;font-size:17px"
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

<style></style>
