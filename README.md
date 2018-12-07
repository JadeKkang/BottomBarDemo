# 效果展示
![](https://github.com/JadeKkang/BottomBarDemo/blob/master/image/bottombar01.gif)
![](https://github.com/JadeKkang/BottomBarDemo/blob/master/image/bottombar02.gif)
# 使用
     1.在项目gradle中添加
       allprojects {
          repositories {
                ...
                maven { url 'https://jitpack.io' }
           }
        }
     2.添加依赖
       {
       implementation 'com.github.JadeKkang:BottomBarDemo:v1.0'
       }
     3.xml中使用 
     <com.example.mlibrary.BottomBar
        android:id="@+id/bt_bar" 
        android:layout_width="match_parent"
        android:background="@color/colorAccent" 
        app:text_select="@color/text_select"
        app:text_no_select="@color/text_no_select"  
        app:text_size="14sp"  
        app:circle_color="@color/colorCircle"  
        app:circle_size="20"  
        android:layout_height="55dp"> 
    </com.example.mlibrary.BottomBar> 
# 自定义属性
| 属性 | 值 | 描述 | 
| ------------- |:-------------:| -----:| 
| text_select |#0082e0| 选中字体颜色 | 
| text_no_select |#999999 | 未选中字体颜色 | 
| text_size |14sp| 字体大小 | 
| circle_color | #ff3c0c | 小圆点颜色 | 
| circle_size |20| 小圆点大小 | 
# 预留方法

	1.setRedPoint(int index)设置第几个按钮显示小红点

	2.setCancelRedPoint(int index)设置第几个按钮取消小红点

	3.setOnItemListener(OnItemListener onItemListener)设置点击回调
	
# 说明
        1.此控件有两种使用方法，可以和fragment关联，也可以不喝fragment关联，具体如下
	1） //关联fragment
        bottomBar.init(getSupportFragmentManager(),R.id.fl_mains)
                .addItem("首页",R.mipmap.home_true,R.mipmap.home_false,new HomeFragment(),false)
                .addItem("圈子",R.mipmap.cirle_true,R.mipmap.cirle_fales,new CircleFragment(),false)
                .addItem("主页",R.mipmap.survey_true,R.mipmap.survey_false,new SureyFragment(),false)
                .addItem("消息",R.mipmap.msg_true,R.mipmap.msg_false,new MsgFragment(),true)
                .addItem("我的",R.mipmap.my_true,R.mipmap.my_false,new MyFragment(),false)
                .defaultIndext(1);
	2）//不需要关联fragment，只当做按钮用法
	bottomBar.addItem("首页",R.mipmap.home_true,R.mipmap.home_false,null,false)
                .addItem("圈子",R.mipmap.cirle_true,R.mipmap.cirle_fales,null,false)
                .addItem("主页",R.mipmap.survey_true,R.mipmap.survey_false,null,false)
                .addItem("消息",R.mipmap.msg_true,R.mipmap.msg_false,null,false)
                .addItem("我的",R.mipmap.my_true,R.mipmap.my_false,null,false)
                .defaultIndext(1);
		
	
