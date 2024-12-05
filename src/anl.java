import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anl extends an7 {
   public int W;
   public int V;

   public anl() {
   }

   public anl(aiw var1, aiw var2) {
      this.W = var1.av;
      this.V = var2 != null ? var2.av : -1;
   }

   public int for() {
      return 8;
   }

   public void for(DataInputStream var1) {
      this.W = var1.readInt();
      this.V = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.W);
      var1.writeInt(this.V);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      anl var2 = (anl)var1;
      return var2.W == this.W;
   }
}
