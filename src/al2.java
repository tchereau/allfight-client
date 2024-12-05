import java.util.Arrays;
import java.util.List;

public class al2 extends ao8 {
   public List a() {
      return Arrays.asList("w", "msg");
   }

   public String if() {
      return "tell";
   }

   public int do() {
      return 0;
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length < 2) {
         throw new ard("commands.message.usage", new Object[0]);
      } else {
         ak2 var3 = do(var1, var2[0]);
         if (var3 == null) {
            throw new arf();
         } else if (var3 == var1) {
            throw new arf("commands.message.sameTarget", new Object[0]);
         } else {
            String var4 = a(var1, var2, 1, !(var1 instanceof aek));
            var3.a((String)(aqj.i + "" + aqj.new + var3.a("commands.message.display.incoming", var1.do(), var4)));
            var1.a(aqj.i + "" + aqj.new + var1.a("commands.message.display.outgoing", var3.do(), var4));
         }
      }
   }

   public List a(ar0 var1, String[] var2) {
      return a(var2, net.minecraft.a.a.g2().hs());
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
