import java.util.ArrayList;
import java.util.List;

public class alo extends ao8 {
   public String if() {
      return "whitelist";
   }

   public int do() {
      return 3;
   }

   public String if(ar0 var1) {
      return var1.a("commands.whitelist.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 1) {
         if (var2[0].equals("on")) {
            net.minecraft.a.a.g2().g6().a(true);
            a(var1, "commands.whitelist.enabled", new Object[0]);
            return;
         }

         if (var2[0].equals("off")) {
            net.minecraft.a.a.g2().g6().a(false);
            a(var1, "commands.whitelist.disabled", new Object[0]);
            return;
         }

         if (var2[0].equals("list")) {
            var1.a(var1.a("commands.whitelist.list", net.minecraft.a.a.g2().g6().e().size(), net.minecraft.a.a.g2().g6().d().length));
            var1.a(a(net.minecraft.a.a.g2().g6().e().toArray(new String[0])));
            return;
         }

         if (var2[0].equals("add")) {
            if (var2.length < 2) {
               throw new ard("commands.whitelist.add.usage", new Object[0]);
            }

            net.minecraft.a.a.g2().g6().try(var2[1]);
            a(var1, "commands.whitelist.add.success", new Object[]{var2[1]});
            return;
         }

         if (var2[0].equals("remove")) {
            if (var2.length < 2) {
               throw new ard("commands.whitelist.remove.usage", new Object[0]);
            }

            net.minecraft.a.a.g2().g6().byte(var2[1]);
            a(var1, "commands.whitelist.remove.success", new Object[]{var2[1]});
            return;
         }

         if (var2[0].equals("reload")) {
            net.minecraft.a.a.g2().g6().long();
            a(var1, "commands.whitelist.reloaded", new Object[0]);
            return;
         }
      }

      throw new ard("commands.whitelist.usage", new Object[0]);
   }

   public List a(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         return a(var2, new String[]{"on", "off", "list", "add", "remove", "reload"});
      } else {
         if (var2.length == 2) {
            if (var2[0].equals("add")) {
               String[] var3 = net.minecraft.a.a.g2().g6().d();
               ArrayList var4 = new ArrayList();
               String var5 = var2[var2.length - 1];
               String[] var6 = var3;
               int var7 = var3.length;

               for(int var8 = 0; var8 < var7; ++var8) {
                  String var9 = var6[var8];
                  if (a(var5, var9) && !net.minecraft.a.a.g2().g6().e().contains(var9)) {
                     var4.add(var9);
                  }
               }

               return var4;
            }

            if (var2[0].equals("remove")) {
               return a(var2, net.minecraft.a.a.g2().g6().e());
            }
         }

         return null;
      }
   }
}
