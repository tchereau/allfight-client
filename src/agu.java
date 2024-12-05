import java.util.Iterator;
import java.util.List;

public class agu extends ahk {
   private aep d;
   private afy c;
   private int f;
   private boolean e = false;

   public agu(aep var1) {
      this.d = var1;
      this.a(3);
   }

   public boolean do() {
      if (this.d.fr() >= 0) {
         return false;
      } else if (!this.d.ap.j()) {
         return false;
      } else {
         List var1 = this.d.ap.a(afy.class, this.d.aZ.do(6.0D, 2.0D, 6.0D));
         if (var1.isEmpty()) {
            return false;
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               afy var3 = (afy)var2.next();
               if (var3.fd() > 0) {
                  this.c = var3;
                  break;
               }
            }

            return this.c != null;
         }
      }
   }

   public boolean try() {
      return this.c.fd() > 0;
   }

   public void a() {
      this.f = this.d.bq().nextInt(320);
      this.e = false;
      this.c.bl().case();
   }

   public void new() {
      this.c = null;
      this.d.bl().case();
   }

   public void int() {
      this.d.b9().a(this.c, 30.0F, 30.0F);
      if (this.c.fd() == this.f) {
         this.d.bl().a((aig)this.c, 0.15F);
         this.e = true;
      }

      if (this.e && this.d.for((aiw)this.c) < 4.0D) {
         this.c.t(false);
         this.d.bl().case();
      }

   }
}
