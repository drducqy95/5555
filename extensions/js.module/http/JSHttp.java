package com.vbook.app.extensions.js.module.http;

/* loaded from: classes3.dex */
public class JSHttp {
    public Object get(Object obj) {
        return new JSGetHttp(obj.toString());
    }

    public Object post(Object obj) {
        return new JSPostHttp(obj.toString());
    }
}