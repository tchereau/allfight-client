import java.util.Random;

public class ry extends pa {
   private ajd eR;
   private ajd eQ;

   protected ry(int var1) {
      super(var1, ts.b);
      this.a(true);
      this.a(acn.c);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.a(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.new(var2, var3 - var6, var4) == this.void; ++var6) {
         }

         if (var6 < 3) {
            int var7 = var1.for(var2, var3, var4);
            if (var7 == 15) {
               var1.int(var2, var3 + 1, var4, this.void);
               var1.do(var2, var3, var4, 0, 4);
               this.new(var1, var2, var3 + 1, var4, this.void);
            } else {
               var1.do(var2, var3, var4, var7 + 1, 4);
            }
         }
      }

   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return nw.if().a((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return nw.if().a((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)(var3 + 1), (double)((float)(var4 + 1) - var5));
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.eR;
      } else {
         return var1 == 0 ? this.eQ : this.an;
      }
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public int new() {
      return 13;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return !super.case(var1, var2, var3, var4) ? false : this.try(var1, var2, var3, var4);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!this.try(var1, var2, var3, var4)) {
         var1.int(var2, var3, var4, true);
      }

   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      if (var1.byte(var2 - 1, var3, var4).for()) {
         return false;
      } else if (var1.byte(var2 + 1, var3, var4).for()) {
         return false;
      } else if (var1.byte(var2, var3, var4 - 1).for()) {
         return false;
      } else if (var1.byte(var2, var3, var4 + 1).for()) {
         return false;
      } else {
         int var5 = var1.new(var2, var3 - 1, var4);
         return var5 == pa.b7.void || var5 == pa.a1.void;
      }
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      var5.a((ai4)ai4.d, 1);
   }

   public void a(ajc var1) {
      this.an = var1.a("cactus_side");
      this.eR = var1.a("cactus_top");
      this.eQ = var1.a("cactus_bottom");
   }
}
