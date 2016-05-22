package india.evayadesk.com.evayadesk.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by bhargavagugamsetty on 19/05/16.
 */
public class EvaApplication extends Application {
    private static EvaApplication sEvaApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
    public static EvaApplication getInstance() {

        if (sEvaApplication == null)
            sEvaApplication = new EvaApplication();

        return sEvaApplication;
    }

}
