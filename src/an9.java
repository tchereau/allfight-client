import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an9 extends aob {
   public an9() {
      this.a4 = true;
      this.a5 = true;
   }

   public an9(double var1, double var3, double var5, double var7, float var9, float var10, boolean var11) {
      this.bc = var1;
      this.bb = var3;
      this.a9 = var5;
      this.ba = var7;
      this.a8 = var9;
      this.a7 = var10;
      this.a6 = var11;
      this.a4 = true;
      this.a5 = true;
   }

   public void for(DataInputStream var1) {
      this.bc = var1.readDouble();
      this.bb = var1.readDouble();
      this.a9 = var1.readDouble();
      this.ba = var1.readDouble();
      this.a8 = var1.readFloat();
      this.a7 = var1.readFloat();
      super.for(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeDouble(this.bc);
      var1.writeDouble(this.bb);
      var1.writeDouble(this.a9);
      var1.writeDouble(this.ba);
      var1.writeFloat(this.a8);
      var1.writeFloat(this.a7);
      super.a(var1);
   }

   public int for() {
      return 41;
   }
}
