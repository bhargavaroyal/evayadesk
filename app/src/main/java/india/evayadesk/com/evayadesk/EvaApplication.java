package india.evayadesk.com.evayadesk;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

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


    public RequestQueue getRequestQueue() {
        return mRequestqueue;
    }

    /**
     * Adds the specified request to the global queue, if tag is specified then
     * it is used else Default TAG is used.
     *
     * @param req
     * @param tag
     */
    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        VolleyLog.d("Adding request to queue: %s", req.getUrl());
        getRequestQueue().add(req);
    }

    /**
     * Adds the specified request to the global queue using the Default TAG.
     *
     * @param req
     */
    public <T> void addToRequestQueue(Request<T> req) {
        // set the default tag if tag is empty
        req.setTag(TAG);
        getRequestQueue().add(req);
    }

    /**
     * Cancels all pending requests by the specified TAG, it is important to
     * specify a TAG so that the pending/ongoing requests can be cancelled.
     *
     * @param tag
     */
    public void cancelPendingRequests(Object tag) {
        if (mRequestqueue != null) {
            mRequestqueue.cancelAll(tag);
        }
    }
}
