package base;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/11/9.
 */
public class ActivityController {
    public static List<Activity> activityList = new ArrayList<Activity>();

    public  static void addActivity(Activity activity){
        activityList.add(activity);
    }

    public static  void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void finishAll(){
        for(Activity activity : activityList){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
