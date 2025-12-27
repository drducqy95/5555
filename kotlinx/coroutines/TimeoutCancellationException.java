package kotlinx.coroutines;

import defpackage.InterfaceC3591j70;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Timeout.kt */
@Metadata
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {

    @JvmField
    @Nullable
    public final transient InterfaceC3591j70 a;

    public TimeoutCancellationException(@NotNull String str, @Nullable InterfaceC3591j70 interfaceC3591j70) {
        super(str);
        this.a = interfaceC3591j70;
    }

    public TimeoutCancellationException(@NotNull String str) {
        this(str, null);
    }
}