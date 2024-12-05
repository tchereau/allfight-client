import java.util.List;

public class ama extends ao8 {
   public String if() {
      return "say";
   }

   public int do() {
      return 1;
   }

   public String if(ar0 var1) {
      return var1.a("commands.say.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 0 && var2[0].length() > 0) {
         String var3 = a(var1, var2, 0, true);
         net.minecraft.a.a.g2().g6().case(String.format("[%s] %s", var1.do(), var3));
      } else {
         throw new ard("commands.say.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length >= 1 ? a(var2, net.minecraft.a.a.g2().hs()) : null;
   }
}
