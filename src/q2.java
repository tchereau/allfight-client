import java.util.Random;

public class q2 extends pa {
   private ajd dU;
   private ajd dT;
   private ajd dV;

   protected q2(int var1) {
      super(var1, ts.y);
      this.a(true);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.dU;
      } else {
         return var1 == 0 ? pa.g.do(var1) : this.an;
      }
   }

   public ajd if(yy var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.dU;
      } else if (var5 == 0) {
         return pa.g.do(var5);
      } else {
         ts var6 = var1.byte(var2, var3 + 1, var4);
         return var6 != ts.d && var6 != ts.c ? this.an : this.dT;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("grass_side");
      this.dU = var1.a("grass_top");
      this.dT = var1.a("snow_side");
      this.dV = var1.a("grass_side_overlay");
   }

   public int c() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return y7.a(var1, var3);
   }

   public int a(int var1) {
      return this.c();
   }

   public int do(yy var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = -1; var8 <= 1; ++var8) {
         for(int var9 = -1; var9 <= 1; ++var9) {
            int var10 = var1.a(var2 + var9, var4 + var8).try();
            var5 += (var10 & 16711680) >> 16;
            var6 += (var10 & '\uff00') >> 8;
            var7 += var10 & 255;
         }
      }

      return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         if (var1.h(var2, var3 + 1, var4) < 4 && pa.t[var1.new(var2, var3 + 1, var4)] > 2) {
            var1.int(var2, var3, var4, pa.g.void);
         } else if (var1.h(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               int var10 = var1.new(var7, var8 + 1, var9);
               if (var1.new(var7, var8, var9) == pa.g.void && var1.h(var7, var8 + 1, var9) >= 4 && pa.t[var10] <= 2) {
                  var1.int(var7, var8, var9, pa.i.void);
               }
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return pa.g.a(0, var2, var3);
   }

   public static ajd v() {
      return pa.i.dV;
   }
}
