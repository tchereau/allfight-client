import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aop extends an7 {
   public int b9 = 0;

   public void for(DataInputStream var1) {
      try {
         this.b9 = var1.readByte();
      } catch (Throwable var3) {
         this.b9 = 0;
      }

   }

   public void a(DataOutputStream var1) {
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 0;
   }
}
