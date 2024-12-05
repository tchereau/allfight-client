public class alw extends ao8 {
   public String if() {
      return "save-off";
   }

   public int do() {
      return 4;
   }

   public void if(ar0 var1, String[] var2) {
      net.minecraft.a.a var3 = net.minecraft.a.a.g2();

      for(int var4 = 0; var4 < var3.t4.length; ++var4) {
         if (var3.t4[var4] != null) {
            ak5 var5 = var3.t4[var4];
            var5.Q = true;
         }
      }

      a(var1, "commands.save.disabled", new Object[0]);
   }
}
