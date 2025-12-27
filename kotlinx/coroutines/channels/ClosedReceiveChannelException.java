package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException(@Nullable String str) {
        super(str);
    }
}