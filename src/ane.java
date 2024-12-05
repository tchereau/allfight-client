import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ane extends an7 {
   public int y;
   public int x;
   public int C;
   public int B;
   public byte A;
   public byte z;

   public ane() {
   }

   public ane(aiw var1) {
      this.y = var1.av;
      this.x = ajs.a(var1.al * 32.0D);
      this.C = ajs.a(var1.ak * 32.0D);
      this.B = ajs.a(var1.aj * 32.0D);
      this.A = (byte)((int)(var1.a5 * 256.0F / 360.0F));
      this.z = (byte)((int)(var1.a4 * 256.0F / 360.0F));
   }

   public ane(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      this.y = var1;
      this.x = var2;
      this.C = var3;
      this.B = var4;
      this.A = var5;
      this.z = var6;
   }

   public void for(DataInputStream var1) {
      this.y = var1.readInt();
      this.x = var1.readInt();
      this.C = var1.readInt();
      this.B = var1.readInt();
      this.A = (byte)var1.read();
      this.z = (byte)var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.y);
      var1.writeInt(this.x);
      var1.writeInt(this.C);
      var1.writeInt(this.B);
      var1.write(this.A);
      var1.write(this.z);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 34;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      ane var2 = (ane)var1;
      return var2.y == this.y;
   }
}
