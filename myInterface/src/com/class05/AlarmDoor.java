package com.class05;
/*
* 設計理念
* 抽象類是對事物的抽象
* 接口是對行為的抽象
*
* 流程
*
* 門都有開關功能故使用抽象類設計
* 附加功能報警不是每一個們都有故使用接口添加
* */
public class AlarmDoor extends Door implements Alarm{


    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void alarm() {

    }
}
