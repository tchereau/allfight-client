import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class vl extends v1 {
   public vo I;
   public List H = new ArrayList();
   public List K;
   public ArrayList J = new ArrayList();

   public vl(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      vo[] var4 = v2.if();
      int var5 = var4.length;

      int var6;
      vo var7;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.int = 0;
         this.H.add(var7);
      }

      this.K = new ArrayList();
      var4 = v2.a();
      var5 = var4.length;

      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.int = 0;
         this.K.add(var7);
      }

   }
}
