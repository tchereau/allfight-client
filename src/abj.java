import java.util.Iterator;
import java.util.List;

public class abj extends abr {
   private ajd de;

   public abj(int var1) {
      super(var1);
      this.a(true);
      this.a(acn.long);
   }

   public String if(abp var1) {
      String var2 = ("" + aqz.if(this.int() + ".name")).trim();
      String var3 = air.if(var1.new());
      if (var3 != null) {
         var2 = var2 + " " + aqz.if("entity." + var3 + ".name");
      }

      return var2;
   }

   public int a(abp var1, int var2) {
      aiq var3 = (aiq)air.if.get(var1.new());
      if (var3 != null) {
         return var2 == 0 ? var3.a : var3.do;
      } else {
         return 16777215;
      }
   }

   public boolean do() {
      return true;
   }

   public ajd a(int var1, int var2) {
      return var2 > 0 ? this.de : super.a(var1, var2);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var3.goto) {
         return true;
      } else {
         int var11 = var3.new(var4, var5, var6);
         var4 += api.a[var7];
         var5 += api.int[var7];
         var6 += api.for[var7];
         double var12 = 0.0D;
         if (var7 == 1 && pa.x[var11] != null && pa.x[var11].new() == 11) {
            var12 = 0.5D;
         }

         aiw var14 = a(var3, var1.new(), (double)var4 + 0.5D, (double)var5 + var12, (double)var6 + 0.5D);
         if (var14 != null) {
            if (var14 instanceof aig && var1.g()) {
               ((aig)var14).int(var1.void());
            }

            if (!var2.fY.new) {
               --var1.if;
            }
         }

         return true;
      }
   }

   public static aiw a(y6 var0, int var1, double var2, double var4, double var6) {
      if (!air.if.containsKey(var1)) {
         return null;
      } else {
         aiw var8 = null;

         for(int var9 = 0; var9 < 1; ++var9) {
            var8 = air.a(var1, var0);
            if (var8 != null && var8 instanceof aig) {
               aig var10 = (aig)var8;
               var8.if(var2, var4, var6, ajs.int(var0.o.nextFloat() * 360.0F), 0.0F);
               var10.fA = var10.a5;
               var10.eH = var10.a5;
               var10.bO();
               var0.new(var8);
               var10.bP();
            }
         }

         return var8;
      }
   }

   public void a(int var1, acn var2, List var3) {
      Iterator var4 = air.if.values().iterator();

      while(var4.hasNext()) {
         aiq var5 = (aiq)var4.next();
         var3.add(new abp(var1, 1, var5.if));
      }

   }

   public void a(ajc var1) {
      super.a(var1);
      this.de = var1.a("monsterPlacer_overlay");
   }
}
