import java.util.List;

public class al9 extends ao8 {
   public String if() {
      return "clear";
   }

   public String if(ar0 var1) {
      return var1.a("commands.clear.usage");
   }

   public int do() {
      return 2;
   }

   public void if(ar0 var1, String[] var2) {
      ak2 var3 = var2.length == 0 ? do(var1) : do(var1, var2[0]);
      int var4 = var2.length >= 2 ? a(var1, var2[1], 1) : -1;
      int var5 = var2.length >= 3 ? a(var1, var2[2], 0) : -1;
      int var6 = var3.fR.int(var4, var5);
      var3.fQ.do();
      if (var6 == 0) {
         throw new ari("commands.clear.failure", new Object[]{var3.aB()});
      } else {
         a(var1, "commands.clear.success", new Object[]{var3.aB(), var6});
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, this.new()) : null;
   }

   protected String[] new() {
      return net.minecraft.a.a.g2().hs();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
