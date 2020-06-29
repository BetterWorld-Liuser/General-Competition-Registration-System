<template>
  <div id="outerLayer" style="width:1440px;height:1080px">
    <div style="width:1440px;height:250px;overflow:hidden;position:relative">
      <h2
        style="position:absolute;left:200px;top:100px;color:#fff;font-size:30px"
      >
        报名工具
      </h2>
      <img src="../assets/background4.jpg" style="width:100%;" />
    </div>
    <div
      style="width:1440px;height:400px;display:flex;justify-content:center;align-items:center"
    >
      <div style="width:320px;height:180px;text-align:left">
        <p style="text-align:left;font-size:24px">学校：</p>
        <el-autocomplete
          style="width:360px"
          v-model="state"
          :fetch-suggestions="querySearchAsync"
          placeholder="请输入内容"
          @select="handleSelect"
        ></el-autocomplete>
        <p style="text-align:left;font-size:24px">学生名单：</p>
        <el-upload
          class="upload-demo"
          drag
          action="https://jsonplaceholder.typicode.com/posts/"
          multiple
        >
          <i class="el-icon-upload"></i>
          <div class="el-upload__text">
            将文件拖到此处，或
            <em>点击上传</em>
          </div>
          <div class="el-upload__tip" slot="tip">
            只能上传xlsx文件，且不超过10MB
          </div>
        </el-upload>
        <el-button type='primary'>确认</el-button>
      </div>
    </div>
  </div>
</template>

<style>
#outerLater::-webkit-scrollbar {
  display: none;
}
</style>

<script>
export default {
  name: "Register"
};
</script>
