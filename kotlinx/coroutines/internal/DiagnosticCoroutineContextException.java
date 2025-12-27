package kotlinx.coroutines.internal;

import defpackage.InterfaceC2200bv;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata
/* loaded from: classes3.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    @NotNull
    public final transient InterfaceC2200bv a;

    public DiagnosticCoroutineContextException(@NotNull InterfaceC2200bv interfaceC2200bv) {
        this.a = interfaceC2200bv;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getLocalizedMessage() {
        return this.a.toString();
    }
}