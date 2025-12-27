package com.vbook.app.extensions.js.module.log;

import defpackage.C3329ia1;

/* loaded from: classes3.dex */
public class JSLog {
    public static JSLogListener jsLogListener;

    public void log(Object obj) {
        if (obj != null) {
            JSLogListener jSLogListener = jsLogListener;
            if (jSLogListener != null) {
                jSLogListener.log(obj);
            }
            C3329ia1.b(obj.toString(), new Object[0]);
        }
    }
}