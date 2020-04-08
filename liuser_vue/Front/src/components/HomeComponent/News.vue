<template>
  <div id="news" class="news-side" style="height:400px;overflow:hidden">
    <el-row style="height:100%">
      <el-col :span="6" v-for="item in newsArr" :key="item.name">
        <el-card :body-style="{ padding: '2px' }" style="margin:50px">
          <img
            :src="item.imgUrl"
            style="overflow:hidden;height:200px;width:180px;margin-top:30px"
            crossOrigin = "anonymous"
          />
          <div style="padding: 3%;">
            <span><font style="font-size:14px">{{item.name}}</font></span>
            <div class="bottom clearfix">
              <div style="float:left">{{item.time}}</div>
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
export default {
  data(){
    return{
      newsArr:[
        {
          name:"2019届成图大赛举办成功",
          imgUrl:"https://user-gold-cdn.xitu.io/2020/3/29/17125cd350be4682?w=325&h=265&f=png&s=155105",
          time:"2019/10/10"
        }
      ]
    }
  }
};
</script>

<style></style>
