import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aod extends aof {
   public aod() {
      this.bf = true;
   }

   public aod(int var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      super(var1);
      this.bd = var2;
      this.bj = var3;
      this.bi = var4;
      this.bh = var5;
      this.bg = var6;
      this.bf = true;
   }

   public void for(DataInputStream var1) {
      super.for(var1);
      this.bd = var1.readByte();
      this.bj = var1.readByte();
      this.bi = var1.readByte();
      this.bh = var1.readByte();
      this.bg = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.bd);
      var1.writeByte(this.bj);
      var1.writeByte(this.bi);
      var1.writeByte(this.bh);
      var1.writeByte(this.bg);
   }

   public int for() {
      return 9;
   }
}
