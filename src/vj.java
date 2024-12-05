import java.util.Random;

public class vj extends ui {
   public vj(y6 var1, Random var2, int var3, int var4) {
      yn var5 = var1.a(var3 * 16 + 8, var4 * 16 + 8);
      if (var5 != yn.k && var5 != yn.j) {
         if (var5 == yn.z) {
            vc var7 = new vc(var2, var3 * 16, var4 * 16);
            this.if.add(var7);
         } else {
            vh var8 = new vh(var2, var3 * 16, var4 * 16);
            this.if.add(var8);
         }
      } else {
         vg var6 = new vg(var2, var3 * 16, var4 * 16);
         this.if.add(var6);
      }

      this.a();
   }
}
