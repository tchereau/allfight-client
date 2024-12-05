import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.IllegalFormatException;
import java.util.Properties;
import java.util.TreeMap;

public class aqy {
   private static aqy if = new aqy("en_US");
   private Properties a = new Properties();
   private TreeMap new;
   private TreeMap int = new TreeMap();
   private String for;
   private boolean do;

   public aqy(String var1) {
      this.do();
      this.a(var1, false);
   }

   public static aqy if() {
      return if;
   }

   private void do() {
      TreeMap var1 = new TreeMap();

      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(aqy.class.getResourceAsStream("/lang/languages.txt"), "UTF-8"));

         for(String var3 = var2.readLine(); var3 != null; var3 = var2.readLine()) {
            String[] var4 = var3.trim().split("=");
            if (var4 != null && var4.length == 2) {
               var1.put(var4[0], var4[1]);
            }
         }
      } catch (IOException var5) {
         var5.printStackTrace();
         return;
      }

      this.new = var1;
      this.new.put("en_US", "English (US)");
   }

   public TreeMap a() {
      return this.new;
   }

   private void a(Properties var1, String var2) {
      BufferedReader var3 = null;
      if (this.int.containsKey(var2)) {
         var3 = new BufferedReader(new FileReader((File)this.int.get(var2)));
      } else {
         var3 = new BufferedReader(new InputStreamReader(aqy.class.getResourceAsStream("/lang/" + var2 + ".lang"), "UTF-8"));
      }

      for(String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
         var4 = var4.trim();
         if (!var4.startsWith("#")) {
            String[] var5 = var4.split("=");
            if (var5 != null && var5.length == 2) {
               var1.setProperty(var5[0], var5[1]);
            }
         }
      }

   }

   public synchronized void a(String var1, boolean var2) {
      if (var2 || !var1.equals(this.for)) {
         Properties var3 = new Properties();

         try {
            this.a(var3, "en_US");
         } catch (IOException var9) {
         }

         this.do = false;
         if (!"en_US".equals(var1)) {
            try {
               this.a(var3, var1);
               Enumeration var4 = var3.propertyNames();

               label49:
               while(true) {
                  while(true) {
                     Object var6;
                     do {
                        if (!var4.hasMoreElements() || this.do) {
                           break label49;
                        }

                        Object var5 = var4.nextElement();
                        var6 = var3.get(var5);
                     } while(var6 == null);

                     String var7 = var6.toString();

                     for(int var8 = 0; var8 < var7.length(); ++var8) {
                        if (var7.charAt(var8) >= 256) {
                           this.do = true;
                           break;
                        }
                     }
                  }
               }
            } catch (IOException var10) {
               var10.printStackTrace();
               return;
            }
         }

         this.for = var1;
         this.a = var3;
      }
   }

   public String int() {
      return this.for;
   }

   public boolean for() {
      return this.do;
   }

   public synchronized String a(String var1) {
      return this.a.getProperty(var1, var1);
   }

   public synchronized String a(String var1, Object... var2) {
      String var3 = this.a.getProperty(var1, var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   public synchronized boolean if(String var1) {
      return this.a.containsKey(var1);
   }

   public synchronized String for(String var1) {
      return this.a.getProperty(var1 + ".name", "");
   }

   public static boolean do(String var0) {
      return "ar_SA".equals(var0) || "he_IL".equals(var0);
   }

   public synchronized void a(String var1, File var2) {
      int var3 = var1.indexOf(46);
      if (var3 > 0) {
         var1 = var1.substring(0, var3);
      }

      this.int.put(var1, var2);
      if (var1.contains(this.for)) {
         this.a(this.for, true);
      }

   }
}
