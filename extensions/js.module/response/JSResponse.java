package com.vbook.app.extensions.js.module.response;

import com.vbook.app.extensions.js.module.core.JSList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;

/* loaded from: classes3.dex */
public class JSResponse {
    private static JSONArray convertJsonArray(NativeArray nativeArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < nativeArray.size(); i++) {
            Object obj = nativeArray.get(i);
            if (obj instanceof NativeObject) {
                jSONArray.put(convertJsonObject((NativeObject) obj));
            } else if (obj instanceof NativeArray) {
                jSONArray.put(convertJsonArray((NativeArray) obj));
            } else if (obj instanceof JSList) {
                jSONArray.put(convertJsonArray((JSList) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    private static JSONObject convertJsonObject(NativeObject nativeObject) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Object obj : nativeObject.keySet()) {
            Object obj2 = nativeObject.get(obj);
            if (obj2 instanceof NativeObject) {
                jSONObject.put(obj.toString(), convertJsonObject((NativeObject) obj2));
            } else if (obj2 instanceof NativeArray) {
                jSONObject.put(obj.toString(), convertJsonArray((NativeArray) obj2));
            } else if (obj2 instanceof JSList) {
                jSONObject.put(obj.toString(), convertJsonArray((JSList) obj2));
            } else {
                jSONObject.put(obj.toString(), obj2);
            }
        }
        return jSONObject;
    }

    private static Object convertToJson(Object obj) {
        return obj instanceof NativeObject ? convertJsonObject((NativeObject) obj) : obj instanceof NativeArray ? convertJsonArray((NativeArray) obj) : obj instanceof JSList ? convertJsonArray((JSList) obj) : obj;
    }

    public JSONObject error(Object obj) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("data2", convertToJson(obj));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject success(Object obj, Object obj2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("data", convertToJson(obj));
            jSONObject.put("data2", convertToJson(obj2));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject success(Object obj) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("data", convertToJson(obj));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONArray convertJsonArray(JSList jSList) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < jSList.length; i++) {
            Object obj = jSList.get(i);
            if (obj instanceof NativeObject) {
                jSONArray.put(convertJsonObject((NativeObject) obj));
            } else if (obj instanceof NativeArray) {
                jSONArray.put(convertJsonArray((NativeArray) obj));
            } else if (obj instanceof JSList) {
                jSONArray.put(convertJsonArray((JSList) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }
}