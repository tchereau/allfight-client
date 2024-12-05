import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class aj2 implements Runnable {
   // $FF: synthetic field
   final ajo if;
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final Map new;
   // $FF: synthetic field
   final File int;
   // $FF: synthetic field
   final aj1 for;
   // $FF: synthetic field
   final int do;

   aj2(ajo var1, String var2, Map var3, File var4, aj1 var5, int var6) {
      this.if = var1;
      this.a = var2;
      this.new = var3;
      this.int = var4;
      this.for = var5;
      this.do = var6;
   }

   public void run() {
      URLConnection var1 = null;
      InputStream var2 = null;
      DataOutputStream var3 = null;
      if (this.if != null) {
         this.if.m("Downloading Texture Pack");
         this.if.n("Making Request...");
      }

      try {
         byte[] var4 = new byte[4096];
         URL var5 = new URL(this.a);
         var1 = var5.openConnection();
         float var6 = 0.0F;
         float var7 = (float)this.new.entrySet().size();
         Iterator var8 = this.new.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            var1.setRequestProperty((String)var9.getKey(), (String)var9.getValue());
            if (this.if != null) {
               this.if.ac((int)(++var6 / var7 * 100.0F));
            }
         }

         var2 = var1.getInputStream();
         var7 = (float)var1.getContentLength();
         int var28 = var1.getContentLength();
         if (this.if != null) {
            this.if.n(String.format("Downloading file (%.2f MB)...", var7 / 1000.0F / 1000.0F));
         }

         if (this.int.exists()) {
            long var29 = this.int.length();
            if (var29 == (long)var28) {
               this.for.a(this.int);
               if (this.if != null) {
                  this.if.d6();
               }

               return;
            }

            System.out.println("Deleting " + this.int + " as it does not match what we currently have (" + var28 + " vs our " + var29 + ").");
            this.int.delete();
         }

         var3 = new DataOutputStream(new FileOutputStream(this.int));
         if (this.do > 0 && var7 > (float)this.do) {
            if (this.if != null) {
               this.if.d6();
            }

            throw new IOException("Filesize is bigger than maximum allowed (file is " + var6 + ", limit is " + this.do + ")");
         }

         boolean var30 = false;

         int var31;
         while((var31 = var2.read(var4)) >= 0) {
            var6 += (float)var31;
            if (this.if != null) {
               this.if.ac((int)(var6 / var7 * 100.0F));
            }

            if (this.do > 0 && var6 > (float)this.do) {
               if (this.if != null) {
                  this.if.d6();
               }

               throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6 + ", limit was " + this.do + ")");
            }

            var3.write(var4, 0, var31);
         }

         this.for.a(this.int);
         if (this.if != null) {
            this.if.d6();
         }
      } catch (Throwable var26) {
         var26.printStackTrace();
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var25) {
         }

         try {
            if (var3 != null) {
               var3.close();
            }
         } catch (IOException var24) {
         }

      }

   }
}
