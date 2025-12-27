package com.vbook.app.extensions.js.module.core;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public class JSList {
    public int length;
    private List list = new ArrayList();

    public boolean add(Object obj) {
        boolean zAdd = this.list.add(obj);
        this.length = this.list.size();
        return zAdd;
    }

    public boolean addAll(@NonNull Collection collection) {
        boolean zAddAll = this.list.addAll(collection);
        this.length = this.list.size();
        return zAddAll;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.list.size(); i++) {
            consumer.accept(this.list.get(i));
        }
    }

    public Object get(int i) {
        return this.list.get(i);
    }

    public Object join(Object obj) {
        int size = this.list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.list.get(0));
        for (int i = 1; i < size; i++) {
            sb.append(obj.toString());
            sb.append(this.list.get(i));
        }
        return sb.toString();
    }

    public Object map(MapFunction mapFunction) {
        JSList jSList = new JSList();
        for (int i = 0; i < this.list.size(); i++) {
            jSList.add(mapFunction.accept(this.list.get(i)));
        }
        return jSList;
    }

    public void add(int i, Object obj) {
        this.list.add(i, obj);
        this.length = this.list.size();
    }
}