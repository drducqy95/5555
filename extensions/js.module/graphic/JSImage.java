package com.vbook.app.extensions.js.module.graphic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.E20;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class JSImage {
    protected Bitmap bitmap;
    public int height;
    public int width;

    public JSImage(String str) {
        byte[] bArrE = E20.e(str);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrE, 0, bArrE.length);
        this.bitmap = bitmapDecodeByteArray;
        this.width = bitmapDecodeByteArray.getWidth();
        this.height = this.bitmap.getHeight();
    }

    public byte[] compress() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void release() {
        this.bitmap.recycle();
        this.bitmap = null;
    }

    public JSImage(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
    }
}