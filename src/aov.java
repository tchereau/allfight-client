import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aov extends an7 {
   public String cu;
   public int ct;
   public byte[] cv;

   public aov() {
   }

   public aov(String var1, byte[] var2) {
      this.cu = var1;
      this.cv = var2;
      if (var2 != null) {
         this.ct = var2.length;
         if (this.ct > 32767) {
            throw new IllegalArgumentException("Payload may not be larger than 32k");
         }
      }

   }

   public void for(DataInputStream var1) {
      this.cu = a(var1, 20);
      this.ct = var1.readShort();
      if (this.ct > 0 && this.ct < 32767) {
         this.cv = new byte[this.ct];
         var1.readFully(this.cv);
      }

   }

   public void a(DataOutputStream var1) {
      a(this.cu, var1);
      var1.writeShort((short)this.ct);
      if (this.cv != null) {
         var1.write(this.cv);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2 + this.cu.length() * 2 + 2 + this.ct;
   }
}
