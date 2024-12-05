import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aob extends an7 {
   public double bc;
   public double bb;
   public double ba;
   public double a9;
   public float a8;
   public float a7;
   public boolean a6;
   public boolean a5;
   public boolean a4;

   public aob() {
   }

   public aob(boolean var1) {
      this.a6 = var1;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.a6 = var1.read() != 0;
   }

   public void a(DataOutputStream var1) {
      var1.write(this.a6 ? 1 : 0);
   }

   public int for() {
      return 1;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }
}
