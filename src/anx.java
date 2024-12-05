import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.PublicKey;

public class anx extends an7 {
   private String aC;
   private PublicKey aB;
   private byte[] aD = new byte[0];

   public anx() {
   }

   public anx(String var1, PublicKey var2, byte[] var3) {
      this.aC = var1;
      this.aB = var2;
      this.aD = var3;
   }

   public void for(DataInputStream var1) {
      this.aC = a(var1, 20);
      this.aB = aj5.a(if(var1));
      this.aD = if(var1);
   }

   public void a(DataOutputStream var1) {
      a(this.aC, var1);
      a(var1, this.aB.getEncoded());
      a(var1, this.aD);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2 + this.aC.length() * 2 + 2 + this.aB.getEncoded().length + 2 + this.aD.length;
   }

   public String b() {
      return this.aC;
   }

   public PublicKey void() {
      return this.aB;
   }

   public byte[] c() {
      return this.aD;
   }
}
