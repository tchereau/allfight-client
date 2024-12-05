public class act extends abr {
   private int dK;

   public act(int var1, int var2) {
      super(var1);
      this.y = 1;
      this.dK = var2;
      this.a(acn.long);
   }

   public abp a(abp var1, y6 var2, aek var3) {
      float var4 = 1.0F;
      double var5 = var3.ao + (var3.al - var3.ao) * (double)var4;
      double var7 = var3.an + (var3.ak - var3.an) * (double)var4 + 1.62D - (double)var3.aQ;
      double var9 = var3.am + (var3.aj - var3.am) * (double)var4;
      boolean var11 = this.dK == 0;
      nt var12 = this.a(var2, var3, var11);
      if (var12 == null) {
         return var1;
      } else {
         if (var12.if == ns.if) {
            int var13 = var12.a;
            int var14 = var12.try;
            int var15 = var12.new;
            if (!var2.a(var3, var13, var14, var15)) {
               return var1;
            }

            if (this.dK == 0) {
               if (!var3.a(var13, var14, var15, var12.int, var1)) {
                  return var1;
               }

               if (var2.byte(var13, var14, var15) == ts.s && var2.for(var13, var14, var15) == 0) {
                  var2.o(var13, var14, var15);
                  if (var3.fY.new) {
                     return var1;
                  }

                  if (--var1.if <= 0) {
                     return new abp(abr.bg);
                  }

                  if (!var3.fR.new(new abp(abr.bg))) {
                     var3.else(new abp(abr.bg.A, 1, 0));
                  }

                  return var1;
               }

               if (var2.byte(var13, var14, var15) == ts.r && var2.for(var13, var14, var15) == 0) {
                  var2.o(var13, var14, var15);
                  if (var3.fY.new) {
                     return var1;
                  }

                  if (--var1.if <= 0) {
                     return new abp(abr.be);
                  }

                  if (!var3.fR.new(new abp(abr.be))) {
                     var3.else(new abp(abr.be.A, 1, 0));
                  }

                  return var1;
               }
            } else {
               if (this.dK < 0) {
                  return new abp(abr.bi);
               }

               if (var12.int == 0) {
                  --var14;
               }

               if (var12.int == 1) {
                  ++var14;
               }

               if (var12.int == 2) {
                  --var15;
               }

               if (var12.int == 3) {
                  ++var15;
               }

               if (var12.int == 4) {
                  --var13;
               }

               if (var12.int == 5) {
                  ++var13;
               }

               if (!var3.a(var13, var14, var15, var12.int, var1)) {
                  return var1;
               }

               if (this.a(var2, var5, var7, var9, var13, var14, var15) && !var3.fY.new) {
                  return new abp(abr.bi);
               }
            }
         } else if (this.dK == 0 && var12.do instanceof af7) {
            return new abp(abr.cr);
         }

         return var1;
      }
   }

   public boolean a(y6 var1, double var2, double var4, double var6, int var8, int var9, int var10) {
      if (this.dK <= 0) {
         return false;
      } else if (!var1.a(var8, var9, var10) && var1.byte(var8, var9, var10).for()) {
         return false;
      } else {
         if (var1.n.int && this.dK == pa.bb.void) {
            var1.a(var2 + 0.5D, var4 + 0.5D, var6 + 0.5D, "random.fizz", 0.5F, 2.6F + (var1.o.nextFloat() - var1.o.nextFloat()) * 0.8F);

            for(int var11 = 0; var11 < 8; ++var11) {
               var1.a("largesmoke", (double)var8 + Math.random(), (double)var9 + Math.random(), (double)var10 + Math.random(), 0.0D, 0.0D, 0.0D);
            }
         } else {
            var1.int(var8, var9, var10, this.dK, 0, 3);
         }

         return true;
      }
   }
}
