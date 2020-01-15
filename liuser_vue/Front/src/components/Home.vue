<template>
  <div class="el-main-div">
    <FirstHead></FirstHead>
    <ThreeButton></ThreeButton>
    <Indroduce></Indroduce>
    <Insititution></Insititution>
    <News></News>
    <Sigin></Sigin>
    <FileDownload></FileDownload>
    <Files></Files>
    <Footer></Footer>
  </div>
</template>

<script>
import FirstHead from "./HomeComponent/FirstHead";
import ThreeButton from "./HomeComponent/ThreeButton";
import Indroduce from "./HomeComponent/Indroduce";
import Insititution from "./HomeComponent/Institution";
import News from "./HomeComponent/News";
import Sigin from "./HomeComponent/Sigin";
import FileDownload from "./HomeComponent/FileDownload";
import Files from "./HomeComponent/Files";

export default {
  components: {
    FirstHead,
    ThreeButton,
    Indroduce,
    Insititution,
    News,
    Sigin,
    FileDownload,
    Files
  }
};
</script>

<style></style>
