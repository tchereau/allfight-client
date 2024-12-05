import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao2 extends an7 {
   public int cR;
   public int cQ;

   public ao2() {
   }

   public ao2(int var1, int var2) {
      this.cR = var1;
      this.cQ = var2;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cR = var1.readByte();
      this.cQ = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cR);
      var1.writeByte(this.cQ);
   }

   public int for() {
      return 2;
   }
}
