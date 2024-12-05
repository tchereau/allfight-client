import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apf extends an7 {
   public static int df = 119;
   public String de;
   private boolean dg;

   public apf() {
      this.dg = true;
   }

   public apf(String var1) {
      this(var1, true);
   }

   public apf(String var1, boolean var2) {
      this.dg = true;
      if (var1.length() > df) {
         var1 = var1.substring(0, df);
      }

      this.de = var1;
      this.dg = var2;
   }

   public void for(DataInputStream var1) {
      this.de = a(var1, df);
   }

   public void a(DataOutputStream var1) {
      a(this.de, var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2 + this.de.length() * 2;
   }

   public boolean M() {
      return this.dg;
   }

   public boolean a() {
      return !this.de.startsWith("/");
   }
}
