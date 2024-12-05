import java.util.List;

public class aa3 extends abr {
   private static final String[] c0 = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};
   public static final String[] c1 = new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"};
   private ajd[] c2;

   public aa3(int var1) {
      super(var1);
      this.a(acn.c);
      this.for(0);
      this.a(true);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 == 0) {
         return false;
      } else if (!var3.byte(var4, var5, var6).for()) {
         return false;
      } else {
         if (var7 == 1) {
            ++var5;
         }

         if (var7 == 2) {
            --var6;
         }

         if (var7 == 3) {
            ++var6;
         }

         if (var7 == 4) {
            --var4;
         }

         if (var7 == 5) {
            ++var4;
         }

         if (!var2.a(var4, var5, var6, var7, var1)) {
            return false;
         } else if (!pa.A.case(var3, var4, var5, var6)) {
            return false;
         } else {
            var3.int(var4, var5, var6, pa.A.void, var7, 2);
            int var11 = 0;
            if (var7 == 1) {
               var11 = ajs.a((double)(var2.a5 * 16.0F / 360.0F) + 0.5D) & 15;
            }

            n4 var12 = var3.if(var4, var5, var6);
            if (var12 != null && var12 instanceof n6) {
               String var13 = "";
               if (var1.a() && var1.b().try("SkullOwner")) {
                  var13 = var1.b().new("SkullOwner");
               }

               ((n6)var12).if(var1.new(), var13);
               ((n6)var12).a(var11);
               ((po)pa.A).a(var3, var4, var5, var6, (n6)var12);
            }

            --var1.if;
            return true;
         }
      }
   }

   public void a(int var1, acn var2, List var3) {
      for(int var4 = 0; var4 < c0.length; ++var4) {
         var3.add(new abp(var1, 1, var4));
      }

   }

   public ajd a(int var1) {
      if (var1 < 0 || var1 >= c0.length) {
         var1 = 0;
      }

      return this.c2[var1];
   }

   public int do(int var1) {
      return var1;
   }

   public String int(abp var1) {
      int var2 = var1.new();
      if (var2 < 0 || var2 >= c0.length) {
         var2 = 0;
      }

      return super.int() + "." + c0[var2];
   }

   public String if(abp var1) {
      return var1.new() == 3 && var1.a() && var1.b().try("SkullOwner") ? aqz.a("item.skull.player.name", var1.b().new("SkullOwner")) : super.if(var1);
   }

   public void a(ajc var1) {
      this.c2 = new ajd[c1.length];

      for(int var2 = 0; var2 < c1.length; ++var2) {
         this.c2[var2] = var1.a(c1[var2]);
      }

   }
}
