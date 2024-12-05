import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aog extends an7 {
   public int bl = 0;
   public yx bk;
   public boolean br;
   public yz bq;
   public int bp;
   public byte bo;
   public byte bn;
   public byte bm;

   public aog() {
   }

   public aog(int var1, yx var2, yz var3, boolean var4, int var5, int var6, int var7, int var8) {
      this.bl = var1;
      this.bk = var2;
      this.bp = var5;
      this.bo = (byte)var6;
      this.bq = var3;
      this.bn = (byte)var7;
      this.bm = (byte)var8;
      this.br = var4;
   }

   public void for(DataInputStream var1) {
      this.bl = var1.readInt();
      String var2 = a(var1, 16);
      this.bk = yx.a(var2);
      if (this.bk == null) {
         this.bk = yx.case;
      }

      byte var3 = var1.readByte();
      this.br = (var3 & 8) == 8;
      int var4 = var3 & -9;
      this.bq = yz.a(var4);
      this.bp = var1.readByte();
      this.bo = var1.readByte();
      this.bn = var1.readByte();
      this.bm = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.bl);
      a(this.bk == null ? "" : this.bk.byte(), var1);
      int var2 = this.bq.new();
      if (this.br) {
         var2 |= 8;
      }

      var1.writeByte(var2);
      var1.writeByte(this.bp);
      var1.writeByte(this.bo);
      var1.writeByte(this.bn);
      var1.writeByte(this.bm);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      int var1 = 0;
      if (this.bk != null) {
         var1 = this.bk.byte().length();
      }

      return 6 + 2 * var1 + 4 + 4 + 1 + 1 + 1;
   }
}
