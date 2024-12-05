import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anp extends an7 {
   public float al;
   public int ak;
   public int am;

   public anp() {
   }

   public anp(float var1, int var2, int var3) {
      this.al = var1;
      this.ak = var2;
      this.am = var3;
   }

   public void for(DataInputStream var1) {
      this.al = var1.readFloat();
      this.am = var1.readShort();
      this.ak = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeFloat(this.al);
      var1.writeShort(this.am);
      var1.writeShort(this.ak);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 4;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }
}
