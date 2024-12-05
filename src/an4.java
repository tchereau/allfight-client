import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an4 extends an7 {
   public int aU;
   public int aT;
   public int aX;
   public int aW;
   public int aV;

   public an4() {
   }

   public an4(int var1, int var2, int var3, int var4, int var5) {
      this.aV = var1;
      this.aU = var2;
      this.aT = var3;
      this.aX = var4;
      this.aW = var5;
   }

   public void for(DataInputStream var1) {
      this.aV = var1.read();
      this.aU = var1.readInt();
      this.aT = var1.read();
      this.aX = var1.readInt();
      this.aW = var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.write(this.aV);
      var1.writeInt(this.aU);
      var1.write(this.aT);
      var1.writeInt(this.aX);
      var1.write(this.aW);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 11;
   }
}
