package india.evayadesk.com.evayadesk.network;

import android.os.Bundle;

/**
 * Interface for Http Requests
 *
 */
public interface HttpListener {

    /**
     * Called before making web service request
     */
    public void onPreExecute();

    /**
     * Called after making web service request
     */
    public void onPostExecute();

    /**
     * Called when web service request execution is completed successfully.
     *
     * @param requestId
     * @param baseData
     */
    public void onRequestCompleted(int requestId, BaseData baseData);

    /**
     * Called when the error is incurred while executing the web service
     * request.
     *
     * @param requestId
     * @param errorMessage
     */
    public void onRequestError(int requestId, String errorMessage, Bundle requestData, int httpStatus);

    /**
     * Called when the web service request is cancelled.
     *
     * @param requestId
     */
    public void onRequestCancel(int requestId);

    public void onRequestErrorRefreshToken(int requestId, int statusCode, String errorMessage);

}
