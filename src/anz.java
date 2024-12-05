import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anz extends an7 {
   public int aH;
   public int aG;
   public int aK;
   public yz aJ;
   public yx aI;

   public anz() {
   }

   public anz(int var1, byte var2, yx var3, int var4, yz var5) {
      this.aH = var1;
      this.aG = var2;
      this.aK = var4;
      this.aJ = var5;
      this.aI = var3;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.aH = var1.readInt();
      this.aG = var1.readByte();
      this.aJ = yz.a(var1.readByte());
      this.aK = var1.readShort();
      String var2 = a(var1, 16);
      this.aI = yx.a(var2);
      if (this.aI == null) {
         this.aI = yx.case;
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.aH);
      var1.writeByte(this.aG);
      var1.writeByte(this.aJ.new());
      var1.writeShort(this.aK);
      a(this.aI.byte(), var1);
   }

   public int for() {
      return 8 + (this.aI == null ? 0 : this.aI.byte().length());
   }
}
