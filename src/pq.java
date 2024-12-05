import java.util.List;
import java.util.Random;

public class pq extends r0 {
   public static final String[] eY = new String[]{"oak", "spruce", "birch", "jungle"};
   private static final String[] eX = new String[]{"sapling", "sapling_spruce", "sapling_birch", "sapling_jungle"};
   private ajd[] eZ;

   protected pq(int var1) {
      super(var1);
      float var2 = 0.4F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var2 * 2.0F, 0.5F + var2);
      this.a(acn.c);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         super.if(var1, var2, var3, var4, var5);
         if (var1.h(var2, var3 + 1, var4) >= 9 && var5.nextInt(7) == 0) {
            this.for(var1, var2, var3, var4, var5);
         }

      }
   }

   public ajd if(int var1, int var2) {
      var2 &= 3;
      return this.eZ[var2];
   }

   public void for(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      if ((var6 & 8) == 0) {
         var1.do(var2, var3, var4, var6 | 8, 4);
      } else {
         this.int(var1, var2, var3, var4, var5);
      }

   }

   public void int(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4) & 3;
      Object var7 = null;
      int var8 = 0;
      int var9 = 0;
      boolean var10 = false;
      if (var6 == 1) {
         var7 = new wj(true);
      } else if (var6 == 2) {
         var7 = new w8(true);
      } else if (var6 == 3) {
         for(var8 = 0; var8 >= -1; --var8) {
            for(var9 = 0; var9 >= -1; --var9) {
               if (this.n(var1, var2 + var8, var3, var4 + var9, 3) && this.n(var1, var2 + var8 + 1, var3, var4 + var9, 3) && this.n(var1, var2 + var8, var3, var4 + var9 + 1, 3) && this.n(var1, var2 + var8 + 1, var3, var4 + var9 + 1, 3)) {
                  var7 = new ws(true, 10 + var5.nextInt(20), 3, 3);
                  var10 = true;
                  break;
               }
            }

            if (var7 != null) {
               break;
            }
         }

         if (var7 == null) {
            var9 = 0;
            var8 = 0;
            var7 = new wg(true, 4 + var5.nextInt(7), 3, 3, false);
         }
      } else {
         var7 = new wg(true);
         if (var5.nextInt(10) == 0) {
            var7 = new w9(true);
         }
      }

      if (var10) {
         var1.int(var2 + var8, var3, var4 + var9, 0, 0, 4);
         var1.int(var2 + var8 + 1, var3, var4 + var9, 0, 0, 4);
         var1.int(var2 + var8, var3, var4 + var9 + 1, 0, 0, 4);
         var1.int(var2 + var8 + 1, var3, var4 + var9 + 1, 0, 0, 4);
      } else {
         var1.int(var2, var3, var4, 0, 0, 4);
      }

      if (!((w2)var7).a(var1, var5, var2 + var8, var3, var4 + var9)) {
         if (var10) {
            var1.int(var2 + var8, var3, var4 + var9, this.void, var6, 4);
            var1.int(var2 + var8 + 1, var3, var4 + var9, this.void, var6, 4);
            var1.int(var2 + var8, var3, var4 + var9 + 1, this.void, var6, 4);
            var1.int(var2 + var8 + 1, var3, var4 + var9 + 1, this.void, var6, 4);
         } else {
            var1.int(var2, var3, var4, this.void, var6, 4);
         }
      }

   }

   public boolean n(y6 var1, int var2, int var3, int var4, int var5) {
      return var1.new(var2, var3, var4) == this.void && (var1.for(var2, var3, var4) & 3) == var5;
   }

   public int for(int var1) {
      return var1 & 3;
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
      var3.add(new abp(var1, 1, 3));
   }

   public void a(ajc var1) {
      this.eZ = new ajd[eX.length];

      for(int var2 = 0; var2 < this.eZ.length; ++var2) {
         this.eZ[var2] = var1.a(eX[var2]);
      }

   }
}
