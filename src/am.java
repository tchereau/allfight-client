import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class am extends an {
   public am() {
      super("default", (File)null, "Default", (aj)null);
   }

   protected void new() {
      this.a = "The default look of Minecraft";
   }

   public boolean do(String var1) {
      return am.class.getResourceAsStream(var1) != null;
   }

   public boolean int() {
      return true;
   }

   protected InputStream for(String var1) {
      InputStream var2 = am.class.getResourceAsStream(var1);
      if (var2 == null) {
         throw new FileNotFoundException(var1);
      } else {
         return var2;
      }
   }
}
