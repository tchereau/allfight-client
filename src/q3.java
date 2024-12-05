import java.util.Random;

public class q3 extends qz {
   public q3(int var1, ts var2, boolean var3) {
      super(var1, "glass", var2, var3);
      this.a((acn)acn.d);
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ajc var1) {
      String var2 = this.void == mod_rajouts.S.void ? "blackglassfull" : (this.void == mod_rajouts.R.void ? "redglassfull" : (this.void == mod_rajouts.ab.void ? "greenglassfull" : (this.void == mod_rajouts.O.void ? "brownglassfull" : (this.void == mod_rajouts.Z.void ? "blueglassfull" : "glass"))));
      this.an = var1.a(var2);
   }

   public int b() {
      return 0;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   protected boolean d() {
      return true;
   }

   public int do(yy var1, int var2, int var3, int var4) {
      if (this.void == mod_rajouts.R.void) {
         return 16711680;
      } else if (this.void == mod_rajouts.Z.void) {
         return 255;
      } else if (this.void == mod_rajouts.ab.void) {
         return 65280;
      } else if (this.void == mod_rajouts.O.void) {
         return 8404992;
      } else {
         return this.void == mod_rajouts.S.void ? 0 : 16777200;
      }
   }
}
