public abstract class ah2 extends af9 {
   protected agw rx = new agw(this);

   public ah2(y6 var1) {
      super(var1);
   }

   protected void X() {
      super.X();
      this.bg.a(16, (byte)0);
      this.bg.a(17, "");
   }

   public void for(aqv var1) {
      super.for(var1);
      if (this.fz() == null) {
         var1.a("Owner", "");
      } else {
         var1.a("Owner", this.fz());
      }

      var1.a("Sitting", this.fB());
   }

   public void try(aqv var1) {
      super.try(var1);
      String var2 = var1.new("Owner");
      if (var2.length() > 0) {
         this.w(var2);
         this.C(true);
      }

      this.rx.a(var1.if("Sitting"));
      this.B(var1.if("Sitting"));
   }

   protected void D(boolean var1) {
      String var2 = "heart";
      if (!var1) {
         var2 = "smoke";
      }

      for(int var3 = 0; var3 < 7; ++var3) {
         double var4 = this.bm.nextGaussian() * 0.02D;
         double var6 = this.bm.nextGaussian() * 0.02D;
         double var8 = this.bm.nextGaussian() * 0.02D;
         this.ap.a(var2, this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + 0.5D + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, var4, var6, var8);
      }

   }

   public void a(byte var1) {
      if (var1 == 7) {
         this.D(true);
      } else if (var1 == 6) {
         this.D(false);
      } else {
         super.a(var1);
      }

   }

   public boolean fy() {
      return (this.bg.for(16) & 4) != 0;
   }

   public void C(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 4));
      } else {
         this.bg.if(16, (byte)(var2 & -5));
      }

   }

   public boolean fB() {
      return (this.bg.for(16) & 1) != 0;
   }

   public void B(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 1));
      } else {
         this.bg.if(16, (byte)(var2 & -2));
      }

   }

   public String fz() {
      return this.bg.a(17);
   }

   public void w(String var1) {
      this.bg.if(17, var1);
   }

   public aig fC() {
      return this.ap.if(this.fz());
   }

   public agw fA() {
      return this.rx;
   }
}
