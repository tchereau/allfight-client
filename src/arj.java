import java.util.List;
import java.util.Random;

public class arj extends ao8 {
   public String if() {
      return "weather";
   }

   public int do() {
      return 2;
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length < 1) {
         throw new ard("commands.weather.usage", new Object[0]);
      } else {
         int var3 = (300 + (new Random()).nextInt(600)) * 20;
         if (var2.length >= 2) {
            var3 = a(var1, var2[1], 1, 1000000) * 20;
         }

         ak5 var4 = net.minecraft.a.a.g2().t4[0];
         ss var5 = var4.l();
         var5.do(var3);
         var5.int(var3);
         if ("clear".equalsIgnoreCase(var2[0])) {
            var5.do(false);
            var5.a(false);
            a(var1, "commands.weather.clear", new Object[0]);
         } else if ("rain".equalsIgnoreCase(var2[0])) {
            var5.do(true);
            var5.a(false);
            a(var1, "commands.weather.rain", new Object[0]);
         } else if ("thunder".equalsIgnoreCase(var2[0])) {
            var5.do(true);
            var5.a(true);
            a(var1, "commands.weather.thunder", new Object[0]);
         }

      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, new String[]{"clear", "rain", "thunder"}) : null;
   }
}
