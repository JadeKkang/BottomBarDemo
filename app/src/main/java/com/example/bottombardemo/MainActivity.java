package com.example.bottombardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mlibrary.BottomBar;

public class MainActivity extends AppCompatActivity implements BottomBar.OnItemListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBar bottomBar = this.findViewById(R.id.bt_bar);
        bottomBar.init(getSupportFragmentManager(),R.id.fl_mains)
                .addItem("首页",R.mipmap.home_true,R.mipmap.home_false,new HomeFragment(),false)
                .addItem("圈子",R.mipmap.cirle_true,R.mipmap.cirle_fales,new CircleFragment(),false)
                .addItem("主页",R.mipmap.survey_true,R.mipmap.survey_false,new SureyFragment(),false)
                .addItem("消息",R.mipmap.msg_true,R.mipmap.msg_false,new MsgFragment(),true)
                .addItem("我的",R.mipmap.my_true,R.mipmap.my_false,new MyFragment(),false)
                .defaultIndext(1);
        bottomBar.setOnItemListener(this);
        //测试显示小红点
//        bottomBar.setRedPoint(4);
//        bottomBar.setCancelRedPoint(3);
        //不需要关联fragment，只当做按钮用法
//        bottomBar.addItem("首页",R.mipmap.home_true,R.mipmap.home_false,null,false)
//                .addItem("圈子",R.mipmap.cirle_true,R.mipmap.cirle_fales,null,false)
//                .addItem("主页",R.mipmap.survey_true,R.mipmap.survey_false,null,false)
//                .addItem("消息",R.mipmap.msg_true,R.mipmap.msg_false,null,false)
//                .addItem("我的",R.mipmap.my_true,R.mipmap.my_false,null,false)
//                .defaultIndext(1);

    }

    @Override
    public void onItem(int i) {
        Toast.makeText(this,"点击了第"+(i+1)+"个",Toast.LENGTH_SHORT).show();
    }
}
