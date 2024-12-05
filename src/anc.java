import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anc extends an7 {
   public int o;
   public int n;
   public int r;
   public int q;
   public aqv p;

   public anc() {
      this.else = true;
   }

   public anc(int var1, int var2, int var3, int var4, aqv var5) {
      this.else = true;
      this.o = var1;
      this.n = var2;
      this.r = var3;
      this.q = var4;
      this.p = var5;
   }

   public void for(DataInputStream var1) {
      this.o = var1.readInt();
      this.n = var1.readShort();
      this.r = var1.readInt();
      this.q = var1.readByte();
      this.p = a((DataInputStream)var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.o);
      var1.writeShort(this.n);
      var1.writeInt(this.r);
      var1.writeByte((byte)this.q);
      a(this.p, var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 25;
   }
}
