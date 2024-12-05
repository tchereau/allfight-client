import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anf extends an7 {
   public int E;
   public int D;

   public anf() {
   }

   public anf(int var1, int var2) {
      this.E = var1;
      this.D = var2;
   }

   public void for(DataInputStream var1) {
      this.E = var1.readInt();
      this.D = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.E);
      var1.writeInt(this.D);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 8;
   }
}
