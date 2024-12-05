import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ak extends an {
   public ak(String var1, File var2, aj var3) {
      super(var1, var2, var2.getName(), var3);
   }

   protected InputStream for(String var1) {
      File var2 = new File(this.if, var1.substring(1));
      if (!var2.exists()) {
         throw new FileNotFoundException(var1);
      } else {
         return new BufferedInputStream(new FileInputStream(var2));
      }
   }

   public boolean do(String var1) {
      File var2 = new File(this.if, var1);
      return var2.exists() && var2.isFile();
   }

   public boolean int() {
      File var1 = new File(this.if, "textures/");
      boolean var2 = var1.exists() && var1.isDirectory();
      boolean var3 = this.do("terrain.png") || this.do("gui/items.png");
      return var2 || !var3;
   }
}
