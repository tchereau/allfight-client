public class abg extends aca {
   private static pa[] dI;

   protected abg(int var1, abq var2) {
      super(var1, 2, var2, dI);
   }

   public boolean a(pa var1) {
      if (var1 == pa.bs) {
         return this.dD.try() == 3;
      } else if (var1 != pa.cv && var1 != pa.cw) {
         if (var1 != pa.bp && var1 != pa.bh) {
            if (var1 != pa.bJ && var1 != pa.aV) {
               if (var1 != pa.bH && var1 != pa.aS) {
                  if (var1 != pa.ax && var1 != pa.aA) {
                     if (var1 != pa.cf && var1 != pa.ce) {
                        if (var1.at == ts.v) {
                           return true;
                        } else if (var1.at == ts.u) {
                           return true;
                        } else {
                           return var1.at == ts.t;
                        }
                     } else {
                        return this.dD.try() >= 2;
                     }
                  } else {
                     return this.dD.try() >= 1;
                  }
               } else {
                  return this.dD.try() >= 1;
               }
            } else {
               return this.dD.try() >= 2;
            }
         } else {
            return this.dD.try() >= 2;
         }
      } else {
         return this.dD.try() >= 2;
      }
   }

   public float a(abp var1, pa var2) {
      return var2 == null || var2.at != ts.u && var2.at != ts.t && var2.at != ts.v ? super.a(var1, var2) : this.dE;
   }

   static {
      dI = new pa[]{pa.bf, pa.bF, pa.bD, pa.k, pa.ar, pa.bv, pa.aS, pa.bH, pa.aP, pa.bJ, pa.aV, pa.cw, pa.cv, pa.b9, pa.aT, pa.aA, pa.ax, pa.cf, pa.ce, pa.cm, pa.ah, pa.aj, pa.c};
   }
}
