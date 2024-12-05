import java.util.List;

public class arq extends ao8 {
   public String if() {
      return "gamerule";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.gamerule.usage");
   }

   public void if(ar0 var1, String[] var2) {
      String var6;
      if (var2.length == 2) {
         var6 = var2[0];
         String var7 = var2[1];
         ze var8 = this.char();
         if (var8.if(var6)) {
            var8.a(var6, var7);
            a(var1, "commands.gamerule.success", new Object[0]);
         } else {
            a(var1, "commands.gamerule.norule", new Object[]{var6});
         }

      } else if (var2.length == 1) {
         var6 = var2[0];
         ze var4 = this.char();
         if (var4.if(var6)) {
            String var5 = var4.do(var6);
            var1.a(var6 + " = " + var5);
         } else {
            a(var1, "commands.gamerule.norule", new Object[]{var6});
         }

      } else if (var2.length == 0) {
         ze var3 = this.char();
         var1.a(a(var3.a()));
      } else {
         throw new ard("commands.gamerule.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         return a(var2, this.char().a());
      } else {
         return var2.length == 2 ? a(var2, new String[]{"true", "false"}) : null;
      }
   }

   private ze char() {
      return net.minecraft.a.a.g2().aS(0).i();
   }
}
