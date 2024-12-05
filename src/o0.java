import java.util.List;
import java.util.Random;

public class o0 extends pa {
   public static final String[] cJ = new String[]{"oak", "spruce", "birch", "jungle"};
   public static final String[] cI = new String[]{"tree_side", "tree_spruce", "tree_birch", "tree_jungle"};
   private ajd[] cL;
   private ajd cK;

   protected o0(int var1) {
      super(var1, ts.w);
      this.a((acn)acn.d);
   }

   public int new() {
      return 31;
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2, int var3) {
      return pa.aM.void;
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 4;
      int var8 = var7 + 1;
      if (var1.for(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  int var12 = var1.new(var2 + var9, var3 + var10, var4 + var11);
                  if (var12 == pa.aJ.void) {
                     int var13 = var1.for(var2 + var9, var3 + var10, var4 + var11);
                     if ((var13 & 8) == 0) {
                        var1.do(var2 + var9, var3 + var10, var4 + var11, var13 | 8, 4);
                     }
                  }
               }
            }
         }
      }

   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var9 & 3;
      byte var11 = 0;
      switch(var5) {
      case 0:
      case 1:
         var11 = 0;
         break;
      case 2:
      case 3:
         var11 = 8;
         break;
      case 4:
      case 5:
         var11 = 4;
      }

      return var10 | var11;
   }

   public ajd if(int var1, int var2) {
      int var3 = var2 & 12;
      int var4 = var2 & 3;
      if (var3 == 0 && (var1 == 1 || var1 == 0)) {
         return this.cK;
      } else if (var3 != 4 || var1 != 5 && var1 != 4) {
         return var3 != 8 || var1 != 2 && var1 != 3 ? this.cL[var4] : this.cK;
      } else {
         return this.cK;
      }
   }

   public int for(int var1) {
      return var1 & 3;
   }

   public static int goto(int var0) {
      return var0 & 3;
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
      var3.add(new abp(var1, 1, 3));
   }

   protected abp int(int var1) {
      return new abp(this.void, 1, goto(var1));
   }

   public void a(ajc var1) {
      this.cK = var1.a("tree_top");
      this.cL = new ajd[cI.length];

      for(int var2 = 0; var2 < this.cL.length; ++var2) {
         this.cL[var2] = var1.a(cI[var2]);
      }

   }
}
