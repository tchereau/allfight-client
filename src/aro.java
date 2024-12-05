import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class aro extends ao8 {
   public String if() {
      return "help";
   }

   public int do() {
      return 0;
   }

   public String if(ar0 var1) {
      return var1.a("commands.help.usage");
   }

   public List a() {
      return Arrays.asList("?");
   }

   public void if(ar0 var1, String[] var2) {
      List var3 = this.int(var1);
      byte var4 = 7;
      int var5 = (var3.size() - 1) / var4;
      boolean var6 = false;

      ao6 var9;
      int var11;
      try {
         var11 = var2.length == 0 ? 0 : a(var1, var2[0], 1, var5 + 1) - 1;
      } catch (arh var10) {
         Map var8 = this.byte();
         var9 = (ao6)var8.get(var2[0]);
         if (var9 != null) {
            throw new ard(var9.if(var1), new Object[0]);
         }

         throw new are();
      }

      int var7 = Math.min((var11 + 1) * var4, var3.size());
      var1.a(aqj.n + var1.a("commands.help.header", var11 + 1, var5 + 1));

      for(int var12 = var11 * var4; var12 < var7; ++var12) {
         var9 = (ao6)var3.get(var12);
         var1.a(var9.if(var1));
      }

      if (var11 == 0 && var1 instanceof aek) {
         var1.a(aqj.f + var1.a("commands.help.footer"));
      }

   }

   protected List int(ar0 var1) {
      List var2 = net.minecraft.a.a.g2().gM().a(var1);
      Collections.sort(var2);
      return var2;
   }

   protected Map byte() {
      return net.minecraft.a.a.g2().gM().a();
   }
}
