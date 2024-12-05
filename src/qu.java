import java.util.Random;

public class qu extends pa {
   private static final String[] dE = new String[]{"mushroom_skin_brown", "mushroom_skin_red"};
   private final int dD;
   private ajd[] dH;
   private ajd dG;
   private ajd dF;

   public qu(int var1, ts var2, int var3) {
      super(var1, var2);
      this.dD = var3;
   }

   public ajd if(int var1, int var2) {
      if (var2 == 10 && var1 > 1) {
         return this.dG;
      } else if (var2 >= 1 && var2 <= 9 && var1 == 1) {
         return this.dH[this.dD];
      } else if (var2 >= 1 && var2 <= 3 && var1 == 2) {
         return this.dH[this.dD];
      } else if (var2 >= 7 && var2 <= 9 && var1 == 3) {
         return this.dH[this.dD];
      } else if ((var2 == 1 || var2 == 4 || var2 == 7) && var1 == 4) {
         return this.dH[this.dD];
      } else if ((var2 == 3 || var2 == 6 || var2 == 9) && var1 == 5) {
         return this.dH[this.dD];
      } else if (var2 == 14) {
         return this.dH[this.dD];
      } else {
         return var2 == 15 ? this.dG : this.dF;
      }
   }

   public int a(Random var1) {
      int var2 = var1.nextInt(10) - 7;
      if (var2 < 0) {
         var2 = 0;
      }

      return var2;
   }

   public int a(int var1, Random var2, int var3) {
      return pa.bN.void + this.dD;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return pa.bN.void + this.dD;
   }

   public void a(ajc var1) {
      this.dH = new ajd[dE.length];

      for(int var2 = 0; var2 < this.dH.length; ++var2) {
         this.dH[var2] = var1.a(dE[var2]);
      }

      this.dF = var1.a("mushroom_inside");
      this.dG = var1.a("mushroom_skin_stem");
   }
}
