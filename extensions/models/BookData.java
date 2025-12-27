package com.vbook.app.extensions.models;

import java.util.List;

/* loaded from: classes3.dex */
public class BookData {
    public NovelProperty a;
    public List<String> b;
    public List<Chapter> c;

    public BookData(NovelProperty novelProperty, List<String> list, List<Chapter> list2) {
        this.a = novelProperty;
        this.b = list;
        this.c = list2;
    }

    public List<Chapter> getChapterList() {
        return this.c;
    }

    public NovelProperty getNovel() {
        return this.a;
    }

    public List<String> getPageList() {
        return this.b;
    }

    public void setChapterList(List<Chapter> list) {
        this.c = list;
    }

    public void setNovel(NovelProperty novelProperty) {
        this.a = novelProperty;
    }

    public void setPageList(List<String> list) {
        this.b = list;
    }
}