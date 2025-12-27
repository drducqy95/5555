package com.vbook.app.extensions.js.module.script;

import defpackage.C3329ia1;
import java.util.ArrayList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.ScriptableObject;

/* loaded from: classes3.dex */
public class JSScript {
    public Object execute(String str, String str2, Object obj) {
        Context contextEnter = Context.enter();
        contextEnter.setOptimizationLevel(-1);
        contextEnter.setLanguageVersion(200);
        try {
            try {
                ScriptableObject scriptableObjectInitSafeStandardObjects = contextEnter.initSafeStandardObjects();
                contextEnter.getWrapFactory().setJavaPrimitiveWrap(false);
                contextEnter.evaluateString(scriptableObjectInitSafeStandardObjects, str, "Script", 1, null);
                Object objCall = ((Function) scriptableObjectInitSafeStandardObjects.get(str2, scriptableObjectInitSafeStandardObjects)).call(contextEnter, scriptableObjectInitSafeStandardObjects, scriptableObjectInitSafeStandardObjects, obj instanceof NativeArray ? new ArrayList((NativeArray) obj).toArray() : obj != null ? new Object[]{obj} : null);
                Context.exit();
                return objCall;
            } catch (Exception e) {
                C3329ia1.c(e);
                Context.exit();
                return null;
            }
        } catch (Throwable th) {
            Context.exit();
            throw th;
        }
    }
}