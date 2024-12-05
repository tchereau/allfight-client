public class alx extends ao8 {
   public String if() {
      return "save-all";
   }

   public int do() {
      return 4;
   }

   public void if(ar0 var1, String[] var2) {
      net.minecraft.a.a var3 = net.minecraft.a.a.g2();
      var1.a(var1.a("commands.save.start"));
      if (var3.g6() != null) {
         var3.g6().byte();
      }

      try {
         for(int var4 = 0; var4 < var3.t4.length; ++var4) {
            if (var3.t4[var4] != null) {
               ak5 var5 = var3.t4[var4];
               boolean var6 = var5.Q;
               var5.Q = false;
               var5.a(true, (ajo)null);
               var5.Q = var6;
            }
         }
      } catch (y2 var7) {
         a(var1, "commands.save.failed", new Object[]{var7.getMessage()});
         return;
      }

      a(var1, "commands.save.success", new Object[0]);
   }
}
