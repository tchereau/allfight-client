import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class apn extends an7 {
   public int dw;
   public String dv;
   public int du;
   public int dt;
   public int ds;
   public byte dr;
   public byte dq;
   public int dp;
   private ah4 dn;
   private List dm;

   public apn() {
   }

   public apn(aek var1) {
      this.dw = var1.av;
      this.dv = var1.fJ;
      this.du = ajs.a(var1.al * 32.0D);
      this.dt = ajs.a(var1.ak * 32.0D);
      this.ds = ajs.a(var1.aj * 32.0D);
      this.dr = (byte)((int)(var1.a5 * 256.0F / 360.0F));
      this.dq = (byte)((int)(var1.a4 * 256.0F / 360.0F));
      abp var2 = var1.fR.L();
      this.dp = var2 == null ? 0 : var2.new;
      this.dn = var1.ab();
   }

   public void for(DataInputStream var1) {
      this.dw = var1.readInt();
      this.dv = a(var1, 16);
      this.du = var1.readInt();
      this.dt = var1.readInt();
      this.ds = var1.readInt();
      this.dr = var1.readByte();
      this.dq = var1.readByte();
      this.dp = var1.readShort();
      this.dm = ah4.a(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dw);
      a(this.dv, var1);
      var1.writeInt(this.du);
      var1.writeInt(this.dt);
      var1.writeInt(this.ds);
      var1.writeByte(this.dr);
      var1.writeByte(this.dq);
      var1.writeShort(this.dp);
      this.dn.a(var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 28;
   }

   public List O() {
      if (this.dm == null) {
         this.dm = this.dn.for();
      }

      return this.dm;
   }
}
