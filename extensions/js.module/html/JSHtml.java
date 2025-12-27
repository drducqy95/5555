package com.vbook.app.extensions.js.module.html;

import defpackage.PN0;
import defpackage.Q80;
import org.mozilla.javascript.NativeArray;

/* loaded from: classes3.dex */
public class JSHtml {
    public Object clean(Object obj, Object obj2) {
        PN0 pn0 = new PN0();
        if (obj2 instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) obj2;
            for (int i = 0; i < nativeArray.size(); i++) {
                pn0.d(nativeArray.get(i).toString());
            }
        } else {
            pn0.d(obj2.toString());
        }
        return Q80.a(obj.toString(), pn0);
    }

    public Object parse(Object obj) {
        return new JSDocument(Q80.c(obj.toString()));
    }
}