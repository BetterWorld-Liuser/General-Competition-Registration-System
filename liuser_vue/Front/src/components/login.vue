<template>
  <div class="frame">
    <div class="loginBox">
    <div class="title">登录</div>
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="用户名">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary">
              登录
          </el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        name: "",
        password: ""
      }
    };
  }
};
</script>

<style>
.frame {
  width: 100%;
  height: 90vh;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background: #E8853B;
  background-attachment: fixed;
  background-size:cover;
  background-repeat:no-repeat;
  background-position:center;
  border-radius: 5px;
  margin-bottom: 5px;
}
.loginBox {
  width: 30%;
  background-color: white;
  border-radius: 5px;
  padding:20px 30px 50px 20px;
}
.title{
    text-align: center;
    font-size:20px;
    font-weight: bold;
    margin-bottom: 50px;
}
</style>
