package kotlinx.coroutines;

import defpackage.C5329t60;
import defpackage.InterfaceC3591j70;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Exceptions.kt */
@Metadata
/* loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException {

    @JvmField
    @NotNull
    public final transient InterfaceC3591j70 a;

    public JobCancellationException(@NotNull String str, @Nullable Throwable th, @NotNull InterfaceC3591j70 interfaceC3591j70) {
        super(str);
        this.a = interfaceC3591j70;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return C5329t60.a(jobCancellationException.getMessage(), getMessage()) && C5329t60.a(jobCancellationException.a, this.a) && C5329t60.a(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C5329t60.b(message);
        int iHashCode = ((message.hashCode() * 31) + this.a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.a;
    }
}