import java.util.Iterator;
import java.util.Random;

public class ru extends r8 {
   private final Random ex = new Random();
   public final int ey;

   protected ru(int var1, int var2) {
      super(var1, ts.w);
      this.ey = var2;
      this.a(acn.c);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 22;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      if (var1.new(var2, var3, var4 - 1) == this.void) {
         this.a(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
      } else if (var1.new(var2, var3, var4 + 1) == this.void) {
         this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
      } else if (var1.new(var2 - 1, var3, var4) == this.void) {
         this.a(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      } else if (var1.new(var2 + 1, var3, var4) == this.void) {
         this.a(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
      } else {
         this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      this.M(var1, var2, var3, var4);
      int var5 = var1.new(var2, var3, var4 - 1);
      int var6 = var1.new(var2, var3, var4 + 1);
      int var7 = var1.new(var2 - 1, var3, var4);
      int var8 = var1.new(var2 + 1, var3, var4);
      if (var5 == this.void) {
         this.M(var1, var2, var3, var4 - 1);
      }

      if (var6 == this.void) {
         this.M(var1, var2, var3, var4 + 1);
      }

      if (var7 == this.void) {
         this.M(var1, var2 - 1, var3, var4);
      }

      if (var8 == this.void) {
         this.M(var1, var2 + 1, var3, var4);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = var1.new(var2, var3, var4 - 1);
      int var8 = var1.new(var2, var3, var4 + 1);
      int var9 = var1.new(var2 - 1, var3, var4);
      int var10 = var1.new(var2 + 1, var3, var4);
      byte var11 = 0;
      int var12 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3;
      if (var12 == 0) {
         var11 = 2;
      }

      if (var12 == 1) {
         var11 = 5;
      }

      if (var12 == 2) {
         var11 = 3;
      }

      if (var12 == 3) {
         var11 = 4;
      }

      if (var7 != this.void && var8 != this.void && var9 != this.void && var10 != this.void) {
         var1.do(var2, var3, var4, var11, 3);
      } else {
         if ((var7 == this.void || var8 == this.void) && (var11 == 4 || var11 == 5)) {
            if (var7 == this.void) {
               var1.do(var2, var3, var4 - 1, var11, 3);
            } else {
               var1.do(var2, var3, var4 + 1, var11, 3);
            }

            var1.do(var2, var3, var4, var11, 3);
         }

         if ((var9 == this.void || var10 == this.void) && (var11 == 2 || var11 == 3)) {
            if (var9 == this.void) {
               var1.do(var2 - 1, var3, var4, var11, 3);
            } else {
               var1.do(var2 + 1, var3, var4, var11, 3);
            }

            var1.do(var2, var3, var4, var11, 3);
         }
      }

      if (var6.g()) {
         ((om)var1.if(var2, var3, var4)).do(var6.void());
      }

   }

   public void M(y6 var1, int var2, int var3, int var4) {
      if (!var1.goto) {
         int var5 = var1.new(var2, var3, var4 - 1);
         int var6 = var1.new(var2, var3, var4 + 1);
         int var7 = var1.new(var2 - 1, var3, var4);
         int var8 = var1.new(var2 + 1, var3, var4);
         boolean var9 = true;
         int var10;
         int var11;
         boolean var12;
         byte var13;
         int var14;
         if (var5 != this.void && var6 != this.void) {
            if (var7 != this.void && var8 != this.void) {
               var13 = 3;
               if (pa.v[var5] && !pa.v[var6]) {
                  var13 = 3;
               }

               if (pa.v[var6] && !pa.v[var5]) {
                  var13 = 2;
               }

               if (pa.v[var7] && !pa.v[var8]) {
                  var13 = 5;
               }

               if (pa.v[var8] && !pa.v[var7]) {
                  var13 = 4;
               }
            } else {
               var10 = var1.new(var7 == this.void ? var2 - 1 : var2 + 1, var3, var4 - 1);
               var11 = var1.new(var7 == this.void ? var2 - 1 : var2 + 1, var3, var4 + 1);
               var13 = 3;
               var12 = true;
               if (var7 == this.void) {
                  var14 = var1.for(var2 - 1, var3, var4);
               } else {
                  var14 = var1.for(var2 + 1, var3, var4);
               }

               if (var14 == 2) {
                  var13 = 2;
               }

               if ((pa.v[var5] || pa.v[var10]) && !pa.v[var6] && !pa.v[var11]) {
                  var13 = 3;
               }

               if ((pa.v[var6] || pa.v[var11]) && !pa.v[var5] && !pa.v[var10]) {
                  var13 = 2;
               }
            }
         } else {
            var10 = var1.new(var2 - 1, var3, var5 == this.void ? var4 - 1 : var4 + 1);
            var11 = var1.new(var2 + 1, var3, var5 == this.void ? var4 - 1 : var4 + 1);
            var13 = 5;
            var12 = true;
            if (var5 == this.void) {
               var14 = var1.for(var2, var3, var4 - 1);
            } else {
               var14 = var1.for(var2, var3, var4 + 1);
            }

            if (var14 == 4) {
               var13 = 4;
            }

            if ((pa.v[var7] || pa.v[var10]) && !pa.v[var8] && !pa.v[var11]) {
               var13 = 5;
            }

            if ((pa.v[var8] || pa.v[var11]) && !pa.v[var7] && !pa.v[var10]) {
               var13 = 4;
            }
         }

         var1.do(var2, var3, var4, var13, 3);
      }
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.new(var2 - 1, var3, var4) == this.void) {
         ++var5;
      }

      if (var1.new(var2 + 1, var3, var4) == this.void) {
         ++var5;
      }

      if (var1.new(var2, var3, var4 - 1) == this.void) {
         ++var5;
      }

      if (var1.new(var2, var3, var4 + 1) == this.void) {
         ++var5;
      }

      if (var5 > 1) {
         return false;
      } else if (this.N(var1, var2 - 1, var3, var4)) {
         return false;
      } else if (this.N(var1, var2 + 1, var3, var4)) {
         return false;
      } else if (this.N(var1, var2, var3, var4 - 1)) {
         return false;
      } else {
         return !this.N(var1, var2, var3, var4 + 1);
      }
   }

   private boolean N(y6 var1, int var2, int var3, int var4) {
      if (var1.new(var2, var3, var4) != this.void) {
         return false;
      } else if (var1.new(var2 - 1, var3, var4) == this.void) {
         return true;
      } else if (var1.new(var2 + 1, var3, var4) == this.void) {
         return true;
      } else if (var1.new(var2, var3, var4 - 1) == this.void) {
         return true;
      } else {
         return var1.new(var2, var3, var4 + 1) == this.void;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      super.new(var1, var2, var3, var4, var5);
      om var6 = (om)var1.if(var2, var3, var4);
      if (var6 != null) {
         var6.d();
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      om var7 = (om)var1.if(var2, var3, var4);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.r(); ++var8) {
            abp var9 = var7.do(var8);
            if (var9 != null) {
               float var10 = this.ex.nextFloat() * 0.8F + 0.1F;
               float var11 = this.ex.nextFloat() * 0.8F + 0.1F;

               afk var14;
               for(float var12 = this.ex.nextFloat() * 0.8F + 0.1F; var9.if > 0; var1.new(var14)) {
                  int var13 = this.ex.nextInt(21) + 10;
                  if (var13 > var9.if) {
                     var13 = var9.if;
                  }

                  var9.if -= var13;
                  var14 = new afk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new abp(var9.new, var13, var9.new()));
                  float var15 = 0.05F;
                  var14.ai = (double)((float)this.ex.nextGaussian() * var15);
                  var14.ah = (double)((float)this.ex.nextGaussian() * var15 + 0.2F);
                  var14.ag = (double)((float)this.ex.nextGaussian() * var15);
                  if (var9.a()) {
                     var14.ba().do((aqv)var9.b().do());
                  }
               }
            }
         }

         var1.new(var2, var3, var4, var5);
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         ajg var10 = this.K(var1, var2, var3, var4);
         if (var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public ajg K(y6 var1, int var2, int var3, int var4) {
      Object var5 = (om)var1.if(var2, var3, var4);
      if (var5 == null) {
         return null;
      } else if (var1.try(var2, var3 + 1, var4)) {
         return null;
      } else if (L(var1, var2, var3, var4)) {
         return null;
      } else if (var1.new(var2 - 1, var3, var4) == this.void && (var1.try(var2 - 1, var3 + 1, var4) || L(var1, var2 - 1, var3, var4))) {
         return null;
      } else if (var1.new(var2 + 1, var3, var4) == this.void && (var1.try(var2 + 1, var3 + 1, var4) || L(var1, var2 + 1, var3, var4))) {
         return null;
      } else if (var1.new(var2, var3, var4 - 1) != this.void || !var1.try(var2, var3 + 1, var4 - 1) && !L(var1, var2, var3, var4 - 1)) {
         if (var1.new(var2, var3, var4 + 1) != this.void || !var1.try(var2, var3 + 1, var4 + 1) && !L(var1, var2, var3, var4 + 1)) {
            if (var1.new(var2 - 1, var3, var4) == this.void) {
               var5 = new ajh("container.chestDouble", (om)var1.if(var2 - 1, var3, var4), (ajg)var5);
            }

            if (var1.new(var2 + 1, var3, var4) == this.void) {
               var5 = new ajh("container.chestDouble", (ajg)var5, (om)var1.if(var2 + 1, var3, var4));
            }

            if (var1.new(var2, var3, var4 - 1) == this.void) {
               var5 = new ajh("container.chestDouble", (om)var1.if(var2, var3, var4 - 1), (ajg)var5);
            }

            if (var1.new(var2, var3, var4 + 1) == this.void) {
               var5 = new ajh("container.chestDouble", (ajg)var5, (om)var1.if(var2, var3, var4 + 1));
            }

            return (ajg)var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public n4 if(y6 var1) {
      om var2 = new om();
      return var2;
   }

   public boolean int() {
      return this.ey == 1;
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      if (!this.int()) {
         return 0;
      } else {
         int var6 = ((om)var1.if(var2, var3, var4)).t;
         return ajs.a(var6, 0, 15);
      }
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 1 ? this.do(var1, var2, var3, var4, var5) : 0;
   }

   private static boolean L(y6 var0, int var1, int var2, int var3) {
      Iterator var4 = var0.a(af4.class, nw.if().a((double)var1, (double)(var2 + 1), (double)var3, (double)(var1 + 1), (double)(var2 + 2), (double)(var3 + 1))).iterator();

      af4 var6;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         af4 var5 = (af4)var4.next();
         var6 = (af4)var5;
      } while(!var6.fB());

      return true;
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      return ad1.a(this.K(var1, var2, var3, var4));
   }

   public void a(ajc var1) {
      this.an = var1.a("wood");
   }
}
