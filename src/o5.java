import java.util.Random;

public class o5 extends pa {
   private ajd cV;
   private ajd cU;

   public o5(int var1) {
      super(var1, ts.g);
      this.a((acn)acn.b);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 0) {
         return this.cU;
      } else {
         return var1 == 1 ? this.cV : this.an;
      }
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      if (var1.f(var2, var3, var4)) {
         this.a(var1, var2, var3, var4, 1);
         var1.o(var2, var3, var4);
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (var1.f(var2, var3, var4)) {
         this.a(var1, var2, var3, var4, 1);
         var1.o(var2, var3, var4);
      }

   }

   public int a(Random var1) {
      return 1;
   }

   public void a(y6 var1, int var2, int var3, int var4, zg var5) {
      if (!var1.goto) {
         afa var6 = new afa(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5.do());
         var6.dA = var1.o.nextInt(var6.dA / 4) + var6.dA / 8;
         var1.new(var6);
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, (aig)null);
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aig var6) {
      if (!var1.goto) {
         if ((var5 & 1) == 1) {
            afa var7 = new afa(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var6);
            var1.new(var7);
            var1.a((aiw)var7, "random.fuse", 1.0F, 1.0F);
         }

      }
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var5.cD() != null && var5.cD().new == abr.aa.A) {
         this.a(var1, var2, var3, var4, 1, var5);
         var1.o(var2, var3, var4);
         return true;
      } else {
         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (var5 instanceof aei && !var1.goto) {
         aei var6 = (aei)var5;
         if (var6.aP()) {
            this.a(var1, var2, var3, var4, 1, var6.cF instanceof aig ? (aig)var6.cF : null);
            var1.o(var2, var3, var4);
         }
      }

   }

   public boolean a(zg var1) {
      return false;
   }

   public void a(ajc var1) {
      this.an = var1.a("tnt_side");
      this.cV = var1.a("tnt_top");
      this.cU = var1.a("tnt_bottom");
   }
}
