import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aos extends an7 {
   public int cm;
   public byte cl;

   public aos() {
   }

   public aos(int var1, byte var2) {
      this.cm = var1;
      this.cl = var2;
   }

   public void for(DataInputStream var1) {
      this.cm = var1.readInt();
      this.cl = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.cm);
      var1.writeByte(this.cl);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 5;
   }
}
