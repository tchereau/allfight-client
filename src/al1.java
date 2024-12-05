import java.util.ArrayList;
import java.util.List;

public class al1 extends ao8 {
   public String if() {
      return "op";
   }

   public int do() {
      return 3;
   }

   public String if(ar0 var1) {
      return var1.a("commands.op.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length == 1 && var2[0].length() > 0) {
         net.minecraft.a.a.g2().g6().a(var2[0]);
         a(var1, "commands.op.success", new Object[]{var2[0]});
      } else {
         throw new ard("commands.op.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         String var3 = var2[var2.length - 1];
         ArrayList var4 = new ArrayList();
         String[] var5 = net.minecraft.a.a.g2().hs();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            if (!net.minecraft.a.a.g2().g6().for(var8) && a(var3, var8)) {
               var4.add(var8);
            }
         }

         return var4;
      } else {
         return null;
      }
   }
}
