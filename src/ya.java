import java.util.Random;

public class ya extends yn {
   public ya(int var1) {
      super(var1);
      this.goto.long = 50;
      this.goto.char = 25;
      this.goto.else = 4;
      this.else.add(new ym(af4.class, 2, 1, 1));
      this.char.add(new ym(af8.class, 10, 4, 4));
   }

   public w2 if(Random var1) {
      if (var1.nextInt(10) == 0) {
         return this.int;
      } else if (var1.nextInt(2) == 0) {
         return new wz(3, 0);
      } else {
         return (w2)(var1.nextInt(3) == 0 ? new ws(false, 10 + var1.nextInt(20), 3, 3) : new wg(false, 4 + var1.nextInt(7), 3, 3, true));
      }
   }

   public w2 a(Random var1) {
      return var1.nextInt(4) == 0 ? new wh(pa.b3.void, 2) : new wh(pa.b3.void, 1);
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      wf var5 = new wf();

      for(int var6 = 0; var6 < 50; ++var6) {
         int var7 = var3 + var2.nextInt(16) + 8;
         byte var8 = 64;
         int var9 = var4 + var2.nextInt(16) + 8;
         var5.a(var1, var2, var7, var8, var9);
      }

   }
}
