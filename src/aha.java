import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aha extends ahk {
   private ah5 ar;
   private float aq;
   private s5 av;
   private agg au;
   private boolean at;
   private List as = new ArrayList();

   public aha(ah5 var1, float var2, boolean var3) {
      this.ar = var1;
      this.aq = var2;
      this.at = var3;
      this.a(1);
   }

   public boolean do() {
      this.char();
      if (this.at && this.ar.ap.j()) {
         return false;
      } else {
         agf var1 = this.ar.ap.g.a(ajs.a(this.ar.al), ajs.a(this.ar.ak), ajs.a(this.ar.aj), 0);
         if (var1 == null) {
            return false;
         } else {
            this.au = this.a(var1);
            if (this.au == null) {
               return false;
            } else {
               boolean var2 = this.ar.bl().goto();
               this.ar.bl().if(false);
               this.av = this.ar.bl().a((double)this.au.if, (double)this.au.a, (double)this.au.byte);
               this.ar.bl().if(var2);
               if (this.av != null) {
                  return true;
               } else {
                  nr var3 = agh.if(this.ar, 10, 7, this.ar.ap.do().a((double)this.au.if, (double)this.au.a, (double)this.au.byte));
                  if (var3 == null) {
                     return false;
                  } else {
                     this.ar.bl().if(false);
                     this.av = this.ar.bl().a(var3.int, var3.for, var3.do);
                     this.ar.bl().if(var2);
                     return this.av != null;
                  }
               }
            }
         }
      }
   }

   public boolean try() {
      if (this.ar.bl().new()) {
         return false;
      } else {
         float var1 = this.ar.aP + 4.0F;
         return this.ar.if((double)this.au.if, (double)this.au.a, (double)this.au.byte) > (double)(var1 * var1);
      }
   }

   public void a() {
      this.ar.bl().a(this.av, this.aq);
   }

   public void new() {
      if (this.ar.bl().new() || this.ar.if((double)this.au.if, (double)this.au.a, (double)this.au.byte) < 16.0D) {
         this.as.add(this.au);
      }

   }

   private agg a(agf var1) {
      agg var2 = null;
      int var3 = Integer.MAX_VALUE;
      List var4 = var1.for();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         agg var6 = (agg)var5.next();
         int var7 = var6.a(ajs.a(this.ar.al), ajs.a(this.ar.ak), ajs.a(this.ar.aj));
         if (var7 < var3 && !this.a(var6)) {
            var2 = var6;
            var3 = var7;
         }
      }

      return var2;
   }

   private boolean a(agg var1) {
      Iterator var2 = this.as.iterator();

      agg var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (agg)var2.next();
      } while(var1.if != var3.if || var1.a != var3.a || var1.byte != var3.byte);

      return true;
   }

   private void char() {
      if (this.as.size() > 15) {
         this.as.remove(0);
      }

   }
}
