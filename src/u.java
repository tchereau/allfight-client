import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;

public class u {
   private volatile boolean long = false;
   private volatile Map goto = null;
   private volatile Map else = null;
   private v char;
   private File case;
   private File byte;
   private File try;
   private File new;
   private File int;
   private File for;
   private j7 do;
   private int if = 0;
   private int a = 0;

   public u(j7 var1, v var2, File var3) {
      this.case = new File(var3, "stats_" + var1.if.toLowerCase() + "_unsent.dat");
      this.byte = new File(var3, "stats_" + var1.if.toLowerCase() + ".dat");
      this.int = new File(var3, "stats_" + var1.if.toLowerCase() + "_unsent.old");
      this.for = new File(var3, "stats_" + var1.if.toLowerCase() + ".old");
      this.try = new File(var3, "stats_" + var1.if.toLowerCase() + "_unsent.tmp");
      this.new = new File(var3, "stats_" + var1.if.toLowerCase() + ".tmp");
      if (!var1.if.toLowerCase().equals(var1.if)) {
         this.a(var3, "stats_" + var1.if + "_unsent.dat", this.case);
         this.a(var3, "stats_" + var1.if + ".dat", this.byte);
         this.a(var3, "stats_" + var1.if + "_unsent.old", this.int);
         this.a(var3, "stats_" + var1.if + ".old", this.for);
         this.a(var3, "stats_" + var1.if + "_unsent.tmp", this.try);
         this.a(var3, "stats_" + var1.if + ".tmp", this.new);
      }

      this.char = var2;
      this.do = var1;
      if (this.case.exists()) {
         var2.a(this.a(this.case, this.try, this.int));
      }

      this.if();
   }

   private void a(File var1, String var2, File var3) {
      File var4 = new File(var1, var2);
      if (var4.exists() && !var4.isDirectory() && !var3.exists()) {
         var4.renameTo(var3);
      }

   }

   private Map a(File var1, File var2, File var3) {
      if (var1.exists()) {
         return this.a(var1);
      } else if (var3.exists()) {
         return this.a(var3);
      } else {
         return var2.exists() ? this.a(var2) : null;
      }
   }

   private Map a(File var1) {
      BufferedReader var2 = null;

      try {
         var2 = new BufferedReader(new FileReader(var1));
         String var3 = "";
         StringBuilder var4 = new StringBuilder();

         while((var3 = var2.readLine()) != null) {
            var4.append(var3);
         }

         Map var5 = v.a(var4.toString());
         return var5;
      } catch (Exception var15) {
         var15.printStackTrace();
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Exception var14) {
               var14.printStackTrace();
            }
         }

      }

      return null;
   }

   private void a(Map var1, File var2, File var3, File var4) {
      PrintWriter var5 = new PrintWriter(new FileWriter(var3, false));

      try {
         var5.print(v.a(this.do.if, "local", var1));
      } finally {
         var5.close();
      }

      if (var4.exists()) {
         var4.delete();
      }

      if (var2.exists()) {
         var2.renameTo(var4);
      }

      var3.renameTo(var2);
   }

   public void if() {
      if (this.long) {
         throw new IllegalStateException("Can't get stats from server while StatsSyncher is busy!");
      } else {
         this.if = 100;
         this.long = true;
         (new t(this)).start();
      }
   }

   public void if(Map var1) {
      if (this.long) {
         throw new IllegalStateException("Can't save stats while StatsSyncher is busy!");
      } else {
         this.if = 100;
         this.long = true;
         (new s(this, var1)).start();
      }
   }

   public void a(Map var1) {
      int var2 = 30;

      while(this.long) {
         --var2;
         if (var2 <= 0) {
            break;
         }

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var10) {
            var10.printStackTrace();
         }
      }

      this.long = true;

      try {
         this.a(var1, this.case, this.try, this.int);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         this.long = false;
      }

   }

   public boolean do() {
      return this.if <= 0 && !this.long && this.else == null;
   }

   public void a() {
      if (this.if > 0) {
         --this.if;
      }

      if (this.a > 0) {
         --this.a;
      }

      if (this.else != null) {
         this.char.do(this.else);
         this.else = null;
      }

      if (this.goto != null) {
         this.char.if(this.goto);
         this.goto = null;
      }

   }

   // $FF: synthetic method
   static Map a(u var0) {
      return var0.goto;
   }

   // $FF: synthetic method
   static File int(u var0) {
      return var0.byte;
   }

   // $FF: synthetic method
   static File try(u var0) {
      return var0.new;
   }

   // $FF: synthetic method
   static File if(u var0) {
      return var0.for;
   }

   // $FF: synthetic method
   static void a(u var0, Map var1, File var2, File var3, File var4) {
      var0.a(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Map a(u var0, Map var1) {
      return var0.goto = var1;
   }

   // $FF: synthetic method
   static Map a(u var0, File var1, File var2, File var3) {
      return var0.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static boolean a(u var0, boolean var1) {
      return var0.long = var1;
   }

   // $FF: synthetic method
   static File for(u var0) {
      return var0.case;
   }

   // $FF: synthetic method
   static File do(u var0) {
      return var0.try;
   }

   // $FF: synthetic method
   static File new(u var0) {
      return var0.int;
   }
}
