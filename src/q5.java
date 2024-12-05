import java.util.Random;

public class q5 extends r8 {
   private final Random ek = new Random();
   private final boolean ej;
   private static boolean en = false;
   private ajd em;
   private ajd el;

   protected q5(int var1, boolean var2) {
      super(var1, ts.v);
      this.ej = var2;
   }

   public int a(int var1, Random var2, int var3) {
      return pa.cr.void;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      this.G(var1, var2, var3, var4);
   }

   private void G(y6 var1, int var2, int var3, int var4) {
      if (!var1.goto) {
         int var5 = var1.new(var2, var3, var4 - 1);
         int var6 = var1.new(var2, var3, var4 + 1);
         int var7 = var1.new(var2 - 1, var3, var4);
         int var8 = var1.new(var2 + 1, var3, var4);
         byte var9 = 3;
         if (pa.v[var5] && !pa.v[var6]) {
            var9 = 3;
         }

         if (pa.v[var6] && !pa.v[var5]) {
            var9 = 2;
         }

         if (pa.v[var7] && !pa.v[var8]) {
            var9 = 5;
         }

         if (pa.v[var8] && !pa.v[var7]) {
            var9 = 4;
         }

         var1.do(var2, var3, var4, var9, 2);
      }
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.em;
      } else if (var1 == 0) {
         return this.em;
      } else {
         return var1 != var2 ? this.an : this.el;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("furnace_side");
      this.el = var1.a(this.ej ? "furnace_front_lit" : "furnace_front");
      this.em = var1.a("furnace_top");
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.ej) {
         int var6 = var1.for(var2, var3, var4);
         float var7 = (float)var2 + 0.5F;
         float var8 = (float)var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = (float)var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if (var6 == 4) {
            var1.a("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if (var6 == 5) {
            var1.a("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if (var6 == 2) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
         } else if (var6 == 3) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         oe var10 = (oe)var1.if(var2, var3, var4);
         if (var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public static void a(boolean var0, y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      n4 var6 = var1.if(var2, var3, var4);
      en = true;
      if (var0) {
         var1.int(var2, var3, var4, pa.cq.void);
      } else {
         var1.int(var2, var3, var4, pa.cr.void);
      }

      en = false;
      var1.do(var2, var3, var4, var5, 2);
      if (var6 != null) {
         var6.byte();
         var1.if(var2, var3, var4, var6);
      }

   }

   public n4 if(y6 var1) {
      return new oe();
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3;
      if (var7 == 0) {
         var1.do(var2, var3, var4, 2, 2);
      }

      if (var7 == 1) {
         var1.do(var2, var3, var4, 5, 2);
      }

      if (var7 == 2) {
         var1.do(var2, var3, var4, 3, 2);
      }

      if (var7 == 3) {
         var1.do(var2, var3, var4, 4, 2);
      }

      if (var6.g()) {
         ((oe)var1.if(var2, var3, var4)).A(var6.void());
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!en) {
         oe var7 = (oe)var1.if(var2, var3, var4);
         if (var7 != null) {
            for(int var8 = 0; var8 < var7.r(); ++var8) {
               abp var9 = var7.do(var8);
               if (var9 != null) {
                  float var10 = this.ek.nextFloat() * 0.8F + 0.1F;
                  float var11 = this.ek.nextFloat() * 0.8F + 0.1F;
                  float var12 = this.ek.nextFloat() * 0.8F + 0.1F;

                  while(var9.if > 0) {
                     int var13 = this.ek.nextInt(21) + 10;
                     if (var13 > var9.if) {
                        var13 = var9.if;
                     }

                     var9.if -= var13;
                     afk var14 = new afk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new abp(var9.new, var13, var9.new()));
                     if (var9.a()) {
                        var14.ba().do((aqv)var9.b().do());
                     }

                     float var15 = 0.05F;
                     var14.ai = (double)((float)this.ek.nextGaussian() * var15);
                     var14.ah = (double)((float)this.ek.nextGaussian() * var15 + 0.2F);
                     var14.ag = (double)((float)this.ek.nextGaussian() * var15);
                     var1.new(var14);
                  }
               }
            }

            var1.new(var2, var3, var4, var5);
         }
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      return ad1.a((ajg)var1.if(var2, var3, var4));
   }
}
