package india.evayadesk.com.evayadesk.network;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model object that stores the server api call response state. It is delivered
 * back to the {@link HttpListener} object
 *
 *
 */
public class BaseData implements Parcelable {

    /**
     * true, if data is fetched successful
     *
     */
    public boolean                                   isSuccess;

    /**
     * holds the server error message which occurred while fetching the data.
     */
    public String                                    errorMessage;

    /**
     * Holds the error code sent by server
     */
    public int                                       errorCode;

    /**
     * holds the server system message.
     */
    public String                                    sysMessage;

    /**
     * Holds any data regd. response
     */
    public Bundle                                    responseExtras;

    /**
     * response object
     */

    public Object                                   responseObj;


    /**
     * Status Code
     */
    public int                                      statusCode;

    // This is used to regenerate the object.
    public static final Creator<BaseData> CREATOR = new Creator<BaseData>() {

        @Override
        public BaseData createFromParcel(final Parcel in) {

            return new BaseData(in);
        }

        @Override
        public BaseData[] newArray(final int size) {

            return new BaseData[size];
        }
    };

    public BaseData() {

    }

    /**
     *
     * Constructor used when re-constructing object from a parcel
     *
     * @param in
     *            a parcel from which to read this object
     */
    private BaseData(final Parcel in) {

        isSuccess = (in.readByte() == 1);
        errorMessage = in.readString();
        sysMessage = in.readString();
        responseExtras = in.readBundle();
    }

    @Override
    public int describeContents() {

        return 0;
    }

    @Override
    public void writeToParcel(final Parcel out, final int flags) {

        out.writeByte((byte) (isSuccess ? 1 : 0));
        out.writeString(errorMessage);
        out.writeString(sysMessage);
        out.writeBundle(responseExtras);
    }

    public Object getResponseObj() {
        return responseObj;
    }

    public void setResponseObj(Object responseObj) {
        this.responseObj = responseObj;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
