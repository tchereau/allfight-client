import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoc extends aof {
   public aoc() {
      this.bf = true;
   }

   public aoc(int var1, byte var2, byte var3) {
      super(var1);
      this.bh = var2;
      this.bg = var3;
      this.bf = true;
   }

   public void for(DataInputStream var1) {
      super.for(var1);
      this.bh = var1.readByte();
      this.bg = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.bh);
      var1.writeByte(this.bg);
   }

   public int for() {
      return 6;
   }
}
