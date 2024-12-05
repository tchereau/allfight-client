import java.util.List;

public class p1 extends pa {
   public static final String[] dq = new String[]{"default", "chiseled", "lines"};
   private static final String[] dp = new String[]{"quartzblock_side", "quartzblock_chiseled", "quartzblock_lines", null, null};
   private ajd[] dv;
   private ajd du;
   private ajd dt;
   private ajd ds;
   private ajd dr;

   public p1(int var1) {
      super(var1, ts.v);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var2 != 2 && var2 != 3 && var2 != 4) {
         if (var1 != 1 && (var1 != 0 || var2 != 1)) {
            if (var1 == 0) {
               return this.dr;
            } else {
               if (var2 < 0 || var2 >= this.dv.length) {
                  var2 = 0;
               }

               return this.dv[var2];
            }
         } else {
            return var2 == 1 ? this.du : this.ds;
         }
      } else if (var2 == 2 && (var1 == 1 || var1 == 0)) {
         return this.dt;
      } else if (var2 == 3 && (var1 == 5 || var1 == 4)) {
         return this.dt;
      } else {
         return var2 == 4 && (var1 == 2 || var1 == 3) ? this.dt : this.dv[var2];
      }
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      if (var9 == 2) {
         switch(var5) {
         case 0:
         case 1:
            var9 = 2;
            break;
         case 2:
         case 3:
            var9 = 4;
            break;
         case 4:
         case 5:
            var9 = 3;
         }
      }

      return var9;
   }

   public int for(int var1) {
      return var1 != 3 && var1 != 4 ? var1 : 2;
   }

   protected abp int(int var1) {
      return var1 != 3 && var1 != 4 ? super.int(var1) : new abp(this.void, 1, 2);
   }

   public int new() {
      return 39;
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
   }

   public void a(ajc var1) {
      this.dv = new ajd[dp.length];

      for(int var2 = 0; var2 < this.dv.length; ++var2) {
         if (dp[var2] == null) {
            this.dv[var2] = this.dv[var2 - 1];
         } else {
            this.dv[var2] = var1.a(dp[var2]);
         }
      }

      this.ds = var1.a("quartzblock_top");
      this.du = var1.a("quartzblock_chiseled_top");
      this.dt = var1.a("quartzblock_lines_top");
      this.dr = var1.a("quartzblock_bottom");
   }
}
