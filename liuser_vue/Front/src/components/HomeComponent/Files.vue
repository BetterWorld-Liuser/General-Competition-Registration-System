<template>
  <div
    class="file-dowload"
    style="position:relative; height:500px; overflow:hidden"
  >
    <el-row style="height:100%;text-align:left">
      <el-col style="height:100%" :span="8" v-for="k in 3" :key="k">
        <div v-for="o in 2" :key="o" style="margin-left:40px; height:33%">
          <h2>第{{ k }}届成图大赛报名</h2>
          <span>第{{ k }}届成图大赛报名报名指南</span>
          <span style="float:right;position:relative;right:200px"
            >下载链接</span
          >
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {};
</script>

<style></style>
