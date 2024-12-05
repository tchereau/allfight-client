import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sy extends st {
   public sy(File var1) {
      super(var1);
   }

   public List if() {
      if (this.a != null && this.a.exists() && this.a.isDirectory()) {
         ArrayList var1 = new ArrayList();
         File[] var2 = this.a.listFiles();
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if (var6.isDirectory()) {
               String var7 = var6.getName();
               ss var8 = this.a(var7);
               if (var8 != null && (var8.goto() == 19132 || var8.goto() == 19133)) {
                  boolean var9 = var8.goto() != this.do();
                  String var10 = var8.l();
                  if (var10 == null || ajs.a(var10)) {
                     var10 = var7;
                  }

                  long var11 = 0L;
                  var1.add(new sf(var7, var10, var8.k(), var11, var8.f(), var9, var8.void(), var8.char()));
               }
            }
         }

         return var1;
      } else {
         throw new sh("Unable to read or access folder where game worlds are saved!");
      }
   }

   protected int do() {
      return 19133;
   }

   public void a() {
      xo.a();
   }

   public si a(String var1, boolean var2) {
      return new sz(this.a, var1, var2);
   }

   public boolean do(String var1) {
      ss var2 = this.a(var1);
      return var2 != null && var2.goto() != this.do();
   }

   public boolean a(String var1, ajo var2) {
      var2.ac(0);
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      File var6 = new File(this.a, var1);
      File var7 = new File(var6, "DIM-1");
      File var8 = new File(var6, "DIM1");
      net.minecraft.a.a.g2().a().a("Scanning folders...");
      this.a((File)var6, (Collection)var3);
      if (var7.exists()) {
         this.a((File)var7, (Collection)var4);
      }

      if (var8.exists()) {
         this.a((File)var8, (Collection)var5);
      }

      int var9 = var3.size() + var4.size() + var5.size();
      net.minecraft.a.a.g2().a().a("Total conversion count is " + var9);
      ss var10 = this.a(var1);
      Object var11 = null;
      if (var10.new() == yx.byte) {
         var11 = new yf(yn.E, 0.5F, 0.5F);
      } else {
         var11 = new yi(var10.case(), var10.new());
      }

      this.a(new File(var6, "region"), (Iterable)var3, (yi)var11, 0, var9, var2);
      this.a(new File(var7, "region"), (Iterable)var4, new yf(yn.x, 1.0F, 0.0F), var3.size(), var9, var2);
      this.a(new File(var8, "region"), (Iterable)var5, new yf(yn.w, 0.5F, 0.0F), var3.size() + var4.size(), var9, var2);
      var10.a(19133);
      if (var10.new() == yx.new) {
         var10.a(yx.case);
      }

      this.int(var1);
      si var12 = this.a(var1, false);
      var12.a(var10);
      return true;
   }

   private void int(String var1) {
      File var2 = new File(this.a, var1);
      if (!var2.exists()) {
         System.out.println("Warning: Unable to create level.dat_mcr backup");
      } else {
         File var3 = new File(var2, "level.dat");
         if (!var3.exists()) {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
         } else {
            File var4 = new File(var2, "level.dat_mcr");
            if (!var3.renameTo(var4)) {
               System.out.println("Warning: Unable to create level.dat_mcr backup");
            }

         }
      }
   }

   private void a(File var1, Iterable var2, yi var3, int var4, int var5, ajo var6) {
      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         File var8 = (File)var7.next();
         this.a(var1, var8, var3, var4, var5, var6);
         ++var4;
         int var9 = (int)Math.round(100.0D * (double)var4 / (double)var5);
         var6.ac(var9);
      }

   }

   private void a(File var1, File var2, yi var3, int var4, int var5, ajo var6) {
      try {
         String var7 = var2.getName();
         xq var8 = new xq(var2);
         xq var9 = new xq(new File(var1, var7.substring(0, var7.length() - ".mcr".length()) + ".mca"));

         for(int var10 = 0; var10 < 32; ++var10) {
            int var11;
            for(var11 = 0; var11 < 32; ++var11) {
               if (var8.a(var10, var11) && !var9.a(var10, var11)) {
                  DataInputStream var12 = var8.int(var10, var11);
                  if (var12 == null) {
                     net.minecraft.a.a.g2().a().if("Failed to fetch input stream");
                  } else {
                     aqv var13 = aqk.a((DataInput)var12);
                     var12.close();
                     aqv var14 = var13.char("Level");
                     xr var15 = xs.a(var14);
                     aqv var16 = new aqv();
                     aqv var17 = new aqv();
                     var16.a("Level", (aqd)var17);
                     xs.a(var15, var17, var3);
                     DataOutputStream var18 = var9.if(var10, var11);
                     aqk.a(var16, (DataOutput)var18);
                     var18.close();
                  }
               }
            }

            var11 = (int)Math.round(100.0D * (double)(var4 * 1024) / (double)(var5 * 1024));
            int var20 = (int)Math.round(100.0D * (double)((var10 + 1) * 32 + var4 * 1024) / (double)(var5 * 1024));
            if (var20 > var11) {
               var6.ac(var20);
            }
         }

         var8.a();
         var9.a();
      } catch (IOException var19) {
         var19.printStackTrace();
      }

   }

   private void a(File var1, Collection var2) {
      File var3 = new File(var1, "region");
      File[] var4 = var3.listFiles(new sx(this));
      if (var4 != null) {
         Collections.addAll(var2, var4);
      }

   }
}
