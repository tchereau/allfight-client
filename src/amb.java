import java.util.List;

public class amb extends ao8 {
   public String if() {
      return "ban";
   }

   public int do() {
      return 3;
   }

   public String if(ar0 var1) {
      return var1.a("commands.ban.usage");
   }

   public boolean a(ar0 var1) {
      return net.minecraft.a.a.g2().g6().int().int() && super.a(var1);
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 1 && var2[0].length() > 0) {
         ak2 var3 = net.minecraft.a.a.g2().g6().char(var2[0]);
         am6 var4 = new am6(var2[0]);
         var4.do(var1.do());
         if (var2.length >= 2) {
            var4.if(a(var1, var2, 1));
         }

         net.minecraft.a.a.g2().g6().int().a(var4);
         if (var3 != null) {
            var3.pV.if("You are banned from this server.");
         }

         a(var1, "commands.ban.success", new Object[]{var2[0]});
      } else {
         throw new ard("commands.ban.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length >= 1 ? a(var2, net.minecraft.a.a.g2().hs()) : null;
   }
}
