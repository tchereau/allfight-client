public class ad3 extends aeg {
   public ad3(y6 var1) {
      super(var1);
      this.if(0.3125F, 0.3125F);
   }

   public ad3(y6 var1, aig var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.if(0.3125F, 0.3125F);
   }

   protected float a6() {
      return this.a7() ? 0.73F : super.a6();
   }

   public ad3(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.if(0.3125F, 0.3125F);
   }

   public boolean aP() {
      return false;
   }

   public float a(zg var1, y6 var2, int var3, int var4, int var5, pa var6) {
      float var7 = super.a(var1, var2, var3, var4, var5, var6);
      if (this.a7() && var6 != pa.bc && var6 != pa.bK && var6 != pa.bI) {
         var7 = Math.min(0.8F, var7);
      }

      return var7;
   }

   protected void if(nt var1) {
      if (!this.ap.goto) {
         if (var1.do != null) {
            if (this.dr != null) {
               if (var1.do.a((ai4)ai4.a(this.dr), 8) && !var1.do.aA()) {
                  this.dr.q(5);
               }
            } else {
               var1.do.a((ai4)ai4.long, 5);
            }

            if (var1.do instanceof aig) {
               byte var2 = 0;
               if (this.ap.p > 1) {
                  if (this.ap.p == 2) {
                     var2 = 10;
                  } else if (this.ap.p == 3) {
                     var2 = 40;
                  }
               }

               if (var2 > 0) {
                  ((aig)var1.do).for(new aiz(ai0.f.try, 20 * var2, 1));
               }
            }
         }

         this.ap.a(this, this.al, this.ak, this.aj, 1.0F, false, this.ap.i().a("mobGriefing"));
         this.az();
      }

   }

   public boolean aw() {
      return false;
   }

   public boolean a(ai4 var1, int var2) {
      return false;
   }

   protected void X() {
      this.bg.a(10, (byte)0);
   }

   public boolean a7() {
      return this.bg.for(10) == 1;
   }

   public void goto(boolean var1) {
      this.bg.if(10, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }
}
