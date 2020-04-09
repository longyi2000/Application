package com.example.application;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    //定义自己的工具类
    public static List<Activity> activities=new ArrayList<Activity>();
    //添加
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    //删除
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    //全部关闭
    public static void finishAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
