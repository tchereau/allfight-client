import java.util.List;
import java.util.Random;

public class u1 extends uq {
   private static final aji[] e;
   protected final up f;
   private final boolean g;

   public u1(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.f = this.a(var2);
      this.do = var3;
      this.g = var3.do() > 6;
   }

   public static u1 try(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!a(var7) || uk.a(var0, var7) != null) {
         var7 = wc.a(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!a(var7) || uk.a(var0, var7) != null) {
            return null;
         }
      }

      return new u1(var6, var1, var7, var5);
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         byte var4 = 11;
         if (!this.g) {
            var4 = 6;
         }

         this.a(var1, var3, 0, 0, 0, 13, var4 - 1, 14, true, var2, u9.do());
         this.a(var1, var2, var3, this.f, 4, 1, 0);
         this.a(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, pa.b5.void, pa.b5.void, false);

         int var7;
         for(var7 = 1; var7 <= 13; ++var7) {
            if ((var7 - 1) % 4 == 0) {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, pa.be.void, pa.be.void, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, pa.be.void, pa.be.void, false);
               this.a(var1, pa.bq.void, 0, 2, 3, var7, var3);
               this.a(var1, pa.bq.void, 0, 11, 3, var7, var3);
               if (this.g) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, pa.be.void, pa.be.void, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, pa.be.void, pa.be.void, false);
               }
            } else {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, pa.bx.void, pa.bx.void, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, pa.bx.void, pa.bx.void, false);
               if (this.g) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, pa.bx.void, pa.bx.void, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, pa.bx.void, pa.bx.void, false);
               }
            }
         }

         for(var7 = 3; var7 < 12; var7 += 2) {
            this.a(var1, var3, 3, 1, var7, 4, 3, var7, pa.bx.void, pa.bx.void, false);
            this.a(var1, var3, 6, 1, var7, 7, 3, var7, pa.bx.void, pa.bx.void, false);
            this.a(var1, var3, 9, 1, var7, 10, 3, var7, pa.bx.void, pa.bx.void, false);
         }

         if (this.g) {
            this.a(var1, var3, 1, 5, 1, 3, 5, 13, pa.be.void, pa.be.void, false);
            this.a(var1, var3, 10, 5, 1, 12, 5, 13, pa.be.void, pa.be.void, false);
            this.a(var1, var3, 4, 5, 1, 9, 5, 2, pa.be.void, pa.be.void, false);
            this.a(var1, var3, 4, 5, 12, 9, 5, 13, pa.be.void, pa.be.void, false);
            this.a(var1, pa.be.void, 0, 9, 5, 11, var3);
            this.a(var1, pa.be.void, 0, 8, 5, 11, var3);
            this.a(var1, pa.be.void, 0, 9, 5, 10, var3);
            this.a(var1, var3, 3, 6, 2, 3, 6, 12, pa.aZ.void, pa.aZ.void, false);
            this.a(var1, var3, 10, 6, 2, 10, 6, 10, pa.aZ.void, pa.aZ.void, false);
            this.a(var1, var3, 4, 6, 2, 9, 6, 2, pa.aZ.void, pa.aZ.void, false);
            this.a(var1, var3, 4, 6, 12, 8, 6, 12, pa.aZ.void, pa.aZ.void, false);
            this.a(var1, pa.aZ.void, 0, 9, 6, 11, var3);
            this.a(var1, pa.aZ.void, 0, 8, 6, 11, var3);
            this.a(var1, pa.aZ.void, 0, 9, 6, 10, var3);
            var7 = this.do(pa.cn.void, 3);
            this.a(var1, pa.cn.void, var7, 10, 1, 13, var3);
            this.a(var1, pa.cn.void, var7, 10, 2, 13, var3);
            this.a(var1, pa.cn.void, var7, 10, 3, 13, var3);
            this.a(var1, pa.cn.void, var7, 10, 4, 13, var3);
            this.a(var1, pa.cn.void, var7, 10, 5, 13, var3);
            this.a(var1, pa.cn.void, var7, 10, 6, 13, var3);
            this.a(var1, pa.cn.void, var7, 10, 7, 13, var3);
            byte var8 = 7;
            byte var9 = 7;
            this.a(var1, pa.aZ.void, 0, var8 - 1, 9, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8, 9, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8 - 1, 8, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8, 8, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8 - 1, 7, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8, 7, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8 - 2, 7, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8 + 1, 7, var9, var3);
            this.a(var1, pa.aZ.void, 0, var8 - 1, 7, var9 - 1, var3);
            this.a(var1, pa.aZ.void, 0, var8 - 1, 7, var9 + 1, var3);
            this.a(var1, pa.aZ.void, 0, var8, 7, var9 - 1, var3);
            this.a(var1, pa.aZ.void, 0, var8, 7, var9 + 1, var3);
            this.a(var1, pa.bq.void, 0, var8 - 2, 8, var9, var3);
            this.a(var1, pa.bq.void, 0, var8 + 1, 8, var9, var3);
            this.a(var1, pa.bq.void, 0, var8 - 1, 8, var9 - 1, var3);
            this.a(var1, pa.bq.void, 0, var8 - 1, 8, var9 + 1, var3);
            this.a(var1, pa.bq.void, 0, var8, 8, var9 - 1, var3);
            this.a(var1, pa.bq.void, 0, var8, 8, var9 + 1, var3);
         }

         this.a(var1, var3, var2, 3, 3, 5, aji.a(e, abr.bj.a(var2, 1, 5, 2)), 1 + var2.nextInt(4));
         if (this.g) {
            this.a(var1, 0, 0, 12, 9, 1, var3);
            this.a(var1, var3, var2, 12, 8, 1, aji.a(e, abr.bj.a(var2, 1, 5, 2)), 1 + var2.nextInt(4));
         }

         return true;
      }
   }

   static {
      e = new aji[]{new aji(abr.cm.A, 0, 1, 3, 20), new aji(abr.cn.A, 0, 2, 7, 20), new aji(abr.bA.A, 0, 1, 1, 1), new aji(abr.cg.A, 0, 1, 1, 1)};
   }
}
