public abstract class aiy extends ah5 {
   private float ri = -1.0F;
   private float rh;

   public aiy(y6 var1) {
      super(var1);
   }

   public abstract aiy a(aiy var1);

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 != null && var2.new == abr.bZ.A && !this.ap.goto) {
         Class var3 = air.a(var2.new());
         if (var3 != null && var3.isAssignableFrom(this.getClass())) {
            aiy var4 = this.a(this);
            if (var4 != null) {
               var4.at(-24000);
               var4.if(this.al, this.ak, this.aj, 0.0F, 0.0F);
               this.ap.new(var4);
               if (var2.g()) {
                  var4.int(var2.void());
               }

               if (!var1.fY.new) {
                  --var2.if;
                  if (var2.if <= 0) {
                     var1.fR.if(var1.fR.aa, (abp)null);
                  }
               }
            }
         }
      }

      return super.for(var1);
   }

   protected void X() {
      super.X();
      this.bg.a(12, new Integer(0));
   }

   public int fr() {
      return this.bg.int(12);
   }

   public void at(int var1) {
      this.bg.if(12, var1);
      this.y(this.bG());
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Age", this.fr());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.at(var1.goto("Age"));
   }

   public void bU() {
      super.bU();
      if (this.ap.goto) {
         this.y(this.bG());
      } else {
         int var1 = this.fr();
         if (var1 < 0) {
            ++var1;
            this.at(var1);
         } else if (var1 > 0) {
            --var1;
            this.at(var1);
         }
      }

   }

   public boolean bG() {
      return this.fr() < 0;
   }

   public void y(boolean var1) {
      this.j(var1 ? 0.5F : 1.0F);
   }

   protected final void if(float var1, float var2) {
      boolean var3 = this.ri > 0.0F;
      this.ri = var1;
      this.rh = var2;
      if (!var3) {
         this.j(1.0F);
      }

   }

   private void j(float var1) {
      super.if(this.ri * var1, this.rh * var1);
   }
}
