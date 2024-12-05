import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anj extends an7 {
   public int P;
   public int O;
   public int Q;

   public anj() {
   }

   public anj(int var1, int var2, int var3) {
      this.P = var1;
      this.O = var2;
      this.Q = var3;
   }

   public void for(DataInputStream var1) {
      this.P = var1.readInt();
      this.O = var1.readInt();
      this.Q = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.P);
      var1.writeInt(this.O);
      var1.writeInt(this.Q);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 12;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }

   public boolean a() {
      return false;
   }
}
