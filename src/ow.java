import java.util.List;

public class ow extends pa {
   public static final String[] cH = new String[]{"normal", "mossy"};

   public ow(int var1, pa var2) {
      super(var1, var2.at);
      this.if(var2.a9);
      this.a(var2.a6 / 3.0F);
      this.a(var2.az);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      return var2 == 1 ? pa.bv.do(var1) : pa.bf.do(var1);
   }

   public int new() {
      return 32;
   }

   public boolean if() {
      return false;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean do() {
      return false;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      boolean var5 = this.try(var1, var2, var3, var4 - 1);
      boolean var6 = this.try(var1, var2, var3, var4 + 1);
      boolean var7 = this.try(var1, var2 - 1, var3, var4);
      boolean var8 = this.try(var1, var2 + 1, var3, var4);
      float var9 = 0.25F;
      float var10 = 0.75F;
      float var11 = 0.25F;
      float var12 = 0.75F;
      float var13 = 1.0F;
      if (var5) {
         var11 = 0.0F;
      }

      if (var6) {
         var12 = 1.0F;
      }

      if (var7) {
         var9 = 0.0F;
      }

      if (var8) {
         var10 = 1.0F;
      }

      if (var5 && var6 && !var7 && !var8) {
         var13 = 0.8125F;
         var9 = 0.3125F;
         var10 = 0.6875F;
      } else if (!var5 && !var6 && var7 && var8) {
         var13 = 0.8125F;
         var11 = 0.3125F;
         var12 = 0.6875F;
      }

      this.a(var9, 0.0F, var11, var10, var13, var12);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      this.aF = 1.5D;
      return super.int(var1, var2, var3, var4);
   }

   public boolean try(yy var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      if (var5 != this.void && var5 != pa.Y.void) {
         pa var6 = pa.x[var5];
         if (var6 != null && var6.at.goto() && var6.if()) {
            return var6.at != ts.long;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
   }

   public int for(int var1) {
      return var1;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 ? super.int(var1, var2, var3, var4, var5) : true;
   }

   public void a(ajc var1) {
   }
}
