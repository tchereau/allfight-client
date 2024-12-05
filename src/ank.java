import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ank extends an7 {
   public String S = "";
   public String R = "";
   public int U = 0;
   public int T = 0;

   public ank() {
   }

   public ank(nn var1, int var2) {
      this.S = var1.do();
      this.R = var1.int().if();
      this.U = var1.for();
      this.T = var2;
   }

   public ank(String var1) {
      this.S = var1;
      this.R = "";
      this.U = 0;
      this.T = 1;
   }

   public void for(DataInputStream var1) {
      this.S = a(var1, 16);
      this.T = var1.readByte();
      if (this.T != 1) {
         this.R = a(var1, 16);
         this.U = var1.readInt();
      }

   }

   public void a(DataOutputStream var1) {
      a(this.S, var1);
      var1.writeByte(this.T);
      if (this.T != 1) {
         a(this.R, var1);
         var1.writeInt(this.U);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2 + this.S.length() + 2 + this.R.length() + 4 + 1;
   }
}
