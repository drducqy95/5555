package com.vbook.app.extensions.js.module.html;

import defpackage.C4685pI;
import defpackage.C5874wI;

/* loaded from: classes3.dex */
public class JSElement {
    private final C4685pI element;

    public JSElement(C4685pI c4685pI) {
        this.element = c4685pI;
    }

    private String wrapNoneNull(String str) {
        return str == null ? "" : str;
    }

    public Object attr(Object obj) {
        C4685pI c4685pI = this.element;
        return c4685pI == null ? "" : wrapNoneNull(c4685pI.i(obj.toString()));
    }

    public Object html() {
        C4685pI c4685pI = this.element;
        return c4685pI == null ? "" : wrapNoneNull(c4685pI.R0());
    }

    public Object outerHtml() {
        C4685pI c4685pI = this.element;
        return c4685pI == null ? "" : wrapNoneNull(c4685pI.O());
    }

    public void remove() {
        C4685pI c4685pI = this.element;
        if (c4685pI != null) {
            c4685pI.Y();
        }
    }

    public Object select(Object obj) {
        C4685pI c4685pI = this.element;
        return c4685pI == null ? new JSElements(new C5874wI()) : new JSElements(c4685pI.l1(obj.toString()));
    }

    public Object tagName(String str) {
        C4685pI c4685pI = this.element;
        if (c4685pI == null) {
            return null;
        }
        return new JSElement(c4685pI.s1(str));
    }

    public Object text() {
        C4685pI c4685pI = this.element;
        return c4685pI == null ? "" : wrapNoneNull(c4685pI.w1());
    }

    public String toString() {
        C4685pI c4685pI = this.element;
        return c4685pI != null ? c4685pI.toString() : "";
    }

    public Object tagName() {
        C4685pI c4685pI = this.element;
        return c4685pI == null ? "" : c4685pI.v1();
    }
}