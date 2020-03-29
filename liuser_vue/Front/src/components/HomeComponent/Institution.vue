<template>
  <div class="directed-department" style="height:700px;overflow:hidden">
    <el-row style="height:100%">
      <el-col
        :span="12"
        style="height:100%;display:flex;justify-content:center;align-items:center"
      >
        <div class='imginstitusion'
         width:600px></div>
      </el-col>
      <el-col
        :span="12"
        style="height:100%;display:flex;justify-content:center;align-items:center"
      >
        <div>
          <h2 style="font-size:24px">1.指导单位</h2>
          <div style="font-size:17px;line-height:17px;color:#898989">
            <p>中华共和国教育部</p>
            <p>中华科学技术协会</p>
            <p>中国图学学会</p>
          </div>

          <h2 style="font-size:24px">2.主办单位</h2>
          <div style="font-size:17px;line-height:17px;color:#898989">
            <p>教育部高等学校工程图学教学指导委员会</p>
            <p>中国图学学会制图技术专业委员会</p>
            <p>中国图学学会产品信息建模专业委员会</p>
          </div>

          <h2 style="font-size:24px">1.指导单位</h2>
          <div style="font-size:17px;line-height:17px;color:#898989">
            <p>高等教育出版社等</p>
          </div>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Institution"
};
</script>

<style>
.imginstitusion {
  width: 80%;
  height: 60%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background: url('https://user-gold-cdn.xitu.io/2020/3/29/17125992d200dfe3?w=980&h=320&f=jpeg&s=82086');
  background-attachment: fixed;
  background-size:cover;
  background-repeat:no-repeat;
  background-position:center
}

</style>
