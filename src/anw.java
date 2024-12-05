import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anw extends an7 {
   public int aA;

   public anw() {
   }

   public anw(int var1) {
      this.aA = var1;
   }

   public void for(DataInputStream var1) {
      this.aA = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.aA);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }
}
