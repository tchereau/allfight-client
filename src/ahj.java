import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ahj {
   private List if = new ArrayList();
   private List a = new ArrayList();
   private final ajq int;
   private int for = 0;
   private int do = 3;

   public ahj(ajq var1) {
      this.int = var1;
   }

   public void a(int var1, ahk var2) {
      this.if.add(new ahi(this, var1, var2));
   }

   public void a(ahk var1) {
      Iterator var2 = this.if.iterator();

      while(var2.hasNext()) {
         ahi var3 = (ahi)var2.next();
         ahk var4 = var3.if;
         if (var4 == var1) {
            if (this.a.contains(var3)) {
               var4.new();
               this.a.remove(var3);
            }

            var2.remove();
         }
      }

   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2;
      ahi var3;
      if (this.for++ % this.do == 0) {
         var2 = this.if.iterator();

         label59:
         while(true) {
            while(true) {
               if (!var2.hasNext()) {
                  break label59;
               }

               var3 = (ahi)var2.next();
               boolean var4 = this.a.contains(var3);
               if (!var4) {
                  break;
               }

               if (!this.a(var3) || !this.if(var3)) {
                  var3.if.new();
                  this.a.remove(var3);
                  break;
               }
            }

            if (this.a(var3) && var3.if.do()) {
               var1.add(var3);
               this.a.add(var3);
            }
         }
      } else {
         var2 = this.a.iterator();

         while(var2.hasNext()) {
            var3 = (ahi)var2.next();
            if (!var3.if.try()) {
               var3.if.new();
               var2.remove();
            }
         }
      }

      this.int.a("goalStart");
      var2 = var1.iterator();

      while(var2.hasNext()) {
         var3 = (ahi)var2.next();
         this.int.a(var3.if.getClass().getSimpleName());
         var3.if.a();
         this.int.if();
      }

      this.int.if();
      this.int.a("goalTick");
      var2 = this.a.iterator();

      while(var2.hasNext()) {
         var3 = (ahi)var2.next();
         var3.if.int();
      }

      this.int.if();
   }

   private boolean if(ahi var1) {
      this.int.a("canContinue");
      boolean var2 = var1.if.try();
      this.int.if();
      return var2;
   }

   private boolean a(ahi var1) {
      this.int.a("canUse");
      Iterator var2 = this.if.iterator();

      while(var2.hasNext()) {
         ahi var3 = (ahi)var2.next();
         if (var3 != var1) {
            if (var1.a >= var3.a) {
               if (this.a.contains(var3) && !this.a(var1, var3)) {
                  this.int.if();
                  return false;
               }
            } else if (this.a.contains(var3) && !var3.if.if()) {
               this.int.if();
               return false;
            }
         }
      }

      this.int.if();
      return true;
   }

   private boolean a(ahi var1, ahi var2) {
      return (var1.if.for() & var2.if.for()) == 0;
   }
}
