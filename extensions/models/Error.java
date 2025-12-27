package com.vbook.app.extensions.models;

/* loaded from: classes3.dex */
public class Error extends Exception {
    public final int a;

    public Error(int i, String str) {
        super(str);
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "Error{code=" + this.a + ", message='" + getMessage() + "'}";
    }
}