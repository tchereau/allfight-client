import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an2 extends an7 {
   public String aP;
   public boolean aO;
   public int aQ;

   public an2() {
   }

   public an2(String var1, boolean var2, int var3) {
      this.aP = var1;
      this.aO = var2;
      this.aQ = var3;
   }

   public void for(DataInputStream var1) {
      this.aP = a(var1, 16);
      this.aO = var1.readByte() != 0;
      this.aQ = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      a(this.aP, var1);
      var1.writeByte(this.aO ? 1 : 0);
      var1.writeShort(this.aQ);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return this.aP.length() + 2 + 1 + 2;
   }
}
