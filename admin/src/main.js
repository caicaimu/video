import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from "axios";


/**
 * axios������
 */
axios.interceptors.request.use(function (config) {
  console.log("����", config);
  let token = Tool.getLoginUser().token;
  if (Tool.isNotEmpty(token)) {
    config.headers.token = token;
    console.log("����headers����token:", token);
  }
  return config;
}, error => {});
axios.interceptors.response.use(function (response) {
  console.log("���ؽ����", response);
  return response;
}, error => {});

Vue.config.productionTip = false
Vue.prototype.$ajax=axios;
import qs from 'qs'
Vue.prototype.$qs=qs


axios.defaults.headers.post['Content-Type']='application/x-www-form-urlencoded';
axios.defaults.transformRequest=[function(data){return qs.stringify(data)}];



new Vue({
  router,
  render: h => h(App),
}).$mount('#app');

