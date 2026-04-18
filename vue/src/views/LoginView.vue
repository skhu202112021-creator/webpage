<script setup>
	import {reactive} from "vue";
	import {login} from "@/services/accountService";
	import {useRouter} from "vue-router";
	const state = reactive({
		form: {
			loginId: "",
			loginPw: "",
		}
	});
	const router = useRouter();
	const submit = async () => { // ③
	  const res = await login(state.form);

	  switch (res.status) {
	    case 200:
	      await router.push("/LoginTest");
	      break;

	    case 404:
	      window.alert("입력하신 정보와 일치하는 회원이 없습니다.");
	      break;
	  }
	};
</script>
<template>
	<div class="background">
	<h3>Welcome!</h3>
	<img src="../img/ui_1.png"/>
	<form @submit.prevent="submit">
	<table style="margin: 0 auto;">
	<tr><td><strong>아이디</strong></td> <td><input id="loginId" placeholder="학번" v-model="state.form.loginId"></input></td></tr>
	<tr><td><strong>비밀번호</strong></td> <td><input type="password" input id="loginPw" placeholder="비밀번호" v-model="state.form.loginPw"></input></td></tr>
	<tr><td></td><td><button type="submit">로그인</button></td></tr>
	</table>
	</form>
	</div>
</template>
<style>
	.background{
		@import url('https://fonts.googleapis.com/css2?family=Gowun+Batang:wght@700&display=swap');
		font-family: "Gowun Batang", serif;
		font-weight: 700;
		font-style: normal;
		color: aliceblue;
		background-image:url("../img/space.png");
		width:50%;
		margin: 0 auto;
		box-shadow : 10px 10px black;
	}
</style>