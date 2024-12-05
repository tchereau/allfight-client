import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoa extends aob {
   public aoa() {
      this.a5 = true;
   }

   public aoa(double var1, double var3, double var5, double var7, boolean var9) {
      this.bc = var1;
      this.bb = var3;
      this.a9 = var5;
      this.ba = var7;
      this.a6 = var9;
      this.a5 = true;
   }

   public void for(DataInputStream var1) {
      this.bc = var1.readDouble();
      this.bb = var1.readDouble();
      this.a9 = var1.readDouble();
      this.ba = var1.readDouble();
      super.for(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeDouble(this.bc);
      var1.writeDouble(this.bb);
      var1.writeDouble(this.a9);
      var1.writeDouble(this.ba);
      super.a(var1);
   }

   public int for() {
      return 33;
   }
}
