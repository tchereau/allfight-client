import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ant extends an7 {
   public int ax;
   public String aw;

   public ant() {
   }

   public ant(int var1, np var2) {
      this.ax = var1;
      if (var2 == null) {
         this.aw = "";
      } else {
         this.aw = var2.if();
      }

   }

   public void for(DataInputStream var1) {
      this.ax = var1.readByte();
      this.aw = a(var1, 16);
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.ax);
      a(this.aw, var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 3 + this.aw.length();
   }
}
