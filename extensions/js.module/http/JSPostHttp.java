package com.vbook.app.extensions.js.module.http;

import com.vbook.app.extensions.js.module.html.JSDocument;
import defpackage.C4798pz0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.mozilla.javascript.NativeObject;

/* loaded from: classes3.dex */
public class JSPostHttp {
    private C4798pz0 http;

    public JSPostHttp(String str) {
        this.http = new C4798pz0(str);
    }

    public Object body(Object obj) {
        return params(obj);
    }

    public Object cookie() {
        return this.http.k();
    }

    public Object formData(Object obj) {
        return params(obj);
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
        } else if (obj != null) {
            this.http.g(RequestBody.e(MediaType.g("application/json; charset=utf-8"), obj.toString()));
        }
        return this;
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