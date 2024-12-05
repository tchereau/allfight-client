import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apl extends an7 {
   public int dl;
   public int dk;

   public apl() {
   }

   public apl(aiw var1, int var2) {
      this.dl = var1.av;
      this.dk = var2;
   }

   public void for(DataInputStream var1) {
      this.dl = var1.readInt();
      this.dk = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dl);
      var1.writeByte(this.dk);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 5;
   }
}
