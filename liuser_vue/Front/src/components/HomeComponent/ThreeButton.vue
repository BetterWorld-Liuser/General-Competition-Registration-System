<template>
  <div class="three-button">
    <el-row style="height:100%">
      <el-col
        style="height:100%;display:flex;justify-content:center;align-items:center"
        :span="8"
      >
        <div
        class="scoreButton"
          @click="jumpTogetscore"
          style="width:300px;height:65px;display:flex;justify-content:center"
        >
          <img
            src="../../assets/find.png"
            alt=""
            style="width:65px;height:65px;display:inline;float:left"
          />
          <div style="float:left;margin:17px;color:#fff">
            <h2 style="margin:0;">成绩查询</h2>
            <p
              style="margin:0 0 0 0; padding: -1 0 0 0;font-size:14px;line-height:9px"
            >
              Score query
            </p>
          </div>
        </div>
      </el-col>
      <el-col
        style="height:100%;display:flex;justify-content:center;align-items:center"
        :span="8"
      >
        <div
        class="newsButton"
        @click="jumpToNews"
          style="width:300px;height:65px;display:flex;justify-content:center"
        >
          <img
            src="../../assets/new.png"
            alt=""
            style="width:65px;height:65px;display:inline;float:left"
          />
          <div style="float:left;margin:17px;color:#fff">
            <h2 style="margin:0;">新闻公告</h2>
            <p
              style="margin:0 0 0 0; padding: -1 0 0 0;font-size:14px;line-height:9px"
            >
              News
            </p>
          </div>
        </div>
      </el-col>
      <el-col
        style="height:100%;display:flex;justify-content:center;align-items:center"
        :span="8"
      >
        <div
        class="filesButton"
          @click="jumpToFiledownload"
          style="width:300px;height:65px;display:flex;justify-content:center"
        >
          <img
            src="../../assets/document.png"
            alt=""
            style="width:65px;height:65px;display:inline;float:left"
          />
          <div style="float:left;margin:17px;color:#fff">
            <h2 style="margin:0;">资料下载</h2>
            <p
              style="margin:0 0 0 0; padding: -1 0 0 0;font-size:10px;line-height:9px"
            >
              Data Download
            </p>
          </div>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "ThreeButton",
  methods:{
    jumpTogetscore(){
      this.$router.push({name:"GetScore"})
    },
    jumpToNews(){
      window.location.hash='#news'
    },
    jumpToFiledownload(){
      window.location.hash='#filedownload'
    }

  }

};
</script>

<style>
.scoreButton{
  cursor: pointer;
  font-size: 1rem;
}
.scoreButton:hover {
  cursor: pointer;
  font-size: 1.2rem;
}
.newsButton{
  cursor: pointer;
  font-size: 1rem;
}
.newsButton:hover {
  cursor: pointer;
  font-size: 1.2rem;
}
.filesButton{
  cursor: pointer;
  font-size: 1rem;
}
.filesButton:hover{
  cursor: pointer;
  font-size: 1.2rem;
}
</style>
