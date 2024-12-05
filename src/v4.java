import java.util.ArrayList;
import java.util.List;

public class v4 extends uo {
   private List b = new ArrayList();

   public v4() {
      this.b.add(new ym(ae9.class, 10, 2, 3));
      this.b.add(new ym(aez.class, 5, 4, 4));
      this.b.add(new ym(aew.class, 10, 4, 4));
      this.b.add(new ym(ae1.class, 3, 4, 4));
   }

   public List do() {
      return this.b;
   }

   protected boolean if(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      this.a.setSeed((long)(var3 ^ var4 << 4) ^ this.do.b());
      this.a.nextInt();
      if (this.a.nextInt(3) != 0) {
         return false;
      } else if (var1 != (var3 << 4) + 4 + this.a.nextInt(8)) {
         return false;
      } else {
         return var2 == (var4 << 4) + 4 + this.a.nextInt(8);
      }
   }

   protected ui a(int var1, int var2) {
      return new v3(this.do, this.a, var1, var2);
   }
}
