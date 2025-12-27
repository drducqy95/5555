package com.vbook.app.extensions.js.module.html;

import androidx.annotation.NonNull;
import com.vbook.app.extensions.js.module.core.Consumer;
import com.vbook.app.extensions.js.module.core.JSList;
import com.vbook.app.extensions.js.module.core.MapFunction;
import defpackage.C4685pI;
import defpackage.C5874wI;

/* loaded from: classes3.dex */
public class JSElements {
    private final C5874wI elements;
    public int length;

    public JSElements(C5874wI c5874wI) {
        this.elements = c5874wI;
        this.length = c5874wI.size();
    }

    private String wrapNoneNull(String str) {
        return str == null ? "" : str;
    }

    public Object attr(Object obj) {
        C5874wI c5874wI = this.elements;
        return c5874wI == null ? "" : wrapNoneNull(c5874wI.j(obj.toString()));
    }

    public JSElement first() {
        C5874wI c5874wI = this.elements;
        if (c5874wI == null) {
            return null;
        }
        return new JSElement(c5874wI.l());
    }

    public void forEach(Consumer consumer) {
        if (this.elements != null) {
            for (int i = 0; i < this.elements.size(); i++) {
                consumer.accept(new JSElement((C4685pI) this.elements.get(i)));
            }
        }
    }

    public Object get(int i) {
        if (i < this.elements.size()) {
            return new JSElement((C4685pI) this.elements.get(i));
        }
        return null;
    }

    public Object html() {
        C5874wI c5874wI = this.elements;
        return c5874wI == null ? "" : wrapNoneNull(c5874wI.m());
    }

    public Object isEmpty() {
        return Boolean.valueOf(this.length == 0);
    }

    public Object last() {
        C5874wI c5874wI = this.elements;
        if (c5874wI == null) {
            return null;
        }
        return new JSElement(c5874wI.n());
    }

    public Object map(MapFunction mapFunction) {
        JSList jSList = new JSList();
        if (this.elements != null) {
            for (int i = 0; i < this.elements.size(); i++) {
                jSList.add(mapFunction.accept(new JSElement((C4685pI) this.elements.get(i))));
            }
        }
        return jSList;
    }

    public Object outerHtml() {
        C5874wI c5874wI = this.elements;
        return c5874wI == null ? "" : wrapNoneNull(c5874wI.f());
    }

    public void remove() {
        C5874wI c5874wI = this.elements;
        if (c5874wI != null) {
            c5874wI.h();
        }
    }

    public Object select(String str) {
        C5874wI c5874wI = this.elements;
        return c5874wI == null ? new JSElements(new C5874wI()) : new JSElements(c5874wI.q(str));
    }

    public Object size() {
        return Integer.valueOf(this.length);
    }

    public Object tagName(String str) {
        C5874wI c5874wI = this.elements;
        return c5874wI == null ? new JSElements(new C5874wI()) : new JSElements(c5874wI.s(str));
    }

    public Object text() {
        C5874wI c5874wI = this.elements;
        return c5874wI == null ? "" : wrapNoneNull(c5874wI.t());
    }

    @NonNull
    public String toString() {
        C5874wI c5874wI = this.elements;
        return c5874wI != null ? c5874wI.toString() : "";
    }
}