import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoz extends an7 {
   public int cF;
   public int cE;
   public String cI;
   public int cH;
   public boolean cG;

   public aoz() {
   }

   public aoz(int var1, int var2, String var3, int var4, boolean var5) {
      this.cF = var1;
      this.cE = var2;
      this.cI = var3;
      this.cH = var4;
      this.cG = var5;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public void for(DataInputStream var1) {
      this.cF = var1.readByte() & 255;
      this.cE = var1.readByte() & 255;
      this.cI = a(var1, 32);
      this.cH = var1.readByte() & 255;
      this.cG = var1.readBoolean();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.cF & 255);
      var1.writeByte(this.cE & 255);
      a(this.cI, var1);
      var1.writeByte(this.cH & 255);
      var1.writeBoolean(this.cG);
   }

   public int for() {
      return 4 + this.cI.length();
   }
}
