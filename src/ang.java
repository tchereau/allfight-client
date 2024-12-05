import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ang extends an7 {
   public int G;
   public int F;
   public int I;
   public String[] H;

   public ang() {
      this.else = true;
   }

   public ang(int var1, int var2, int var3, String[] var4) {
      this.else = true;
      this.G = var1;
      this.F = var2;
      this.I = var3;
      this.H = new String[]{var4[0], var4[1], var4[2], var4[3]};
   }

   public void for(DataInputStream var1) {
      this.G = var1.readInt();
      this.F = var1.readShort();
      this.I = var1.readInt();
      this.H = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.H[var2] = a(var1, 15);
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.G);
      var1.writeShort(this.F);
      var1.writeInt(this.I);

      for(int var2 = 0; var2 < 4; ++var2) {
         a(this.H[var2], var1);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      int var1 = 0;

      for(int var2 = 0; var2 < 4; ++var2) {
         var1 += this.H[var2].length();
      }

      return var1;
   }
}
