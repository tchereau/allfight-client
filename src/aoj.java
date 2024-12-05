import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoj extends an7 {
   public int bI;
   public int bH;
   public int bM;
   public int bL;
   public int bK;
   private boolean bJ;

   public aoj() {
   }

   public aoj(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.bI = var1;
      this.bM = var2;
      this.bL = var3;
      this.bK = var4;
      this.bH = var5;
      this.bJ = var6;
   }

   public void for(DataInputStream var1) {
      this.bI = var1.readInt();
      this.bM = var1.readInt();
      this.bL = var1.readByte() & 255;
      this.bK = var1.readInt();
      this.bH = var1.readInt();
      this.bJ = var1.readBoolean();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.bI);
      var1.writeInt(this.bM);
      var1.writeByte(this.bL & 255);
      var1.writeInt(this.bK);
      var1.writeInt(this.bH);
      var1.writeBoolean(this.bJ);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 21;
   }

   public boolean y() {
      return this.bJ;
   }
}
