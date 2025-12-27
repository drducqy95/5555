package com.vbook.app.extensions.js.module.http;

import com.vbook.app.extensions.js.module.html.JSDocument;
import com.vbook.app.extensions.js.module.http.JSHttpResponse;
import defpackage.C3329ia1;
import defpackage.E20;
import defpackage.Q80;
import java.util.List;
import java.util.Map;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.Scriptable;

/* loaded from: classes3.dex */
public class JSHttpResponse {
    private final Context context;
    public Object headers;
    public Object ok;
    public Object request;
    private Response response;
    private final Scriptable scriptable;
    public Object status;
    public Object statusText;
    public Object url;

    public JSHttpResponse(Context context, Scriptable scriptable, Response response) throws JSONException {
        this.response = response;
        this.context = context;
        this.scriptable = scriptable;
        if (response != null) {
            this.status = Integer.valueOf(response.A());
            this.statusText = response.Q();
            this.ok = Boolean.valueOf(response.M());
            this.url = response.k0().m().toString();
            Map<String, List<String>> mapG = response.S().L().g();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, List<String>> entry : mapG.entrySet()) {
                    List<String> value = entry.getValue();
                    if (value != null && !value.isEmpty()) {
                        jSONObject.put(entry.getKey(), value.get(0));
                    }
                }
            } catch (Exception unused) {
            }
            this.request = new JSHttpRequest(context, scriptable, response.S().k0());
            this.headers = NativeJSON.parse(context, scriptable, jSONObject.toString(), nullCallable());
        }
    }

    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return objArr[1];
    }

    private Callable nullCallable() {
        return new Callable() { // from class: S60
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
                return JSHttpResponse.a(context, scriptable, scriptable2, objArr);
            }
        };
    }

    public Object base64() {
        try {
            ResponseBody responseBodyC = this.response.c();
            if (responseBodyC != null) {
                return E20.h(responseBodyC.c());
            }
            return null;
        } catch (Exception e) {
            C3329ia1.c(e);
            return null;
        }
    }

    public Object header(Object obj) {
        return this.response.F(obj.toString());
    }

    public Object html() {
        return html(null);
    }

    public Object json() {
        return json(null);
    }

    public Object text() {
        return text(null);
    }

    public Object html(Object obj) {
        try {
            ResponseBody responseBodyC = this.response.c();
            if (responseBodyC != null) {
                return obj == null ? new JSDocument(Q80.c(responseBodyC.G())) : new JSDocument(Q80.c(new String(responseBodyC.c(), obj.toString())));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public Object json(Object obj) {
        try {
            ResponseBody responseBodyC = this.response.c();
            if (responseBodyC != null) {
                return NativeJSON.parse(this.context, this.scriptable, obj == null ? responseBodyC.G() : new String(responseBodyC.c(), obj.toString()), nullCallable());
            }
            return null;
        } catch (Exception e) {
            C3329ia1.c(e);
            return null;
        }
    }

    public Object text(Object obj) {
        try {
            ResponseBody responseBodyC = this.response.c();
            if (responseBodyC != null) {
                return obj == null ? responseBodyC.G() : new String(responseBodyC.c(), obj.toString());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}