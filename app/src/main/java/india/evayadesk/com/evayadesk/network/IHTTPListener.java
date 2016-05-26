package india.evayadesk.com.evayadesk.network;

/**
 * Created by bhargavagugamsetty on 26/05/16.
 */
public interface IHTTPListener {

        public void onSuccess(ResponseData responsedata);

        public void onError(Integer errorCode, String errorTitle, String errorMessage);
    }


