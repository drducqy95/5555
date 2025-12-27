package com.vbook.app.extensions.js.module.graphic;

/* loaded from: classes3.dex */
public class JSGraphics {
    public JSCanvas createCanvas(int i, int i2) {
        return new JSCanvas(i, i2);
    }

    public JSImage createImage(String str) {
        return new JSImage(str);
    }
}