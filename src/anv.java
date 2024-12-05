import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anv extends an7 {
   public int az;
   public abp ay;

   public anv() {
   }

   public anv(int var1, abp var2) {
      this.az = var1;
      this.ay = var2 != null ? var2.n() : null;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.az = var1.readShort();
      this.ay = do(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.az);
      a(this.ay, var1);
   }

   public int for() {
      return 8;
   }
}
