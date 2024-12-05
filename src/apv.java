import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apv extends an7 {
   public int dW;
   public int dV;
   public int dZ;
   public int dY;
   public int dX;

   public apv() {
   }

   public apv(aik var1) {
      this.dW = var1.av;
      this.dV = ajs.a(var1.al * 32.0D);
      this.dZ = ajs.a(var1.ak * 32.0D);
      this.dY = ajs.a(var1.aj * 32.0D);
      this.dX = var1.fX();
   }

   public void for(DataInputStream var1) {
      this.dW = var1.readInt();
      this.dV = var1.readInt();
      this.dZ = var1.readInt();
      this.dY = var1.readInt();
      this.dX = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dW);
      var1.writeInt(this.dV);
      var1.writeInt(this.dZ);
      var1.writeInt(this.dY);
      var1.writeShort(this.dX);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 18;
   }
}
