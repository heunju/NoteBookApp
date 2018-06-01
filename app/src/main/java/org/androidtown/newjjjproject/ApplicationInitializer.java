package org.androidtown.newjjjproject;

import android.app.Application;
import android.content.Context;

/**
 * Created by Jeon Hyunmin on 2018-02-04.
 */

public class ApplicationInitializer extends Application {
    private static Context context; // private로 막아둬야한다.

    @Override
    public void onCreate() { // '어플이 실행될 때 뭘 할 것인가?' 에 대한 함수.
        super.onCreate();

        ApplicationInitializer.context = getApplicationContext(); // AI 에 있는 컨텍스트에 이 어플에 있는 컨텍스트를 넣어주겠다는 뜻!
        SharedPreferenceManager.getInstance(); // getInstance 하는 순간, SPM 이 있으면 그걸 가져오고, 없으면 new 해준다!!
    }

    public static Context getAppContext(){
        return ApplicationInitializer.context;
    }
}