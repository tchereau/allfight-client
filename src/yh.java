import java.util.Random;

public class yh extends yn {
   public yh(int var1) {
      super(var1);
      this.char.clear();
      this.g = (byte)pa.a1.void;
      this.f = (byte)pa.a1.void;
      this.goto.long = -999;
      this.goto.case = 2;
      this.goto.try = 50;
      this.goto.new = 10;
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if (var2.nextInt(1000) == 0) {
         int var5 = var3 + var2.nextInt(16) + 8;
         int var6 = var4 + var2.nextInt(16) + 8;
         w3 var7 = new w3();
         var7.a(var1, var2, var5, var1.do(var5, var6) + 1, var6);
      }

   }
}
