import java.util.List;

public class al6 extends ao8 {
   public String if() {
      return "me";
   }

   public int do() {
      return 0;
   }

   public String if(ar0 var1) {
      return var1.a("commands.me.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 0) {
         String var3 = a(var1, var2, 0, var1.a(1, "me"));
         net.minecraft.a.a.g2().g6().a((an7)(new apf("* " + var1.do() + " " + var3)));
      } else {
         throw new ard("commands.me.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return a(var2, net.minecraft.a.a.g2().hs());
   }
}
