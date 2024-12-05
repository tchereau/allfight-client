import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class abc extends abr {
   private static final Map c5 = new HashMap();
   public final String c6;

   protected abc(int var1, String var2) {
      super(var1);
      this.c6 = var2;
      this.y = 1;
      this.a(acn.long);
      c5.put(var2, this);
   }

   public ajd a(int var1) {
      return this.s;
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var3.new(var4, var5, var6) == pa.a2.void && var3.for(var4, var5, var6) == 0) {
         if (var3.goto) {
            return true;
         } else {
            ((pz)pa.a2).if(var3, var4, var5, var6, var1);
            var3.a((aek)null, 1005, var4, var5, var6, this.A);
            --var1.if;
            return true;
         }
      } else if (var3.new(var4, var5, var6) == mod_rajouts.V.void && var3.for(var4, var5, var6) == 0) {
         if (var3.goto) {
            return true;
         } else {
            ((y8)mod_rajouts.V).do(var3, var4, var5, var6, var1);
            var3.a((aek)null, 1006, var4, var5, var6, this.A);
            --var1.if;
            return true;
         }
      } else {
         return false;
      }
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      var3.add(this.o());
   }

   public String o() {
      return "AllFight - " + this.c6;
   }

   public abd try(abp var1) {
      return abd.byte;
   }

   public static abc do(String var0) {
      return (abc)c5.get(var0);
   }

   public void a(ajc var1) {
      this.s = var1.a("record_" + this.c6);
   }
}
