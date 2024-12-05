import java.util.Iterator;
import java.util.List;

public class p4 extends r7 {
   private p3 fc;

   protected p4(int var1, String var2, ts var3, p3 var4) {
      super(var1, var2, var3);
      this.fc = var4;
   }

   protected int N(int var1) {
      return var1 > 0 ? 1 : 0;
   }

   protected int O(int var1) {
      return var1 == 1 ? 15 : 0;
   }

   protected int Y(y6 var1, int var2, int var3, int var4) {
      List var5 = null;
      if (this.fc == p3.if) {
         var5 = var1.a((aiw)null, (nw)this.if(var2, var3, var4));
      }

      if (this.fc == p3.a) {
         var5 = var1.a(aig.class, this.if(var2, var3, var4));
      }

      if (this.fc == p3.for) {
         var5 = var1.a(aek.class, this.if(var2, var3, var4));
      }

      if (!var5.isEmpty()) {
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            aiw var7 = (aiw)var6.next();
            if (!var7.ah()) {
               return 15;
            }
         }
      }

      return 0;
   }
}
