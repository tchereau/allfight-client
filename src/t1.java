import java.util.List;
import java.util.Random;

abstract class t1 extends uk {
   private int S;
   protected t4 T;

   protected t1(t4 var1, int var2) {
      super(var2);
      this.T = var1;
   }

   protected uk a(t4 var1, List var2, Random var3, int var4, int var5) {
      switch(this.if) {
      case 0:
         return uf.if(var1, var2, var3, this.do.if - 1, this.do.a + var4, this.do.new + var5, 1, this.a());
      case 1:
         return uf.if(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.new - 1, 2, this.a());
      case 2:
         return uf.if(var1, var2, var3, this.do.if - 1, this.do.a + var4, this.do.new + var5, 1, this.a());
      case 3:
         return uf.if(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.new - 1, 2, this.a());
      default:
         return null;
      }
   }

   protected uk if(t4 var1, List var2, Random var3, int var4, int var5) {
      switch(this.if) {
      case 0:
         return uf.if(var1, var2, var3, this.do.int + 1, this.do.a + var4, this.do.new + var5, 3, this.a());
      case 1:
         return uf.if(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.do + 1, 0, this.a());
      case 2:
         return uf.if(var1, var2, var3, this.do.int + 1, this.do.a + var4, this.do.new + var5, 3, this.a());
      case 3:
         return uf.if(var1, var2, var3, this.do.if + var5, this.do.a + var4, this.do.do + 1, 0, this.a());
      default:
         return null;
      }
   }

   protected int if(y6 var1, wc var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = this.do.new; var5 <= this.do.do; ++var5) {
         for(int var6 = this.do.if; var6 <= this.do.int; ++var6) {
            if (var2.if(var6, 64, var5)) {
               var3 += Math.max(var1.case(var6, var5), var1.n.if());
               ++var4;
            }
         }
      }

      if (var4 == 0) {
         return -1;
      } else {
         return var3 / var4;
      }
   }

   protected static boolean do(wc var0) {
      return var0 != null && var0.a > 10;
   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6) {
      if (this.S < var6) {
         for(int var7 = this.S; var7 < var6; ++var7) {
            int var8 = this.a(var3 + var7, var5);
            int var9 = this.a(var4);
            int var10 = this.if(var3 + var7, var5);
            if (!var2.if(var8, var9, var10)) {
               break;
            }

            ++this.S;
            aep var11 = new aep(var1, this.if(var7));
            var11.if((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
            var1.new(var11);
         }

      }
   }

   protected int if(int var1) {
      return 0;
   }

   protected int for(int var1, int var2) {
      if (this.T.as) {
         if (var1 == pa.aM.void) {
            return pa.ar.void;
         }

         if (var1 == pa.bf.void) {
            return pa.ar.void;
         }

         if (var1 == pa.be.void) {
            return pa.ar.void;
         }

         if (var1 == pa.bk.void) {
            return pa.br.void;
         }

         if (var1 == pa.cl.void) {
            return pa.br.void;
         }

         if (var1 == pa.aY.void) {
            return pa.ar.void;
         }
      }

      return var1;
   }

   protected int int(int var1, int var2) {
      if (this.T.as) {
         if (var1 == pa.aM.void) {
            return 0;
         }

         if (var1 == pa.bf.void) {
            return 0;
         }

         if (var1 == pa.be.void) {
            return 2;
         }
      }

      return var2;
   }

   protected void a(y6 var1, int var2, int var3, int var4, int var5, int var6, wc var7) {
      int var8 = this.for(var2, var3);
      int var9 = this.int(var2, var3);
      super.a(var1, var8, var9, var4, var5, var6, var7);
   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      int var12 = this.for(var9, 0);
      int var13 = this.int(var9, 0);
      int var14 = this.for(var10, 0);
      int var15 = this.int(var10, 0);
      super.a(var1, var2, var3, var4, var5, var6, var7, var8, var12, var13, var14, var15, var11);
   }

   protected void if(y6 var1, int var2, int var3, int var4, int var5, int var6, wc var7) {
      int var8 = this.for(var2, var3);
      int var9 = this.int(var2, var3);
      super.if(var1, var8, var9, var4, var5, var6, var7);
   }
}
