public class aly extends ao8 {
   public String if() {
      return "publish";
   }

   public int do() {
      return 4;
   }

   public void if(ar0 var1, String[] var2) {
      String var3 = net.minecraft.a.a.g2().a(yz.a, false);
      if (var3 != null) {
         a(var1, "commands.publish.started", new Object[]{var3});
      } else {
         a(var1, "commands.publish.failed", new Object[0]);
      }

   }
}
