import java.util.Random;

public class qe extends pa {
   private ajd dx;
   private ajd dw;

   protected qe(int var1) {
      super(var1, ts.y);
      this.a(true);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.dx;
      } else {
         return var1 == 0 ? pa.g.do(var1) : this.an;
      }
   }

   public ajd if(yy var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.dx;
      } else if (var5 == 0) {
         return pa.g.do(var5);
      } else {
         ts var6 = var1.byte(var2, var3 + 1, var4);
         return var6 != ts.d && var6 != ts.c ? this.an : this.dw;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("mycel_side");
      this.dx = var1.a("mycel_top");
      this.dw = var1.a("snow_side");
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
                  var1.int(var7, var8, var9, this.void);
               }
            }
         }

      }
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if (var5.nextInt(10) == 0) {
         var1.a("townaura", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + 1.1F), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return pa.g.a(0, var2, var3);
   }
}
