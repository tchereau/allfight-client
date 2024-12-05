public class ary extends arr {
   public String if() {
      return "defaultgamemode";
   }

   public String if(ar0 var1) {
      return var1.a("commands.defaultgamemode.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 0) {
         yz var3 = this.new(var1, var2[0]);
         this.a(var3);
         String var4 = aqz.if("gameMode." + var3.int());
         a(var1, "commands.defaultgamemode.success", new Object[]{var4});
      } else {
         throw new ard("commands.defaultgamemode.usage", new Object[0]);
      }
   }

   protected void a(yz var1) {
      net.minecraft.a.a.g2().if(var1);
   }
}
