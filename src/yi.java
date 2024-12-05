import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class yi {
   private th for;
   private th do;
   private yl if;
   private List a;

   protected yi() {
      this.if = new yl(this);
      this.a = new ArrayList();
      this.a.add(yn.B);
      this.a.add(yn.E);
      this.a.add(yn.A);
      this.a.add(yn.m);
      this.a.add(yn.n);
      this.a.add(yn.k);
      this.a.add(yn.j);
   }

   public yi(long var1, yx var3) {
      this();
      th[] var4 = th.a(var1, var3);
      this.for = var4[0];
      this.do = var4[1];
   }

   public yi(y6 var1) {
      this(var1.b(), var1.l().new());
   }

   public List if() {
      return this.a;
   }

   public yn a(int var1, int var2) {
      return this.if.a(var1, var2);
   }

   public float[] if(float[] var1, int var2, int var3, int var4, int var5) {
      tj.if();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.do.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)yn.G[var6[var7]].else() / 65536.0F;
         if (var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public float a(float var1, int var2) {
      return var1;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      tj.if();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.do.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)yn.G[var6[var7]].a() / 65536.0F;
         if (var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public yn[] if(yn[] var1, int var2, int var3, int var4, int var5) {
      tj.if();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new yn[var4 * var5];
      }

      int[] var6 = this.for.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         var1[var7] = yn.G[var6[var7]];
      }

      return var1;
   }

   public yn[] a(yn[] var1, int var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, var5, true);
   }

   public yn[] a(yn[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      tj.if();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new yn[var4 * var5];
      }

      if (var6 && var4 == 16 && var5 == 16 && (var2 & 15) == 0 && (var3 & 15) == 0) {
         yn[] var9 = this.if.if(var2, var3);
         System.arraycopy(var9, 0, var1, 0, var4 * var5);
         return var1;
      } else {
         int[] var7 = this.do.a(var2, var3, var4, var5);

         for(int var8 = 0; var8 < var4 * var5; ++var8) {
            var1[var8] = yn.G[var7[var8]];
         }

         return var1;
      }
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      tj.if();
      int var5 = var1 - var3 >> 2;
      int var6 = var2 - var3 >> 2;
      int var7 = var1 + var3 >> 2;
      int var8 = var2 + var3 >> 2;
      int var9 = var7 - var5 + 1;
      int var10 = var8 - var6 + 1;
      int[] var11 = this.for.a(var5, var6, var9, var10);

      for(int var12 = 0; var12 < var9 * var10; ++var12) {
         yn var13 = yn.G[var11[var12]];
         if (!var4.contains(var13)) {
            return false;
         }
      }

      return true;
   }

   public yp a(int var1, int var2, int var3, List var4, Random var5) {
      tj.if();
      int var6 = var1 - var3 >> 2;
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.for.a(var6, var7, var10, var11);
      yp var13 = null;
      int var14 = 0;

      for(int var15 = 0; var15 < var10 * var11; ++var15) {
         int var16 = var6 + var15 % var10 << 2;
         int var17 = var7 + var15 / var10 << 2;
         yn var18 = yn.G[var12[var15]];
         if (var4.contains(var18) && (var13 == null || var5.nextInt(var14 + 1) == 0)) {
            var13 = new yp(var16, 0, var17);
            ++var14;
         }
      }

      return var13;
   }

   public void a() {
      this.if.a();
   }
}
