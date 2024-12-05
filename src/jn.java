import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;

public class jn {
   public static final Pattern if = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
   private final jq a;
   private final k3 try;
   private final int new;
   private final int int;
   private final String for;
   private final String do;

   public jn(jq var1, k3 var2, int var3, int var4) {
      this.a = var1;
      this.try = var2;
      this.new = var3;
      this.int = var4;
      this.for = var1.a(var2.do(), var3);
      this.do = this.if();
   }

   public String do() {
      return this.do;
   }

   public URI a() {
      String var1 = this.do();
      if (var1 == null) {
         return null;
      } else {
         Matcher var2 = if.matcher(var1);
         if (var2.matches()) {
            try {
               String var3 = var2.group(0);
               if (var2.group(1) == null) {
                  var3 = "http://" + var3;
               }

               return new URI(var3);
            } catch (URISyntaxException var4) {
               Minecraft.ih().a().a("Couldn't create URI from chat", (Throwable)var4);
            }
         }

         return null;
      }
   }

   private String if() {
      int var1 = this.for.lastIndexOf(" ", this.for.length()) + 1;
      if (var1 < 0) {
         var1 = 0;
      }

      int var2 = this.try.do().indexOf(" ", var1);
      if (var2 < 0) {
         var2 = this.try.do().length();
      }

      return ajm.a(this.try.do().substring(var1, var2));
   }
}
