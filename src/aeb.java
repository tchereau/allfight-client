public class aeb extends aeg {
   public aeb(y6 var1) {
      super(var1);
      this.if(0.3125F, 0.3125F);
   }

   public aeb(y6 var1, aig var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.if(0.3125F, 0.3125F);
   }

   public aeb(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.if(0.3125F, 0.3125F);
   }

   protected void if(nt var1) {
      if (!this.ap.goto) {
         if (var1.do != null) {
            if (!var1.do.al() && var1.do.a((ai4)ai4.a((aeg)this, this.dr), 5)) {
               var1.do.e(5);
            }
         } else {
            int var2 = var1.a;
            int var3 = var1.try;
            int var4 = var1.new;
            switch(var1.int) {
            case 0:
               --var3;
               break;
            case 1:
               ++var3;
               break;
            case 2:
               --var4;
               break;
            case 3:
               ++var4;
               break;
            case 4:
               --var2;
               break;
            case 5:
               ++var2;
            }

            if (this.ap.a(var2, var3, var4)) {
               this.ap.int(var2, var3, var4, pa.bo.void);
            }
         }

         this.az();
      }

   }

   public boolean aw() {
      return false;
   }

   public boolean a(ai4 var1, int var2) {
      return false;
   }
}
