public class agy extends ahk {
   private ah5 m;
   private agg l;

   public agy(ah5 var1) {
      this.m = var1;
   }

   public boolean do() {
      if (this.m.ap.j()) {
         return false;
      } else {
         agf var1 = this.m.ap.g.a(ajs.a(this.m.al), ajs.a(this.m.ak), ajs.a(this.m.aj), 16);
         if (var1 == null) {
            return false;
         } else {
            this.l = var1.if(ajs.a(this.m.al), ajs.a(this.m.ak), ajs.a(this.m.aj));
            if (this.l == null) {
               return false;
            } else {
               return (double)this.l.if(ajs.a(this.m.al), ajs.a(this.m.ak), ajs.a(this.m.aj)) < 2.25D;
            }
         }
      }
   }

   public boolean try() {
      if (this.m.ap.j()) {
         return false;
      } else {
         return !this.l.for && this.l.a(ajs.a(this.m.al), ajs.a(this.m.aj));
      }
   }

   public void a() {
      this.m.bl().if(false);
      this.m.bl().int(false);
   }

   public void new() {
      this.m.bl().if(true);
      this.m.bl().int(true);
      this.l = null;
   }

   public void int() {
      this.l.a();
   }
}
