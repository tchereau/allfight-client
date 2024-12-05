import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class aht extends ahk {
   private af9 bG;
   y6 bE;
   private af9 bF;
   int bD = 0;
   float bH;

   public aht(af9 var1, float var2) {
      this.bG = var1;
      this.bE = var1.ap;
      this.bH = var2;
      this.a(3);
   }

   public boolean do() {
      if (!this.bG.fs()) {
         return false;
      } else {
         this.bF = this.e();
         return this.bF != null;
      }
   }

   public boolean try() {
      return this.bF.aA() && this.bF.fs() && this.bD < 60;
   }

   public void new() {
      this.bF = null;
      this.bD = 0;
   }

   public void int() {
      this.bG.b9().a(this.bF, 10.0F, (float)this.bG.bJ());
      this.bG.bl().a((aig)this.bF, this.bH);
      ++this.bD;
      if (this.bD >= 60 && this.bG.for((aiw)this.bF) < 9.0D) {
         this.f();
      }

   }

   private af9 e() {
      float var1 = 8.0F;
      List var2 = this.bE.a(this.bG.getClass(), this.bG.aZ.do((double)var1, (double)var1, (double)var1));
      double var3 = Double.MAX_VALUE;
      af9 var5 = null;
      Iterator var6 = var2.iterator();

      while(var6.hasNext()) {
         af9 var7 = (af9)var6.next();
         if (this.bG.if(var7) && this.bG.for((aiw)var7) < var3) {
            var5 = var7;
            var3 = this.bG.for((aiw)var7);
         }
      }

      return var5;
   }

   private void f() {
      aiy var1 = this.bG.a(this.bF);
      if (var1 != null) {
         this.bG.at(6000);
         this.bF.at(6000);
         this.bG.ft();
         this.bF.ft();
         var1.at(-24000);
         var1.if(this.bG.al, this.bG.ak, this.bG.aj, 0.0F, 0.0F);
         this.bE.new(var1);
         Random var2 = this.bG.bq();

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = var2.nextGaussian() * 0.02D;
            double var6 = var2.nextGaussian() * 0.02D;
            double var8 = var2.nextGaussian() * 0.02D;
            this.bE.a("heart", this.bG.al + (double)(var2.nextFloat() * this.bG.aP * 2.0F) - (double)this.bG.aP, this.bG.ak + 0.5D + (double)(var2.nextFloat() * this.bG.aO), this.bG.aj + (double)(var2.nextFloat() * this.bG.aP * 2.0F) - (double)this.bG.aP, var4, var6, var8);
         }

         this.bE.new(new aik(this.bE, this.bG.al, this.bG.ak, this.bG.aj, var2.nextInt(7) + 1));
      }
   }
}
