import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class v3 extends ui {
   public v3(y6 var1, Random var2, int var3, int var4) {
      vl var5 = new vl(var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.if.add(var5);
      var5.a(var5, this.if, var2);
      ArrayList var6 = var5.J;

      while(!var6.isEmpty()) {
         int var7 = var2.nextInt(var6.size());
         uk var8 = (uk)var6.remove(var7);
         var8.a((uk)var5, (List)this.if, (Random)var2);
      }

      this.a();
      this.a(var1, var2, 48, 70);
   }
}
