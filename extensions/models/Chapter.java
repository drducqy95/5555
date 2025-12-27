package com.vbook.app.extensions.models;

/* loaded from: classes3.dex */
public class Chapter {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;

    public Chapter(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = z2;
    }

    public String getName() {
        return this.b;
    }

    public String getNameTrans() {
        return this.c;
    }

    public String getUrl() {
        return this.a;
    }

    public boolean isLock() {
        return this.e;
    }

    public boolean isPay() {
        return this.d;
    }

    public void setLock(boolean z) {
        this.e = z;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setNameTrans(String str) {
        this.c = str;
    }

    public void setPay(boolean z) {
        this.d = z;
    }

    public void setUrl(String str) {
        this.a = str;
    }

    public Chapter() {
    }
}