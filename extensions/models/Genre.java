package com.vbook.app.extensions.models;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class Genre implements Serializable {
    public String a;
    public String b;
    public String c;

    public String getInput() {
        return this.c;
    }

    public String getName() {
        return this.a;
    }

    public String getScript() {
        return this.b;
    }

    public void setInput(String str) {
        this.c = str;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setScript(String str) {
        this.b = str;
    }
}