import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apj extends an7 {
   public int dj;
   public int di;

   public apj() {
   }

   public apj(int var1, int var2) {
      this.dj = var1;
      this.di = var2;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.dj = var1.readInt();
      this.di = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dj);
      var1.writeByte(this.di);
   }

   public int for() {
      return 6;
   }

   public boolean a() {
      return true;
   }
}
