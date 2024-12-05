public class jh extends i5 {
   protected i5 mp;
   private int mo = -1;
   private jg ms;
   private final ke mq;
   private iy mr;

   public jh(i5 var1, ke var2) {
      this.mp = var1;
      this.mq = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.hT.add(this.mr = new iy(6, this.hV / 2 - 75, this.hU - 38, var1.a("gui.done")));
      this.ms = new jg(this);
      this.ms.a(this.hT, 7, 8);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         switch(var1.hv) {
         case 5:
            break;
         case 6:
            this.hW.a(this.mp);
            break;
         default:
            this.ms.a(var1);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.ms.a(var1, var2, var3);
      if (this.mo <= 0) {
         this.hW.uT.char();
         this.mo += 20;
      }

      aqy var4 = aqy.if();
      this.a(this.hR, var4.a("options.language"), this.hV / 2, 16, 16777215);
      this.a(this.hR, "(" + var4.a("options.languageWarning") + ")", this.hV / 2, this.hU - 56, 8421504);
      super.if(var1, var2, var3);
   }

   public void dG() {
      super.dG();
      --this.mo;
   }

   // $FF: synthetic method
   static ke if(jh var0) {
      return var0.mq;
   }

   // $FF: synthetic method
   static iy a(jh var0) {
      return var0.mr;
   }
}
