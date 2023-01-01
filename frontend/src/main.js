import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
//import FightDesign from 'fighting-design'
//import 'fighting-design/dist/index.css'
import vant from 'vant'
import 'vant/lib/index.css'

import './assets/main.css'

const app = createApp(App)

//app.use(FightDesign)
app.use(vant)
app.use(router)

app.mount('#app')
