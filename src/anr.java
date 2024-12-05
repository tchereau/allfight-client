import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anr extends an7 {
   public int ar;
   public int aq;
   public int at;
   public int as;

   public anr() {
   }

   public anr(aiw var1) {
      this(var1.av, var1.ai, var1.ah, var1.ag);
   }

   public anr(int var1, double var2, double var4, double var6) {
      this.ar = var1;
      double var8 = 3.9D;
      if (var2 < -var8) {
         var2 = -var8;
      }

      if (var4 < -var8) {
         var4 = -var8;
      }

      if (var6 < -var8) {
         var6 = -var8;
      }

      if (var2 > var8) {
         var2 = var8;
      }

      if (var4 > var8) {
         var4 = var8;
      }

      if (var6 > var8) {
         var6 = var8;
      }

      this.aq = (int)(var2 * 8000.0D);
      this.at = (int)(var4 * 8000.0D);
      this.as = (int)(var6 * 8000.0D);
   }

   public void for(DataInputStream var1) {
      this.ar = var1.readInt();
      this.aq = var1.readShort();
      this.at = var1.readShort();
      this.as = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.ar);
      var1.writeShort(this.aq);
      var1.writeShort(this.at);
      var1.writeShort(this.as);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 10;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      anr var2 = (anr)var1;
      return var2.ar == this.ar;
   }
}
