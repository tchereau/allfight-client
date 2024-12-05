import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class am6 {
   public static final SimpleDateFormat if = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private final String a;
   private Date new = new Date();
   private String int = "(Unknown)";
   private Date for = null;
   private String do = "Banned by an operator.";

   public am6(String var1) {
      this.a = var1;
   }

   public String try() {
      return this.a;
   }

   public Date a() {
      return this.new;
   }

   public void a(Date var1) {
      this.new = var1 != null ? var1 : new Date();
   }

   public String new() {
      return this.int;
   }

   public void do(String var1) {
      this.int = var1;
   }

   public Date int() {
      return this.for;
   }

   public void if(Date var1) {
      this.for = var1;
   }

   public boolean if() {
      return this.for == null ? false : this.for.before(new Date());
   }

   public String do() {
      return this.do;
   }

   public void if(String var1) {
      this.do = var1;
   }

   public String for() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.try());
      var1.append("|");
      var1.append(if.format(this.a()));
      var1.append("|");
      var1.append(this.new());
      var1.append("|");
      var1.append(this.int() == null ? "Forever" : if.format(this.int()));
      var1.append("|");
      var1.append(this.do());
      return var1.toString();
   }

   public static am6 a(String var0) {
      if (var0.trim().length() < 2) {
         return null;
      } else {
         String[] var1 = var0.trim().split(Pattern.quote("|"), 5);
         am6 var2 = new am6(var1[0].trim());
         byte var3 = 0;
         int var10000 = var1.length;
         int var7 = var3 + 1;
         if (var10000 <= var7) {
            return var2;
         } else {
            try {
               var2.a(if.parse(var1[var7].trim()));
            } catch (ParseException var6) {
               net.minecraft.a.a.g2().a().if("Could not read creation date format for ban entry '" + var2.try() + "' (was: '" + var1[var7] + "')", var6);
            }

            var10000 = var1.length;
            ++var7;
            if (var10000 <= var7) {
               return var2;
            } else {
               var2.do(var1[var7].trim());
               var10000 = var1.length;
               ++var7;
               if (var10000 <= var7) {
                  return var2;
               } else {
                  try {
                     String var4 = var1[var7].trim();
                     if (!var4.equalsIgnoreCase("Forever") && var4.length() > 0) {
                        var2.if(if.parse(var4));
                     }
                  } catch (ParseException var5) {
                     net.minecraft.a.a.g2().a().if("Could not read expiry date format for ban entry '" + var2.try() + "' (was: '" + var1[var7] + "')", var5);
                  }

                  var10000 = var1.length;
                  ++var7;
                  if (var10000 <= var7) {
                     return var2;
                  } else {
                     var2.if(var1[var7].trim());
                     return var2;
                  }
               }
            }
         }
      }
   }
}
