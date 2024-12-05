import java.util.List;
import java.util.Random;

abstract class uq extends uk {
   protected uq(int var1) {
      super(var1);
   }

   protected void a(y6 var1, Random var2, wc var3, up var4, int var5, int var6, int var7) {
      // $FF: Couldn't be decompiled
   }

   protected up a(Random var1) {
      int var2 = var1.nextInt(5);
      switch(var2) {
      case 0:
      case 1:
      default:
         return up.if;
      case 2:
         return up.a;
      case 3:
         return up.int;
      case 4:
         return up.for;
      }
   }

   protected uk do(ut var1, List var2, Random var3, int var4, int var5) {
      switch(this.if) {
      case 0:
         return u9.a(var1, var2, var3, this.do.if + var4, this.do.a + var5, this.do.do + 1, this.if, this.a());
      case 1:
         return u9.a(var1, var2, var3, this.do.if - 1, this.do.a + var5, this.do.new + var4, this.if, this.a());
      case 2:
         return u9.a(var1, var2, var3, this.do.if + var4, this.do.a + var5, this.do.new - 1, this.if, this.a());
      case 3:
         return u9.a(var1, var2, var3, this.do.int + 1, this.do.a + var5, this.do.new + var4, this.if, this.a());
      default:
         return null;
      }
   }

   protected uk a(ut var1, List var2, Random var3, int var4, int var5) {
      switch(this.if) {
      case 0:
         return u9.a((ut)var1, var2, var3, this.do.if - 1, this.do.a + var4, this.do.new + var5, 1, this.a());
      case 1:
         return u9.a((ut)var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.new - 1, 2, this.a());
      case 2:
         return u9.a((ut)var1, var2, var3, this.do.if - 1, this.do.a + var4, this.do.new + var5, 1, this.a());
      case 3:
         return u9.a((ut)var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.new - 1, 2, this.a());
      default:
         return null;
      }
   }

   protected uk if(ut var1, List var2, Random var3, int var4, int var5) {
      switch(this.if) {
      case 0:
         return u9.a((ut)var1, var2, var3, this.do.int + 1, this.do.a + var4, this.do.new + var5, 3, this.a());
      case 1:
         return u9.a((ut)var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.do + 1, 0, this.a());
      case 2:
         return u9.a((ut)var1, var2, var3, this.do.int + 1, this.do.a + var4, this.do.new + var5, 3, this.a());
      case 3:
         return u9.a((ut)var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.do + 1, 0, this.a());
      default:
         return null;
      }
   }

   protected static boolean a(wc var0) {
      return var0 != null && var0.a > 10;
   }
}
