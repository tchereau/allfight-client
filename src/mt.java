import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class mt extends BasicPermission {
   private final String if;
   private final int a;

   public mt(String var1) {
      super(var1);
      this.if = "all";
      this.a = 15;
   }

   public mt(String var1, String var2) {
      super(var1, var2);
      this.if = var2;
      this.a = this.a(var2);
   }

   private int a(String var1) {
      StringTokenizer var2 = new StringTokenizer(mo.a(var1), " ,");
      int var3 = 0;

      while(var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         if (var4.equals("threadlocalecimplicitlyca")) {
            var3 |= 1;
         } else if (var4.equals("ecimplicitlyca")) {
            var3 |= 2;
         } else if (var4.equals("threadlocaldhdefaultparams")) {
            var3 |= 4;
         } else if (var4.equals("dhdefaultparams")) {
            var3 |= 8;
         } else if (var4.equals("all")) {
            var3 |= 15;
         }
      }

      if (var3 == 0) {
         throw new IllegalArgumentException("unknown permissions passed to mask");
      } else {
         return var3;
      }
   }

   public String getActions() {
      return this.if;
   }

   public boolean implies(Permission var1) {
      if (!(var1 instanceof mt)) {
         return false;
      } else if (!this.getName().equals(var1.getName())) {
         return false;
      } else {
         mt var2 = (mt)var1;
         return (this.a & var2.a) == var2.a;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof mt)) {
         return false;
      } else {
         mt var2 = (mt)var1;
         return this.a == var2.a && this.getName().equals(var2.getName());
      }
   }

   public int hashCode() {
      return this.getName().hashCode() + this.a;
   }
}
