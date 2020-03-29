<template>
  <div>
    <div class="class">
      <el-alert
        title="添加新教室后原有顺序会打乱重排,请谨慎添加."
        type="error"
        :closable="false"
        effect="dark"
      >
      </el-alert>

      <el-button type="primary">添加新的教室</el-button>
      <el-button type="primary">下载Excel资料</el-button>
      <div class="search-Box">
        <el-input
          placeholder="请输入教室名称"
          icon="search"
          class="classSearch"
          v-model="classSearch"
        ></el-input>
      </div>
      <div class="table">
        <div class="tableName">教室管理</div>
        <div class="tableInside">
          <el-table
            :data="
              classTableData.filter(
                data =>
                  !classSearch ||
                  data.name.toLowerCase().includes(classSearch.toLowerCase())
              )
            "
            stripe
            style="width: 100%"
          >
            <el-table-column prop="name" label="教室名称"> </el-table-column>
            <el-table-column prop="capacity" label="教室容量">
            </el-table-column>
            <el-table-column label="操作">
              <template slot-scope="scope">
                <el-button
                  size="mini"
                  @click="handleEdit(scope.$index, scope.row)"
                  >编辑</el-button
                >
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
    <div class="students">
      <el-alert
        title="添加新学生后原有顺序不会改变,学生教室将随机分配到一个教室,无法自定义"
        type="error"
        :closable="false"
        effect="dark"
      >
      </el-alert>
      <el-button type="primary">添加新的学生</el-button>
      <el-button type="primary">下载Excel资料</el-button>
      <div class="search-Box">
        <el-input
          placeholder="请输入学生姓名"
          icon="search"
          class="studentSearch"
          v-model="studentSearch"
        ></el-input>
      </div>
      <div class="table">
        <div class="tableName">学生管理</div>
        <div class="tableInside">
          <el-table
            :data="
              studentTableData.filter(
                data =>
                  !studentSearch ||
                  data.name.toLowerCase().includes(studentSearch.toLowerCase())
              )
            "
            stripe
            style="width: 100%"
          >
            <el-table-column prop="name" label="姓名"> </el-table-column>
            <el-table-column prop="number" label="考号"></el-table-column>
            <el-table-column prop="school" label="学校"></el-table-column>
            <el-table-column prop="seat" label="座位"></el-table-column>
            <el-table-column prop="score" label="成绩"></el-table-column>
            <el-table-column label="操作">
              <template slot-scope="scope">
                <el-button
                  size="mini"
                  @click="handleEdit(scope.$index, scope.row)"
                  >编辑</el-button
                >
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
    <!-- dialog
    <el-dialog title="添加新的教室" :visible.sync="classaddDialogFormVisible">
      <el-form :model="form">
        <el-form-item label="教室名称" :label-width="formLabelWidth">
          <el-input v-model="classadd.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="教室容量" :label-width="formLabelWidth">
          <el-input v-model="classadd.capacity" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="classaddDialogFormVisible = false"
          >确 定</el-button
        >
      </div>
    </el-dialog>

    <el-dialog title="添加新的学生" :visible.sync="studentaddDialogFormVisible">
      <el-form :model="form">
        <el-form-item label="学生姓名" :label-width="formLabelWidth">
          <el-input v-model="stdentadd.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="学校" :label-width="formLabelWidth">
          <el-input v-model="stdentadd.school" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="studentaddDialogFormVisible = false"
          >确 定</el-button
        >
      </div>
    </el-dialog>

    -->
  </div>
</template>

<script>
export default {
  name: "students",
  data() {
    return {
      classTableData: [
        {
          name: "教西D301",
          capacity: 100
        },
        {
          name: "教西A104",
          capacity: 132
        },
        {
          name: "教东D212",
          capacity: 80
        }
      ],
      studentTableData: [
        {
          name: "刘政东",
          number: "20200001",
          school: "西北工业大学",
          seat: "教西D 10",
          score: 100
        },
        {
          name: "徐京华",
          number: "20200002",
          school: "西北工业大学",
          seat: "教西D 10",
          score: 100
        }
      ],
      classSearch: "",
      studentSearch: "",
      formLabelWidth: "50%",
      classaddDialogFormVisible: false,
      studentaddDialogFormVisible:false,
      classadd: {
        name: "",
        capacity: ""
      },
      studentadd: {
        name: "",
        school: ""
      }
    };
  },
  methods: {
    handleEdit(index, row) {
      console.log(index, row);
    },
    handleDelete(index, row) {
      console.log(index, row);
    },
    //改变学生数据
    changestudent(data) {
      return data;
    },
    //改变教室数据
    changeclass(data) {
      return data;
    }
    //
  }
};
</script>

<style scoped>
.search-Box {
  width: 30%;
  float: right;
  margin-top: 13px;
}
.table {
  display: flex;
  flex-direction: row;
  width: 100%;
  margin: 100px 0 0 0;
  border-top: 1px solid #d9d9d9;
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
a {
  text-decoration: white;
}
.class {
  width: 100%;
  margin: 10px 0 0 0;
}
.students {
  width: 100%;
  margin: 100px 0 0 0;
}
.el-button {
  margin: 13px 0 0 14px;
  float: left;
}
</style>
