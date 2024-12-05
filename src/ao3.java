import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao3 extends an7 {
   public int cT;
   public short cS;
   public boolean cU;

   public ao3() {
   }

   public ao3(int var1, short var2, boolean var3) {
      this.cT = var1;
      this.cS = var2;
      this.cU = var3;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cT = var1.readByte();
      this.cS = var1.readShort();
      this.cU = var1.readByte() != 0;
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cT);
      var1.writeShort(this.cS);
      var1.writeByte(this.cU ? 1 : 0);
   }

   public int for() {
      return 4;
   }
}
