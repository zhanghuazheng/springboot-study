package com.huazheng.service;

import com.huazheng.pojo.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghuazheng
 * @date 2021/4/22 17:33
 **/

public class Jdk8StreamTest {
    List<User> userList = new ArrayList<>();

    @Before
    public void initData(){
        for (int i = 0; i < 10 ; i++) {
            User user = new User();
            user.setId(i);
            user.setName(Thread.currentThread().getName()+ LocalDate.now());
            userList.add(user);
        }
    }

    @Test
    public void forechList(){
        userList.stream().forEach(System.out::println);
    }

    @Test
    public void forechDealTest(){
        userList.stream().forEach(x->{
            x.setName("zhz"+x.getName());
        });

        userList.stream().forEach(System.out::println);
    }

    @Test
    public void filterTest(){
       userList.stream().filter(x->x.getId()<5).forEach(System.out::println);
    }

    @Test
    public void mapTest(){
        userList.stream().map(x->{

           if(x.getId()%2==0){
               x.setName(x.getId()+"");
           }

           return x;
        }).forEach(System.out::println);
    }

    @Test
    public void longTest(){
       long a = 0;
        System.out.println(0-1);
    }


}
