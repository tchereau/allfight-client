import java.util.List;

public class aru extends ao8 {
   public String if() {
      return "xp";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.xp.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length <= 0) {
         throw new ard("commands.xp.usage", new Object[0]);
      } else {
         String var4 = var2[0];
         boolean var5 = var4.endsWith("l") || var4.endsWith("L");
         if (var5 && var4.length() > 1) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         int var6 = a(var1, var4);
         boolean var7 = var6 < 0;
         if (var7) {
            var6 *= -1;
         }

         ak2 var3;
         if (var2.length > 1) {
            var3 = do(var1, var2[1]);
         } else {
            var3 = do(var1);
         }

         if (var5) {
            if (var7) {
               var3.D(-var6);
               a(var1, "commands.xp.success.negative.levels", new Object[]{var6, var3.aB()});
            } else {
               var3.D(var6);
               a(var1, "commands.xp.success.levels", new Object[]{var6, var3.aB()});
            }
         } else {
            if (var7) {
               throw new ard("commands.xp.failure.widthdrawXp", new Object[0]);
            }

            var3.C(var6);
            a(var1, "commands.xp.success", new Object[]{var6, var3.aB()});
         }

      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 2 ? a(var2, this.goto()) : null;
   }

   protected String[] goto() {
      return net.minecraft.a.a.g2().hs();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 1;
   }
}
