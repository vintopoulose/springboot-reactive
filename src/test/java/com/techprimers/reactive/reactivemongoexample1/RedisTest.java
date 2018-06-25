package com.techprimers.reactive.reactivemongoexample1;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class RedisTest {
    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());
        List<String> list = jedis.lrange("tutorial-list", 0 ,5);
        System.out.println();

    }
}
