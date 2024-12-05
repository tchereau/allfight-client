public class ae9 extends ae0 {
   private float q2 = 0.5F;
   private int q1;
   private int q0;

   public ae9(y6 var1) {
      super(var1);
      this.ft = "/mob/fire.png";
      this.bh = true;
      this.eB = 10;
   }

   public int b0() {
      return 20;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)0));
   }

   protected String b2() {
      return "mob.blaze.breathe";
   }

   protected String bX() {
      return "mob.blaze.hit";
   }

   protected String bS() {
      return "mob.blaze.death";
   }

   public int new(float var1) {
      return 15728880;
   }

   public float int(float var1) {
      return 1.0F;
   }

   public void bU() {
      if (!this.ap.goto) {
         if (this.ao()) {
            this.a(ai4.f, 1);
         }

         --this.q1;
         if (this.q1 <= 0) {
            this.q1 = 100;
            this.q2 = 0.5F + (float)this.bm.nextGaussian() * 3.0F;
         }

         if (this.eO() != null && this.eO().ak + (double)this.eO().af() > this.ak + (double)this.af() + (double)this.q2) {
            this.ah += (0.30000001192092896D - this.ah) * 0.30000001192092896D;
         }
      }

      if (this.bm.nextInt(24) == 0) {
         this.ap.a(this.al + 0.5D, this.ak + 0.5D, this.aj + 0.5D, "fire.fire", 1.0F + this.bm.nextFloat(), this.bm.nextFloat() * 0.7F + 0.3F);
      }

      if (!this.aY && this.ah < 0.0D) {
         this.ah *= 0.6D;
      }

      for(int var1 = 0; var1 < 2; ++var1) {
         this.ap.a("largesmoke", this.al + (this.bm.nextDouble() - 0.5D) * (double)this.aP, this.ak + this.bm.nextDouble() * (double)this.aO, this.aj + (this.bm.nextDouble() - 0.5D) * (double)this.aP, 0.0D, 0.0D, 0.0D);
      }

      super.bU();
   }

   protected void a(aiw var1, float var2) {
      if (this.eF <= 0 && var2 < 2.0F && var1.aZ.int > this.aZ.a && var1.aZ.a < this.aZ.int) {
         this.eF = 20;
         this.long(var1);
      } else if (var2 < 30.0F) {
         double var3 = var1.al - this.al;
         double var5 = var1.aZ.a + (double)(var1.aO / 2.0F) - (this.ak + (double)(this.aO / 2.0F));
         double var7 = var1.aj - this.aj;
         if (this.eF == 0) {
            ++this.q0;
            if (this.q0 == 1) {
               this.eF = 60;
               this.x(true);
            } else if (this.q0 <= 4) {
               this.eF = 6;
            } else {
               this.eF = 100;
               this.q0 = 0;
               this.x(false);
            }

            if (this.q0 > 1) {
               float var9 = ajs.if(var2) * 0.5F;
               this.ap.a((aek)null, 1009, (int)this.al, (int)this.ak, (int)this.aj, 0);

               for(int var10 = 0; var10 < 1; ++var10) {
                  aeb var11 = new aeb(this.ap, this, var3 + this.bm.nextGaussian() * (double)var9, var5, var7 + this.bm.nextGaussian() * (double)var9);
                  var11.ak = this.ak + (double)(this.aO / 2.0F) + 0.5D;
                  this.ap.new(var11);
               }
            }
         }

         this.a5 = (float)(Math.atan2(var7, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.pW = true;
      }

   }

   protected void try(float var1) {
   }

   protected int bI() {
      return abr.aD.A;
   }

   public boolean aP() {
      return this.fq();
   }

   protected void a(boolean var1, int var2) {
      if (var1) {
         int var3 = this.bm.nextInt(2 + var2);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.new(abr.aD.A, 1);
         }
      }

   }

   public boolean fq() {
      return (this.bg.for(16) & 1) != 0;
   }

   public void x(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.bg.if(16, var2);
   }

   protected boolean eZ() {
      return true;
   }

   public int h(aiw var1) {
      return 6;
   }
}
