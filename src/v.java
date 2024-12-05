import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class v {
   private Map if = new HashMap();
   private Map a = new HashMap();
   private boolean for = false;
   private u do;

   public v(j7 var1, File var2) {
      File var3 = new File(var2, "stats");
      if (!var3.exists()) {
         var3.mkdir();
      }

      File[] var4 = var2.listFiles();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         File var7 = var4[var6];
         if (var7.getName().startsWith("stats_") && var7.getName().endsWith(".dat")) {
            File var8 = new File(var3, var7.getName());
            if (!var8.exists()) {
               System.out.println("Relocating " + var7.getName());
               var7.renameTo(var8);
            }
         }
      }

      this.do = new u(var1, this, var3);
   }

   public void a(akf var1, int var2) {
      this.a(this.a, var1, var2);
      this.a(this.if, var1, var2);
      this.for = true;
   }

   private void a(Map var1, akf var2, int var3) {
      Integer var4 = (Integer)var1.get(var2);
      int var5 = var4 == null ? 0 : var4;
      var1.put(var2, var5 + var3);
   }

   public Map a() {
      return new HashMap(this.a);
   }

   public void a(Map var1) {
      if (var1 != null) {
         this.for = true;
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            akf var3 = (akf)var2.next();
            this.a(this.a, var3, (Integer)var1.get(var3));
            this.a(this.if, var3, (Integer)var1.get(var3));
         }

      }
   }

   public void if(Map var1) {
      if (var1 != null) {
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            akf var3 = (akf)var2.next();
            Integer var4 = (Integer)this.a.get(var3);
            int var5 = var4 == null ? 0 : var4;
            this.if.put(var3, (Integer)var1.get(var3) + var5);
         }

      }
   }

   public void do(Map var1) {
      if (var1 != null) {
         this.for = true;
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            akf var3 = (akf)var2.next();
            this.a(this.a, var3, (Integer)var1.get(var3));
         }

      }
   }

   public static Map a(String var0) {
      HashMap var1 = new HashMap();

      try {
         String var2 = "local";
         StringBuilder var3 = new StringBuilder();
         lh var4 = (new mh()).a(var0);
         List var5 = var4.int(new Object[]{"stats-change"});
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            l6 var7 = (l6)var6.next();
            Map var8 = var7.if();
            Entry var9 = (Entry)var8.entrySet().iterator().next();
            int var10 = Integer.parseInt(((lg)var9.getKey()).a());
            int var11 = Integer.parseInt(((l6)var9.getValue()).a());
            akf var12 = aka.a(var10);
            if (var12 == null) {
               System.out.println(var10 + " is not a valid stat, creating place-holder");
               var12 = (new akg(var10)).new();
            }

            var3.append(aka.a(var10).for).append(",");
            var3.append(var11).append(",");
            var1.put(var12, var11);
         }

         aj4 var14 = new aj4(var2);
         String var15 = var14.a(var3.toString());
         if (!var15.equals(var4.for(new Object[]{"checksum"}))) {
            System.out.println("CHECKSUM MISMATCH");
            return null;
         }
      } catch (ld var13) {
         var13.printStackTrace();
      }

      return var1;
   }

   public static String a(String var0, String var1, Map var2) {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      boolean var5 = true;
      var3.append("{\r\n");
      if (var0 != null && var1 != null) {
         var3.append("  \"user\":{\r\n");
         var3.append("    \"name\":\"").append(var0).append("\",\r\n");
         var3.append("    \"sessionid\":\"").append(var1).append("\"\r\n");
         var3.append("  },\r\n");
      }

      var3.append("  \"stats-change\":[");
      Iterator var6 = var2.keySet().iterator();

      while(var6.hasNext()) {
         akf var7 = (akf)var6.next();
         if (var5) {
            var5 = false;
         } else {
            var3.append("},");
         }

         var3.append("\r\n    {\"").append(var7.new).append("\":").append(var2.get(var7));
         var4.append(var7.for).append(",");
         var4.append(var2.get(var7)).append(",");
      }

      if (!var5) {
         var3.append("}");
      }

      aj4 var8 = new aj4(var1);
      var3.append("\r\n  ],\r\n");
      var3.append("  \"checksum\":\"").append(var8.a(var4.toString())).append("\"\r\n");
      var3.append("}");
      return var3.toString();
   }

   public boolean if(akl var1) {
      return this.if.containsKey(var1);
   }

   public boolean a(akl var1) {
      return var1.e == null || this.if(var1.e);
   }

   public int a(akf var1) {
      Integer var2 = (Integer)this.if.get(var1);
      return var2 == null ? 0 : var2;
   }

   public void do() {
      this.do.a(this.a());
   }

   public void if() {
      if (this.for && this.do.do()) {
         this.do.if(this.a());
      }

      this.do.a();
   }
}
