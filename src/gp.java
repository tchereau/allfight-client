import java.io.OutputStream;

public class gp extends gt {
   private byte[] int;

   public gp(String var1, byte[] var2, int var3, int var4) {
      super(var1, var3, var4);
      this.int = var2;
   }

   public gp char() {
      try {
         this.if.setDoOutput(true);
         this.if.setDoInput(true);
         this.if.setRequestMethod("PUT");
         OutputStream var1 = this.if.getOutputStream();
         var1.write(this.int);
         var1.flush();
         return this;
      } catch (Exception var2) {
         throw new gu("Failed URL: " + this.a, var2);
      }
   }

   // $FF: synthetic method
   public gt a() {
      return this.char();
   }
}
