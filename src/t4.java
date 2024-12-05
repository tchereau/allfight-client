import java.util.ArrayList;
import java.util.Random;

public class t4 extends tz {
   public final yi at;
   public final boolean as;
   public final int ay;
   public ua ax;
   public ArrayList aw;
   public ArrayList av = new ArrayList();
   public ArrayList au = new ArrayList();

   public t4(yi var1, int var2, Random var3, int var4, int var5, ArrayList var6, int var7) {
      super((t4)null, 0, var3, var4, var5);
      this.at = var1;
      this.aw = var6;
      this.ay = var7;
      yn var8 = var1.a(var4, var5);
      this.as = var8 == yn.D || var8 == yn.o;
      this.T = this;
   }

   public yi for() {
      return this.at;
   }
}
