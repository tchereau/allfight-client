import java.util.ArrayList;
import java.util.List;

public class agi {
   aig if;
   List a = new ArrayList();
   List do = new ArrayList();

   public agi(aig var1) {
      this.if = var1;
   }

   public void a() {
      this.a.clear();
      this.do.clear();
   }

   public boolean a(aiw var1) {
      if (this.a.contains(var1)) {
         return true;
      } else if (this.do.contains(var1)) {
         return false;
      } else {
         this.if.ap.e.a("canSee");
         boolean var2 = this.if.void(var1);
         this.if.ap.e.if();
         if (var2) {
            this.a.add(var1);
         } else {
            this.do.add(var1);
         }

         return var2;
      }
   }
}
