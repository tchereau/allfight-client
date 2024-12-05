import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class apr extends an7 {
   public int dN;
   public int dM;
   public int dL;
   public int dK;
   public int dJ;
   public int dI;
   public int dH;
   public int dG;
   public byte dF;
   public byte dE;
   public byte dD;
   private ah4 dP;
   private List dO;

   public apr() {
   }

   public apr(aig var1) {
      this.dN = var1.av;
      this.dM = (byte)air.a(var1);
      this.dL = var1.a1.a(var1.al);
      this.dK = ajs.a(var1.ak * 32.0D);
      this.dJ = var1.a1.a(var1.aj);
      this.dF = (byte)((int)(var1.a5 * 256.0F / 360.0F));
      this.dE = (byte)((int)(var1.a4 * 256.0F / 360.0F));
      this.dD = (byte)((int)(var1.fA * 256.0F / 360.0F));
      double var2 = 3.9D;
      double var4 = var1.ai;
      double var6 = var1.ah;
      double var8 = var1.ag;
      if (var4 < -var2) {
         var4 = -var2;
      }

      if (var6 < -var2) {
         var6 = -var2;
      }

      if (var8 < -var2) {
         var8 = -var2;
      }

      if (var4 > var2) {
         var4 = var2;
      }

      if (var6 > var2) {
         var6 = var2;
      }

      if (var8 > var2) {
         var8 = var2;
      }

      this.dI = (int)(var4 * 8000.0D);
      this.dH = (int)(var6 * 8000.0D);
      this.dG = (int)(var8 * 8000.0D);
      this.dP = var1.ab();
   }

   public void for(DataInputStream var1) {
      this.dN = var1.readInt();
      this.dM = var1.readByte() & 255;
      this.dL = var1.readInt();
      this.dK = var1.readInt();
      this.dJ = var1.readInt();
      this.dF = var1.readByte();
      this.dE = var1.readByte();
      this.dD = var1.readByte();
      this.dI = var1.readShort();
      this.dH = var1.readShort();
      this.dG = var1.readShort();
      this.dO = ah4.a(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dN);
      var1.writeByte(this.dM & 255);
      var1.writeInt(this.dL);
      var1.writeInt(this.dK);
      var1.writeInt(this.dJ);
      var1.writeByte(this.dF);
      var1.writeByte(this.dE);
      var1.writeByte(this.dD);
      var1.writeShort(this.dI);
      var1.writeShort(this.dH);
      var1.writeShort(this.dG);
      this.dP.a(var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 26;
   }

   public List P() {
      if (this.dO == null) {
         this.dO = this.dP.for();
      }

      return this.dO;
   }
}
