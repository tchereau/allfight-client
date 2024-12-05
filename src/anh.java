import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class anh extends an7 {
   private byte[] K = new byte[0];
   private byte[] J = new byte[0];
   private SecretKey L;

   public anh() {
   }

   public anh(SecretKey var1, PublicKey var2, byte[] var3) {
      this.L = var1;
      this.K = aj5.a((Key)var2, (byte[])var1.getEncoded());
      this.J = aj5.a((Key)var2, (byte[])var3);
   }

   public void for(DataInputStream var1) {
      this.K = if(var1);
      this.J = if(var1);
   }

   public void a(DataOutputStream var1) {
      a(var1, this.K);
      a(var1, this.J);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2 + this.K.length + 2 + this.J.length;
   }

   public SecretKey if(PrivateKey var1) {
      return var1 == null ? this.L : (this.L = aj5.a(var1, this.K));
   }

   public SecretKey else() {
      return this.if((PrivateKey)null);
   }

   public byte[] a(PrivateKey var1) {
      return var1 == null ? this.J : aj5.if(var1, this.J);
   }
}
