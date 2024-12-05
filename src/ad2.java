public class ad2 {
   private int if = 20;
   private float a = 5.0F;
   private float int;
   private int for = 0;
   private int do = 20;

   public void a(int var1, float var2) {
      this.if = Math.min(var1 + this.if, 20);
      this.a = Math.min(this.a + (float)var1 * var2 * 2.0F, (float)this.if);
   }

   public void a(abw var1) {
      this.a(var1.v(), var1.u());
   }

   public void a(f var1) {
      this.a(var1.A(), var1.C());
   }

   public void a(aek var1) {
      int var2 = var1.ap.p;
      this.do = this.if;
      if (this.int > 4.0F) {
         this.int -= 4.0F;
         if (this.a > 0.0F) {
            this.a = Math.max(this.a - 1.0F, 0.0F);
         } else if (var2 > 0) {
            this.if = Math.max(this.if - 1, 0);
         }
      }

      if (this.if >= 18 && var1.cT()) {
         ++this.for;
         if (this.for >= 80) {
            var1.q(1);
            this.for = 0;
         }
      } else if (this.if <= 0) {
         ++this.for;
         if (this.for >= 80) {
            if (var1.cd() > 10 || var2 >= 3 || var1.cd() > 1 && var2 >= 2) {
               var1.a((ai4)ai4.e, 1);
            }

            this.for = 0;
         }
      } else {
         this.for = 0;
      }

   }

   public void if(aqv var1) {
      if (var1.try("foodLevel")) {
         this.if = var1.goto("foodLevel");
         this.for = var1.goto("foodTickTimer");
         this.a = var1.b("foodSaturationLevel");
         this.int = var1.b("foodExhaustionLevel");
      }

   }

   public void a(aqv var1) {
      var1.a("foodLevel", this.if);
      var1.a("foodTickTimer", this.for);
      var1.a("foodSaturationLevel", this.a);
      var1.a("foodExhaustionLevel", this.int);
   }

   public int for() {
      return this.if;
   }

   public int do() {
      return this.do;
   }

   public boolean if() {
      return this.if < 20;
   }

   public void if(float var1) {
      this.int = Math.min(this.int + var1, 40.0F);
   }

   public float a() {
      return this.a;
   }

   public void a(int var1) {
      this.if = var1;
   }

   public void a(float var1) {
      this.a = var1;
   }
}
