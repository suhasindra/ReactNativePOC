package com.sampleapp;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.json.JSONObject;

/**
 * Created by akshayrao on 15/11/18.
 */

public class ActivityControllerModule extends ReactContextBaseJavaModule {

    private ReactApplicationContext mReactContext;

    ActivityControllerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mReactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ActivityController";
    }

    @ReactMethod
    void navigateToExample(String data) {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, NativeActivity.class);
        intent.putExtra("data", data);
        context.startActivity(intent);
    }

//     void sedBackDtat(String data){
//         mReactContext.getJSModule(com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter.class)
//                 .emit("onNewData", data);
//     }
}
