<template>
  <div class="inform" style="padding-bottom:100px;position:relative">
    <h1 style="font-size:30px">大学生先进成图技术和产品信息建模创新大赛</h1>
    <img
      src="../assets/pic2.jpg"
      style="width:300px;position:absolute;top:20px;right:70px"
    />
    <div class="introduce">
      <p style="font-size:23px;font-weight:700;margin-top:50px">简要介绍：</p>
      <div
        style="font-size:17px;font-weight:600;color:#919191;width:500px;margin:0 auto"
      >
        {{ this.introduce }}
      </div>
      <div style="position:relative">
        <p style="font-size:23px;font-weight:700;margin-top:90px">指导单位：</p>
        <img
          src="../assets/pic1.jpg"
          style="width:300px;position:absolute;top:20px;left:100px"
        />
      </div>
      <ul style="list-style:none;padding-left:0px">
        <li
          v-for="item in zhidao"
          :key="item"
          style="
        font-size:17px;font-weight:600;color:#919191;
        position:relative;
        right:10px
        "
        >
          {{ item }}
        </li>
      </ul>
      <p style="font-size:23px;font-weight:700">主办单位：</p>
      <ul style="list-style:none;padding-left:0px">
        <li
          v-for="item in zhuban"
          :key="item"
          style="
        font-size:17px;font-weight:600;color:#919191;
        position:relative;
        right:10px
        "
        >
          {{ item }}
        </li>
      </ul>
      <p style="font-size:23px;font-weight:700">相关单位：</p>
      <ul style="list-style:none;padding-left:0px">
        <li
          v-for="item in xiangguan"
          :key="item"
          style="
        font-size:17px;font-weight:600;color:#919191;
        position:relative;
        right:10px;
        
        "
        >
          {{ item }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      zhidao: ["中华共和国教育部", "中华科学技术协会", "中国图学学会"],
      zhuban: [
        "教育部高等学校工程图学教学指导委员会",
        "中国图学学会制图技术专业委员会",
        "中国图学学会产品信息建模专业委员会"
      ],
      xiangguan: ["高等教育出版社等"],
      introduce:
        "全国大学生先进成图技术与产品信息建模创新大赛是由教育部高等学校工程图学课程教学指导委员会、中国图学学会制图技术专业委员会、中国图学学会产品信息建模专业委员会联合主办的图学类课程最高级别的国家级赛事。"
    };
  },

  created: {
    changeHeight() {
      let inform = document.getElementsByClassName("infom");
      if (inform.offsetHeight < 1000) {
        inform.style.height = "100vh";
      }
    }
  }
};
</script>

<style scoped></style>
