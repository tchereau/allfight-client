import java.util.List;

public class al4 extends ao8 {
   public String if() {
      return "banlist";
   }

   public int do() {
      return 3;
   }

   public boolean a(ar0 var1) {
      return (net.minecraft.a.a.g2().g6().for().int() || net.minecraft.a.a.g2().g6().int().int()) && super.a(var1);
   }

   public String if(ar0 var1) {
      return var1.a("commands.banlist.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 1 && var2[0].equalsIgnoreCase("ips")) {
         var1.a(var1.a("commands.banlist.ips", net.minecraft.a.a.g2().g6().for().for().size()));
         var1.a(a(net.minecraft.a.a.g2().g6().for().for().keySet().toArray()));
      } else {
         var1.a(var1.a("commands.banlist.players", net.minecraft.a.a.g2().g6().int().for().size()));
         var1.a(a(net.minecraft.a.a.g2().g6().int().for().keySet().toArray()));
      }

   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, new String[]{"players", "ips"}) : null;
   }
}
