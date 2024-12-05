import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apt extends an7 {
   public int dR;
   public int dQ;
   public int dU;
   public int dT;
   public int dS;

   public apt() {
   }

   public apt(aiw var1) {
      this.dR = var1.av;
      this.dQ = ajs.a(var1.al * 32.0D);
      this.dU = ajs.a(var1.ak * 32.0D);
      this.dT = ajs.a(var1.aj * 32.0D);
      if (var1 instanceof afn) {
         this.dS = 1;
      }

   }

   public void for(DataInputStream var1) {
      this.dR = var1.readInt();
      this.dS = var1.readByte();
      this.dQ = var1.readInt();
      this.dU = var1.readInt();
      this.dT = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.dR);
      var1.writeByte(this.dS);
      var1.writeInt(this.dQ);
      var1.writeInt(this.dU);
      var1.writeInt(this.dT);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 17;
   }
}
