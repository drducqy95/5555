package com.vbook.app.extensions.js.module.http;

import android.os.SystemClock;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* loaded from: classes3.dex */
public class JSSleepFunction extends BaseFunction {
    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr.length != 1) {
            return null;
        }
        SystemClock.sleep(((Number) objArr[0]).intValue());
        return null;
    }
}