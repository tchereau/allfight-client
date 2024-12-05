import java.util.List;
import java.util.Random;

public class r1 extends r8 {
   private Random eA = new Random();
   private ajd ez;

   public r1(int var1) {
      super(var1, ts.u);
   }

   public boolean do() {
      return false;
   }

   public int new() {
      return 25;
   }

   public n4 if(y6 var1) {
      return new on();
   }

   public boolean if() {
      return false;
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.try();
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void try() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         on var10 = (on)var1.if(var2, var3, var4);
         if (var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      if (var6.g()) {
         ((on)var1.if(var2, var3, var4)).B(var6.void());
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + 0.4F + var5.nextFloat() * 0.2F);
      double var8 = (double)((float)var3 + 0.7F + var5.nextFloat() * 0.3F);
      double var10 = (double)((float)var4 + 0.4F + var5.nextFloat() * 0.2F);
      var1.a("smoke", var6, var8, var10, 0.0D, 0.0D, 0.0D);
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      n4 var7 = var1.if(var2, var3, var4);
      if (var7 instanceof on) {
         on var8 = (on)var7;

         for(int var9 = 0; var9 < var8.r(); ++var9) {
            abp var10 = var8.do(var9);
            if (var10 != null) {
               float var11 = this.eA.nextFloat() * 0.8F + 0.1F;
               float var12 = this.eA.nextFloat() * 0.8F + 0.1F;
               float var13 = this.eA.nextFloat() * 0.8F + 0.1F;

               while(var10.if > 0) {
                  int var14 = this.eA.nextInt(21) + 10;
                  if (var14 > var10.if) {
                     var14 = var10.if;
                  }

                  var10.if -= var14;
                  afk var15 = new afk(var1, (double)((float)var2 + var11), (double)((float)var3 + var12), (double)((float)var4 + var13), new abp(var10.new, var14, var10.new()));
                  float var16 = 0.05F;
                  var15.ai = (double)((float)this.eA.nextGaussian() * var16);
                  var15.ah = (double)((float)this.eA.nextGaussian() * var16 + 0.2F);
                  var15.ag = (double)((float)this.eA.nextGaussian() * var16);
                  var1.new(var15);
               }
            }
         }
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public int a(int var1, Random var2, int var3) {
      return abr.ao.A;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.ao.A;
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      return ad1.a((ajg)var1.if(var2, var3, var4));
   }

   public void a(ajc var1) {
      super.a(var1);
      this.ez = var1.a("brewingStand_base");
   }

   public ajd y() {
      return this.ez;
   }
}
