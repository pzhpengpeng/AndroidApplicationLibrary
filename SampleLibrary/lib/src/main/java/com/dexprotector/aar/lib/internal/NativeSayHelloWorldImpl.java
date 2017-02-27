package com.dexprotector.aar.lib.internal;

import android.content.Context;

import com.dexprotector.aar.lib.SayHelloWorld;


public class NativeSayHelloWorldImpl extends SayHelloWorld {

    public NativeSayHelloWorldImpl(Context ctx) {
        System.loadLibrary("sample-jni");
    }

    @Override
    public native String sayHelloWorld();
}
