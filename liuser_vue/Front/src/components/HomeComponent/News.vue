<template>
  <div class="news-side" style="height:400px;overflow:hidden">
    <el-row style="height:100%">
      <el-col :span="6" v-for="count in 4" :key="count">
        <el-card :body-style="{ padding: '2px' }" style="margin:50px">
          <img
            src="https://tse1.mm.bing.net/th?id=OIP.YpXu31MI7KveHA7So5BYTwHaE7&w=218&h=160&c=8&rs=1&qlt=90&dpr=1.25&pid=3.1&rm=2"
            style="overflow:hidden;height:200px;width:180px;margin-top:30px"
          />
          <div style="padding: 3%;">
            <span><font style="font-size:14px">今日消息</font></span>
            <div class="bottom clearfix">
              <div style="float:left">2020/1/13</div>
              <el-button
                type="text"
                class="button"
                style="float:right;color:#FF855F"
                >查看详细</el-button
              >
            </div>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {};
</script>

<style></style>
