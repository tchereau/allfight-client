import java.util.List;
import java.util.Random;

public class t7 extends t1 {
   private int ab = -1;
   private final boolean aa;
   private final int ac;

   public t7(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
      this.aa = var3.nextBoolean();
      this.ac = var3.nextInt(3);
   }

   public static t7 for(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
      return do(var8) && uk.a(var1, var8) == null ? new t7(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.ab < 0) {
         this.ab = this.if(var1, var3);
         if (this.ab < 0) {
            return true;
         }

         this.do.a(0, this.ab - this.do.for + 6 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 3, 0, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 3, pa.g.void, pa.g.void, false);
      if (this.aa) {
         this.a(var1, var3, 1, 4, 1, 2, 4, 3, pa.aM.void, pa.aM.void, false);
      } else {
         this.a(var1, var3, 1, 5, 1, 2, 5, 3, pa.aM.void, pa.aM.void, false);
      }

      this.a(var1, pa.aM.void, 0, 1, 4, 0, var3);
      this.a(var1, pa.aM.void, 0, 2, 4, 0, var3);
      this.a(var1, pa.aM.void, 0, 1, 4, 4, var3);
      this.a(var1, pa.aM.void, 0, 2, 4, 4, var3);
      this.a(var1, pa.aM.void, 0, 0, 4, 1, var3);
      this.a(var1, pa.aM.void, 0, 0, 4, 2, var3);
      this.a(var1, pa.aM.void, 0, 0, 4, 3, var3);
      this.a(var1, pa.aM.void, 0, 3, 4, 1, var3);
      this.a(var1, pa.aM.void, 0, 3, 4, 2, var3);
      this.a(var1, pa.aM.void, 0, 3, 4, 3, var3);
      this.a(var1, var3, 0, 1, 0, 0, 3, 0, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 3, 1, 0, 3, 3, 0, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 0, 1, 4, 0, 3, 4, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 3, 1, 4, 3, 3, 4, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 3, 1, 1, 3, 3, 3, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 1, 4, 2, 3, 4, pa.be.void, pa.be.void, false);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 3, 2, 2, var3);
      if (this.ac > 0) {
         this.a(var1, pa.aZ.void, 0, this.ac, 1, 3, var3);
         this.a(var1, pa.cg.void, 0, this.ac, 2, 3, var3);
      }

      this.a(var1, 0, 0, 1, 1, 0, var3);
      this.a(var1, 0, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.do(pa.co.void, 1));
      if (this.if(var1, 1, 0, -1, var3) == 0 && this.if(var1, 1, -1, -1, var3) != 0) {
         this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 1, 0, -1, var3);
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 4; ++var5) {
            this.a(var1, var5, 6, var4, var3);
            this.if(var1, pa.bf.void, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
