import java.util.Random;

public class af2 extends af9 {
   private final adt rn = new adt(new af1(this), 2, 1);
   public static final float[][] ro = new float[][]{{1.0F, 1.0F, 1.0F}, {0.85F, 0.5F, 0.2F}, {0.7F, 0.3F, 0.85F}, {0.4F, 0.6F, 0.85F}, {0.9F, 0.9F, 0.2F}, {0.5F, 0.8F, 0.1F}, {0.95F, 0.5F, 0.65F}, {0.3F, 0.3F, 0.3F}, {0.6F, 0.6F, 0.6F}, {0.3F, 0.5F, 0.6F}, {0.5F, 0.25F, 0.7F}, {0.2F, 0.3F, 0.7F}, {0.4F, 0.3F, 0.2F}, {0.4F, 0.5F, 0.2F}, {0.6F, 0.2F, 0.2F}, {0.1F, 0.1F, 0.1F}};
   private int rm;
   private ahq rl = new ahq(this);

   public af2(y6 var1) {
      super(var1);
      this.ft = "/mob/sheep.png";
      this.if(0.9F, 1.3F);
      float var2 = 0.23F;
      this.bl().for(true);
      this.er.a(0, new aho(this));
      this.er.a(1, new ag3(this, 0.38F));
      this.er.a(2, new aht(this, var2));
      this.er.a(3, new agt(this, 0.25F, abr.aE.A, false));
      this.er.a(4, new ahl(this, 0.25F));
      this.er.a(5, this.rl);
      this.er.a(6, new ag0(this, var2));
      this.er.a(7, new ahf(this, aek.class, 6.0F));
      this.er.a(8, new ag1(this));
      this.rn.if(0, new abp(abr.b9, 1, 0));
      this.rn.if(1, new abp(abr.b9, 1, 0));
   }

   protected boolean co() {
      return true;
   }

   protected void bQ() {
      this.rm = this.rl.void();
      super.bQ();
   }

   public void bU() {
      if (this.ap.goto) {
         this.rm = Math.max(0, this.rm - 1);
      }

      super.bU();
   }

   public int b0() {
      return 8;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)0));
   }

   protected void a(boolean var1, int var2) {
      if (!this.fu()) {
         this.a(new abp(pa.bV.void, 1, this.fv()), 0.0F);
      }

   }

   protected int bI() {
      return pa.bV.void;
   }

   public void a(byte var1) {
      if (var1 == 10) {
         this.rm = 40;
      } else {
         super.a(var1);
      }

   }

   public float l(float var1) {
      if (this.rm <= 0) {
         return 0.0F;
      } else if (this.rm >= 4 && this.rm <= 36) {
         return 1.0F;
      } else {
         return this.rm < 4 ? ((float)this.rm - var1) / 4.0F : -((float)(this.rm - 40) - var1) / 4.0F;
      }
   }

   public float k(float var1) {
      if (this.rm > 4 && this.rm <= 36) {
         float var2 = ((float)(this.rm - 4) - var1) / 32.0F;
         return 0.62831855F + 0.21991149F * ajs.try(var2 * 28.7F);
      } else {
         return this.rm > 0 ? 0.62831855F : this.a4 / 57.295776F;
      }
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 != null && var2.new == abr.aX.A && !this.fu() && !this.bG()) {
         if (!this.ap.goto) {
            this.z(true);
            int var3 = 1 + this.bm.nextInt(3);

            for(int var4 = 0; var4 < var3; ++var4) {
               afk var5 = this.a(new abp(pa.bV.void, 1, this.fv()), 1.0F);
               var5.ah += (double)(this.bm.nextFloat() * 0.05F);
               var5.ai += (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.1F);
               var5.ag += (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.1F);
            }
         }

         var2.a(1, (aig)var1);
         this.a("mob.sheep.shear", 1.0F, 1.0F);
      }

      return super.for(var1);
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Sheared", this.fu());
      var1.a("Color", (byte)this.fv());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.z(var1.if("Sheared"));
      this.au(var1.else("Color"));
   }

   protected String b2() {
      return "mob.sheep.say";
   }

   protected String bX() {
      return "mob.sheep.say";
   }

   protected String bS() {
      return "mob.sheep.say";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.sheep.step", 0.15F, 1.0F);
   }

   public int fv() {
      return this.bg.for(16) & 15;
   }

   public void au(int var1) {
      byte var2 = this.bg.for(16);
      this.bg.if(16, (byte)(var2 & 240 | var1 & 15));
   }

   public boolean fu() {
      return (this.bg.for(16) & 16) != 0;
   }

   public void z(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 16));
      } else {
         this.bg.if(16, (byte)(var2 & -17));
      }

   }

   public static int a(Random var0) {
      int var1 = var0.nextInt(100);
      if (var1 < 5) {
         return 15;
      } else if (var1 < 10) {
         return 7;
      } else if (var1 < 15) {
         return 8;
      } else if (var1 < 18) {
         return 12;
      } else {
         return var0.nextInt(500) == 0 ? 6 : 0;
      }
   }

   public af2 if(aiy var1) {
      af2 var2 = (af2)var1;
      af2 var3 = new af2(this.ap);
      int var4 = this.a(this, var2);
      var3.au(15 - var4);
      return var3;
   }

   public void cp() {
      this.z(false);
      if (this.bG()) {
         int var1 = this.fr() + 1200;
         if (var1 > 0) {
            var1 = 0;
         }

         this.at(var1);
      }

   }

   public void bO() {
      this.au(a(this.ap.o));
   }

   private int a(af9 var1, af9 var2) {
      int var3 = this.do(var1);
      int var4 = this.do(var2);
      this.rn.do(0).do(var3);
      this.rn.do(1).do(var4);
      abp var5 = aai.if().a(this.rn, ((af2)var1).ap);
      int var6;
      if (var5 != null && var5.d().A == abr.b9.A) {
         var6 = var5.new();
      } else {
         var6 = this.ap.o.nextBoolean() ? var3 : var4;
      }

      return var6;
   }

   private int do(af9 var1) {
      return 15 - ((af2)var1).fv();
   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.if(var1);
   }
}
