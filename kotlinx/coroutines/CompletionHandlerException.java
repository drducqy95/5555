package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Exceptions.common.kt */
@InternalCoroutinesApi
@Metadata
/* loaded from: classes3.dex */
public final class CompletionHandlerException extends RuntimeException {
    public CompletionHandlerException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}