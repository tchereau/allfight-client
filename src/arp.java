import java.util.List;

public class arp extends ao8 {
   public String if() {
      return "give";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.give.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 2) {
         ak2 var3 = do(var1, var2[0]);
         int var4 = a(var1, var2[1], 1);
         int var5 = 1;
         int var6 = 0;
         if (abr.ai[var4] == null) {
            throw new arh("commands.give.notFound", new Object[]{var4});
         } else {
            if (var2.length >= 3) {
               var5 = a(var1, var2[2], 1, 64);
            }

            if (var2.length >= 4) {
               var6 = a(var1, var2[3]);
            }

            abp var7 = new abp(var4, var5, var6);
            afk var8 = var3.else(var7);
            var8.dB = 0;
            a(var1, "commands.give.success", new Object[]{abr.ai[var4].byte(var7), var4, var5, var3.aB()});
         }
      } else {
         throw new ard("commands.give.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, this.case()) : null;
   }

   protected String[] case() {
      return net.minecraft.a.a.g2().hs();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
