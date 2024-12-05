import java.util.Random;

public class rd extends r8 {
   private ajd ep;
   private ajd eo;

   protected rd(int var1) {
      super(var1, ts.v);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.new(0);
      this.a(acn.c);
   }

   public boolean if() {
      return false;
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);

      for(int var6 = var2 - 2; var6 <= var2 + 2; ++var6) {
         for(int var7 = var4 - 2; var7 <= var4 + 2; ++var7) {
            if (var6 > var2 - 2 && var6 < var2 + 2 && var7 == var4 - 1) {
               var7 = var4 + 2;
            }

            if (var5.nextInt(16) == 0) {
               for(int var8 = var3; var8 <= var3 + 1; ++var8) {
                  if (var1.new(var6, var8, var7) == pa.bx.void) {
                     if (!var1.a((var6 - var2) / 2 + var2, var8, (var7 - var4) / 2 + var4)) {
                        break;
                     }

                     var1.a("enchantmenttable", (double)var2 + 0.5D, (double)var3 + 2.0D, (double)var4 + 0.5D, (double)((float)(var6 - var2) + var5.nextFloat()) - 0.5D, (double)((float)(var8 - var3) - var5.nextFloat() - 1.0F), (double)((float)(var7 - var4) + var5.nextFloat()) - 0.5D);
                  }
               }
            }
         }
      }

   }

   public boolean do() {
      return false;
   }

   public ajd if(int var1, int var2) {
      if (var1 == 0) {
         return this.eo;
      } else {
         return var1 == 1 ? this.ep : this.an;
      }
   }

   public n4 if(y6 var1) {
      return new og();
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         og var10 = (og)var1.if(var2, var3, var4);
         var5.a(var2, var3, var4, var10.gB() ? var10.gA() : null);
         return true;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if (var6.g()) {
         ((og)var1.if(var2, var3, var4)).C(var6.void());
      }

   }

   public void a(ajc var1) {
      this.an = var1.a("enchantment_side");
      this.ep = var1.a("enchantment_top");
      this.eo = var1.a("enchantment_bottom");
   }
}
