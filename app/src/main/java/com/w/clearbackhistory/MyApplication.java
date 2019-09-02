package com.w.clearbackhistory;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    /**
     * 己打开的activity集合
     */
    private static List<Activity> activities = new ArrayList<Activity>();

    public static void setActivities(Activity activity) {
        if(activities != null){
            activities.add(activity);
        }
    }

    /**
     * 释放界面
     */
    public static void finishActivities() {
        for (Activity activity : activities) {
            if (activity != null) {
                activity.finish();
            }
        }
        activities.clear();
    }

    /**
     * 根据Activity来销毁
     * @param activity
     */
    public static void popActivity(Activity activity){
        if(activity == null) return;
        Activity act = null;
        for(int i=0;i<activities.size(); i++){
            act = activities.get(i);
            if(act !=null && act == activity){
                activity.finish();
                activities.remove(act);
                act.finish();
                act = null;
                return;
            }
        }
    }
}
