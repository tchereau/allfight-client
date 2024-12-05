import java.util.Random;

public class xd {
   protected int if = 8;
   protected Random a = new Random();
   protected y6 do;

   public void a(x0 var1, y6 var2, int var3, int var4, byte[] var5) {
      int var6 = this.if;
      this.do = var2;
      this.a.setSeed(var2.b());
      long var7 = this.a.nextLong();
      long var9 = this.a.nextLong();

      for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
         for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
            long var13 = (long)var11 * var7;
            long var15 = (long)var12 * var9;
            this.a.setSeed(var13 ^ var15 ^ var2.b());
            this.a(var2, var11, var12, var3, var4, var5);
         }
      }

   }

   protected void a(y6 var1, int var2, int var3, int var4, int var5, byte[] var6) {
   }
}
