package com.vbook.app.extensions.js.module.browser;

import com.vbook.app.extensions.js.module.html.JSDocument;
import defpackage.C1258Qe;
import defpackage.C2302cY;
import defpackage.C2935gD;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;

/* loaded from: classes3.dex */
public class JSBrowser {
    final Set<String> blockUrl;
    final C1258Qe browser;
    final Map<String, String> injectCookies;

    public JSBrowser() {
        C1258Qe c1258Qe = new C1258Qe();
        this.browser = c1258Qe;
        HashSet hashSet = new HashSet();
        this.blockUrl = hashSet;
        this.injectCookies = new LinkedHashMap();
        c1258Qe.J(hashSet);
    }

    public void block(NativeArray nativeArray) {
        this.blockUrl.clear();
        for (int i = 0; i < nativeArray.size(); i++) {
            this.blockUrl.add(nativeArray.get(i).toString());
        }
    }

    public JSDocument callJs(Object obj, Object obj2) {
        try {
            return new JSDocument(this.browser.q(obj.toString(), (long) Double.parseDouble(obj2.toString())));
        } catch (Throwable unused) {
            return new JSDocument(html(this.browser));
        }
    }

    public JSDocument click(Object obj, Object obj2) {
        this.browser.click(Float.parseFloat(obj.toString()), Float.parseFloat(obj2.toString()));
        return html();
    }

    public void close() {
        this.browser.p();
    }

    public String getVariable(String str) {
        return this.browser.t(str);
    }

    public JSDocument html() {
        return new JSDocument(html(this.browser));
    }

    public JSDocument launch(Object obj, Object obj2) {
        try {
            return new JSDocument(this.browser.G(obj.toString(), this.injectCookies, (long) Double.parseDouble(obj2.toString())));
        } catch (Throwable unused) {
            return new JSDocument(html(this.browser));
        }
    }

    public void launchAsync(Object obj) {
        try {
            this.browser.H(obj.toString(), this.injectCookies);
        } catch (Throwable unused) {
        }
    }

    public void loadHtml(String str, String str2) {
        try {
            this.browser.F(str2, str, 500L);
        } catch (Exception unused) {
        }
    }

    public void overrideCookie(Object obj) {
        if (obj instanceof NativeObject) {
            NativeObject nativeObject = (NativeObject) obj;
            for (Object obj2 : nativeObject.keySet()) {
                if (obj2 != null && nativeObject.get(obj2) != null) {
                    this.injectCookies.put(obj2.toString(), nativeObject.get(obj2).toString());
                }
            }
        }
    }

    public void setUserAgent(String str) {
        this.browser.K(str);
    }

    public Object urls() {
        HashSet hashSet = new HashSet();
        List<String> listS = this.browser.s();
        for (int i = 0; i < listS.size(); i++) {
            try {
                hashSet.add(listS.get(i));
            } catch (Exception unused) {
            }
        }
        return new C2302cY().u(hashSet);
    }

    public void waitUrl(Object obj, Object obj2) {
        try {
            this.browser.L(obj.toString(), (long) Double.parseDouble(obj2.toString()));
        } catch (Throwable unused) {
        }
    }

    public JSDocument html(Object obj) {
        return new JSDocument(html(this.browser, (int) Double.parseDouble(obj.toString())));
    }

    private C2935gD html(C1258Qe c1258Qe) {
        try {
            return c1258Qe.u();
        } catch (Throwable unused) {
            return null;
        }
    }

    private C2935gD html(C1258Qe c1258Qe, int i) {
        try {
            return c1258Qe.v(i);
        } catch (Throwable unused) {
            return null;
        }
    }
}