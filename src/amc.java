import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class amc extends ao8 {
   public static final Pattern for = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

   public String if() {
      return "ban-ip";
   }

   public int do() {
      return 3;
   }

   public boolean a(ar0 var1) {
      return net.minecraft.a.a.g2().g6().for().int() && super.a(var1);
   }

   public String if(ar0 var1) {
      return var1.a("commands.banip.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 1 && var2[0].length() > 1) {
         Matcher var3 = for.matcher(var2[0]);
         String var4 = null;
         if (var2.length >= 2) {
            var4 = a(var1, var2, 1);
         }

         if (var3.matches()) {
            this.a(var1, var2[0], var4);
         } else {
            ak2 var5 = net.minecraft.a.a.g2().g6().char(var2[0]);
            if (var5 == null) {
               throw new arf("commands.banip.invalid", new Object[0]);
            }

            this.a(var1, var5.eH(), var4);
         }

      } else {
         throw new ard("commands.banip.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, net.minecraft.a.a.g2().hs()) : null;
   }

   protected void a(ar0 var1, String var2, String var3) {
      am6 var4 = new am6(var2);
      var4.do(var1.do());
      if (var3 != null) {
         var4.if(var3);
      }

      net.minecraft.a.a.g2().g6().for().a(var4);
      List var5 = net.minecraft.a.a.g2().g6().int(var2);
      String[] var6 = new String[var5.size()];
      int var7 = 0;

      ak2 var9;
      for(Iterator var8 = var5.iterator(); var8.hasNext(); var6[var7++] = var9.aB()) {
         var9 = (ak2)var8.next();
         var9.pV.if("You have been IP banned.");
      }

      if (var5.isEmpty()) {
         a(var1, "commands.banip.success", new Object[]{var2});
      } else {
         a(var1, "commands.banip.success.players", new Object[]{var2, a(var6)});
      }

   }
}
