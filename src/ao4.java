import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao4 extends an7 {
   public short cW;
   public short cV;
   public byte[] cX;

   public ao4() {
      this.else = true;
   }

   public ao4(short var1, short var2, byte[] var3) {
      this.else = true;
      this.cW = var1;
      this.cV = var2;
      this.cX = var3;
   }

   public void for(DataInputStream var1) {
      this.cW = var1.readShort();
      this.cV = var1.readShort();
      this.cX = new byte[var1.readUnsignedShort()];
      var1.readFully(this.cX);
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.cW);
      var1.writeShort(this.cV);
      var1.writeShort(this.cX.length);
      var1.write(this.cX);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 4 + this.cX.length;
   }
}
