package india.evayadesk.com.evayadesk.models.api;

import com.android.volley.RequestQueue;

import android.content.Context;
import android.os.Bundle;

import india.evayadesk.com.evayadesk.network.HttpListener;

/**
 * Created by bhargavagugamsetty on 25/05/16.
 */
public class ApiUpdateTicketAgent {
    private Context mContext;
    private HttpListener mCallback = null;

    private RequestQueue mRequestQueue = null;

    private Bundle mUrlParams = null;

    private Bundle mParams = null;

    private int mRequestID = 0;
//    private DatabaseManager dbMgr = null;


    public ApiUpdateTicketAgent(final Context context, final HttpListener callback, final RequestQueue requestQueue, final Bundle params,
                          final Bundle urlParams, int requestID) {

    }
}
