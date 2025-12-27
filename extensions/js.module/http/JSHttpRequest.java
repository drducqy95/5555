package com.vbook.app.extensions.js.module.http;

import com.vbook.app.extensions.js.module.http.JSHttpRequest;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.Scriptable;

/* loaded from: classes3.dex */
public class JSHttpRequest {
    public Object headers;
    private Request request;
    public Object url;

    public JSHttpRequest(Context context, Scriptable scriptable, Request request) throws JSONException {
        this.request = request;
        this.url = request.m().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, List<String>> entry : request.g().g().entrySet()) {
                List<String> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    jSONObject.put(entry.getKey(), value.get(0));
                }
            }
        } catch (Exception unused) {
        }
        this.headers = NativeJSON.parse(context, scriptable, jSONObject.toString(), nullCallable());
    }

    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return objArr[1];
    }

    private Callable nullCallable() {
        return new Callable() { // from class: R60
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
                return JSHttpRequest.a(context, scriptable, scriptable2, objArr);
            }
        };
    }

    public Object header(Object obj) {
        return this.request.e(obj.toString());
    }
}