import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aow extends an7 {
   public int cx;
   public int cw;
   public abp cy;

   public aow() {
   }

   public aow(int var1, int var2, abp var3) {
      this.cx = var1;
      this.cw = var2;
      this.cy = var3 == null ? var3 : var3.n();
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cx = var1.readByte();
      this.cw = var1.readShort();
      this.cy = do(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cx);
      var1.writeShort(this.cw);
      a(this.cy, var1);
   }

   public int for() {
      return 8;
   }
}
