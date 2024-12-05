import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class ug extends ui {
   private boolean do = false;

   public ug(y6 var1, Random var2, int var3, int var4, int var5) {
      ArrayList var6 = uf.a(var2, var5);
      t4 var7 = new t4(var1.void(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var6, var5);
      this.if.add(var7);
      var7.a(var7, this.if, var2);
      ArrayList var8 = var7.au;
      ArrayList var9 = var7.av;

      int var10;
      while(!var8.isEmpty() || !var9.isEmpty()) {
         uk var11;
         if (var8.isEmpty()) {
            var10 = var2.nextInt(var9.size());
            var11 = (uk)var9.remove(var10);
            var11.a((uk)var7, (List)this.if, (Random)var2);
         } else {
            var10 = var2.nextInt(var8.size());
            var11 = (uk)var8.remove(var10);
            var11.a((uk)var7, (List)this.if, (Random)var2);
         }
      }

      this.a();
      var10 = 0;
      Iterator var13 = this.if.iterator();

      while(var13.hasNext()) {
         uk var12 = (uk)var13.next();
         if (!(var12 instanceof t0)) {
            ++var10;
         }
      }

      this.do = var10 > 2;
   }

   public boolean if() {
      return this.do;
   }
}
