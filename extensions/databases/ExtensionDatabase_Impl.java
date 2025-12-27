package com.vbook.app.extensions.databases;

import androidx.annotation.NonNull;
import androidx.room.c;
import androidx.room.util.TableInfo;
import defpackage.AbstractC2340cl0;
import defpackage.AbstractC4693pL0;
import defpackage.BN;
import defpackage.C0564Ex;
import defpackage.C5918wc0;
import defpackage.InterfaceC5035rN;
import defpackage.InterfaceC5238sc0;
import defpackage.InterfaceC5501u7;
import defpackage.LI0;
import defpackage.RM0;
import defpackage.SI0;
import defpackage.SM0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ExtensionDatabase_Impl extends ExtensionDatabase {
    public volatile InterfaceC5035rN q;
    public volatile LI0 r;
    public volatile InterfaceC5238sc0 s;

    @Override // defpackage.AbstractC3631jL0
    @NonNull
    public Map<Class<?>, List<Class<?>>> C() {
        HashMap map = new HashMap();
        map.put(InterfaceC5035rN.class, BN.j());
        map.put(LI0.class, SI0.g());
        map.put(InterfaceC5238sc0.class, C5918wc0.g());
        return map;
    }

    @Override // com.vbook.app.extensions.databases.ExtensionDatabase
    public InterfaceC5238sc0 c0() {
        InterfaceC5238sc0 interfaceC5238sc0;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new C5918wc0(this);
                }
                interfaceC5238sc0 = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5238sc0;
    }

    @Override // com.vbook.app.extensions.databases.ExtensionDatabase
    public InterfaceC5035rN d0() {
        InterfaceC5035rN interfaceC5035rN;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new BN(this);
                }
                interfaceC5035rN = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5035rN;
    }

    @Override // com.vbook.app.extensions.databases.ExtensionDatabase
    public LI0 e0() {
        LI0 li0;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new SI0(this);
                }
                li0 = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return li0;
    }

    @Override // defpackage.AbstractC3631jL0
    @NonNull
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public AbstractC4693pL0 p() {
        return new a(8, "8aa97e531ef635c2e7972aa8b086c9d6", "6eb2ca8e037ea8f369a9e8b857a23bd1");
    }

    @Override // defpackage.AbstractC3631jL0
    @NonNull
    public c o() {
        return new c(this, new HashMap(0), new HashMap(0), "tb_extension", "tb_repository", "tb_storage");
    }

    @Override // defpackage.AbstractC3631jL0
    @NonNull
    public List<AbstractC2340cl0> s(@NonNull Map<Class<? extends InterfaceC5501u7>, InterfaceC5501u7> map) {
        return new ArrayList();
    }

    @Override // defpackage.AbstractC3631jL0
    @NonNull
    public Set<Class<? extends InterfaceC5501u7>> z() {
        return new HashSet();
    }

    public class a extends AbstractC4693pL0 {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // defpackage.AbstractC4693pL0
        public void a(@NonNull SM0 sm0) {
            RM0.a(sm0, "CREATE TABLE IF NOT EXISTS `tb_extension` (`id` TEXT NOT NULL, `name` TEXT, `author` TEXT, `version` INTEGER NOT NULL, `source` TEXT, `icon` TEXT, `regexp` TEXT, `description` TEXT, `last_update` INTEGER NOT NULL, `url` TEXT, `local` TEXT, `language` TEXT, `type` TEXT, `enabled` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `tag` TEXT, `agent` TEXT, `debug` INTEGER NOT NULL, `last_use` INTEGER NOT NULL, `search_index` INTEGER NOT NULL, `delay_connect` INTEGER NOT NULL, `num_connect` INTEGER NOT NULL, `home` TEXT, `detail` TEXT, `page` TEXT, `site` TEXT, `toc` TEXT, `chap` TEXT, `search` TEXT, `genre` TEXT, `data` TEXT, `config` TEXT, `encrypt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            RM0.a(sm0, "CREATE TABLE IF NOT EXISTS `tb_repository` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `repository` TEXT, `description` TEXT, `author` TEXT)");
            RM0.a(sm0, "CREATE TABLE IF NOT EXISTS `tb_storage` (`id` TEXT NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            RM0.a(sm0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            RM0.a(sm0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8aa97e531ef635c2e7972aa8b086c9d6')");
        }

        @Override // defpackage.AbstractC4693pL0
        public void b(@NonNull SM0 sm0) {
            RM0.a(sm0, "DROP TABLE IF EXISTS `tb_extension`");
            RM0.a(sm0, "DROP TABLE IF EXISTS `tb_repository`");
            RM0.a(sm0, "DROP TABLE IF EXISTS `tb_storage`");
        }

        @Override // defpackage.AbstractC4693pL0
        public void g(@NonNull SM0 sm0) {
            ExtensionDatabase_Impl.this.M(sm0);
        }

        @Override // defpackage.AbstractC4693pL0
        public void i(@NonNull SM0 sm0) {
            C0564Ex.a(sm0);
        }

        @Override // defpackage.AbstractC4693pL0
        @NonNull
        public AbstractC4693pL0.a j(@NonNull SM0 sm0) {
            HashMap map = new HashMap(33);
            map.put("id", new TableInfo.a("id", "TEXT", true, 1, null, 1));
            map.put("name", new TableInfo.a("name", "TEXT", false, 0, null, 1));
            map.put("author", new TableInfo.a("author", "TEXT", false, 0, null, 1));
            map.put("version", new TableInfo.a("version", "INTEGER", true, 0, null, 1));
            map.put("source", new TableInfo.a("source", "TEXT", false, 0, null, 1));
            map.put("icon", new TableInfo.a("icon", "TEXT", false, 0, null, 1));
            map.put("regexp", new TableInfo.a("regexp", "TEXT", false, 0, null, 1));
            map.put("description", new TableInfo.a("description", "TEXT", false, 0, null, 1));
            map.put("last_update", new TableInfo.a("last_update", "INTEGER", true, 0, null, 1));
            map.put("url", new TableInfo.a("url", "TEXT", false, 0, null, 1));
            map.put("local", new TableInfo.a("local", "TEXT", false, 0, null, 1));
            map.put("language", new TableInfo.a("language", "TEXT", false, 0, null, 1));
            map.put("type", new TableInfo.a("type", "TEXT", false, 0, null, 1));
            map.put("enabled", new TableInfo.a("enabled", "INTEGER", true, 0, null, 1));
            map.put("priority", new TableInfo.a("priority", "INTEGER", true, 0, null, 1));
            map.put("tag", new TableInfo.a("tag", "TEXT", false, 0, null, 1));
            map.put("agent", new TableInfo.a("agent", "TEXT", false, 0, null, 1));
            map.put("debug", new TableInfo.a("debug", "INTEGER", true, 0, null, 1));
            map.put("last_use", new TableInfo.a("last_use", "INTEGER", true, 0, null, 1));
            map.put("search_index", new TableInfo.a("search_index", "INTEGER", true, 0, null, 1));
            map.put("delay_connect", new TableInfo.a("delay_connect", "INTEGER", true, 0, null, 1));
            map.put("num_connect", new TableInfo.a("num_connect", "INTEGER", true, 0, null, 1));
            map.put("home", new TableInfo.a("home", "TEXT", false, 0, null, 1));
            map.put("detail", new TableInfo.a("detail", "TEXT", false, 0, null, 1));
            map.put("page", new TableInfo.a("page", "TEXT", false, 0, null, 1));
            map.put("site", new TableInfo.a("site", "TEXT", false, 0, null, 1));
            map.put("toc", new TableInfo.a("toc", "TEXT", false, 0, null, 1));
            map.put("chap", new TableInfo.a("chap", "TEXT", false, 0, null, 1));
            map.put("search", new TableInfo.a("search", "TEXT", false, 0, null, 1));
            map.put("genre", new TableInfo.a("genre", "TEXT", false, 0, null, 1));
            map.put("data", new TableInfo.a("data", "TEXT", false, 0, null, 1));
            map.put("config", new TableInfo.a("config", "TEXT", false, 0, null, 1));
            map.put("encrypt", new TableInfo.a("encrypt", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("tb_extension", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfoA = TableInfo.a(sm0, "tb_extension");
            if (!tableInfo.equals(tableInfoA)) {
                return new AbstractC4693pL0.a(false, "tb_extension(com.vbook.app.extensions.databases.entities.ExtensionEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
            }
            HashMap map2 = new HashMap(4);
            map2.put("id", new TableInfo.a("id", "INTEGER", true, 1, null, 1));
            map2.put("repository", new TableInfo.a("repository", "TEXT", false, 0, null, 1));
            map2.put("description", new TableInfo.a("description", "TEXT", false, 0, null, 1));
            map2.put("author", new TableInfo.a("author", "TEXT", false, 0, null, 1));
            TableInfo tableInfo2 = new TableInfo("tb_repository", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfoA2 = TableInfo.a(sm0, "tb_repository");
            if (!tableInfo2.equals(tableInfoA2)) {
                return new AbstractC4693pL0.a(false, "tb_repository(com.vbook.app.extensions.databases.entities.RepositoryEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("id", new TableInfo.a("id", "TEXT", true, 1, null, 1));
            map3.put("data", new TableInfo.a("data", "TEXT", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("tb_storage", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfoA3 = TableInfo.a(sm0, "tb_storage");
            if (tableInfo3.equals(tableInfoA3)) {
                return new AbstractC4693pL0.a(true, null);
            }
            return new AbstractC4693pL0.a(false, "tb_storage(com.vbook.app.extensions.databases.entities.LocalStorageEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoA3);
        }

        @Override // defpackage.AbstractC4693pL0
        public void f(@NonNull SM0 sm0) {
        }

        @Override // defpackage.AbstractC4693pL0
        public void h(@NonNull SM0 sm0) {
        }
    }
}