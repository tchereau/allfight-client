import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao5 extends an7 {
   private int cZ;
   private String cY;
   private String c1;
   private int c0;

   public ao5() {
   }

   public ao5(int var1, String var2, String var3, int var4) {
      this.cZ = var1;
      this.cY = var2;
      this.c1 = var3;
      this.c0 = var4;
   }

   public void for(DataInputStream var1) {
      this.cZ = var1.readByte();
      this.cY = a(var1, 16);
      this.c1 = a(var1, 255);
      this.c0 = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cZ);
      a(this.cY, var1);
      a(this.c1, var1);
      var1.writeInt(this.c0);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 3 + 2 * this.cY.length();
   }

   public int F() {
      return this.cZ;
   }

   public String E() {
      return this.cY;
   }
}
