import java.util.List;
import java.util.Random;

public class ud extends t1 {
   private int al = -1;
   private int ak;
   private int ao;
   private int an;
   private int am;

   public ud(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
      this.ak = this.do(var3);
      this.ao = this.do(var3);
      this.an = this.do(var3);
      this.am = this.do(var3);
   }

   private int do(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return pa.G.void;
      case 1:
         return pa.E.void;
      default:
         return pa.ct.void;
      }
   }

   public static ud byte(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
      return do(var8) && uk.a(var1, var8) == null ? new ud(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.al < 0) {
         this.al = this.if(var1, var3);
         if (this.al < 0) {
            return true;
         }

         this.do.a(0, this.al - this.do.for + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 12, 4, 8, 0, 0, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 7, pa.cs.void, pa.cs.void, false);
      this.a(var1, var3, 4, 0, 1, 5, 0, 7, pa.cs.void, pa.cs.void, false);
      this.a(var1, var3, 7, 0, 1, 8, 0, 7, pa.cs.void, pa.cs.void, false);
      this.a(var1, var3, 10, 0, 1, 11, 0, 7, pa.cs.void, pa.cs.void, false);
      this.a(var1, var3, 0, 0, 0, 0, 0, 8, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 6, 0, 0, 6, 0, 8, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 12, 0, 0, 12, 0, 8, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 1, 0, 0, 11, 0, 0, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 1, 0, 8, 11, 0, 8, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 3, 0, 1, 3, 0, 7, pa.bb.void, pa.bb.void, false);
      this.a(var1, var3, 9, 0, 1, 9, 0, 7, pa.bb.void, pa.bb.void, false);

      int var4;
      for(var4 = 1; var4 <= 7; ++var4) {
         this.a(var1, this.ak, ajs.a((Random)var2, 2, 7), 1, 1, var4, var3);
         this.a(var1, this.ak, ajs.a((Random)var2, 2, 7), 2, 1, var4, var3);
         this.a(var1, this.ao, ajs.a((Random)var2, 2, 7), 4, 1, var4, var3);
         this.a(var1, this.ao, ajs.a((Random)var2, 2, 7), 5, 1, var4, var3);
         this.a(var1, this.an, ajs.a((Random)var2, 2, 7), 7, 1, var4, var3);
         this.a(var1, this.an, ajs.a((Random)var2, 2, 7), 8, 1, var4, var3);
         this.a(var1, this.am, ajs.a((Random)var2, 2, 7), 10, 1, var4, var3);
         this.a(var1, this.am, ajs.a((Random)var2, 2, 7), 11, 1, var4, var3);
      }

      for(var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 13; ++var5) {
            this.a(var1, var5, 4, var4, var3);
            this.if(var1, pa.g.void, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
