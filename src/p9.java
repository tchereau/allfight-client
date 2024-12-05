import java.util.Random;

public class p9 extends pa {
   public p9(int var1) {
      super(var1, ts.v);
      this.a((acn)acn.d);
   }

   public int a(int var1, Random var2, int var3) {
      if (this.void == mod_rajouts.Q.void) {
         byte var4 = 7;
         Random var5 = new Random();
         int var6 = ajs.a((Random)var5, 1, var4);
         switch(var6) {
         case 1:
            return abr.R.A;
         case 2:
            return abr.P.A;
         case 3:
            return abr.bP.A;
         case 4:
            return mod_saphir.L.A;
         case 5:
            return mod_rubis.ao.A;
         case 6:
            return mod_onyx.r.A;
         default:
            return this.void;
         }
      } else {
         return this.void == mod_rajouts.af.void ? 0 : (this.void == pa.aP.void ? abr.R.A : (this.void == pa.cw.void ? abr.P.A : (this.void == pa.aA.void ? abr.b9.A : (this.void == pa.bp.void ? abr.bP.A : (this.void == mod_rubis.av.void ? mod_rubis.ao.A : (this.void == mod_saphir.C.void ? mod_saphir.L.A : (this.void == mod_onyx.q.void ? mod_onyx.r.A : (this.void == pa.h.void ? abr.ah.A : this.void))))))));
      }
   }

   public int a(Random var1) {
      return this.void == pa.aA.void ? 4 + var1.nextInt(5) : 1;
   }

   public int a(int var1, Random var2) {
      if (var1 > 0 && this.void != this.a(0, var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         if (var3 < 0) {
            var3 = 0;
         }

         return this.a(var2) * (var3 + 1);
      } else {
         return this.a(var2);
      }
   }

   public abd a(abp var1) {
      return this.void == mod_rajouts.af.void & this.void == mod_rajouts.Q.void ? abd.do : abd.if;
   }

   protected boolean d() {
      if (this.void == mod_rajouts.af.void) {
         return false;
      } else {
         return this.void != mod_rajouts.Q.void;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.void == mod_rajouts.af.void) {
         this.do(var1, var2, var3, var4, ajs.a((Random)var1.o, 20, 30));
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (this.a(var5, var1.o, var7) != this.void) {
         int var8 = 0;
         if (this.void == pa.aP.void) {
            var8 = ajs.a((Random)var1.o, 0, 2);
         } else if (this.void == pa.cw.void) {
            var8 = ajs.a((Random)var1.o, 3, 7);
         } else if (this.void == pa.bp.void) {
            var8 = ajs.a((Random)var1.o, 3, 7);
         } else if (this.void == pa.aA.void) {
            var8 = ajs.a((Random)var1.o, 2, 5);
         } else if (this.void == pa.h.void) {
            var8 = ajs.a((Random)var1.o, 2, 5);
         }

         this.do(var1, var2, var3, var4, var8);
      }

   }

   public int for(int var1) {
      return this.void == pa.aA.void ? 4 : 0;
   }
}
