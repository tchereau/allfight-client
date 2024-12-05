import java.util.Random;

public class rr extends rj {
   public static final String[] eE = new String[]{"cocoa_0", "cocoa_1", "cocoa_2"};
   private ajd[] eD;

   public rr(int var1) {
      super(var1, ts.p);
      this.a(true);
   }

   public ajd if(int var1, int var2) {
      return this.eD[2];
   }

   public ajd D(int var1) {
      if (var1 < 0 || var1 >= this.eD.length) {
         var1 = this.eD.length - 1;
      }

      return this.eD[var1];
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!this.try(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      } else if (var1.o.nextInt(5) == 0) {
         int var6 = var1.for(var2, var3, var4);
         int var7 = E(var6);
         if (var7 < 2) {
            ++var7;
            var1.do(var2, var3, var4, var7 << 2 | r(var6), 2);
         }
      }

   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      int var5 = r(var1.for(var2, var3, var4));
      var2 += apk.case[var5];
      var4 += apk.byte[var5];
      int var6 = var1.new(var2, var3, var4);
      return var6 == pa.aM.void && o0.goto(var1.for(var2, var3, var4)) == 3;
   }

   public int new() {
      return 28;
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.int(var1, var2, var3, var4);
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.new(var1, var2, var3, var4);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = r(var5);
      int var7 = E(var5);
      int var8 = 4 + var7 * 2;
      int var9 = 5 + var7 * 2;
      float var10 = (float)var8 / 2.0F;
      switch(var6) {
      case 0:
         this.a((8.0F - var10) / 16.0F, (12.0F - (float)var9) / 16.0F, (15.0F - (float)var8) / 16.0F, (8.0F + var10) / 16.0F, 0.75F, 0.9375F);
         break;
      case 1:
         this.a(0.0625F, (12.0F - (float)var9) / 16.0F, (8.0F - var10) / 16.0F, (1.0F + (float)var8) / 16.0F, 0.75F, (8.0F + var10) / 16.0F);
         break;
      case 2:
         this.a((8.0F - var10) / 16.0F, (12.0F - (float)var9) / 16.0F, 0.0625F, (8.0F + var10) / 16.0F, 0.75F, (1.0F + (float)var8) / 16.0F);
         break;
      case 3:
         this.a((15.0F - (float)var8) / 16.0F, (12.0F - (float)var9) / 16.0F, (8.0F - var10) / 16.0F, 0.9375F, 0.75F, (8.0F + var10) / 16.0F);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ((ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3) + 0) % 4;
      var1.do(var2, var3, var4, var7, 2);
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      if (var5 == 1 || var5 == 0) {
         var5 = 2;
      }

      return apk.for[apk.int[var5]];
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!this.try(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public static int E(int var0) {
      return (var0 & 12) >> 2;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      int var8 = E(var5);
      byte var9 = 1;
      if (var8 >= 2) {
         var9 = 3;
      }

      for(int var10 = 0; var10 < var9; ++var10) {
         this.a(var1, var2, var3, var4, new abp(abr.b9, 1, 3));
      }

   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.b9.A;
   }

   public int a(y6 var1, int var2, int var3, int var4) {
      return 3;
   }

   public void a(ajc var1) {
      this.eD = new ajd[eE.length];

      for(int var2 = 0; var2 < this.eD.length; ++var2) {
         this.eD[var2] = var1.a(eE[var2]);
      }

   }
}
