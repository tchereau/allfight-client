import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gm extends gg {
   public long g;
   public String f;
   public String e;
   public String d;
   public String c;
   public List b;
   public String void;
   public boolean long;
   public int goto;
   public String else = "";
   public String char = "";
   public boolean case;
   public boolean byte = false;
   public long try;
   private String new = null;
   private String int = null;

   public String if() {
      if (this.new == null) {
         try {
            this.new = URLDecoder.decode(this.e, "UTF-8");
         } catch (UnsupportedEncodingException var2) {
            this.new = this.e;
         }
      }

      return this.new;
   }

   public String a() {
      if (this.int == null) {
         try {
            this.int = URLDecoder.decode(this.f, "UTF-8");
         } catch (UnsupportedEncodingException var2) {
            this.int = this.f;
         }
      }

      return this.int;
   }

   public void for(String var1) {
      this.f = var1;
      this.int = null;
   }

   public void int(String var1) {
      this.e = var1;
      this.new = null;
   }

   public void a(gm var1) {
      this.char = var1.char;
      this.else = var1.else;
      this.try = var1.try;
      this.case = var1.case;
      this.goto = var1.goto;
      this.byte = true;
   }

   public static gm a(l6 var0) {
      gm var1 = new gm();

      try {
         var1.g = Long.parseLong(var0.a("id"));
         var1.f = var0.for("name");
         var1.e = var0.for("motd");
         var1.d = var0.for("state");
         var1.c = var0.for("owner");
         if (var0.if("invited")) {
            var1.b = a(var0.int("invited"));
         } else {
            var1.b = new ArrayList();
         }

         var1.void = var0.for("ip");
         var1.long = var0.do("expired");
      } catch (IllegalArgumentException var3) {
      }

      return var1;
   }

   private static List a(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         l6 var3 = (l6)var2.next();
         var1.add(var3.for());
      }

      return var1;
   }

   public static gm new(String var0) {
      gm var1 = new gm();

      try {
         var1 = a((l6)(new mh()).a(var0));
      } catch (ld var3) {
      }

      return var1;
   }
}
