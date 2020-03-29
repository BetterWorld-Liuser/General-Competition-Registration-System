<template>
  <div
    class="sign-up"
    style="background-color: #ff7043;height:300px;overflow:hidden"
  >
    <el-row style="height:100%">
      <el-col
        style="height:100%;display:flex;justify-content:center;align-items:center"
        :span="24"
      >
        <img
          style="width:150px;height:95px;margin:10px"
          src="../../assets/icon-cloud_brief.png"
          alt=""
        />
        <div style="width:150px">
          <h2 style="font-size:24px;color:#fff">报名入口</h2>
          <p style="font-size:14px;color:#fff;line-height:14px">
            sign up entance
          </p>
          <el-button style="background:none" @click="jump">
            <font style="color:#fff">报名</font>
          </el-button>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  methods:{
    jump(){
      this.$router.push({path:"login"})
    }
  }
};
</script>

<style></style>
