package com.vbook.app.extensions.js.module.http;

import com.vbook.app.extensions.js.module.html.JSDocument;
import defpackage.GW;
import org.mozilla.javascript.NativeObject;

/* loaded from: classes3.dex */
public class JSGetHttp {
    private final GW http;

    public JSGetHttp(String str) {
        this.http = new GW(str);
    }

    public Object cookie() {
        return this.http.k();
    }

    public Object headers(Object obj) {
        if (obj instanceof NativeObject) {
            NativeObject nativeObject = (NativeObject) obj;
            for (Object obj2 : nativeObject.keySet()) {
                if (obj2 != null && nativeObject.get(obj2) != null) {
                    this.http.e(obj2.toString(), nativeObject.get(obj2).toString());
                }
            }
        }
        return this;
    }

    public Object html() {
        return new JSDocument(this.http.m());
    }

    public Object params(Object obj) {
        if (obj instanceof NativeObject) {
            NativeObject nativeObject = (NativeObject) obj;
            for (Object obj2 : nativeObject.keySet()) {
                if (obj2 != null && nativeObject.get(obj2) != null) {
                    this.http.f(obj2.toString(), nativeObject.get(obj2).toString());
                }
            }
        }
        return this;
    }

    public Object queries(Object obj) {
        return params(obj);
    }

    public Object string() {
        return this.http.s();
    }

    public Object timeout(Object obj) {
        this.http.u(Integer.parseInt(obj.toString()));
        return this;
    }

    public Object url() {
        return this.http.w();
    }

    public Object html(Object obj) {
        return new JSDocument(this.http.n(obj.toString()));
    }

    public Object string(Object obj) {
        return this.http.t(obj.toString());
    }
}