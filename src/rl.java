import java.util.List;
import java.util.Random;

public class rl extends r6 {
   private ajd[] e9;

   public rl(int var1) {
      super(var1, true);
      this.a(true);
   }

   public int a(y6 var1) {
      return 20;
   }

   public boolean int() {
      return true;
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         if ((var6 & 8) == 0) {
            this.o(var1, var2, var3, var4, var6);
         }
      }
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         if ((var6 & 8) != 0) {
            this.o(var1, var2, var3, var4, var6);
         }
      }
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return (var1.for(var2, var3, var4) & 8) != 0 ? 15 : 0;
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      if ((var1.for(var2, var3, var4) & 8) == 0) {
         return 0;
      } else {
         return var5 == 1 ? 15 : 0;
      }
   }

   private void o(y6 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = (var5 & 8) != 0;
      boolean var7 = false;
      float var8 = 0.125F;
      List var9 = var1.a(afj.class, nw.if().a((double)((float)var2 + var8), (double)var3, (double)((float)var4 + var8), (double)((float)(var2 + 1) - var8), (double)((float)(var3 + 1) - var8), (double)((float)(var4 + 1) - var8)));
      if (!var9.isEmpty()) {
         var7 = true;
      }

      if (var7 && !var6) {
         var1.do(var2, var3, var4, var5 | 8, 3);
         var1.for(var2, var3, var4, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         var1.new(var2, var3, var4, var2, var3, var4);
      }

      if (!var7 && var6) {
         var1.do(var2, var3, var4, var5 & 7, 3);
         var1.for(var2, var3, var4, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         var1.new(var2, var3, var4, var2, var3, var4);
      }

      if (var7) {
         var1.if(var2, var3, var4, this.void, this.a(var1));
      }

      var1.new(var2, var3, var4, this.void);
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      this.o(var1, var2, var3, var4, var1.for(var2, var3, var4));
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      if ((var1.for(var2, var3, var4) & 8) > 0) {
         float var6 = 0.125F;
         List var7 = var1.a(afj.class, nw.if().a((double)((float)var2 + var6), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)(var3 + 1) - var6), (double)((float)(var4 + 1) - var6)), aip.a);
         if (var7.size() > 0) {
            return ad1.a((ajg)var7.get(0));
         }
      }

      return 0;
   }

   public void a(ajc var1) {
      this.e9 = new ajd[2];
      this.e9[0] = var1.a("detectorRail");
      this.e9[1] = var1.a("detectorRail_on");
   }

   public ajd if(int var1, int var2) {
      return (var2 & 8) != 0 ? this.e9[1] : this.e9[0];
   }
}
