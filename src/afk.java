import java.util.Iterator;

public class afk extends aiw {
   public int dC;
   public int dB;
   private int dD;
   public float dE;

   public afk(y6 var1, double var2, double var4, double var6) {
      super(var1);
      this.dC = 0;
      this.dD = 5;
      this.dE = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.if(0.25F, 0.25F);
      this.aQ = this.aO / 2.0F;
      this.try(var2, var4, var6);
      this.a5 = (float)(Math.random() * 360.0D);
      this.ai = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.ah = 0.20000000298023224D;
      this.ag = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
   }

   public afk(y6 var1, double var2, double var4, double var6, abp var8) {
      this(var1, var2, var4, var6);
      this.try(var8);
   }

   protected boolean aK() {
      return false;
   }

   public afk(y6 var1) {
      super(var1);
      this.dC = 0;
      this.dD = 5;
      this.dE = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.if(0.25F, 0.25F);
      this.aQ = this.aO / 2.0F;
   }

   protected void X() {
      this.ab().a(10, 5);
   }

   public void aC() {
      super.aC();
      if (this.dB > 0) {
         --this.dB;
      }

      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.ah -= 0.03999999910593033D;
      this.aE = this.for(this.al, (this.aZ.a + this.aZ.int) / 2.0D, this.aj);
      this.do(this.ai, this.ah, this.ag);
      boolean var1 = (int)this.ao != (int)this.al || (int)this.an != (int)this.ak || (int)this.am != (int)this.aj;
      if (var1 || this.bl % 25 == 0) {
         if (this.ap.byte(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) == ts.r) {
            this.ah = 0.20000000298023224D;
            this.ai = (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F);
            this.ag = (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F);
            this.a("random.fizz", 0.4F, 2.0F + this.bm.nextFloat() * 0.4F);
         }

         if (!this.ap.goto) {
            this.bb();
         }
      }

      float var2 = 0.98F;
      if (this.aY) {
         var2 = 0.58800006F;
         int var3 = this.ap.new(ajs.a(this.al), ajs.a(this.aZ.a) - 1, ajs.a(this.aj));
         if (var3 > 0) {
            var2 = pa.x[var3].aq * 0.98F;
         }
      }

      this.ai *= (double)var2;
      this.ah *= 0.9800000190734863D;
      this.ag *= (double)var2;
      if (this.aY) {
         this.ah *= -0.5D;
      }

      ++this.dC;
      if (!this.ap.goto && this.dC >= 6000) {
         this.az();
      }

   }

   private void bb() {
      Iterator var1 = this.ap.a(afk.class, this.aZ.do(0.5D, 0.0D, 0.5D)).iterator();

      while(var1.hasNext()) {
         afk var2 = (afk)var1.next();
         this.a(var2);
      }

   }

   public boolean a(afk var1) {
      if (var1 == this) {
         return false;
      } else if (var1.aA() && this.aA()) {
         abp var2 = this.ba();
         abp var3 = var1.ba();
         if (var3.d() != var2.d()) {
            return false;
         } else if (var3.a() ^ var2.a()) {
            return false;
         } else if (var3.a() && !var3.b().equals(var2.b())) {
            return false;
         } else if (var3.d().b() && var3.new() != var2.new()) {
            return false;
         } else if (var3.if < var2.if) {
            return var1.a(this);
         } else if (var3.if + var2.if > var3.h()) {
            return false;
         } else {
            var3.if += var2.if;
            var1.dB = Math.max(var1.dB, this.dB);
            var1.dC = Math.min(var1.dC, this.dC);
            var1.try(var3);
            this.az();
            return true;
         }
      } else {
         return false;
      }
   }

   public void bc() {
      this.dC = 4800;
   }

   public boolean aq() {
      return this.ap.a((nw)this.aZ, (ts)ts.s, (aiw)this);
   }

   protected void d(int var1) {
      this.a(ai4.j, var1);
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else if (this.ba() != null && this.ba().new == abr.br.A && var1.long()) {
         return false;
      } else {
         this.av();
         this.dD -= var2;
         if (this.dD <= 0) {
            this.az();
         }

         return false;
      }
   }

   public void for(aqv var1) {
      var1.a("Health", (short)((byte)this.dD));
      var1.a("Age", (short)this.dC);
      if (this.ba() != null) {
         var1.a("Item", this.ba().if(new aqv()));
      }

   }

   public void try(aqv var1) {
      this.dD = var1.case("Health") & 255;
      this.dC = var1.case("Age");
      aqv var2 = var1.char("Item");
      this.try(abp.for(var2));
      if (this.ba() == null) {
         this.az();
      }

   }

   public void do(aek var1) {
      if (!this.ap.goto) {
         abp var2 = this.ba();
         int var3 = var2.if;
         if (this.dB == 0 && var1.fR.new(var2)) {
            if (var2.new == pa.aM.void) {
               var1.a((akf)akk.m);
            }

            if (var2.new == abr.cs.A) {
               var1.a((akf)akk.case);
            }

            if (var2.new == abr.P.A) {
               var1.a((akf)akk.for);
            }

            if (var2.new == abr.aD.A) {
               var1.a((akf)akk.a);
            }

            ModLoader.if(var1, var2);
            this.a("random.pop", 0.2F, ((this.bm.nextFloat() - this.bm.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.if(this, var3);
            if (var2.if <= 0) {
               this.az();
            }
         }
      }

   }

   public String aB() {
      return aqz.if("item." + this.ba().c());
   }

   public boolean aa() {
      return false;
   }

   public void f(int var1) {
      super.f(var1);
      if (!this.ap.goto) {
         this.bb();
      }

   }

   public abp ba() {
      abp var1 = this.ab().new(10);
      if (var1 == null) {
         if (this.ap != null) {
            this.ap.char().do("Item entity " + this.av + " has no item?!");
         }

         return new abp(pa.k);
      } else {
         return var1;
      }
   }

   public void try(abp var1) {
      this.ab().if(10, var1);
      this.ab().do(10);
   }
}
