import java.util.ArrayList;
import java.util.Iterator;

public class afl extends aiw {
   public int dN;
   public int dM;
   public int dL;
   public boolean dK;
   private boolean dI;
   private boolean dH;
   private int dG;
   private float dF;
   public aqv dJ;

   public afl(y6 var1) {
      super(var1);
      this.dL = 0;
      this.dK = true;
      this.dI = false;
      this.dH = false;
      this.dG = 40;
      this.dF = 2.0F;
      this.dJ = null;
   }

   public afl(y6 var1, double var2, double var4, double var6, int var8) {
      this(var1, var2, var4, var6, var8, 0);
   }

   public afl(y6 var1, double var2, double var4, double var6, int var8, int var9) {
      super(var1);
      this.dL = 0;
      this.dK = true;
      this.dI = false;
      this.dH = false;
      this.dG = 40;
      this.dF = 2.0F;
      this.dJ = null;
      this.dN = var8;
      this.dM = var9;
      this.at = true;
      this.if(0.98F, 0.98F);
      this.aQ = this.aO / 2.0F;
      this.try(var2, var4, var6);
      this.ai = 0.0D;
      this.ah = 0.0D;
      this.ag = 0.0D;
      this.ao = var2;
      this.an = var4;
      this.am = var6;
   }

   protected boolean aK() {
      return false;
   }

   protected void X() {
   }

   public boolean aw() {
      return !this.aR;
   }

   public void aC() {
      if (this.dN == 0) {
         this.az();
      } else {
         this.ao = this.al;
         this.an = this.ak;
         this.am = this.aj;
         ++this.dL;
         this.ah -= 0.03999999910593033D;
         this.do(this.ai, this.ah, this.ag);
         this.ai *= 0.9800000190734863D;
         this.ah *= 0.9800000190734863D;
         this.ag *= 0.9800000190734863D;
         if (!this.ap.goto) {
            int var1 = ajs.a(this.al);
            int var2 = ajs.a(this.ak);
            int var3 = ajs.a(this.aj);
            if (this.dL == 1) {
               if (this.ap.new(var1, var2, var3) != this.dN) {
                  this.az();
                  return;
               }

               this.ap.o(var1, var2, var3);
            }

            if (this.aY) {
               this.ai *= 0.699999988079071D;
               this.ag *= 0.699999988079071D;
               this.ah *= -0.5D;
               if (this.ap.new(var1, var2, var3) != pa.bT.void) {
                  this.az();
                  if (!this.dI && this.ap.a(this.dN, var1, var2, var3, true, 1, (aiw)null, (abp)null) && !qy.v(this.ap, var1, var2 - 1, var3) && this.ap.int(var1, var2, var3, this.dN, this.dM, 3)) {
                     if (pa.x[this.dN] instanceof qy) {
                        ((qy)pa.x[this.dN]).d(this.ap, var1, var2, var3, this.dM);
                     }

                     if (this.dJ != null && pa.x[this.dN] instanceof rb) {
                        n4 var4 = this.ap.if(var1, var2, var3);
                        if (var4 != null) {
                           aqv var5 = new aqv();
                           var4.do(var5);
                           Iterator var6 = this.dJ.new().iterator();

                           while(var6.hasNext()) {
                              aqd var7 = (aqd)var6.next();
                              if (!var7.if().equals("x") && !var7.if().equals("y") && !var7.if().equals("z")) {
                                 var5.a(var7.if(), var7.do());
                              }
                           }

                           var4.a(var5);
                           var4.case();
                        }
                     }
                  } else if (this.dK && !this.dI) {
                     this.a(new abp(this.dN, 1, pa.x[this.dN].for(this.dM)), 0.0F);
                  }
               }
            } else if (this.dL > 100 && !this.ap.goto && (var2 < 1 || var2 > 256) || this.dL > 600) {
               if (this.dK) {
                  this.a(new abp(this.dN, 1, pa.x[this.dN].for(this.dM)), 0.0F);
               }

               this.az();
            }
         }

      }
   }

   protected void try(float var1) {
      if (this.dH) {
         int var2 = ajs.a(var1 - 1.0F);
         if (var2 > 0) {
            ArrayList var3 = new ArrayList(this.ap.a((aiw)this, (nw)this.aZ));
            ai4 var4 = this.dN == pa.y.void ? ai4.else : ai4.char;
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               aiw var6 = (aiw)var5.next();
               var6.a(var4, Math.min(ajs.new((float)var2 * this.dF), this.dG));
            }

            if (this.dN == pa.y.void && (double)this.bm.nextFloat() < 0.05000000074505806D + (double)var2 * 0.05D) {
               int var7 = this.dM >> 2;
               int var8 = this.dM & 3;
               ++var7;
               if (var7 > 2) {
                  this.dI = true;
               } else {
                  this.dM = var8 | var7 << 2;
               }
            }
         }
      }

   }

   protected void for(aqv var1) {
      var1.a("Tile", (byte)this.dN);
      var1.a("TileID", this.dN);
      var1.a("Data", (byte)this.dM);
      var1.a("Time", (byte)this.dL);
      var1.a("DropItem", this.dK);
      var1.a("HurtEntities", this.dH);
      var1.a("FallHurtAmount", this.dF);
      var1.a("FallHurtMax", this.dG);
      if (this.dJ != null) {
         var1.a("TileEntityData", this.dJ);
      }

   }

   protected void try(aqv var1) {
      if (var1.try("TileID")) {
         this.dN = var1.goto("TileID");
      } else {
         this.dN = var1.else("Tile") & 255;
      }

      this.dM = var1.else("Data") & 255;
      this.dL = var1.else("Time") & 255;
      if (var1.try("HurtEntities")) {
         this.dH = var1.if("HurtEntities");
         this.dF = var1.b("FallHurtAmount");
         this.dG = var1.goto("FallHurtMax");
      } else if (this.dN == pa.y.void) {
         this.dH = true;
      }

      if (var1.try("DropItem")) {
         this.dK = var1.if("DropItem");
      }

      if (var1.try("TileEntityData")) {
         this.dJ = var1.char("TileEntityData");
      }

      if (this.dN == 0) {
         this.dN = pa.a1.void;
      }

   }

   public float aH() {
      return 0.0F;
   }

   public y6 bd() {
      return this.ap;
   }

   public void long(boolean var1) {
      this.dH = var1;
   }

   public boolean aj() {
      return false;
   }

   public void if(apu var1) {
      super.if(var1);
      var1.a((String)"Immitating block ID", (Object)this.dN);
      var1.a((String)"Immitating block data", (Object)this.dM);
   }
}
