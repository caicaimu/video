import Vue from "vue";
import Router from "vue-router"
import Login from "./views/Login.vue"
import Admin from "./views/Admin.vue"
import Welcome  from "./views/admin/Welcome.vue"
import Chapter  from "./views/admin/chapter.vue"

Vue.use(Router);

export default new Router({
    mode: "history",
    base: process.env.BASE_IRL,
    routes: [{
        path: "*",
        redirect: "/login",
    }, {
        path: "",
        component: Login
    },{
        path: "/",
        name:"admin",
        component: Admin,
        children:[{
            path: "welcome",
            name:"welcome",
            component: Welcome,
        },{
            path: "business/chapter",
            name:"business/chapter",
            component: Chapter,
        }]
    }]
})