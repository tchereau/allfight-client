import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao1 extends an7 {
   public int cL;
   public int cK;
   public int cP;
   public short cO;
   public abp cN;
   public int cM;

   public ao1() {
   }

   public ao1(int var1, int var2, int var3, int var4, abp var5, short var6) {
      this.cL = var1;
      this.cK = var2;
      this.cP = var3;
      this.cN = var5 != null ? var5.n() : null;
      this.cO = var6;
      this.cM = var4;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cL = var1.readByte();
      this.cK = var1.readShort();
      this.cP = var1.readByte();
      this.cO = var1.readShort();
      this.cM = var1.readByte();
      this.cN = do(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cL);
      var1.writeShort(this.cK);
      var1.writeByte(this.cP);
      var1.writeShort(this.cO);
      var1.writeByte(this.cM);
      a(this.cN, var1);
   }

   public int for() {
      return 11;
   }
}
