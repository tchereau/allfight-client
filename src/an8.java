import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an8 extends aob {
   public an8() {
      this.a4 = true;
   }

   public an8(float var1, float var2, boolean var3) {
      this.a8 = var1;
      this.a7 = var2;
      this.a6 = var3;
      this.a4 = true;
   }

   public void for(DataInputStream var1) {
      this.a8 = var1.readFloat();
      this.a7 = var1.readFloat();
      super.for(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeFloat(this.a8);
      var1.writeFloat(this.a7);
      super.a(var1);
   }

   public int for() {
      return 9;
   }
}
