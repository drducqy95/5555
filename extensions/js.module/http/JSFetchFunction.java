package com.vbook.app.extensions.js.module.http;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* loaded from: classes3.dex */
public class JSFetchFunction extends BaseFunction {
    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return objArr.length == 1 ? fetch(context, scriptable, objArr[0], null) : fetch(context, scriptable, objArr[0], objArr[1]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0008, B:6:0x000f, B:8:0x0017, B:12:0x0028, B:14:0x002e, B:16:0x0034, B:18:0x003a, B:20:0x0040, B:22:0x0046, B:25:0x0051, B:27:0x0061, B:28:0x006b, B:30:0x0071, B:32:0x0077, B:34:0x007d, B:35:0x008d, B:37:0x00a3, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00bf, B:45:0x00e2, B:47:0x00ea, B:48:0x00f3, B:49:0x00f7, B:88:0x019f, B:90:0x01b5, B:92:0x01bb, B:94:0x01c3, B:95:0x01c6, B:51:0x00fc, B:71:0x0141, B:73:0x014b, B:74:0x015a, B:76:0x0160, B:78:0x0166, B:80:0x016c, B:81:0x017c, B:87:0x019b, B:83:0x0183, B:86:0x018f, B:54:0x0105, B:57:0x010e, B:60:0x0117, B:62:0x011f, B:63:0x0125, B:66:0x012e, B:68:0x0134, B:69:0x0139), top: B:99:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetch(org.mozilla.javascript.Context r10, org.mozilla.javascript.Scriptable r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vbook.app.extensions.js.module.http.JSFetchFunction.fetch(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}