import students from '../components/pages/students.vue'
import newsmanage from '../components/pages/news.vue'
import fileupload from '../components/pages/files.vue'
import login from '../components/login.vue'
import frame from '../components/frame.vue'

const routes = [
    {path:'/',component:login},
    {path:'/login',component:login},
    {path:'/setting',
    meta:{
        auth:true
    },
    component:frame,
    children:[
        {path:'/',component:students},
        {name:'students',path:"/setting/students",component:students},
        {name:'newsmanage',path:"/setting/newsmanage",component:newsmanage},
        {name:'fileupload',path:"/setting/fileupload",component:fileupload},
    ]}
    

]

export default routes