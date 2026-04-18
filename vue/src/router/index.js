import { createRouter, createWebHashHistory } from 'vue-router'
import LoginView from '../views/LoginView.vue'
import App from '../App.vue'
import LoginTest from '../views/LoginTest.vue'
const routes = [
    {
        path: '/',
        name: 'home'
    },
    {
        path: '/login',
        name: 'login',
        component: LoginView
    },
	{
	   	path: '/logintest',
	   	name: 'logintest',
	   	component: LoginTest
	}
]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})

export default router
