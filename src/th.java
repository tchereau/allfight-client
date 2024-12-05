public abstract class th {
   private long a;
   protected th if;
   private long for;
   private long do;

   public static th[] a(long var0, yx var2) {
      ti var3 = new ti(1L);
      tk var9 = new tk(2000L, var3);
      to var10 = new to(1L, var9);
      s8 var11 = new s8(2001L, var10);
      var10 = new to(2L, var11);
      tm var12 = new tm(2L, var10);
      var11 = new s8(2002L, var12);
      var10 = new to(3L, var11);
      var11 = new s8(2003L, var10);
      var10 = new to(4L, var11);
      tn var15 = new tn(5L, var10);
      byte var4 = 4;
      if (var2 == yx.try) {
         var4 = 6;
      }

      th var5 = s8.a(1000L, var15, 0);
      tf var13 = new tf(100L, var5);
      var5 = s8.a(1000L, var13, var4 + 2);
      te var14 = new te(1L, var5);
      tb var16 = new tb(1000L, var14);
      th var6 = s8.a(1000L, var15, 0);
      tl var17 = new tl(200L, var6, var2);
      var6 = s8.a(1000L, var17, 2);
      Object var18 = new tg(1000L, var6);

      for(int var7 = 0; var7 < var4; ++var7) {
         var18 = new s8((long)(1000 + var7), (th)var18);
         if (var7 == 0) {
            var18 = new to(3L, (th)var18);
         }

         if (var7 == 1) {
            var18 = new tc(1000L, (th)var18);
         }

         if (var7 == 1) {
            var18 = new ta(1000L, (th)var18);
         }
      }

      tb var19 = new tb(1000L, (th)var18);
      td var20 = new td(100L, var19, var16);
      s9 var8 = new s9(10L, var20);
      var20.a(var0);
      var8.a(var0);
      return new th[]{var20, var8, var20};
   }

   public th(long var1) {
      this.do = var1;
      this.do *= this.do * 6364136223846793005L + 1442695040888963407L;
      this.do += var1;
      this.do *= this.do * 6364136223846793005L + 1442695040888963407L;
      this.do += var1;
      this.do *= this.do * 6364136223846793005L + 1442695040888963407L;
      this.do += var1;
   }

   public void a(long var1) {
      this.a = var1;
      if (this.if != null) {
         this.if.a(var1);
      }

      this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
      this.a += this.do;
      this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
      this.a += this.do;
      this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
      this.a += this.do;
   }

   public void a(long var1, long var3) {
      this.for = this.a;
      this.for *= this.for * 6364136223846793005L + 1442695040888963407L;
      this.for += var1;
      this.for *= this.for * 6364136223846793005L + 1442695040888963407L;
      this.for += var3;
      this.for *= this.for * 6364136223846793005L + 1442695040888963407L;
      this.for += var1;
      this.for *= this.for * 6364136223846793005L + 1442695040888963407L;
      this.for += var3;
   }

   protected int a(int var1) {
      int var2 = (int)((this.for >> 24) % (long)var1);
      if (var2 < 0) {
         var2 += var1;
      }

      this.for *= this.for * 6364136223846793005L + 1442695040888963407L;
      this.for += this.a;
      return var2;
   }

   public abstract int[] a(int var1, int var2, int var3, int var4);
}
