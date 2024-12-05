public class i7 extends i5 implements ajo {
   private String l6 = "";
   private String l5 = "";
   private int l8 = 0;
   private boolean l7;

   public void l(String var1) {
      this.m(var1);
   }

   public void m(String var1) {
      this.l6 = var1;
      this.n("Working...");
   }

   public void n(String var1) {
      this.l5 = var1;
      this.ac(0);
   }

   public void ac(int var1) {
      this.l8 = var1;
   }

   public void d6() {
      this.l7 = true;
   }

   public void if(int var1, int var2, float var3) {
      if (this.l7) {
         this.hW.a((i5)null);
      } else {
         this.dx();
         this.a(this.hR, this.l6, this.hV / 2, 70, 16777215);
         this.a(this.hR, this.l5 + " " + this.l8 + "%", this.hV / 2, 90, 16777215);
         super.if(var1, var2, var3);
      }
   }
}
