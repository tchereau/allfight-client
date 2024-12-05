import java.util.ArrayList;
import java.util.Iterator;

class io extends im {
   // $FF: synthetic field
   final is p;

   public io(is var1) {
      super(var1);
      this.p = var1;
      this.o = new ArrayList();
      Iterator var2 = aka.r.iterator();

      while(var2.hasNext()) {
         akh var3 = (akh)var2.next();
         boolean var4 = false;
         int var5 = var3.try();
         if (is.case(var1).a((akf)var3) > 0) {
            var4 = true;
         } else if (aka.byte[var5] != null && is.case(var1).a(aka.byte[var5]) > 0) {
            var4 = true;
         } else if (aka.goto[var5] != null && is.case(var1).a(aka.goto[var5]) > 0) {
            var4 = true;
         }

         if (var4) {
            this.o.add(var3);
         }
      }

      this.n = new in(this, var1);
   }

   protected void a(int var1, int var2, c4 var3) {
      super.a(var1, var2, var3);
      if (this.j == 0) {
         is.a(this.p, var1 + 115 - 18 + 1, var2 + 1 + 1, 72, 18);
      } else {
         is.a(this.p, var1 + 115 - 18, var2 + 1, 72, 18);
      }

      if (this.j == 1) {
         is.a(this.p, var1 + 165 - 18 + 1, var2 + 1 + 1, 18, 18);
      } else {
         is.a(this.p, var1 + 165 - 18, var2 + 1, 18, 18);
      }

      if (this.j == 2) {
         is.a(this.p, var1 + 215 - 18 + 1, var2 + 1 + 1, 36, 18);
      } else {
         is.a(this.p, var1 + 215 - 18, var2 + 1, 36, 18);
      }

   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      akh var6 = this.do(var1);
      int var7 = var6.try();
      is.a(this.p, var2 + 40, var3, var7);
      this.a((akh)aka.byte[var7], var2 + 115, var3, var1 % 2 == 0);
      this.a((akh)aka.goto[var7], var2 + 165, var3, var1 % 2 == 0);
      this.a(var6, var2 + 215, var3, var1 % 2 == 0);
   }

   protected String int(int var1) {
      if (var1 == 1) {
         return "stat.crafted";
      } else {
         return var1 == 2 ? "stat.used" : "stat.depleted";
      }
   }
}
