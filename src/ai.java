import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class ai {
   private static final aj if = new am();
   private final Minecraft a;
   private final File byte;
   private final File try;
   private List new = new ArrayList();
   private Map int = new HashMap();
   private aj for;
   private boolean do;

   public ai(File var1, Minecraft var2) {
      this.a = var2;
      this.byte = new File(var1, "texturepacks");
      this.try = new File(var1, "texturepacks-mp-cache");
      this.case();
      this.char();
   }

   private void case() {
      if (!this.byte.isDirectory()) {
         this.byte.delete();
         this.byte.mkdirs();
      }

      if (!this.try.isDirectory()) {
         this.try.delete();
         this.try.mkdirs();
      }

   }

   public boolean a(aj var1) {
      if (var1 == this.for) {
         return false;
      } else {
         this.do = false;
         this.for = var1;
         this.a.u1.ac = var1.do();
         this.a.u1.new();
         return true;
      }
   }

   public void a(String var1) {
      String var2 = var1.substring(var1.lastIndexOf("/") + 1);
      if (var2.contains("?")) {
         var2 = var2.substring(0, var2.indexOf("?"));
      }

      if (var2.endsWith(".zip")) {
         File var3 = new File(this.try, var2);
         this.a(var1, var3);
      }
   }

   private void a(String var1, File var2) {
      HashMap var3 = new HashMap();
      i7 var4 = new i7();
      var3.put("X-Minecraft-Username", this.a.vg.if);
      var3.put("X-Minecraft-Version", "1.5.1");
      var3.put("X-Minecraft-Supported-Resolutions", "16");
      this.do = true;
      this.a.a((i5)var4);
      aj3.a(var2, var1, new ah(this), var3, 10000000, var4);
   }

   public boolean for() {
      return this.do;
   }

   public void byte() {
      this.do = false;
      this.char();
      this.a.ij();
   }

   public void char() {
      ArrayList var1 = new ArrayList();
      this.for = if;
      var1.add(if);
      Iterator var2 = this.try().iterator();

      while(var2.hasNext()) {
         File var3 = (File)var2.next();
         String var4 = this.a(var3);
         if (var4 != null) {
            Object var5 = (aj)this.int.get(var4);
            if (var5 == null) {
               var5 = var3.isDirectory() ? new ak(var4, var3, if) : new al(var4, var3, if);
               this.int.put(var4, var5);
            }

            if (((aj)var5).do().equals(this.a.u1.ac)) {
               this.for = (aj)var5;
            }

            var1.add(var5);
         }
      }

      this.new.removeAll(var1);
      var2 = this.new.iterator();

      while(var2.hasNext()) {
         aj var6 = (aj)var2.next();
         var6.a(this.a.vb);
         this.int.remove(var6.for());
      }

      this.new = var1;
   }

   private String a(File var1) {
      if (var1.isFile() && var1.getName().toLowerCase().endsWith(".zip")) {
         return var1.getName() + ":" + var1.length() + ":" + var1.lastModified();
      } else {
         return var1.isDirectory() && (new File(var1, "pack.txt")).exists() ? var1.getName() + ":folder:" + var1.lastModified() : null;
      }
   }

   private List try() {
      return this.byte.exists() && this.byte.isDirectory() ? Arrays.asList(this.byte.listFiles()) : Collections.emptyList();
   }

   public List if() {
      return Collections.unmodifiableList(this.new);
   }

   public aj int() {
      return this.for;
   }

   public boolean a() {
      if (!this.a.u1.U) {
         return false;
      } else {
         eq var1 = this.a.il();
         return var1 == null ? true : var1.if();
      }
   }

   public boolean do() {
      if (!this.a.u1.U) {
         return false;
      } else {
         eq var1 = this.a.il();
         return var1 == null ? false : var1.for();
      }
   }

   // $FF: synthetic method
   static boolean if(ai var0) {
      return var0.do;
   }

   // $FF: synthetic method
   static aj a(ai var0, aj var1) {
      return var0.for = var1;
   }

   // $FF: synthetic method
   static String a(ai var0, File var1) {
      return var0.a(var1);
   }

   // $FF: synthetic method
   static aj new() {
      return if;
   }

   // $FF: synthetic method
   static Minecraft a(ai var0) {
      return var0.a;
   }
}
