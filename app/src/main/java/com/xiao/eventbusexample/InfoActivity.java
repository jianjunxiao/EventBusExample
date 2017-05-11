package com.xiao.eventbusexample;

import android.os.Bundle;
import android.view.View;

import com.xiao.eventbusexample.base.BaseActivity;
import com.xiao.eventbusexample.bean.News;
import com.xiao.eventbusexample.bean.User;
import com.xiao.eventbusexample.eventbus.Event;
import com.xiao.eventbusexample.eventbus.EventBusUtil;

public class InfoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void sendEventA(View view) {
        EventBusUtil.sendEvent(new Event(C.EventCode.A));
    }

    public void sendEventB(View view) {
        EventBusUtil.sendEvent(new Event(C.EventCode.B));
    }

    public void sendEventC(View view) {
        Event<User> event = new Event<>(C.EventCode.C, new User());
        EventBusUtil.sendEvent(event);
    }


    public void sendEventD(View view) {
        Event<News> event = new Event<>(C.EventCode.D, new News());
        EventBusUtil.sendEvent(event);
    }
}
