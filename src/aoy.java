import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class aoy extends an7 {
   public int cD;
   public abp[] cC;

   public aoy() {
   }

   public aoy(int var1, List var2) {
      this.cD = var1;
      this.cC = new abp[var2.size()];

      for(int var3 = 0; var3 < this.cC.length; ++var3) {
         abp var4 = (abp)var2.get(var3);
         this.cC[var3] = var4 == null ? null : var4.n();
      }

   }

   public void for(DataInputStream var1) {
      this.cD = var1.readByte();
      short var2 = var1.readShort();
      this.cC = new abp[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.cC[var3] = do(var1);
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cD);
      var1.writeShort(this.cC.length);

      for(int var2 = 0; var2 < this.cC.length; ++var2) {
         a(this.cC[var2], var1);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 3 + this.cC.length * 5;
   }
}
