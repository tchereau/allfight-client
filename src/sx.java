import java.io.File;
import java.io.FilenameFilter;

class sx implements FilenameFilter {
   // $FF: synthetic field
   final sy a;

   sx(sy var1) {
      this.a = var1;
   }

   public boolean accept(File var1, String var2) {
      return var2.endsWith(".mcr");
   }
}
