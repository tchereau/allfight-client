import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aox extends an7 {
   public int cA;
   public int cz;
   public int cB;

   public aox() {
   }

   public aox(int var1, int var2, int var3) {
      this.cA = var1;
      this.cz = var2;
      this.cB = var3;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cA = var1.readByte();
      this.cz = var1.readShort();
      this.cB = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cA);
      var1.writeShort(this.cz);
      var1.writeShort(this.cB);
   }

   public int for() {
      return 5;
   }
}
