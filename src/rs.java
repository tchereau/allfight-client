import java.util.List;

public class rs extends pa {
   private ajd[] eJ;

   public rs() {
      super(35, ts.m);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      return this.eJ[var2 % this.eJ.length];
   }

   public int for(int var1) {
      return var1;
   }

   public static int I(int var0) {
      return ~var0 & 15;
   }

   public static int H(int var0) {
      return ~var0 & 15;
   }

   public void a(int var1, acn var2, List var3) {
      for(int var4 = 0; var4 < 16; ++var4) {
         var3.add(new abp(var1, 1, var4));
      }

   }

   public void a(ajc var1) {
      this.eJ = new ajd[16];

      for(int var2 = 0; var2 < this.eJ.length; ++var2) {
         this.eJ[var2] = var1.a("cloth_" + var2);
      }

   }
}
