import java.util.List;

public class arv extends ao8 {
   public String if() {
      return "enchant";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.enchant.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length < 2) {
         throw new ard("commands.enchant.usage", new Object[0]);
      } else {
         ak2 var3 = do(var1, var2[0]);
         int var4 = a(var1, var2[1], 0, z3.n.length - 1);
         int var5 = 1;
         abp var6 = var3.cD();
         if (var6 == null) {
            a(var1, "commands.enchant.noItem", new Object[0]);
         } else {
            z3 var7 = z3.n[var4];
            if (var7 == null) {
               throw new arh("commands.enchant.notFound", new Object[]{var4});
            } else if (!var7.a(var6)) {
               a(var1, "commands.enchant.cantEnchant", new Object[0]);
            } else {
               if (var2.length >= 3) {
                  var5 = a(var1, var2[2], var7.a(), var7.do());
               }

               if (var6.a()) {
                  aqm var8 = var6.try();
                  if (var8 != null) {
                     for(int var9 = 0; var9 < var8.for(); ++var9) {
                        short var10 = ((aqv)var8.a(var9)).case("id");
                        if (z3.n[var10] != null) {
                           z3 var11 = z3.n[var10];
                           if (!var11.a(var7)) {
                              a(var1, "commands.enchant.cantCombine", new Object[]{var7.do(var5), var11.do(((aqv)var8.a(var9)).case("lvl"))});
                              return;
                           }
                        }
                     }
                  }
               }

               var6.a(var7, var5);
               a(var1, "commands.enchant.success", new Object[0]);
            }
         }
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, this.long()) : null;
   }

   protected String[] long() {
      return net.minecraft.a.a.g2().hs();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
