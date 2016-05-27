package india.evayadesk.com.evayadesk.network;

import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.Parser;

import android.content.Context;
import android.util.Log;

import java.util.HashMap;

/**
 * Created by bhargavagugamsetty on 26/05/16.
 */
public class NWRequest {


    public static final String TAG = "NWRequest";
    private int mrequestCode = 0;
    private IHTTPListener mListener;
    private Context mContext = null;
    final String BOUNDARY = "myboundary";
    private String mFilePath = null;
    private int mRequestCode = 0;

    HashMap<String, String> mParams;

    public NWRequest(IHTTPListener listener, Context context) {
        mListener = listener;
        mContext = context;
    }
    public void setRequestCode(int requestCode) {
        mrequestCode = requestCode;
    }

    public int getRequestCode() {
        return mrequestCode;
    }

    public void HTTPRequest(int requestCode, HashMap<String, String> requestParams) {
        setRequestCode(requestCode);
        String finalURL = null;

        JSONObject jsonObj = new JSONObject(requestParams);
        JSONObject jsonObj_extract = null;
        switch (requestCode) {

            case HttpRequestConstants.LOGIN:
                Log.i(TAG, "login case");
                // Need to use the stored oAuth Token for API request
                finalURL = HttpRequestConstants.URL + HttpRequestConstants.LOGIN /*
                                                                            * +
                                                                            * "?access_token="
                                                                            * +
                                                                            * token
                                                                            */;
                break;

            case HttpRequestConstants.LOGIN_ADMIN:
                Log.i(TAG, "verify case");
                finalURL = HttpRequestConstants.URL + HttpRequestConstants.ADMIN_LOGIN_SERVICE;
                break;
            default:
                Log.i(TAG, "default case");

        }
        JsonObjectRequest req = new JsonObjectRequest(finalURL, jsonObj, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                try {
                    VolleyLog.v("Response:%n %s", response.toString(4));
                    Parser parser = new Parser();
                    parser.parseHTTPResponse(getRequestCode(), response, mListener);

                    Log.i("response1", "res1" + response);

                } catch (JSONException e) {
                    e.printStackTrace();
            }
        }

    }



}
