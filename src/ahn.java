public class ahn extends ahk {
   private ah2 a7;
   private aig a6;
   y6 ba;
   private float a5;
   private agj a4;
   private int a3;
   float a9;
   float a8;
   private boolean a2;

   public ahn(ah2 var1, float var2, float var3, float var4) {
      this.a7 = var1;
      this.ba = var1.ap;
      this.a5 = var2;
      this.a4 = var1.bl();
      this.a8 = var3;
      this.a9 = var4;
      this.a(3);
   }

   public boolean do() {
      aig var1 = this.a7.fC();
      if (var1 == null) {
         return false;
      } else if (this.a7.fB()) {
         return false;
      } else if (this.a7.for(var1) < (double)(this.a8 * this.a8)) {
         return false;
      } else {
         this.a6 = var1;
         return true;
      }
   }

   public boolean try() {
      return !this.a4.new() && this.a7.for(this.a6) > (double)(this.a9 * this.a9) && !this.a7.fB();
   }

   public void a() {
      this.a3 = 0;
      this.a2 = this.a7.bl().char();
      this.a7.bl().for(false);
   }

   public void new() {
      this.a6 = null;
      this.a4.case();
      this.a7.bl().for(this.a2);
   }

   public void int() {
      this.a7.b9().a(this.a6, 10.0F, (float)this.a7.bJ());
      if (!this.a7.fB()) {
         if (--this.a3 <= 0) {
            this.a3 = 10;
            if (!this.a4.a(this.a6, this.a5)) {
               if (!(this.a7.for(this.a6) < 144.0D)) {
                  int var1 = ajs.a(this.a6.al) - 2;
                  int var2 = ajs.a(this.a6.aj) - 2;
                  int var3 = ajs.a(this.a6.aZ.a);

                  for(int var4 = 0; var4 <= 4; ++var4) {
                     for(int var5 = 0; var5 <= 4; ++var5) {
                        if ((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && this.ba.case(var1 + var4, var3 - 1, var2 + var5) && !this.ba.try(var1 + var4, var3, var2 + var5) && !this.ba.try(var1 + var4, var3 + 1, var2 + var5)) {
                           this.a7.if((double)((float)(var1 + var4) + 0.5F), (double)var3, (double)((float)(var2 + var5) + 0.5F), this.a7.a5, this.a7.a4);
                           this.a4.case();
                           return;
                        }
                     }
                  }

               }
            }
         }
      }
   }
}
