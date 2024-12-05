import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class st implements sg {
   protected final File a;

   public st(File var1) {
      if (!var1.exists()) {
         var1.mkdirs();
      }

      this.a = var1;
   }

   public List if() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < 5; ++var2) {
         String var3 = "World" + (var2 + 1);
         ss var4 = this.a(var3);
         if (var4 != null) {
            var1.add(new sf(var3, "", var4.k(), var4.j(), var4.f(), false, var4.void(), var4.char()));
         }
      }

      return var1;
   }

   public void a() {
   }

   public ss a(String var1) {
      File var2 = new File(this.a, var1);
      if (!var2.exists()) {
         return null;
      } else {
         File var3 = new File(var2, "level.dat");
         aqv var4;
         aqv var5;
         if (var3.exists()) {
            try {
               var4 = aqk.a((InputStream)(new FileInputStream(var3)));
               var5 = var4.char("Data");
               return new ss(var5);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         var3 = new File(var2, "level.dat_old");
         if (var3.exists()) {
            try {
               var4 = aqk.a((InputStream)(new FileInputStream(var3)));
               var5 = var4.char("Data");
               return new ss(var5);
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         return null;
      }
   }

   public void a(String var1, String var2) {
      File var3 = new File(this.a, var1);
      if (var3.exists()) {
         File var4 = new File(var3, "level.dat");
         if (var4.exists()) {
            try {
               aqv var5 = aqk.a((InputStream)(new FileInputStream(var4)));
               aqv var6 = var5.char("Data");
               var6.a("LevelName", var2);
               aqk.a(var5, (OutputStream)(new FileOutputStream(var4)));
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

      }
   }

   public boolean for(String var1) {
      File var2 = new File(this.a, var1);
      if (!var2.exists()) {
         return true;
      } else {
         System.out.println("Deleting level " + var1);

         for(int var3 = 1; var3 <= 5; ++var3) {
            System.out.println("Attempt " + var3 + "...");
            if (a(var2.listFiles())) {
               break;
            }

            System.out.println("Unsuccessful in deleting contents.");
            if (var3 < 5) {
               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }

         return var2.delete();
      }
   }

   protected static boolean a(File[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         File var2 = var0[var1];
         System.out.println("Deleting " + var2);
         if (var2.isDirectory() && !a(var2.listFiles())) {
            System.out.println("Couldn't delete directory " + var2);
            return false;
         }

         if (!var2.delete()) {
            System.out.println("Couldn't delete file " + var2);
            return false;
         }
      }

      return true;
   }

   public si a(String var1, boolean var2) {
      return new su(this.a, var1, var2);
   }

   public boolean do(String var1) {
      return false;
   }

   public boolean a(String var1, ajo var2) {
      return false;
   }

   public boolean if(String var1) {
      File var2 = new File(this.a, var1);
      return var2.isDirectory();
   }
}
