package com.vbook.app.extensions.js.module.html;

import defpackage.C2935gD;
import defpackage.C5874wI;

/* loaded from: classes3.dex */
public class JSDocument {
    private final C2935gD document;

    public JSDocument(C2935gD c2935gD) {
        this.document = c2935gD;
    }

    private String wrapNoneNull(String str) {
        return str == null ? "" : str;
    }

    public Object attr(Object obj) {
        C2935gD c2935gD = this.document;
        return c2935gD == null ? "" : wrapNoneNull(c2935gD.i(obj.toString()));
    }

    public Object html() {
        C2935gD c2935gD = this.document;
        return c2935gD == null ? "" : wrapNoneNull(c2935gD.R0());
    }

    public void remove() {
        C2935gD c2935gD = this.document;
        if (c2935gD != null) {
            c2935gD.Y();
        }
    }

    public Object select(Object obj) {
        try {
            return new JSElements(this.document.l1(obj.toString()));
        } catch (Exception unused) {
            return new JSElements(new C5874wI());
        }
    }

    public Object selectXpath(Object obj) {
        try {
            return new JSElements(this.document.m1(obj.toString()));
        } catch (Exception unused) {
            return new JSElements(new C5874wI());
        }
    }

    public Object tagName(String str) {
        C2935gD c2935gD = this.document;
        if (c2935gD == null) {
            return null;
        }
        return new JSElement(c2935gD.s1(str));
    }

    public Object text() {
        C2935gD c2935gD = this.document;
        return c2935gD == null ? "" : wrapNoneNull(c2935gD.w1());
    }

    public String toString() {
        C2935gD c2935gD = this.document;
        return c2935gD == null ? "" : c2935gD.toString();
    }

    public Object tagName() {
        C2935gD c2935gD = this.document;
        return c2935gD == null ? "" : c2935gD.v1();
    }
}