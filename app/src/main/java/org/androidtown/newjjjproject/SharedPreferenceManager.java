package org.androidtown.newjjjproject;

        import android.content.Context;
        import android.content.SharedPreferences;

/**
 * Created by Jeon Hyunmin on 2018-03-19.
 */

// 이 클래스에서만 SharedPreference를 가질 수 있다.
// SharedPreference는 간단한 값들을 저장해 놓는 거라고 볼 수 있다. ex) 자동로그인, 초기값 저장. 어플을 끄기 전까지는, 저장해놓은 값들이 사라지지 않는다.

public class SharedPreferenceManager{
    private static String LOGIN = "login";
    private static SharedPreferenceManager spf = null;
    private SharedPreferences.Editor loginEditor;
    private SharedPreferences loginSpf;

    public SharedPreferenceManager() {
        context = ApplicationInitializer.getAppContext();
        loginSpf = context.getSharedPreferences(
                LOGIN, Context.MODE_PRIVATE
        );
        loginEditor = loginSpf.edit();
    }
    private Context context;
    // private static SharedPreferences.Editor loginEditor; // 데이터 기록을 위해서 SharedPreferences.Editor instance를 얻는다. 우리는 로그인을 위함이니, loginEditor!
    public static SharedPreferenceManager getInstance() {
        if(spf == null) {
            spf = new SharedPreferenceManager();
            return spf;
        }
        return spf;
    }

    public void setId(String id){ // set 은 return 값이 없어도 되니까 void..! 그러나 void 썼으니 앞에 String 못하니까 ()에 넣기.
        loginEditor.putString("id", id); // 앞에 것이 Key 값. 즉 id 라는 key값에 id 값 넣기. 이걸 loginEditor에 put 하는 것.
    }

    public String getId(){ // 반면 get 은 return 값이 있어야함. 그래서 void하면 안되고, String 을 앞에 써주는 것이다.
        return loginSpf.getString("id", "");
    }

    public void setPw(String pw){
        loginEditor.putString("pw", pw);
    }

    public String getPw(){
        return loginSpf.getString("pw", "");
    }

    public void logout(){
        loginEditor.clear();
        loginEditor.commit();
    }
}