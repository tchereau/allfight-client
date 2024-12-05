import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class su implements si, sd {
   private final File if;
   private final File a;
   private final File int;
   private final long for = System.currentTimeMillis();
   private final String do;

   public su(File var1, String var2, boolean var3) {
      this.if = new File(var1, var2);
      this.if.mkdirs();
      this.a = new File(this.if, "players");
      this.int = new File(this.if, "data");
      this.int.mkdirs();
      this.do = var2;
      if (var3) {
         this.a.mkdirs();
      }

      this.byte();
   }

   private void byte() {
      try {
         File var1 = new File(this.if, "session.lock");
         DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

         try {
            var2.writeLong(this.for);
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         var7.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }
   }

   protected File try() {
      return this.if;
   }

   public void new() {
      try {
         File var1 = new File(this.if, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if (var2.readLong() != this.for) {
               throw new y2("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         throw new y2("Failed to check session lock, aborting");
      }
   }

   public xt a(xl var1) {
      throw new RuntimeException("Old Chunk Storage is no longer supported.");
   }

   public ss int() {
      File var1 = new File(this.if, "level.dat");
      aqv var2;
      aqv var3;
      if (var1.exists()) {
         try {
            var2 = aqk.a((InputStream)(new FileInputStream(var1)));
            var3 = var2.char("Data");
            return new ss(var3);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      var1 = new File(this.if, "level.dat_old");
      if (var1.exists()) {
         try {
            var2 = aqk.a((InputStream)(new FileInputStream(var1)));
            var3 = var2.char("Data");
            return new ss(var3);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return null;
   }

   public void a(ss var1, aqv var2) {
      aqv var3 = var1.a(var2);
      aqv var4 = new aqv();
      var4.a("Data", (aqd)var3);

      try {
         File var5 = new File(this.if, "level.dat_new");
         File var6 = new File(this.if, "level.dat_old");
         File var7 = new File(this.if, "level.dat");
         aqk.a(var4, (OutputStream)(new FileOutputStream(var5)));
         if (var6.exists()) {
            var6.delete();
         }

         var7.renameTo(var6);
         if (var7.exists()) {
            var7.delete();
         }

         var5.renameTo(var7);
         if (var5.exists()) {
            var5.delete();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void a(ss var1) {
      aqv var2 = var1.try();
      aqv var3 = new aqv();
      var3.a("Data", (aqd)var2);

      try {
         File var4 = new File(this.if, "level.dat_new");
         File var5 = new File(this.if, "level.dat_old");
         File var6 = new File(this.if, "level.dat");
         aqk.a(var3, (OutputStream)(new FileOutputStream(var4)));
         if (var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if (var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if (var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public void if(aek var1) {
      try {
         aqv var2 = new aqv();
         var1.int(var2);
         File var3 = new File(this.a, var1.fJ + ".dat.tmp");
         File var4 = new File(this.a, var1.fJ + ".dat");
         aqk.a(var2, (OutputStream)(new FileOutputStream(var3)));
         if (var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         net.minecraft.a.a.g2().a().if("Failed to save player data for " + var1.fJ);
      }

   }

   public aqv a(aek var1) {
      aqv var2 = this.if(var1.fJ);
      if (var2 != null) {
         var1.byte(var2);
      }

      return var2;
   }

   public aqv if(String var1) {
      try {
         File var2 = new File(this.a, var1 + ".dat");
         if (var2.exists()) {
            return aqk.a((InputStream)(new FileInputStream(var2)));
         }
      } catch (Exception var3) {
         net.minecraft.a.a.g2().a().if("Failed to load player data for " + var1);
      }

      return null;
   }

   public sd for() {
      return this;
   }

   public String[] a() {
      String[] var1 = this.a.list();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2].endsWith(".dat")) {
            var1[var2] = var1[var2].substring(0, var1[var2].length() - 4);
         }
      }

      return var1;
   }

   public void do() {
   }

   public File a(String var1) {
      return new File(this.int, var1 + ".dat");
   }

   public String if() {
      return this.do;
   }
}
