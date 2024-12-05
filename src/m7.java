import java.security.SecureRandom;

public class m7 {
   protected SecureRandom if;
   protected int a;

   public void a(m4 var1) {
      this.if = var1.if();
      this.a = (var1.a() + 7) / 8;
   }

   public byte[] a() {
      byte[] var1 = new byte[this.a];
      this.if.nextBytes(var1);
      return var1;
   }
}
