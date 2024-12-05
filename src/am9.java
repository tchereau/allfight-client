import java.io.DataInputStream;
import java.io.DataOutputStream;

public class am9 extends an7 {
   public int long;
   public byte goto;
   public byte b;
   public short void;

   public am9() {
   }

   public am9(int var1, aiz var2) {
      this.long = var1;
      this.goto = (byte)(var2.byte() & 255);
      this.b = (byte)(var2.int() & 255);
      if (var2.do() > 32767) {
         this.void = 32767;
      } else {
         this.void = (short)var2.do();
      }

   }

   public void for(DataInputStream var1) {
      this.long = var1.readInt();
      this.goto = var1.readByte();
      this.b = var1.readByte();
      this.void = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.long);
      var1.writeByte(this.goto);
      var1.writeByte(this.b);
      var1.writeShort(this.void);
   }

   public boolean int() {
      return this.void == 32767;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 8;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      am9 var2 = (am9)var1;
      return var2.long == this.long && var2.goto == this.goto;
   }
}
