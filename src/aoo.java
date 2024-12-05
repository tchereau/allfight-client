import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoo extends an7 {
   public int b7;
   public int b6;
   public int b8;

   public aoo() {
   }

   public aoo(int var1, int var2, int var3) {
      this.b7 = var1;
      this.b6 = var2;
      this.b8 = var3;
   }

   public void for(DataInputStream var1) {
      this.b7 = var1.readInt();
      this.b6 = var1.readInt();
      this.b8 = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.b7);
      var1.writeInt(this.b6);
      var1.writeByte(this.b8);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 9;
   }
}
