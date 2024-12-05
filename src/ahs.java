public class ahs extends ahk {
   private final aig by;
   private final float bx;
   private float bC = 0.0F;
   private boolean bB = false;
   private int bA = 0;
   private int bz = 0;

   public ahs(aig var1, float var2) {
      this.by = var1;
      this.bx = var2;
      this.a(7);
   }

   public void a() {
      this.bC = 0.0F;
   }

   public void new() {
      this.bB = false;
      this.bC = 0.0F;
   }

   public boolean do() {
      return this.by.aA() && this.by.as != null && this.by.as instanceof aek && (this.bB || this.by.cj());
   }

   public void int() {
      aek var1 = (aek)this.by.as;
      ah5 var2 = (ah5)this.by;
      float var3 = ajs.int(var1.a5 - this.by.a5) * 0.5F;
      if (var3 > 5.0F) {
         var3 = 5.0F;
      }

      if (var3 < -5.0F) {
         var3 = -5.0F;
      }

      this.by.a5 = ajs.int(this.by.a5 + var3);
      if (this.bC < this.bx) {
         this.bC += (this.bx - this.bC) * 0.01F;
      }

      if (this.bC > this.bx) {
         this.bC = this.bx;
      }

      int var4 = ajs.a(this.by.al);
      int var5 = ajs.a(this.by.ak);
      int var6 = ajs.a(this.by.aj);
      float var7 = this.bC;
      if (this.bB) {
         if (this.bA++ > this.bz) {
            this.bB = false;
         }

         var7 += var7 * 1.15F * ajs.try((float)this.bA / (float)this.bz * 3.1415927F);
      }

      float var8 = 0.91F;
      if (this.by.aY) {
         var8 = 0.54600006F;
         int var9 = this.by.ap.new(ajs.new((float)var4), ajs.new((float)var5) - 1, ajs.new((float)var6));
         if (var9 > 0) {
            var8 = pa.x[var9].aq * 0.91F;
         }
      }

      float var23 = 0.16277136F / (var8 * var8 * var8);
      float var10 = ajs.try(var2.a5 * 3.1415927F / 180.0F);
      float var11 = ajs.for(var2.a5 * 3.1415927F / 180.0F);
      float var12 = var2.bY() * var23;
      float var13 = Math.max(var7, 1.0F);
      var13 = var12 / var13;
      float var14 = var7 * var13;
      float var15 = -(var14 * var10);
      float var16 = var14 * var11;
      if (ajs.do(var15) > ajs.do(var16)) {
         if (var15 < 0.0F) {
            var15 -= this.by.aP / 2.0F;
         }

         if (var15 > 0.0F) {
            var15 += this.by.aP / 2.0F;
         }

         var16 = 0.0F;
      } else {
         var15 = 0.0F;
         if (var16 < 0.0F) {
            var16 -= this.by.aP / 2.0F;
         }

         if (var16 > 0.0F) {
            var16 += this.by.aP / 2.0F;
         }
      }

      int var17 = ajs.a(this.by.al + (double)var15);
      int var18 = ajs.a(this.by.aj + (double)var16);
      s6 var19 = new s6(ajs.new(this.by.aP + 1.0F), ajs.new(this.by.aO + var1.aO + 1.0F), ajs.new(this.by.aP + 1.0F));
      if (var4 != var17 || var6 != var18) {
         int var20 = this.by.ap.new(var4, var5, var6);
         int var21 = this.by.ap.new(var4, var5 - 1, var6);
         boolean var22 = this.if(var20) || pa.x[var20] == null && this.if(var21);
         if (!var22 && s4.a(this.by, var17, var5, var18, var19, false, false, true) == 0 && s4.a(this.by, var4, var5 + 1, var6, var19, false, false, true) == 1 && s4.a(this.by, var17, var5 + 1, var18, var19, false, false, true) == 1) {
            var2.bo().if();
         }
      }

      if (!var1.fY.new && this.bC >= this.bx * 0.5F && this.by.bq().nextFloat() < 0.006F && !this.bB) {
         abp var24 = var1.bW();
         if (var24 != null && var24.new == abr.bt.A) {
            var24.a(1, (aig)var1);
            if (var24.if == 0) {
               abp var25 = new abp(abr.ce);
               var25.do(var24.int);
               var1.fR.V[var1.fR.aa] = var25;
            }
         }
      }

      this.by.int(0.0F, var7);
   }

   private boolean if(int var1) {
      return pa.x[var1] != null && (pa.x[var1].new() == 10 || pa.x[var1] instanceof q0);
   }

   public boolean c() {
      return this.bB;
   }

   public void d() {
      this.bB = true;
      this.bA = 0;
      this.bz = this.by.bq().nextInt(841) + 140;
   }

   public boolean b() {
      return !this.c() && this.bC > this.bx * 0.3F;
   }
}
