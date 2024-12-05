import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class al extends an {
   private ZipFile case;

   public al(String var1, File var2, aj var3) {
      super(var1, var2, var2.getName(), var3);
   }

   public void a(c3 var1) {
      super.a(var1);

      try {
         if (this.case != null) {
            this.case.close();
         }
      } catch (IOException var3) {
      }

      this.case = null;
   }

   protected InputStream for(String var1) {
      this.byte();
      ZipEntry var2 = this.case.getEntry(var1.substring(1));
      if (var2 == null) {
         throw new FileNotFoundException(var1);
      } else {
         return this.case.getInputStream(var2);
      }
   }

   public boolean do(String var1) {
      try {
         this.byte();
         return this.case.getEntry(var1.substring(1)) != null;
      } catch (Exception var3) {
         return false;
      }
   }

   private void byte() {
      if (this.case == null) {
         this.case = new ZipFile(this.if);
      }
   }

   public boolean int() {
      try {
         this.byte();
         Enumeration var1 = this.case.entries();

         while(var1.hasMoreElements()) {
            ZipEntry var2 = (ZipEntry)var1.nextElement();
            if (var2.getName().startsWith("textures/")) {
               return true;
            }
         }
      } catch (Exception var3) {
      }

      boolean var4 = this.do("terrain.png") || this.do("gui/items.png");
      return !var4;
   }
}
