package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ExceptionSuccessfullyProcessed extends Exception {

    @NotNull
    public static final ExceptionSuccessfullyProcessed a = new ExceptionSuccessfullyProcessed();

    private ExceptionSuccessfullyProcessed() {
    }
}