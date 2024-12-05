import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao0 extends an7 {
   public int cJ;

   public ao0() {
   }

   public ao0(int var1) {
      this.cJ = var1;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cJ = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cJ);
   }

   public int for() {
      return 1;
   }
}
