package org.apache.cordova.logdemo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;

/**
 * This class echoes a string called from JavaScript.
 */
public class LogDemo extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("printLog")) {
            String message = args.getString(0);
            this.printLog(message, callbackContext);
            return true;
        }
        return false;
    }

    private void printLog(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Log.v("Log","Log-v");
            String info = Integer.toString(999);
            Log.v("Log", info);
            Log.v("Log","Log-end");
            Log.v("Log", message);
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
