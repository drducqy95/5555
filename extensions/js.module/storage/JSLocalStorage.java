package com.vbook.app.extensions.js.module.storage;

import defpackage.C6088xc0;
import defpackage.EN;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class JSLocalStorage {
    private final EN dataSource = EN.l();
    private final String id;

    public JSLocalStorage(String str) {
        this.id = str;
    }

    private Object getData(JSONObject jSONObject, String str) throws JSONException {
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof String) {
                return obj;
            }
            if (obj instanceof Number) {
                return obj;
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private JSONObject getJSON() {
        String str = this.id;
        JSONObject jSONObject = null;
        C6088xc0 c6088xc0M = str != null ? this.dataSource.m(str) : null;
        if (c6088xc0M == null) {
            new C6088xc0().d(this.id);
        } else {
            try {
                jSONObject = new JSONObject(c6088xc0M.a());
            } catch (JSONException unused) {
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private void putData(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    public void clear() {
        this.dataSource.u(this.id, new JSONObject().toString());
    }

    public Object getItem(String str) {
        return getData(getJSON(), str);
    }

    public void removeItem(String str) {
        JSONObject json = getJSON();
        json.remove(str);
        this.dataSource.u(this.id, json.toString());
    }

    public void setItem(String str, Object obj) throws JSONException {
        JSONObject json = getJSON();
        putData(json, str, obj);
        this.dataSource.u(this.id, json.toString());
    }
}