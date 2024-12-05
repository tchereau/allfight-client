import java.util.List;
import java.util.Random;

public class qv extends r8 {
   private final Random eg = new Random();
   private ajd ef;
   private ajd ei;
   private ajd eh;

   public qv(int var1) {
      super(var1, ts.u);
      this.a(acn.b);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
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
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = api.if[var5];
      if (var10 == 1) {
         var10 = 0;
      }

      return var10;
   }

   public n4 if(y6 var1) {
      return new oc();
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if (var6.g()) {
         oc var7 = f(var1, var2, var3, var4);
         var7.z(var6.void());
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      this.F(var1, var2, var3, var4);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         oc var10 = f(var1, var2, var3, var4);
         if (var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      this.F(var1, var2, var3, var4);
   }

   private void F(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = A(var5);
      boolean var7 = !var1.f(var2, var3, var4);
      boolean var8 = z(var5);
      if (var7 != var8) {
         var1.do(var2, var3, var4, var6 | (var7 ? 0 : 8), 4);
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      oc var7 = (oc)var1.if(var2, var3, var4);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.r(); ++var8) {
            abp var9 = var7.do(var8);
            if (var9 != null) {
               float var10 = this.eg.nextFloat() * 0.8F + 0.1F;
               float var11 = this.eg.nextFloat() * 0.8F + 0.1F;
               float var12 = this.eg.nextFloat() * 0.8F + 0.1F;

               while(var9.if > 0) {
                  int var13 = this.eg.nextInt(21) + 10;
                  if (var13 > var9.if) {
                     var13 = var9.if;
                  }

                  var9.if -= var13;
                  afk var14 = new afk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new abp(var9.new, var13, var9.new()));
                  if (var9.a()) {
                     var14.ba().do((aqv)var9.b().do());
                  }

                  float var15 = 0.05F;
                  var14.ai = (double)((float)this.eg.nextGaussian() * var15);
                  var14.ah = (double)((float)this.eg.nextGaussian() * var15 + 0.2F);
                  var14.ag = (double)((float)this.eg.nextGaussian() * var15);
                  var1.new(var14);
               }
            }
         }

         var1.new(var2, var3, var4, var5);
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public int new() {
      return 38;
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public ajd if(int var1, int var2) {
      return var1 == 1 ? this.ei : this.ef;
   }

   public static int A(int var0) {
      return var0 & 7;
   }

   public static boolean z(int var0) {
      return (var0 & 8) != 8;
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      return ad1.a((ajg)f(var1, var2, var3, var4));
   }

   public void a(ajc var1) {
      this.ef = var1.a("hopper");
      this.ei = var1.a("hopper_top");
      this.eh = var1.a("hopper_inside");
   }

   public static ajd int(String var0) {
      if (var0 == "hopper") {
         return pa.f.ef;
      } else {
         return var0 == "hopper_inside" ? pa.f.eh : null;
      }
   }

   public String void() {
      return "hopper";
   }

   public static oc f(yy var0, int var1, int var2, int var3) {
      return (oc)var0.if(var1, var2, var3);
   }
}
