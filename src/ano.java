import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ano extends an7 {
   public int ai;
   public int ah;
   public float aj;

   public ano() {
   }

   public ano(int var1, int var2, float var3) {
      this.ai = var1;
      this.ah = var2;
      this.aj = var3;
   }

   public void for(DataInputStream var1) {
      this.ai = var1.readShort();
      this.ah = var1.readShort();
      this.aj = var1.readFloat();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.ai);
      var1.writeShort(this.ah);
      var1.writeFloat(this.aj);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 8;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }
}
