import java.util.Random;

public class pp extends r8 {
   private Class ed;
   private boolean ec;

   protected pp(int var1, Class var2, boolean var3) {
      super(var1, ts.w);
      this.ec = var3;
      this.ed = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   public ajd if(int var1, int var2) {
      return pa.be.do(var1);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.new(var1, var2, var3, var4);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      if (!this.ec) {
         int var5 = var1.for(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if (var5 == 2) {
            this.a(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if (var5 == 3) {
            this.a(var8, var6, 0.0F, var9, var7, var10);
         }

         if (var5 == 4) {
            this.a(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if (var5 == 5) {
            this.a(0.0F, var6, var8, var10, var7, var9);
         }

      }
   }

   public int new() {
      return -1;
   }

   public boolean if() {
      return false;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean do() {
      return false;
   }

   public n4 if(y6 var1) {
      try {
         return (n4)this.ed.newInstance();
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public int a(int var1, Random var2, int var3) {
      return abr.bm.A;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (this.ec) {
         if (!var1.byte(var2, var3 - 1, var4).for()) {
            var6 = true;
         }
      } else {
         int var7 = var1.for(var2, var3, var4);
         var6 = true;
         if (var7 == 2 && var1.byte(var2, var3, var4 + 1).for()) {
            var6 = false;
         }

         if (var7 == 3 && var1.byte(var2, var3, var4 - 1).for()) {
            var6 = false;
         }

         if (var7 == 4 && var1.byte(var2 + 1, var3, var4).for()) {
            var6 = false;
         }

         if (var7 == 5 && var1.byte(var2 - 1, var3, var4).for()) {
            var6 = false;
         }
      }

      if (var6) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

      super.new(var1, var2, var3, var4, var5);
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.bm.A;
   }

   public void a(ajc var1) {
   }
}
