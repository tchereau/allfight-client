import java.util.Random;

public class qd extends r0 {
   private static final String[] e1 = new String[]{"netherStalk_0", "netherStalk_1", "netherStalk_2"};
   private ajd[] e0;

   protected qd(int var1) {
      super(var1);
      this.a(true);
      float var2 = 0.5F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
      this.a((acn)null);
   }

   protected boolean K(int var1) {
      return var1 == pa.aQ.void;
   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      return this.K(var1.new(var2, var3 - 1, var4));
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      if (var6 < 3 && var5.nextInt(10) == 0) {
         ++var6;
         var1.do(var2, var3, var4, var6, 2);
      }

      super.if(var1, var2, var3, var4, var5);
   }

   public ajd if(int var1, int var2) {
      if (var2 >= 3) {
         return this.e0[2];
      } else {
         return var2 > 0 ? this.e0[1] : this.e0[0];
      }
   }

   public int new() {
      return 6;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.goto) {
         int var8 = 1;
         if (var5 >= 3) {
            var8 = 2 + var1.o.nextInt(3);
            if (var7 > 0) {
               var8 += var1.o.nextInt(var7 + 1);
            }
         }

         for(int var9 = 0; var9 < var8; ++var9) {
            this.a(var1, var2, var3, var4, new abp(abr.ax));
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.ax.A;
   }

   public void a(ajc var1) {
      this.e0 = new ajd[e1.length];

      for(int var2 = 0; var2 < this.e0.length; ++var2) {
         this.e0[var2] = var1.a(e1[var2]);
      }

   }
}
