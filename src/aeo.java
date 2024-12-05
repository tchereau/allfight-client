public class aeo {
   public boolean if = false;
   public boolean a = false;
   public boolean try = false;
   public boolean new = false;
   public boolean int = true;
   private float for = 0.05F;
   private float do = 0.1F;

   public void if(aqv var1) {
      aqv var2 = new aqv();
      var2.a("invulnerable", this.if);
      var2.a("flying", this.a);
      var2.a("mayfly", this.try);
      var2.a("instabuild", this.new);
      var2.a("mayBuild", this.int);
      var2.a("flySpeed", this.for);
      var2.a("walkSpeed", this.do);
      var1.a("abilities", (aqd)var2);
   }

   public void a(aqv var1) {
      if (var1.try("abilities")) {
         aqv var2 = var1.char("abilities");
         this.if = var2.if("invulnerable");
         this.a = var2.if("flying");
         this.try = var2.if("mayfly");
         this.new = var2.if("instabuild");
         if (var2.try("flySpeed")) {
            this.for = var2.b("flySpeed");
            this.do = var2.b("walkSpeed");
         }

         if (var2.try("mayBuild")) {
            this.int = var2.if("mayBuild");
         }
      }

   }

   public float a() {
      return this.for;
   }

   public void a(float var1) {
      this.for = var1;
   }

   public float if() {
      return this.do;
   }

   public void if(float var1) {
      this.do = var1;
   }
}
