import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an3 extends an7 {
   public int aS;
   public int aR;

   public an3() {
   }

   public an3(aiw var1, int var2) {
      this.aS = var1.av;
      this.aR = var2;
   }

   public void for(DataInputStream var1) {
      this.aS = var1.readInt();
      this.aR = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.aS);
      var1.writeByte(this.aR);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 5;
   }
}
