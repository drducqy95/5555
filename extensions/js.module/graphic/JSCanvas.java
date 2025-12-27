package com.vbook.app.extensions.js.module.graphic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public class JSCanvas {
    private Bitmap bitmap;
    private Canvas canvas;

    public JSCanvas(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.bitmap = bitmapCreateBitmap;
        this.canvas = new Canvas(bitmapCreateBitmap);
    }

    public JSImage capture() {
        return new JSImage(this.bitmap);
    }

    public void drawImage(JSImage jSImage, double d, double d2) {
        this.canvas.drawBitmap(this.bitmap, (float) d, (float) d2, (Paint) null);
    }

    public void drawImage(JSImage jSImage, double d, double d2, double d3, double d4) {
        this.canvas.drawBitmap(jSImage.bitmap, (Rect) null, new Rect((int) d, (int) d2, (int) (d + d3), (int) (d2 + d4)), (Paint) null);
    }

    public void drawImage(JSImage jSImage, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.canvas.drawBitmap(jSImage.bitmap, new Rect((int) d, (int) d2, (int) (d + d3), (int) (d2 + d4)), new Rect((int) d5, (int) d6, (int) (d5 + d7), (int) (d6 + d8)), (Paint) null);
    }
}