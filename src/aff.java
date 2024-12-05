import java.util.List;

public class aff extends afh implements od {
   private boolean sz = true;
   private int sy = -1;

   public aff(y6 var1) {
      super(var1);
   }

   public aff(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public int f3() {
      return 5;
   }

   public pa f6() {
      return pa.f;
   }

   public int fY() {
      return 1;
   }

   public int r() {
      return 5;
   }

   public boolean for(aek var1) {
      if (!this.ap.goto) {
         var1.a(this);
      }

      return true;
   }

   public void a(int var1, int var2, int var3, boolean var4) {
      boolean var5 = !var4;
      if (var5 != this.gn()) {
         this.L(var5);
      }

   }

   public boolean gn() {
      return this.sz;
   }

   public void L(boolean var1) {
      this.sz = var1;
   }

   public y6 b() {
      return this.ap;
   }

   public double gi() {
      return this.al;
   }

   public double gh() {
      return this.ak;
   }

   public double gg() {
      return this.aj;
   }

   public void aC() {
      super.aC();
      if (!this.ap.goto && this.aA() && this.gn()) {
         --this.sy;
         if (!this.gp()) {
            this.aK(0);
            if (this.go()) {
               this.aK(4);
               this.case();
            }
         }
      }

   }

   public boolean go() {
      if (oc.a((od)this)) {
         return true;
      } else {
         List var1 = this.ap.a(afk.class, this.aZ.do(0.25D, 0.0D, 0.25D), aip.if);
         if (var1.size() > 0) {
            oc.a((ajg)this, (afk)((afk)var1.get(0)));
         }

         return false;
      }
   }

   public void if(ai4 var1) {
      super.if(var1);
      this.a(pa.f.void, 1, 0.0F);
   }

   protected void for(aqv var1) {
      super.for(var1);
      var1.a("TransferCooldown", this.sy);
   }

   protected void try(aqv var1) {
      super.try(var1);
      this.sy = var1.goto("TransferCooldown");
   }

   public void aK(int var1) {
      this.sy = var1;
   }

   public boolean gp() {
      return this.sy > 0;
   }
}
