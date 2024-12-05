import java.io.DataInputStream;
import java.io.DataOutputStream;

public class any extends an7 {
   public int aF;
   public byte aE;

   public any() {
   }

   public any(int var1, byte var2) {
      this.aF = var1;
      this.aE = var2;
   }

   public void for(DataInputStream var1) {
      this.aF = var1.readInt();
      this.aE = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.aF);
      var1.writeByte(this.aE);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 5;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      any var2 = (any)var1;
      return var2.aF == this.aF;
   }

   public boolean a() {
      return true;
   }
}
