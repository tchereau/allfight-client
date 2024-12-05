import java.util.List;
import java.util.regex.Matcher;

public class al0 extends ao8 {
   public String if() {
      return "pardon-ip";
   }

   public int do() {
      return 3;
   }

   public boolean a(ar0 var1) {
      return net.minecraft.a.a.g2().g6().for().int() && super.a(var1);
   }

   public String if(ar0 var1) {
      return var1.a("commands.unbanip.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length == 1 && var2[0].length() > 1) {
         Matcher var3 = amc.for.matcher(var2[0]);
         if (var3.matches()) {
            net.minecraft.a.a.g2().g6().for().a(var2[0]);
            a(var1, "commands.unbanip.success", new Object[]{var2[0]});
         } else {
            throw new arg("commands.unbanip.invalid", new Object[0]);
         }
      } else {
         throw new ard("commands.unbanip.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, net.minecraft.a.a.g2().g6().for().for().keySet()) : null;
   }
}
