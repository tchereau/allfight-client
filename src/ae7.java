public class ae7 extends ae0 {
   private int qZ;
   private int qY;
   private int qX = 30;
   private int qW = 3;

   public ae7(y6 var1) {
      super(var1);
      this.ft = "/mob/creeper.png";
      this.er.a(1, new aho(this));
      this.er.a(2, new agv(this));
      this.er.a(3, new ahx(this, af4.class, 6.0F, 0.25F, 0.3F));
      this.er.a(4, new ahc(this, 0.25F, false));
      this.er.a(5, new ag0(this, 0.2F));
      this.er.a(6, new ahf(this, aek.class, 8.0F));
      this.er.a(6, new ag1(this));
      this.eq.a(1, new agp(this, aek.class, 16.0F, 0, true));
      this.eq.a(2, new agq(this, false));
   }

   public boolean co() {
      return true;
   }

   public int ak() {
      return this.bB() == null ? 3 : 3 + (this.fi - 1);
   }

   protected void try(float var1) {
      super.try(var1);
      this.qY = (int)((float)this.qY + var1 * 1.5F);
      if (this.qY > this.qX - 5) {
         this.qY = this.qX - 5;
      }

   }

   public int b0() {
      return 20;
   }

   protected void X() {
      super.X();
      this.bg.a(16, -1);
      this.bg.a(17, (byte)0);
   }

   public void for(aqv var1) {
      super.for(var1);
      if (this.bg.for(17) == 1) {
         var1.a("powered", true);
      }

      var1.a("Fuse", (short)this.qX);
      var1.a("ExplosionRadius", (byte)this.qW);
   }

   public void try(aqv var1) {
      super.try(var1);
      this.bg.if(17, (byte)(var1.if("powered") ? 1 : 0));
      if (var1.try("Fuse")) {
         this.qX = var1.case("Fuse");
      }

      if (var1.try("ExplosionRadius")) {
         this.qW = var1.else("ExplosionRadius");
      }

   }

   public void aC() {
      if (this.aA()) {
         this.qZ = this.qY;
         int var1 = this.fo();
         if (var1 > 0 && this.qY == 0) {
            this.a("random.fuse", 1.0F, 0.5F);
         }

         this.qY += var1;
         if (this.qY < 0) {
            this.qY = 0;
         }

         if (this.qY >= this.qX) {
            this.qY = this.qX;
            if (!this.ap.goto) {
               boolean var2 = this.ap.i().a("mobGriefing");
               if (this.fp()) {
                  this.ap.a(this, this.al, this.ak, this.aj, (float)(this.qW * 2), var2);
               } else {
                  this.ap.a(this, this.al, this.ak, this.aj, (float)this.qW, var2);
               }

               this.az();
            }
         }
      }

      super.aC();
   }

   protected String bX() {
      return "mob.creeper.say";
   }

   protected String bS() {
      return "mob.creeper.death";
   }

   public void a(ai4 var1) {
      super.a(var1);
      if (var1.new() instanceof aew) {
         int var2 = abr.ab.A + this.bm.nextInt(abr.C.A - abr.ab.A + 1);
         this.new(var2, 1);
      }

   }

   public boolean long(aiw var1) {
      return true;
   }

   public boolean fp() {
      return this.bg.for(17) == 1;
   }

   public float i(float var1) {
      return ((float)this.qZ + (float)(this.qY - this.qZ) * var1) / (float)(this.qX - 2);
   }

   protected int bI() {
      return abr.aS.A;
   }

   public int fo() {
      return this.bg.for(16);
   }

   public void as(int var1) {
      this.bg.if(16, (byte)var1);
   }

   public void a(afn var1) {
      super.a(var1);
      this.bg.if(17, (byte)1);
   }
}
