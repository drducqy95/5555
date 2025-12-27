package com.vbook.app.extensions.js.module.http;

/* loaded from: classes3.dex */
public class JSHttpErrorResponse {
    public Object ok = Boolean.FALSE;
    public Object status;
    public Object statusText;

    public JSHttpErrorResponse(int i, Exception exc) {
        this.status = Integer.valueOf(i);
        this.statusText = exc.getMessage();
    }

    public Object html() {
        return html(null);
    }

    public Object json() {
        return json(null);
    }

    public Object text() {
        return text(null);
    }

    public Object html(Object obj) {
        throw new RuntimeException(this.statusText.toString());
    }

    public Object json(Object obj) {
        throw new RuntimeException(this.statusText.toString());
    }

    public Object text(Object obj) {
        throw new RuntimeException(this.statusText.toString());
    }
}