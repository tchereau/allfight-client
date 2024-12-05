public class afs extends aiw {
   public int d3;
   public int d2;

   public afs(y6 var1) {
      super(var1);
      this.d3 = 0;
      this.at = true;
      this.if(2.0F, 2.0F);
      this.aQ = this.aO / 2.0F;
      this.d2 = 5;
      this.d3 = this.bm.nextInt(100000);
   }

   public afs(y6 var1, double var2, double var4, double var6) {
      this(var1);
      this.try(var2, var4, var6);
   }

   protected boolean aK() {
      return false;
   }

   protected void X() {
      this.bg.a(8, this.d2);
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      ++this.d3;
      this.bg.if(8, this.d2);
      int var1 = ajs.a(this.al);
      int var2 = ajs.a(this.ak);
      int var3 = ajs.a(this.aj);
      if (this.ap.new(var1, var2, var3) != pa.bo.void) {
         this.ap.int(var1, var2, var3, pa.bo.void);
      }

   }

   protected void for(aqv var1) {
   }

   protected void try(aqv var1) {
   }

   public float aH() {
      return 0.0F;
   }

   public boolean aw() {
      return true;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         if (!this.aR && !this.ap.goto) {
            this.d2 = 0;
            if (this.d2 <= 0) {
               this.az();
               if (!this.ap.goto) {
                  this.ap.a((aiw)null, this.al, this.ak, this.aj, 6.0F, true);
               }
            }
         }

         return true;
      }
   }
}
