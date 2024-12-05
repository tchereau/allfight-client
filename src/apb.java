import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apb extends an7 {
   public int c8;

   public apb() {
   }

   public apb(int var1) {
      this.c8 = var1;
   }

   public void for(DataInputStream var1) {
      this.c8 = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.c8 & 255);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 1;
   }
}
