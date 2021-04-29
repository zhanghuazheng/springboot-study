package com.huazheng.process.service;

/**
 * @author zhanghuazheng
 * @date 2021/4/28 19:22
 */
public class TestFor {
    public static void main(String[] args) {

        te();
    }

    public static  boolean te(){
        System.out.println("kaishi");

        for (int i = 0; i < 10; i++) {
            if(i==4){
                System.out.println("4");
                return false;
            }else {
                System.out.println(i);
            }
        }
        System.out.println("2332323");
        return true;

    }
}
