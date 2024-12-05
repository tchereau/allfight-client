import java.util.List;

public class aat extends abr {
   public aat(int var1) {
      super(var1);
      this.if(1);
   }

   public static boolean a(aqv var0) {
      if (!aau.if(var0)) {
         return false;
      } else if (!var0.try("title")) {
         return false;
      } else {
         String var1 = var0.new("title");
         if (var1 != null && var1.length() <= 16) {
            return var0.try("author");
         } else {
            return false;
         }
      }
   }

   public String if(abp var1) {
      if (var1.a()) {
         aqv var2 = var1.b();
         aqf var3 = (aqf)var2.byte("title");
         if (var3 != null) {
            return var3.toString();
         }
      }

      return super.if(var1);
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      if (var1.a()) {
         aqv var5 = var1.b();
         aqf var6 = (aqf)var5.byte("author");
         if (var6 != null) {
            var3.add(aqj.i + String.format(aqz.a("book.byAuthor", var6.do)));
         }
      }

   }

   public abp a(abp var1, y6 var2, aek var3) {
      var3.goto(var1);
      return var1;
   }

   public boolean c() {
      return true;
   }

   public boolean do(abp var1) {
      return true;
   }
}
