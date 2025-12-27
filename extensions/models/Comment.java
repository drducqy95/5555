package com.vbook.app.extensions.models;

import androidx.annotation.NonNull;
import defpackage.SB;

/* loaded from: classes3.dex */
public class Comment implements SB<Comment> {
    public String a;
    public String b;
    public String c;

    public String getContent() {
        return this.b;
    }

    public String getDescription() {
        return this.c;
    }

    public String getName() {
        return this.a;
    }

    @Override // defpackage.SB
    public boolean isSameInstance(Object obj) {
        return obj instanceof Comment;
    }

    public void setContent(String str) {
        this.b = str;
    }

    public void setDescription(String str) {
        this.c = str;
    }

    public void setName(String str) {
        this.a = str;
    }

    @Override // defpackage.SB
    public boolean areContentsTheSame(@NonNull Comment comment) {
        return comment.b.equals(this.b) && comment.a.equals(this.a);
    }

    @Override // defpackage.SB
    public boolean areItemsTheSame(@NonNull Comment comment) {
        return comment.b.equals(this.b);
    }
}