import java.util.List;

public class aez extends aes {
   private int qh = 0;
   private int qg = 0;

   public aez(y6 var1) {
      super(var1);
      this.ft = "/mob/pigzombie.png";
      this.e2 = 0.5F;
      this.bh = true;
   }

   protected boolean co() {
      return false;
   }

   public void aC() {
      this.e2 = this.pZ != null ? 0.95F : 0.5F;
      if (this.qg > 0 && --this.qg == 0) {
         this.a("mob.zombiepig.zpigangry", this.bR() * 2.0F, ((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.aC();
   }

   public String W() {
      return "/mob/pigzombie.png";
   }

   public boolean bj() {
      return this.ap.p > 0 && this.ap.int(this.aZ) && this.ap.if((aiw)this, (nw)this.aZ).isEmpty() && !this.ap.do(this.aZ);
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Anger", (short)this.qh);
   }

   public void try(aqv var1) {
      super.try(var1);
      this.qh = var1.case("Anger");
   }

   protected aiw eM() {
      return this.qh == 0 ? null : super.eM();
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         aiw var3 = var1.new();
         if (var3 instanceof aek) {
            List var4 = this.ap.a((aiw)this, (nw)this.aZ.do(32.0D, 32.0D, 32.0D));

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               aiw var6 = (aiw)var4.get(var5);
               if (var6 instanceof aez) {
                  aez var7 = (aez)var6;
                  var7.i(var3);
               }
            }

            this.i(var3);
         }

         return super.a(var1, var2);
      }
   }

   private void i(aiw var1) {
      this.pZ = var1;
      this.qh = 400 + this.bm.nextInt(400);
      this.qg = this.bm.nextInt(40);
   }

   protected String b2() {
      return "mob.zombiepig.zpig";
   }

   protected String bX() {
      return "mob.zombiepig.zpighurt";
   }

   protected String bS() {
      return "mob.zombiepig.zpigdeath";
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(2 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.new(abr.aH.A, 1);
      }

      var3 = this.bm.nextInt(2 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.new(abr.az.A, 1);
      }

   }

   public boolean for(aek var1) {
      return false;
   }

   protected void u(int var1) {
      this.new(abr.L.A, 1);
   }

   protected int bI() {
      return abr.aH.A;
   }

   protected void bk() {
      this.do(0, new abp(abr.a4));
   }

   public void bO() {
      super.bO();
      this.q(false);
   }

   public int h(aiw var1) {
      abp var2 = this.bW();
      int var3 = 5;
      if (var2 != null) {
         var3 += var2.a((aiw)this);
      }

      return var3;
   }
}
