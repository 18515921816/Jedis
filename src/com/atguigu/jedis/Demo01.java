package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

public class Demo01 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.102",6379);
        String pong = jedis.ping();
        System.out.println("连接成功："+pong);
        System.out.println("master修改");
        jedis.close();
    }
}
