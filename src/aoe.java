import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoe extends aof {
   public aoe() {
   }

   public aoe(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.bd = var2;
      this.bj = var3;
      this.bi = var4;
   }

   public void for(DataInputStream var1) {
      super.for(var1);
      this.bd = var1.readByte();
      this.bj = var1.readByte();
      this.bi = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.bd);
      var1.writeByte(this.bj);
      var1.writeByte(this.bi);
   }

   public int for() {
      return 7;
   }
}
