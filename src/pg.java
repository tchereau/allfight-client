import java.util.List;
import java.util.Random;

public class pg extends q0 {
   public static final String[] dR = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"};
   private ajd dS;

   public pg(int var1, boolean var2) {
      super(var1, var2, ts.v);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      int var3 = var2 & 7;
      if (this.dP && (var2 & 8) != 0) {
         var1 = 1;
      }

      if (var3 == 0) {
         return var1 != 1 && var1 != 0 ? this.dS : this.an;
      } else if (var3 == 1) {
         return pa.ar.do(var1);
      } else if (var3 == 2) {
         return pa.be.do(var1);
      } else if (var3 == 3) {
         return pa.bf.do(var1);
      } else if (var3 == 4) {
         return pa.bB.do(var1);
      } else if (var3 == 5) {
         return pa.am.if(var1, 0);
      } else if (var3 == 6) {
         return pa.bY.do(1);
      } else {
         return var3 == 7 ? pa.e.do(var1) : this.an;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("stoneslab_top");
      this.dS = var1.a("stoneslab_side");
   }

   public int a(int var1, Random var2, int var3) {
      return pa.bD.void;
   }

   protected abp int(int var1) {
      return new abp(pa.bD.void, 2, var1 & 7);
   }

   public String m(int var1) {
      if (var1 < 0 || var1 >= dR.length) {
         var1 = 0;
      }

      return super.long() + "." + dR[var1];
   }

   public void a(int var1, acn var2, List var3) {
      if (var1 != pa.bF.void) {
         for(int var4 = 0; var4 <= 7; ++var4) {
            if (var4 != 2) {
               var3.add(new abp(var1, 1, var4));
            }
         }

      }
   }
}
