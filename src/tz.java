import java.util.List;
import java.util.Random;

public class tz extends t1 {
   private final boolean ar = true;
   private int aq = -1;

   public tz(t4 var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.if = var3.nextInt(4);
      switch(this.if) {
      case 0:
      case 2:
         this.do = new wc(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
         break;
      default:
         this.do = new wc(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
      }

   }

   public void a(uk var1, List var2, Random var3) {
      uf.do((t4)var1, var2, var3, this.do.if - 1, this.do.for - 4, this.do.new + 1, 1, this.a());
      uf.do((t4)var1, var2, var3, this.do.int + 1, this.do.for - 4, this.do.new + 1, 3, this.a());
      uf.do((t4)var1, var2, var3, this.do.if + 1, this.do.for - 4, this.do.new - 1, 2, this.a());
      uf.do((t4)var1, var2, var3, this.do.if + 1, this.do.for - 4, this.do.do + 1, 0, this.a());
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.aq < 0) {
         this.aq = this.if(var1, var3);
         if (this.aq < 0) {
            return true;
         }

         this.do.a(0, this.aq - this.do.for + 3, 0);
      }

      this.a(var1, var3, 1, 0, 1, 4, 12, 4, pa.bf.void, pa.bb.void, false);
      this.a(var1, 0, 0, 2, 12, 2, var3);
      this.a(var1, 0, 0, 3, 12, 2, var3);
      this.a(var1, 0, 0, 2, 12, 3, var3);
      this.a(var1, 0, 0, 3, 12, 3, var3);
      this.a(var1, pa.aZ.void, 0, 1, 13, 1, var3);
      this.a(var1, pa.aZ.void, 0, 1, 14, 1, var3);
      this.a(var1, pa.aZ.void, 0, 4, 13, 1, var3);
      this.a(var1, pa.aZ.void, 0, 4, 14, 1, var3);
      this.a(var1, pa.aZ.void, 0, 1, 13, 4, var3);
      this.a(var1, pa.aZ.void, 0, 1, 14, 4, var3);
      this.a(var1, pa.aZ.void, 0, 4, 13, 4, var3);
      this.a(var1, pa.aZ.void, 0, 4, 14, 4, var3);
      this.a(var1, var3, 1, 15, 1, 4, 15, 4, pa.bf.void, pa.bf.void, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 5; ++var5) {
            if (var5 == 0 || var5 == 5 || var4 == 0 || var4 == 5) {
               this.a(var1, pa.aY.void, 0, var5, 11, var4, var3);
               this.a(var1, var5, 12, var4, var3);
            }
         }
      }

      return true;
   }
}
