import java.io.DataInputStream;
import java.io.DataOutputStream;

public class app extends an7 {
   public int dy;
   public int dx;
   public int dC;
   public int dB;
   public int dA;
   public String dz;

   public app() {
   }

   public app(ah7 var1) {
      this.dy = var1.av;
      this.dx = var1.rX;
      this.dC = var1.r1;
      this.dB = var1.r0;
      this.dA = var1.rY;
      this.dz = var1.r2.new;
   }

   public void for(DataInputStream var1) {
      this.dy = var1.readInt();
      this.dz = a(var1, ah6.try);
      this.dx = var1.readInt();
      this.dC = var1.readInt();
      this.dB = var1.readInt();
      this.dA = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dy);
      a(this.dz, var1);
      var1.writeInt(this.dx);
      var1.writeInt(this.dC);
      var1.writeInt(this.dB);
      var1.writeInt(this.dA);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 24;
   }
}
