import java.io.OutputStream;

public class gq extends gt {
   private byte[] for;

   public gq(String var1, byte[] var2, int var3, int var4) {
      super(var1, var3, var4);
      this.for = var2;
   }

   public gq try() {
      try {
         this.if.setDoInput(true);
         this.if.setDoOutput(true);
         this.if.setUseCaches(false);
         this.if.setRequestMethod("POST");
         OutputStream var1 = this.if.getOutputStream();
         var1.write(this.for);
         var1.flush();
         return this;
      } catch (Exception var2) {
         throw new gu("Failed URL: " + this.a, var2);
      }
   }

   // $FF: synthetic method
   public gt a() {
      return this.try();
   }
}
