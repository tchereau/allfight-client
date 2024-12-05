import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aot extends an7 {
   public int co;
   public int cn;
   public int cr;
   public int cq;
   public int cp;

   public aot() {
   }

   public aot(aiw var1, int var2, int var3, int var4, int var5) {
      this.cp = var2;
      this.cn = var3;
      this.cr = var4;
      this.cq = var5;
      this.co = var1.av;
   }

   public void for(DataInputStream var1) {
      this.co = var1.readInt();
      this.cp = var1.readByte();
      this.cn = var1.readInt();
      this.cr = var1.readByte();
      this.cq = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.co);
      var1.writeByte(this.cp);
      var1.writeInt(this.cn);
      var1.writeByte(this.cr);
      var1.writeInt(this.cq);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 14;
   }
}
