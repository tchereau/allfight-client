import java.util.List;

public class al8 extends ao8 {
   public String if() {
      return "deop";
   }

   public int do() {
      return 3;
   }

   public String if(ar0 var1) {
      return var1.a("commands.deop.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length == 1 && var2[0].length() > 0) {
         net.minecraft.a.a.g2().g6().if(var2[0]);
         a(var1, "commands.deop.success", new Object[]{var2[0]});
      } else {
         throw new ard("commands.deop.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, net.minecraft.a.a.g2().g6().case()) : null;
   }
}
