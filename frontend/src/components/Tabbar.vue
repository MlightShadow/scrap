<template>
  <van-tabbar v-model="active" route>
    <van-tabbar-item replace to="/home" icon="home-o">常驻</van-tabbar-item>
    <van-tabbar-item replace to="/history" icon="search">历史查询</van-tabbar-item>
    <van-tabbar-item replace to="/today" icon="friends-o">今日剪报</van-tabbar-item>
    <van-tabbar-item replace to="/achievement" icon="setting-o">奖杯</van-tabbar-item>
  </van-tabbar>
</template>

<script>
import { ref } from 'vue';

export default {
  setup() {
    const active = ref(0);
    return { active };
  },
};
</script>
