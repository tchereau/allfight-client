import java.util.List;
import java.util.Random;

public class rv extends pa {
   private ajd eL;
   private ajd eK;
   private ajd eM;

   public rv(int var1) {
      super(var1, ts.u);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.eK;
      } else {
         return var1 == 0 ? this.eM : this.an;
      }
   }

   public void a(ajc var1) {
      this.eL = var1.a("cauldron_inner");
      this.eK = var1.a("cauldron_top");
      this.eM = var1.a("cauldron_bottom");
      this.an = var1.a("cauldron_side");
   }

   public static ajd new(String var0) {
      if (var0 == "cauldron_inner") {
         return pa.bM.eL;
      } else {
         return var0 == "cauldron_bottom" ? pa.bM.eM : null;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = 0.125F;
      this.a(0.0F, 0.0F, 0.0F, var8, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(1.0F - var8, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 1.0F - var8, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.try();
   }

   public void try() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean do() {
      return false;
   }

   public int new() {
      return 24;
   }

   public boolean if() {
      return false;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         abp var10 = var5.fR.L();
         if (var10 == null) {
            return true;
         } else {
            int var11 = var1.for(var2, var3, var4);
            if (var10.new == abr.bg.A) {
               if (var11 < 3) {
                  if (!var5.fY.new) {
                     var5.fR.if(var5.fR.aa, new abp(abr.bi));
                  }

                  var1.do(var2, var3, var4, 3, 2);
               }

               return true;
            } else {
               if (var10.new == abr.at.A) {
                  if (var11 > 0) {
                     abp var12 = new abp(abr.av, 1, 0);
                     if (!var5.fR.new(var12)) {
                        var1.new(new afk(var1, (double)var2 + 0.5D, (double)var3 + 1.5D, (double)var4 + 0.5D, var12));
                     } else if (var5 instanceof ak2) {
                        ((ak2)var5).a(var5.fQ);
                     }

                     --var10.if;
                     if (var10.if <= 0) {
                        var5.fR.if(var5.fR.aa, (abp)null);
                     }

                     var1.do(var2, var3, var4, var11 - 1, 2);
                  }
               } else if (var11 > 0 && var10.d() instanceof ac4 && ((ac4)var10.d()).y() == ac1.long) {
                  ac4 var13 = (ac4)var10.d();
                  var13.b(var10);
                  var1.do(var2, var3, var4, var11 - 1, 2);
                  return true;
               }

               return true;
            }
         }
      }
   }

   public void byte(y6 var1, int var2, int var3, int var4) {
      if (var1.o.nextInt(20) == 1) {
         int var5 = var1.for(var2, var3, var4);
         if (var5 < 3) {
            var1.do(var2, var3, var4, var5 + 1, 2);
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return abr.b4.A;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.b4.A;
   }
}
