import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ann extends an7 {
   public String af;
   public String ae;
   public int ag;

   public ann() {
   }

   public ann(np var1, int var2) {
      this.af = var1.if();
      this.ae = var1.for();
      this.ag = var2;
   }

   public void for(DataInputStream var1) {
      this.af = a(var1, 16);
      this.ae = a(var1, 32);
      this.ag = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      a(this.af, var1);
      a(this.ae, var1);
      var1.writeByte(this.ag);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2 + this.af.length() + 2 + this.ae.length() + 1;
   }
}
