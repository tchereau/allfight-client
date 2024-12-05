import java.util.Iterator;
import java.util.List;

public class ad4 extends ad9 {
   private abp cT;

   public ad4(y6 var1) {
      super(var1);
   }

   public ad4(y6 var1, aig var2, int var3) {
      this(var1, var2, new abp(abr.av, 1, var3));
   }

   public ad4(y6 var1, aig var2, abp var3) {
      super(var1, var2);
      this.cT = var3;
   }

   public ad4(y6 var1, double var2, double var4, double var6, int var8) {
      this(var1, var2, var4, var6, new abp(abr.av, 1, var8));
   }

   public ad4(y6 var1, double var2, double var4, double var6, abp var8) {
      super(var1, var2, var4, var6);
      this.cT = var8;
   }

   protected float a1() {
      return 0.05F;
   }

   protected float a2() {
      return 0.5F;
   }

   protected float a0() {
      return -20.0F;
   }

   public void m(int var1) {
      if (this.cT == null) {
         this.cT = new abp(abr.av, 1, 0);
      }

      this.cT.do(var1);
   }

   public int a4() {
      if (this.cT == null) {
         this.cT = new abp(abr.av, 1, 0);
      }

      return this.cT.new();
   }

   protected void a(nt var1) {
      if (!this.ap.goto) {
         List var2 = abr.av.goto(this.cT);
         if (var2 != null && !var2.isEmpty()) {
            nw var3 = this.aZ.do(4.0D, 2.0D, 4.0D);
            List var4 = this.ap.a(aig.class, var3);
            if (var4 != null && !var4.isEmpty()) {
               Iterator var5 = var4.iterator();

               label48:
               while(true) {
                  aig var6;
                  double var7;
                  do {
                     if (!var5.hasNext()) {
                        break label48;
                     }

                     var6 = (aig)var5.next();
                     var7 = this.for(var6);
                  } while(!(var7 < 16.0D));

                  double var9 = 1.0D - Math.sqrt(var7) / 4.0D;
                  if (var6 == var1.do) {
                     var9 = 1.0D;
                  }

                  Iterator var11 = var2.iterator();

                  while(var11.hasNext()) {
                     aiz var12 = (aiz)var11.next();
                     int var13 = var12.byte();
                     if (ai0.A[var13].case()) {
                        ai0.A[var13].a(this.a3(), var6, var12.int(), var9);
                     } else {
                        int var14 = (int)(var9 * (double)var12.do() + 0.5D);
                        if (var14 > 20) {
                           var6.for(new aiz(var13, var14, var12.int()));
                        }
                     }
                  }
               }
            }
         }

         this.ap.for(2002, (int)Math.round(this.al), (int)Math.round(this.ak), (int)Math.round(this.aj), this.a4());
         this.az();
      }

   }

   public void try(aqv var1) {
      super.try(var1);
      if (var1.try("Potion")) {
         this.cT = abp.for(var1.char("Potion"));
      } else {
         this.m(var1.goto("potionValue"));
      }

      if (this.cT == null) {
         this.az();
      }

   }

   public void for(aqv var1) {
      super.for(var1);
      if (this.cT != null) {
         var1.a("Potion", this.cT.if(new aqv()));
      }

   }
}
