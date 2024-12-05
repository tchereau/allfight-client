import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ajq {
   private final List char = new ArrayList();
   private final List byte = new ArrayList();
   public boolean else = false;
   private String try = "";
   private final Map new = new HashMap();
   public boolean do = true;
   private boolean int;
   private long case;
   public long for;
   private long if;
   public long a;

   public ajq() {
      this.int = this.do;
      this.case = 0L;
      this.for = 0L;
      this.if = 0L;
      this.a = 0L;
   }

   public void do() {
      this.new.clear();
      this.try = "";
      this.char.clear();
      this.int = this.do;
   }

   public void a(String var1) {
      if (qs.S().bn) {
         if (this.case == 0L && var1.equals("tick")) {
            this.case = System.nanoTime();
         }

         if (this.case != 0L && var1.equals("preRenderErrors")) {
            this.for = System.nanoTime() - this.case;
            this.case = 0L;
         }

         if (this.if == 0L && var1.equals("updatechunks")) {
            this.if = System.nanoTime();
         }

         if (this.if != 0L && var1.equals("terrain")) {
            this.a = System.nanoTime() - this.if;
            this.if = 0L;
         }
      }

      if (this.int) {
         if (this.else) {
            if (this.try.length() > 0) {
               this.try = this.try + ".";
            }

            this.try = this.try + var1;
            this.char.add(this.try);
            this.byte.add(System.nanoTime());
         }

      }
   }

   public void if() {
      if (this.int) {
         if (this.else) {
            long var1 = System.nanoTime();
            long var3 = (Long)this.byte.remove(this.byte.size() - 1);
            this.char.remove(this.char.size() - 1);
            long var5 = var1 - var3;
            if (this.new.containsKey(this.try)) {
               this.new.put(this.try, (Long)this.new.get(this.try) + var5);
            } else {
               this.new.put(this.try, var5);
            }

            if (var5 > 100000000L) {
               System.out.println("Something's taking too long! '" + this.try + "' took aprox " + (double)var5 / 1000000.0D + " ms");
            }

            this.try = !this.char.isEmpty() ? (String)this.char.get(this.char.size() - 1) : "";
         }

      }
   }

   public List if(String var1) {
      this.int = this.do;
      if (!this.int) {
         return new ArrayList(Arrays.asList(new ajp("root", 0.0D, 0.0D)));
      } else if (!this.else) {
         return null;
      } else {
         long var2 = this.new.containsKey("root") ? (Long)this.new.get("root") : 0L;
         long var4 = this.new.containsKey(var1) ? (Long)this.new.get(var1) : -1L;
         ArrayList var6 = new ArrayList();
         if (var1.length() > 0) {
            var1 = var1 + ".";
         }

         long var7 = 0L;
         Iterator var9 = this.new.keySet().iterator();

         while(var9.hasNext()) {
            String var10 = (String)var9.next();
            if (var10.length() > var1.length() && var10.startsWith(var1) && var10.indexOf(".", var1.length() + 1) < 0) {
               var7 += (Long)this.new.get(var10);
            }
         }

         float var20 = (float)var7;
         if (var7 < var4) {
            var7 = var4;
         }

         if (var2 < var7) {
            var2 = var7;
         }

         Iterator var11 = this.new.keySet().iterator();

         String var12;
         while(var11.hasNext()) {
            var12 = (String)var11.next();
            if (var12.length() > var1.length() && var12.startsWith(var1) && var12.indexOf(".", var1.length() + 1) < 0) {
               long var13 = (Long)this.new.get(var12);
               double var15 = (double)var13 * 100.0D / (double)var7;
               double var17 = (double)var13 * 100.0D / (double)var2;
               String var19 = var12.substring(var1.length());
               var6.add(new ajp(var19, var15, var17));
            }
         }

         var11 = this.new.keySet().iterator();

         while(var11.hasNext()) {
            var12 = (String)var11.next();
            this.new.put(var12, (Long)this.new.get(var12) * 999L / 1000L);
         }

         if ((float)var7 > var20) {
            var6.add(new ajp("unspecified", (double)((float)var7 - var20) * 100.0D / (double)var7, (double)((float)var7 - var20) * 100.0D / (double)var2));
         }

         Collections.sort(var6);
         var6.add(0, new ajp(var1, 100.0D, (double)var7 * 100.0D / (double)var2));
         return var6;
      }
   }

   public void do(String var1) {
      if (this.int) {
         this.if();
         this.a(var1);
      }
   }

   public String a() {
      return this.char.size() == 0 ? "[UNKNOWN]" : (String)this.char.get(this.char.size() - 1);
   }
}
