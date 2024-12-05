import java.util.Iterator;
import java.util.List;

public abstract class aii extends aiw {
   private int rZ;
   public int rY;
   public int rX;
   public int r1;
   public int r0;

   public aii(y6 var1) {
      super(var1);
      this.rZ = 0;
      this.rY = 0;
      this.aQ = 0.0F;
      this.if(0.5F, 0.5F);
   }

   public aii(y6 var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.rX = var2;
      this.r1 = var3;
      this.r0 = var4;
   }

   protected void X() {
   }

   public void aA(int var1) {
      this.rY = var1;
      this.a2 = this.a5 = (float)(var1 * 90);
      float var2 = (float)this.fQ();
      float var3 = (float)this.fR();
      float var4 = (float)this.fQ();
      if (var1 != 2 && var1 != 0) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
         this.a5 = this.a2 = (float)(apk.for[var1] * 90);
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.rX + 0.5F;
      float var6 = (float)this.r1 + 0.5F;
      float var7 = (float)this.r0 + 0.5F;
      float var8 = 0.5625F;
      if (var1 == 2) {
         var7 -= var8;
      }

      if (var1 == 1) {
         var5 -= var8;
      }

      if (var1 == 0) {
         var7 += var8;
      }

      if (var1 == 3) {
         var5 += var8;
      }

      if (var1 == 2) {
         var5 -= this.az(this.fQ());
      }

      if (var1 == 1) {
         var7 += this.az(this.fQ());
      }

      if (var1 == 0) {
         var5 += this.az(this.fQ());
      }

      if (var1 == 3) {
         var7 -= this.az(this.fQ());
      }

      var6 += this.az(this.fR());
      this.try((double)var5, (double)var6, (double)var7);
      float var9 = -0.03125F;
      this.aZ.a((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float az(int var1) {
      if (var1 == 32) {
         return 0.5F;
      } else {
         return var1 == 64 ? 0.5F : 0.0F;
      }
   }

   public void aC() {
      if (this.rZ++ == 100 && !this.ap.goto) {
         this.rZ = 0;
         if (!this.aR && !this.fT()) {
            this.az();
            this.fS();
         }
      }

   }

   public boolean fT() {
      if (!this.ap.if((aiw)this, (nw)this.aZ).isEmpty()) {
         return false;
      } else {
         int var1 = Math.max(1, this.fQ() / 16);
         int var2 = Math.max(1, this.fR() / 16);
         int var3 = this.rX;
         int var4 = this.r1;
         int var5 = this.r0;
         if (this.rY == 2) {
            var3 = ajs.a(this.al - (double)((float)this.fQ() / 32.0F));
         }

         if (this.rY == 1) {
            var5 = ajs.a(this.aj - (double)((float)this.fQ() / 32.0F));
         }

         if (this.rY == 0) {
            var3 = ajs.a(this.al - (double)((float)this.fQ() / 32.0F));
         }

         if (this.rY == 3) {
            var5 = ajs.a(this.aj - (double)((float)this.fQ() / 32.0F));
         }

         var4 = ajs.a(this.ak - (double)((float)this.fR() / 32.0F));

         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 0; var7 < var2; ++var7) {
               ts var8;
               if (this.rY != 2 && this.rY != 0) {
                  var8 = this.ap.byte(this.rX, var4 + var7, var5 + var6);
               } else {
                  var8 = this.ap.byte(var3 + var6, var4 + var7, this.r0);
               }

               if (!var8.for()) {
                  return false;
               }
            }
         }

         List var9 = this.ap.a((aiw)this, (nw)this.aZ);
         Iterator var10 = var9.iterator();

         aiw var11;
         do {
            if (!var10.hasNext()) {
               return true;
            }

            var11 = (aiw)var10.next();
         } while(!(var11 instanceof aii));

         return false;
      }
   }

   public boolean aw() {
      return true;
   }

   public boolean new(aiw var1) {
      return var1 instanceof aek ? this.a(ai4.a((aek)var1), 0) : false;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         if (!this.aR && !this.ap.goto) {
            this.az();
            this.av();
            aek var3 = null;
            if (var1.new() instanceof aek) {
               var3 = (aek)var1.new();
            }

            if (var3 != null && var3.fY.new) {
               return true;
            }

            this.fS();
         }

         return true;
      }
   }

   public void do(double var1, double var3, double var5) {
      if (!this.ap.goto && !this.aR && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.az();
         this.fS();
      }

   }

   public void byte(double var1, double var3, double var5) {
      if (!this.ap.goto && !this.aR && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.az();
         this.fS();
      }

   }

   public void for(aqv var1) {
      var1.a("Direction", (byte)this.rY);
      var1.a("TileX", this.rX);
      var1.a("TileY", this.r1);
      var1.a("TileZ", this.r0);
      switch(this.rY) {
      case 0:
         var1.a("Dir", (byte)2);
         break;
      case 1:
         var1.a("Dir", (byte)1);
         break;
      case 2:
         var1.a("Dir", (byte)0);
         break;
      case 3:
         var1.a("Dir", (byte)3);
      }

   }

   public void try(aqv var1) {
      if (var1.try("Direction")) {
         this.rY = var1.else("Direction");
      } else {
         switch(var1.else("Dir")) {
         case 0:
            this.rY = 2;
            break;
         case 1:
            this.rY = 1;
            break;
         case 2:
            this.rY = 0;
            break;
         case 3:
            this.rY = 3;
         }
      }

      this.rX = var1.goto("TileX");
      this.r1 = var1.goto("TileY");
      this.r0 = var1.goto("TileZ");
      this.aA(this.rY);
   }

   public abstract int fQ();

   public abstract int fR();

   public abstract void fS();
}
