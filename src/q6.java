import java.util.Random;

public class q6 extends pa {
   public q6(int var1) {
      super(var1, ts.j);
      this.try();
   }

   public void try() {
      float var1 = 0.375F;
      float var2 = var1 / 2.0F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var1, 0.5F + var2);
   }

   public boolean do() {
      return false;
   }

   public int new() {
      return 33;
   }

   public boolean if() {
      return false;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      abp var10 = var5.fR.L();
      if (var10 == null) {
         return false;
      } else if (var1.for(var2, var3, var4) != 0) {
         return false;
      } else {
         int var11 = if(var10);
         if (var11 > 0) {
            var1.do(var2, var3, var4, var11, 2);
            if (!var5.fY.new && --var10.if <= 0) {
               var5.fR.if(var5.fR.aa, (abp)null);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      abp var5 = n(var1.for(var2, var3, var4));
      return var5 == null ? abr.bL.A : var5.new;
   }

   public int a(y6 var1, int var2, int var3, int var4) {
      abp var5 = n(var1.for(var2, var3, var4));
      return var5 == null ? abr.bL.A : var5.new();
   }

   public boolean for() {
      return true;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return super.case(var1, var2, var3, var4) && var1.case(var2, var3 - 1, var4);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.case(var2, var3 - 1, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (var5 > 0) {
         abp var8 = n(var5);
         if (var8 != null) {
            this.a(var1, var2, var3, var4, var8);
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      return abr.bL.A;
   }

   public static abp n(int var0) {
      switch(var0) {
      case 1:
         return new abp(pa.bP);
      case 2:
         return new abp(pa.bR);
      case 3:
         return new abp(pa.bd, 1, 0);
      case 4:
         return new abp(pa.bd, 1, 1);
      case 5:
         return new abp(pa.bd, 1, 2);
      case 6:
         return new abp(pa.bd, 1, 3);
      case 7:
         return new abp(pa.bL);
      case 8:
         return new abp(pa.bN);
      case 9:
         return new abp(pa.b7);
      case 10:
         return new abp(pa.b1);
      case 11:
         return new abp(pa.b3, 1, 2);
      case 12:
         return new abp(mod_rajouts.P);
      case 13:
         return new abp(mod_rajouts.ac);
      default:
         return null;
      }
   }

   public static int if(abp var0) {
      int var1 = var0.d().A;
      if (var1 == pa.bP.void) {
         return 1;
      } else if (var1 == pa.bR.void) {
         return 2;
      } else if (var1 == mod_rajouts.P.void) {
         return 12;
      } else if (var1 == mod_rajouts.ac.void) {
         return 13;
      } else if (var1 == pa.b7.void) {
         return 9;
      } else if (var1 == pa.bN.void) {
         return 8;
      } else if (var1 == pa.bL.void) {
         return 7;
      } else if (var1 == pa.b1.void) {
         return 10;
      } else {
         if (var1 == pa.bd.void) {
            switch(var0.new()) {
            case 0:
               return 3;
            case 1:
               return 4;
            case 2:
               return 5;
            case 3:
               return 6;
            }
         }

         if (var1 == pa.b3.void) {
            switch(var0.new()) {
            case 2:
               return 11;
            }
         }

         return 0;
      }
   }
}
