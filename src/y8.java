public class y8 extends r8 {
   private ajd eC;

   protected y8(int var1) {
      super(var1, ts.w);
   }

   public ajd if(int var1, int var2) {
      return var1 == 1 ? this.eC : this.an;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.for(var2, var3, var4) == 0) {
         return false;
      } else {
         this.O(var1, var2, var3, var4);
         return true;
      }
   }

   public void do(y6 var1, int var2, int var3, int var4, abp var5) {
      if (!var1.goto) {
         py var6 = (py)var1.if(var2, var3, var4);
         if (var6 != null) {
            var6.d(var5.n());
            var1.do(var2, var3, var4, 1, 2);
         }
      }

   }

   public void O(y6 var1, int var2, int var3, int var4) {
      if (!var1.goto) {
         py var5 = (py)var1.if(var2, var3, var4);
         if (var5 != null) {
            abp var6 = var5.gD();
            if (var6 != null) {
               var1.for(1006, var2, var3, var4, 0);
               var1.do((String)null, var2, var3, var4);
               var5.d((abp)null);
               var1.do(var2, var3, var4, 0, 2);
               float var7 = 0.7F;
               double var8 = (double)(var1.o.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
               double var10 = (double)(var1.o.nextFloat() * var7) + (double)(1.0F - var7) * 0.2D + 0.6D;
               double var12 = (double)(var1.o.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
               abp var14 = var6.n();
               afk var15 = new afk(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, var14);
               var15.dB = 10;
               var1.new(var15);
            }
         }
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      this.O(var1, var2, var3, var4);
      super.do(var1, var2, var3, var4, var5, var6);
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.goto) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   public n4 if(y6 var1) {
      return new py();
   }

   public void a(ajc var1) {
      this.an = var1.a("sides");
      this.eC = var1.a("jukeboxfull_top");
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      abp var6 = ((py)var1.if(var2, var3, var4)).gD();
      return var6 == null ? 0 : var6.new + 1 - abr.ab.A;
   }
}
