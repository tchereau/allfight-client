import java.util.List;

public class al5 extends ao8 {
   public String if() {
      return "kick";
   }

   public int do() {
      return 3;
   }

   public String if(ar0 var1) {
      return var1.a("commands.kick.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 0 && var2[0].length() > 1) {
         ak2 var3 = net.minecraft.a.a.g2().g6().char(var2[0]);
         String var4 = "Kicked by an operator.";
         boolean var5 = false;
         if (var3 == null) {
            throw new arf();
         } else {
            if (var2.length >= 2) {
               var4 = a(var1, var2, 1);
               var5 = true;
            }

            var3.pV.if(var4);
            if (var5) {
               a(var1, "commands.kick.success.reason", new Object[]{var3.aB(), var4});
            } else {
               a(var1, "commands.kick.success", new Object[]{var3.aB()});
            }

         }
      } else {
         throw new ard("commands.kick.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length >= 1 ? a(var2, net.minecraft.a.a.g2().hs()) : null;
   }
}
