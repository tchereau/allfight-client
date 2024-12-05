import java.util.List;

public class arr extends ao8 {
   public String if() {
      return "gamemode";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.gamemode.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 0) {
         yz var3 = this.new(var1, var2[0]);
         ak2 var4 = var2.length >= 2 ? do(var1, var2[1]) : do(var1);
         var4.a(var3);
         var4.aK = 0.0F;
         String var5 = aqz.if("gameMode." + var3.int());
         if (var4 != var1) {
            a(var1, 1, "commands.gamemode.success.other", new Object[]{var4.aB(), var5});
         } else {
            a(var1, 1, "commands.gamemode.success.self", new Object[]{var5});
         }

      } else {
         throw new ard("commands.gamemode.usage", new Object[0]);
      }
   }

   protected yz new(ar0 var1, String var2) {
      if (!var2.equalsIgnoreCase(yz.a.int()) && !var2.equalsIgnoreCase("s")) {
         if (!var2.equalsIgnoreCase(yz.try.int()) && !var2.equalsIgnoreCase("c")) {
            return !var2.equalsIgnoreCase(yz.new.int()) && !var2.equalsIgnoreCase("a") ? y0.a(a(var1, var2, 0, yz.a().length - 2)) : yz.new;
         } else {
            return yz.try;
         }
      } else {
         return yz.a;
      }
   }

   public List a(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         return a(var2, new String[]{"survival", "creative", "adventure"});
      } else {
         return var2.length == 2 ? a(var2, this.else()) : null;
      }
   }

   protected String[] else() {
      return net.minecraft.a.a.g2().hs();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 1;
   }
}
