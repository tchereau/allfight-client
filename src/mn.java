import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public final class mn implements mk {
   public String a(lh var1) {
      StringWriter var2 = new StringWriter();

      try {
         this.a((lh)var1, var2);
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }

      return var2.toString();
   }

   public void a(lh var1, Writer var2) {
      this.a((l6)var1, var2);
   }

   private void a(l6 var1, Writer var2) {
      // $FF: Couldn't be decompiled
   }
}
