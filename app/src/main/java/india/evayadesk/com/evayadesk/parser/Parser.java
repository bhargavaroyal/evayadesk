package india.evayadesk.com.evayadesk.parser;

import org.json.JSONObject;

import india.evayadesk.com.evayadesk.network.IHTTPListener;
import india.evayadesk.com.evayadesk.network.ResponseData;
import india.evayadesk.com.evayadesk.util.SharedConstants;

/**
 * Created by bhargavagugamsetty on 27/05/16.
 */
public class Parser {
    public static final String TAG = "Parser";
    public static String mPasscode = null;

    public static String getmPasscode() {
        return mPasscode;
    }

    public static void setmPasscode(String mPasscode) {
        Parser.mPasscode = mPasscode;
    }

    public void parseHTTPResponse(int requestCode, JSONObject response, IHTTPListener listener) {
        ResponseData responseDataObj = new ResponseData();
        if (response.has(SharedConstants.STATUSCODE)) { String statusCode = null;
            String responseDataCode = null;
            String responseData = null;
            String userId = null;
            String message = null;



        }
    }
}