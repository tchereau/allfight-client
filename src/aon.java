import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aon extends an7 {
   public int b5;

   public aon() {
   }

   public aon(int var1) {
      this.b5 = var1;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.b5 = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.b5);
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

   public boolean a() {
      return true;
   }
}
