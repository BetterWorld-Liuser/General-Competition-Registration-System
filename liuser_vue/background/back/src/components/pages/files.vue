<template>
  <div>
    <div class="fileupload">
          <el-upload
            class="upload"
            drag
            action="https://jsonplaceholder.typicode.com/posts/"
            multiple
            :auto-upload="true"
          >
            <i class="el-icon-upload"></i>
            <div class="el-upload__text">
              将文件拖到此处，或<em>点击上传</em>
            </div>
            <div class="el-upload__tip" slot="tip">
              上传的文件将可以在官网下载
            </div>
          </el-upload>
    </div>
    <div class="table">
        <div class="tableName">文件管理</div>
        <div class="tableInside">
          <el-table :data="fileTableData.filter(data => !fileSearch || data.name.toLowerCase().includes(fileSearch.toLowerCase()))" stripe style="width: 100%">
            <el-table-column prop="name" label="文件名称"> </el-table-column>
            <el-table-column label="操作">
              <template slot-scope="scope">
                <el-button
                  size="mini"
                  type="danger"
                  @click="handleDelete(scope.$index, scope.row)"
                  >删除</el-button
                >
              </template>
            </el-table-column>
          </el-table>
        </div>
      </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      formLabelAlign: {
        name: ""
      },
      fileTableData: [
        {
          name: "2018年比赛的通知文件",
          url:""
        },
        {
          name: "2017年比赛的通知文件",
          url:""
        },
        {
          name: "2016年比赛的通知文件",
          url:""
        },
        {
          name: "2015年比赛的通知文件",
          url:""
        },
      ],
      fileSearch:''
    };
  }
};
</script>

<style scoped>
.fileupload{
    margin:20px 0 0 30px;
    display: flex;
    justify-content: center;
    align-items: center;
}
.search-Box{
    width:30%;
    float: right;
    margin-top:13px;
}
.tableInside {
  width: 90%;
}
.tableName {
  display: flex;
  padding-top: 30px;
  writing-mode: vertical-rl;
  width: 10%;
  align-items: center;
  border-right: 1px solid #d9d9d9;
  border-bottom: 1px solid #d9d9d9;
  font-weight: bold;
}
.table {
  display: flex;
  flex-direction: row;
  width: 100%;
  margin: 10px 0 0 0;
  border-top: 1px solid #d9d9d9;
}
</style>
