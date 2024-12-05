import java.util.Random;

public class aji extends ajj {
   private abp try = null;
   private int case;
   private int byte;

   public aji(int var1, int var2, int var3, int var4, int var5) {
      super(var5);
      this.try = new abp(var1, 1, var2);
      this.case = var3;
      this.byte = var4;
   }

   public aji(abp var1, int var2, int var3, int var4) {
      super(var4);
      this.try = var1;
      this.case = var2;
      this.byte = var3;
   }

   public static void a(Random var0, aji[] var1, ajg var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         aji var5 = (aji)ajk.a(var0, (ajj[])var1);
         int var6 = var5.case + var0.nextInt(var5.byte - var5.case + 1);
         if (var5.try.h() >= var6) {
            abp var9 = var5.try.n();
            var9.if = var6;
            var2.if(var0.nextInt(var2.r()), var9);
         } else {
            for(int var7 = 0; var7 < var6; ++var7) {
               abp var8 = var5.try.n();
               var8.if = 1;
               var2.if(var0.nextInt(var2.r()), var8);
            }
         }
      }

   }

   public static void a(Random var0, aji[] var1, oi var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         aji var5 = (aji)ajk.a(var0, (ajj[])var1);
         int var6 = var5.case + var0.nextInt(var5.byte - var5.case + 1);
         if (var5.try.h() >= var6) {
            abp var9 = var5.try.n();
            var9.if = var6;
            var2.if(var0.nextInt(var2.r()), var9);
         } else {
            for(int var7 = 0; var7 < var6; ++var7) {
               abp var8 = var5.try.n();
               var8.if = 1;
               var2.if(var0.nextInt(var2.r()), var8);
            }
         }
      }

   }

   public static aji[] a(aji[] var0, aji... var1) {
      aji[] var2 = new aji[var0.length + var1.length];
      int var3 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         var2[var3++] = var0[var4];
      }

      aji[] var8 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         aji var7 = var8[var6];
         var2[var3++] = var7;
      }

      return var2;
   }
}
