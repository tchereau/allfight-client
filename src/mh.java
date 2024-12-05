import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class mh {
   public lh a(Reader var1) {
      mb var2 = new mb();
      (new la()).a((Reader)var1, var2);
      return var2.else();
   }

   public lh a(String var1) {
      try {
         lh var2 = this.a((Reader)(new StringReader(var1)));
         return var2;
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }
   }
}
