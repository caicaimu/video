import Vue from 'vue';
import Router from 'vue-router'
import Login from './views/Login.vue'
import Admin from './views/Admin.vue'
import Welcome  from './views/admin/Welcome.vue'
import Chapter  from './views/admin/chapter.vue'

Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_IRL,
    routes: [{
        path: '*',
        redirect: "/login",
    }, {
        path: '/login',
        component: Login
    },{
        path: '/admin',
        component: Admin,
        children:[{
            path: 'welcome',
            component: Welcome,
        },{
            path: 'business/chapter',
            component: Chapter,
        }]
    }]
})