import java.util.List;

public class als extends ao8 {
   public String if() {
      return "spawnpoint";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.spawnpoint.usage");
   }

   public void if(ar0 var1, String[] var2) {
      ak2 var3 = var2.length == 0 ? do(var1) : do(var1, var2[0]);
      if (var2.length == 4) {
         if (var3.ap != null) {
            byte var4 = 1;
            int var5 = 30000000;
            int var9 = var4 + 1;
            int var6 = a(var1, var2[var4], -var5, var5);
            int var7 = a(var1, var2[var9++], 0, 256);
            int var8 = a(var1, var2[var9++], -var5, var5);
            var3.a(new apg(var6, var7, var8), true);
            a(var1, "commands.spawnpoint.success", new Object[]{var3.aB(), var6, var7, var8});
         }
      } else {
         if (var2.length > 1) {
            throw new ard("commands.spawnpoint.usage", new Object[0]);
         }

         apg var10 = var3.for();
         var3.a(var10, true);
         a(var1, "commands.spawnpoint.success", new Object[]{var3.aB(), var10.if, var10.a, var10.do});
      }

   }

   public List a(ar0 var1, String[] var2) {
      return var2.length != 1 && var2.length != 2 ? null : a(var2, net.minecraft.a.a.g2().hs());
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
