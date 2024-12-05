import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an1 extends an7 {
   public int[] aN;

   public an1() {
   }

   public an1(int... var1) {
      this.aN = var1;
   }

   public void for(DataInputStream var1) {
      this.aN = new int[var1.readByte()];

      for(int var2 = 0; var2 < this.aN.length; ++var2) {
         this.aN[var2] = var1.readInt();
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.aN.length);

      for(int var2 = 0; var2 < this.aN.length; ++var2) {
         var1.writeInt(this.aN[var2]);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 1 + this.aN.length * 4;
   }
}
