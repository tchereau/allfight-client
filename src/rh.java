import java.util.Random;

public class rh extends r8 {
   public static final aq1 er = new aq9(new ara());
   protected Random eq = new Random();
   protected ajd eu;
   protected ajd et;
   protected ajd es;

   protected rh(int var1) {
      super(var1, ts.v);
      this.a((acn)acn.b);
   }

   public int a(y6 var1) {
      return 4;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      this.I(var1, var2, var3, var4);
   }

   private void I(y6 var1, int var2, int var3, int var4) {
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
      int var3 = var2 & 7;
      if (var1 == var3) {
         return var3 != 1 && var3 != 0 ? this.et : this.es;
      } else if (var3 != 1 && var3 != 0) {
         return var1 != 1 && var1 != 0 ? this.an : this.eu;
      } else {
         return this.eu;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("furnace_side");
      this.eu = var1.a("furnace_top");
      this.et = var1.a("dispenser_front");
      this.es = var1.a("dispenser_front_vertical");
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         oi var10 = (oi)var1.if(var2, var3, var4);
         if (var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   protected void H(y6 var1, int var2, int var3, int var4) {
      arb var5 = new arb(var1, var2, var3, var4);
      oi var6 = (oi)var5.try();
      if (var6 != null) {
         int var7 = var6.v();
         if (var7 < 0) {
            var1.for(1001, var2, var3, var4, 0);
         } else {
            abp var8 = var6.do(var7);
            aq8 var9 = this.do(var8);
            if (var9 != aq8.a) {
               abp var10 = var9.a(var5, var8);
               var6.if(var7, var10.if == 0 ? null : var10);
            }
         }

      }
   }

   protected aq8 do(abp var1) {
      return (aq8)er.a(var1.d());
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = var1.f(var2, var3, var4) || var1.f(var2, var3 + 1, var4);
      int var7 = var1.for(var2, var3, var4);
      boolean var8 = (var7 & 8) != 0;
      if (var6 && !var8) {
         var1.if(var2, var3, var4, this.void, this.a(var1));
         var1.do(var2, var3, var4, var7 | 8, 4);
      } else if (!var6 && var8) {
         var1.do(var2, var3, var4, var7 & -9, 4);
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         this.H(var1, var2, var3, var4);
      }

   }

   public n4 if(y6 var1) {
      return new oi();
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = n0.a(var1, var2, var3, var4, var5);
      var1.do(var2, var3, var4, var7, 2);
      if (var6.g()) {
         ((oi)var1.if(var2, var3, var4)).if(var6.void());
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      oi var7 = (oi)var1.if(var2, var3, var4);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.r(); ++var8) {
            abp var9 = var7.do(var8);
            if (var9 != null) {
               float var10 = this.eq.nextFloat() * 0.8F + 0.1F;
               float var11 = this.eq.nextFloat() * 0.8F + 0.1F;
               float var12 = this.eq.nextFloat() * 0.8F + 0.1F;

               while(var9.if > 0) {
                  int var13 = this.eq.nextInt(21) + 10;
                  if (var13 > var9.if) {
                     var13 = var9.if;
                  }

                  var9.if -= var13;
                  afk var14 = new afk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new abp(var9.new, var13, var9.new()));
                  if (var9.a()) {
                     var14.ba().do((aqv)var9.b().do());
                  }

                  float var15 = 0.05F;
                  var14.ai = (double)((float)this.eq.nextGaussian() * var15);
                  var14.ah = (double)((float)this.eq.nextGaussian() * var15 + 0.2F);
                  var14.ag = (double)((float)this.eq.nextGaussian() * var15);
                  var1.new(var14);
               }
            }
         }

         var1.new(var2, var3, var4, var5);
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public static aq3 a(arc var0) {
      aq6 var1 = B(var0.byte());
      double var2 = var0.a() + 0.7D * (double)var1.a();
      double var4 = var0.do() + 0.7D * (double)var1.for();
      double var6 = var0.if() + 0.7D * (double)var1.if();
      return new aq2(var2, var4, var6);
   }

   public static aq6 B(int var0) {
      return aq6.a(var0 & 7);
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      return ad1.a((ajg)var1.if(var2, var3, var4));
   }
}
