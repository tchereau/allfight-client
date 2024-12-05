import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ani extends an7 {
   public long N;
   public long M;

   public ani() {
   }

   public ani(long var1, long var3) {
      this.N = var1;
      this.M = var3;
   }

   public void for(DataInputStream var1) {
      this.N = var1.readLong();
      this.M = var1.readLong();
   }

   public void a(DataOutputStream var1) {
      var1.writeLong(this.N);
      var1.writeLong(this.M);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 16;
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
