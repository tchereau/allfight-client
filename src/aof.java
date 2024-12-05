import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aof extends an7 {
   public int be;
   public byte bd;
   public byte bj;
   public byte bi;
   public byte bh;
   public byte bg;
   public boolean bf = false;

   public aof() {
   }

   public aof(int var1) {
      this.be = var1;
   }

   public void for(DataInputStream var1) {
      this.be = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.be);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 4;
   }

   public String toString() {
      return "Entity_" + super.toString();
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      aof var2 = (aof)var1;
      return var2.be == this.be;
   }
}
