<script setup>
/* eslint-disable */
import { ref } from 'vue'
const disabled = ref(false)
const show = ref(false)
function warnDisabled() {
  disabled.value = true
  setTimeout(() => {
    disabled.value = false
  }, 1500)
}
</script>

<template class="parent">
<header>
<div class="all">
<div class="header" :class="{ shake: disabled }">
  <button @click="warnDisabled"><img src="@/img/logo_w.png"></button>
  <router-link to="/login" @click="show = !show">
  		<img style="display: block; margin: auto; margin-top: 50px;" src="@/img/new_1_2.png">
  		<div class="menu">로그인</div>
  </router-link>
</div>
<Transition name="c"><div v-show="show"><router-view style="display: block; text-align: center;;"/></div></Transition>
</div>
</header>
</template>

<style scoped>
.menu{
	font-size: 20px;
	@import url('https://fonts.googleapis.com/css2?family=Gowun+Batang:wght@700&display=swap');
	font-family: "Gowun Batang", serif;
	font-weight: 700;
	font-style: normal;
	color: black;
}
.all{
	background-size: cover;
	background-image: url("@/img/background.jpg");
	height: 100vh;
}
div{
  display: block;
  text-align: center;
  margin: 0 auto;
}
.header {
  background-color: white;
  height: 200px;
  border-bottom-left-radius: 100px;
  border-bottom-right-radius: 100px;
}
.shake {
  animation: shake 0.82s cubic-bezier(0.36, 0.07, 0.19, 0.97) both;
  transform: translate3d(0, 0, 0);
}

@keyframes shake {
  10%,
  90% {
    transform: translate3d(-1px, 0, 0);
  }

  20%,
  80% {
    transform: translate3d(2px, 0, 0);
  }

  30%,
  50%,
  70% {
    transform: translate3d(-4px, 0, 0);
  }

  40%,
  60% {
    transform: translate3d(4px, 0, 0);
  }
}

.c-enter-active {
  transition: all 0.3s ease-out;
}

.c-leave-active {
  transition: all 0.8s cubic-bezier(1, 0.5, 0.8, 1);
}

.c-enter-from,
.c-leave-to {
  transform: translateX(20px);
  opacity: 0;
}
</style>