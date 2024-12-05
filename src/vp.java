import java.util.Iterator;
import java.util.List;
import java.util.Random;

abstract class vp extends uk {
   protected vp(int var1) {
      super(var1);
   }

   private int a(List var1) {
      boolean var2 = false;
      int var3 = 0;

      vo var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 += var5.a) {
         var5 = (vo)var4.next();
         if (var5.for > 0 && var5.int < var5.for) {
            var2 = true;
         }
      }

      return var2 ? var3 : -1;
   }

   private vp a(vl var1, List var2, List var3, Random var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = this.a(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while(var12 < 5 && var11) {
         ++var12;
         int var13 = var4.nextInt(var10);
         Iterator var14 = var2.iterator();

         while(var14.hasNext()) {
            vo var15 = (vo)var14.next();
            var13 -= var15.a;
            if (var13 < 0) {
               if (!var15.a(var9) || var15 == var1.I && !var15.do) {
                  break;
               }

               vp var16 = v2.a(var15, var3, var4, var5, var6, var7, var8, var9);
               if (var16 != null) {
                  ++var15.int;
                  var1.I = var15;
                  if (!var15.a()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      return v0.j(var3, var4, var5, var6, var7, var8, var9);
   }

   private uk a(vl var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.do().if) <= 112 && Math.abs(var6 - var1.do().new) <= 112) {
         List var10 = var1.H;
         if (var9) {
            var10 = var1.K;
         }

         vp var11 = this.a(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var11 != null) {
            var2.add(var11);
            var1.J.add(var11);
         }

         return var11;
      } else {
         return v0.j(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   protected uk a(vl var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.if) {
      case 0:
         return this.a(var1, var2, var3, this.do.if + var4, this.do.a + var5, this.do.do + 1, this.if, this.a(), var6);
      case 1:
         return this.a(var1, var2, var3, this.do.if - 1, this.do.a + var5, this.do.new + var4, this.if, this.a(), var6);
      case 2:
         return this.a(var1, var2, var3, this.do.if + var4, this.do.a + var5, this.do.new - 1, this.if, this.a(), var6);
      case 3:
         return this.a(var1, var2, var3, this.do.int + 1, this.do.a + var5, this.do.new + var4, this.if, this.a(), var6);
      default:
         return null;
      }
   }

   protected uk if(vl var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.if) {
      case 0:
         return this.a(var1, var2, var3, this.do.if - 1, this.do.a + var4, this.do.new + var5, 1, this.a(), var6);
      case 1:
         return this.a(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.new - 1, 2, this.a(), var6);
      case 2:
         return this.a(var1, var2, var3, this.do.if - 1, this.do.a + var4, this.do.new + var5, 1, this.a(), var6);
      case 3:
         return this.a(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.new - 1, 2, this.a(), var6);
      default:
         return null;
      }
   }

   protected uk do(vl var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.if) {
      case 0:
         return this.a(var1, var2, var3, this.do.int + 1, this.do.a + var4, this.do.new + var5, 3, this.a(), var6);
      case 1:
         return this.a(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.do + 1, 0, this.a(), var6);
      case 2:
         return this.a(var1, var2, var3, this.do.int + 1, this.do.a + var4, this.do.new + var5, 3, this.a(), var6);
      case 3:
         return this.a(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.do + 1, 0, this.a(), var6);
      default:
         return null;
      }
   }

   protected static boolean if(wc var0) {
      return var0 != null && var0.a > 10;
   }
}
