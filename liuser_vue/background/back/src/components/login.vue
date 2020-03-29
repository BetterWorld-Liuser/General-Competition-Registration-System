<template>
  <div class="frame">
    <div class="loginBox">
    <div class="title">后台管理登录</div>
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="用户名">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary"
          @click="jump">
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
  },
  methods:{
    jump(){
      this.$router.push({path:'/setting/'})
    }
  }
};
</script>

<style>
.frame {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background: url('https://img04.sogoucdn.com/app/a/100520146/d5135cfee3b844229eedba7e2da9ebed');
  background-attachment: fixed;
  background-size:cover;
  background-repeat:no-repeat;
  background-position:center
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
