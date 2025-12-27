package kotlinx.coroutines.channels;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException(@Nullable String str) {
        super(str);
    }
}