<template>
  <div id="news" class="news-side" style="height:400px;overflow:hidden">
    <el-row style="height:100%">
      <el-col :span="6" v-for="item in newsArr" :key="item.name">
        <el-card :body-style="{ padding: '2px' }" style="margin:50px">
          <img
            :src="item.imgUrl"
            style="overflow:hidden;height:200px;width:180px;margin-top:30px"
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
          imgUrl:"https://s1.ax1x.com/2020/04/04/GdljjP.png",
          time:"2019/10/10"
        }
      ]
    }
  }
};
</script>

<style></style>
