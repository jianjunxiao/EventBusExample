package com.xiao.eventbusexample;

import android.os.Bundle;
import android.util.Log;

import com.xiao.eventbusexample.base.BaseActivity;
import com.xiao.eventbusexample.bean.News;
import com.xiao.eventbusexample.bean.User;
import com.xiao.eventbusexample.eventbus.Event;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected boolean isRegisterEventBus() {
        return true;
    }

@Override
protected void receiveEvent(Event event) {
    // 接受到Event后的相关逻辑
    switch (event.getCode()) {
        case C.EventCode.A:
            Log.d("EventBus", "接收到A类型的Event");
            break;
        case C.EventCode.B:
            Log.d("EventBus", "接收到B类型的Event");
            break;
        case C.EventCode.C:
            Log.d("EventBus", "接收到B类型的Event，携带User");
            User user = (User) event.getData();
            break;
        case C.EventCode.D:
            Log.d("EventBus", "接收到D类型的Event，携带News");
            News news = (News) event.getData();
            break;
    }
}
}
