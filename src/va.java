import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class va extends ui {
   public va(y6 var1, Random var2, int var3, int var4) {
      u9.a();
      ut var5 = new ut(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.if.add(var5);
      var5.a(var5, this.if, var2);
      ArrayList var6 = var5.goto;

      while(!var6.isEmpty()) {
         int var7 = var2.nextInt(var6.size());
         uk var8 = (uk)var6.remove(var7);
         var8.a((uk)var5, (List)this.if, (Random)var2);
      }

      this.a();
      this.a(var1, var2, 10);
   }
}
