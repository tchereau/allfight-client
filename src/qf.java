public class qf extends r8 {
   public qf(int var1) {
      super(var1, ts.w);
      this.a(acn.b);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = var1.f(var2, var3, var4);
      n8 var7 = (n8)var1.if(var2, var3, var4);
      if (var7 != null && var7.k != var6) {
         if (var6) {
            var7.a(var1, var2, var3, var4);
         }

         var7.k = var6;
      }

   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         n8 var10 = (n8)var1.if(var2, var3, var4);
         if (var10 != null) {
            var10.n();
            var10.a(var1, var2, var3, var4);
         }

         return true;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
      if (!var1.goto) {
         n8 var6 = (n8)var1.if(var2, var3, var4);
         if (var6 != null) {
            var6.a(var1, var2, var3, var4);
         }

      }
   }

   public n4 if(y6 var1) {
      return new n8();
   }

   public boolean if(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)Math.pow(2.0D, (double)(var6 - 12) / 12.0D);
      String var8 = "harp";
      if (var5 == 1) {
         var8 = "bd";
      }

      if (var5 == 2) {
         var8 = "snare";
      }

      if (var5 == 3) {
         var8 = "hat";
      }

      if (var5 == 4) {
         var8 = "bassattack";
      }

      var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "note." + var8, 3.0F, var7);
      var1.a("note", (double)var2 + 0.5D, (double)var3 + 1.2D, (double)var4 + 0.5D, (double)var6 / 24.0D, 0.0D, 0.0D);
      return true;
   }
}
