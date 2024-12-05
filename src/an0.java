import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an0 extends an7 {
   public int aM;
   public byte aL;

   public an0() {
   }

   public an0(int var1, aiz var2) {
      this.aM = var1;
      this.aL = (byte)(var2.byte() & 255);
   }

   public void for(DataInputStream var1) {
      this.aM = var1.readInt();
      this.aL = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.aM);
      var1.writeByte(this.aL);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 5;
   }
}
