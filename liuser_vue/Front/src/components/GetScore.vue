<template>
  <div
    id="GetScore"
    style="width:1440px;height:920px;display:flex;flex-direction:column;justify-content:center;align-items:center"
  >
    <div style="overflow:hidden;width:1440px;height:1000px;position:relative">
      <img
        src="../assets/1.jpg"
        alt=""
        style="width:1440px;position:absolute;top:0;left:0"
      />
      <div
        style="width:980px;height:400px;position:absolute;background-color:#fff;top:100px;left:150px;border-radius:10px"
      >
        <div
          style="background-color:#FF7043;width:auto;height:100px;margin-top:0;padding-top:10px"
        >
          <h2 style="color:#fff;font-size:36px;margin-top:5px">查询系统</h2>
        </div>
        <div>
          <p style="font-size:20px">请输入比赛编号/身份证号：</p>
          <el-input
            v-model="input"
            placeholder="请输入内容"
            style="width:600px"
          ></el-input>
          <el-button type="success" plain style="display:none"
            >成功按钮</el-button
          >
        </div>
      </div>
    </div>
  </div>
</template>

<style></style>

<script>
export default {
  name: "GetScore"
};
</script>
