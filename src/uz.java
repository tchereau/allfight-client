import java.util.List;
import java.util.Random;

public class uz extends uq {
   private boolean d;

   public uz(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      if (var1 != null) {
         ((ut)var1).char = this;
      }

   }

   public static uz new(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
      return a(var7) && uk.a(var0, var7) == null ? new uz(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      this.a(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, u9.do());
      this.a(var1, var2, var3, up.int, 4, 1, 0);
      byte var4 = 6;
      this.a(var1, var3, 1, var4, 1, 1, var4, 14, false, var2, u9.do());
      this.a(var1, var3, 9, var4, 1, 9, var4, 14, false, var2, u9.do());
      this.a(var1, var3, 2, var4, 1, 8, var4, 2, false, var2, u9.do());
      this.a(var1, var3, 2, var4, 14, 8, var4, 14, false, var2, u9.do());
      this.a(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, u9.do());
      this.a(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, u9.do());
      this.a(var1, var3, 1, 1, 1, 1, 1, 3, pa.a7.void, pa.a7.void, false);
      this.a(var1, var3, 9, 1, 1, 9, 1, 3, pa.a7.void, pa.a7.void, false);
      this.a(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, u9.do());
      this.a(var1, var3, 4, 1, 9, 6, 1, 11, pa.a7.void, pa.a7.void, false);

      int var5;
      for(var5 = 3; var5 < 14; var5 += 2) {
         this.a(var1, var3, 0, 3, var5, 0, 4, var5, pa.ag.void, pa.ag.void, false);
         this.a(var1, var3, 10, 3, var5, 10, 4, var5, pa.ag.void, pa.ag.void, false);
      }

      for(var5 = 2; var5 < 9; var5 += 2) {
         this.a(var1, var3, var5, 3, 15, var5, 4, 15, pa.ag.void, pa.ag.void, false);
      }

      var5 = this.do(pa.b4.void, 3);
      this.a(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, u9.do());
      this.a(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, u9.do());
      this.a(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, u9.do());

      for(int var6 = 4; var6 <= 6; ++var6) {
         this.a(var1, pa.b4.void, var5, var6, 1, 4, var3);
         this.a(var1, pa.b4.void, var5, var6, 2, 5, var3);
         this.a(var1, pa.b4.void, var5, var6, 3, 6, var3);
      }

      byte var14 = 2;
      byte var7 = 0;
      byte var8 = 3;
      byte var9 = 1;
      switch(this.if) {
      case 0:
         var14 = 0;
         var7 = 2;
         break;
      case 1:
         var14 = 1;
         var7 = 3;
         var8 = 0;
         var9 = 2;
      case 2:
      default:
         break;
      case 3:
         var14 = 3;
         var7 = 1;
         var8 = 0;
         var9 = 2;
      }

      this.a(var1, pa.bI.void, var14 + (var2.nextFloat() > 0.9F ? 4 : 0), 4, 3, 8, var3);
      this.a(var1, pa.bI.void, var14 + (var2.nextFloat() > 0.9F ? 4 : 0), 5, 3, 8, var3);
      this.a(var1, pa.bI.void, var14 + (var2.nextFloat() > 0.9F ? 4 : 0), 6, 3, 8, var3);
      this.a(var1, pa.bI.void, var7 + (var2.nextFloat() > 0.9F ? 4 : 0), 4, 3, 12, var3);
      this.a(var1, pa.bI.void, var7 + (var2.nextFloat() > 0.9F ? 4 : 0), 5, 3, 12, var3);
      this.a(var1, pa.bI.void, var7 + (var2.nextFloat() > 0.9F ? 4 : 0), 6, 3, 12, var3);
      this.a(var1, pa.bI.void, var8 + (var2.nextFloat() > 0.9F ? 4 : 0), 3, 3, 9, var3);
      this.a(var1, pa.bI.void, var8 + (var2.nextFloat() > 0.9F ? 4 : 0), 3, 3, 10, var3);
      this.a(var1, pa.bI.void, var8 + (var2.nextFloat() > 0.9F ? 4 : 0), 3, 3, 11, var3);
      this.a(var1, pa.bI.void, var9 + (var2.nextFloat() > 0.9F ? 4 : 0), 7, 3, 9, var3);
      this.a(var1, pa.bI.void, var9 + (var2.nextFloat() > 0.9F ? 4 : 0), 7, 3, 10, var3);
      this.a(var1, pa.bI.void, var9 + (var2.nextFloat() > 0.9F ? 4 : 0), 7, 3, 11, var3);
      if (!this.d) {
         int var13 = this.a(3);
         int var10 = this.a(5, 6);
         int var11 = this.if(5, 6);
         if (var3.if(var10, var13, var11)) {
            this.d = true;
            var1.int(var10, var13, var11, pa.bm.void, 0, 2);
            oa var12 = (oa)var1.if(var10, var13, var11);
            if (var12 != null) {
               var12.o().a("Silverfish");
            }
         }
      }

      return true;
   }
}
