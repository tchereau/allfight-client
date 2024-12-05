class adc extends ac9 {
   // $FF: synthetic field
   final y6 char;
   // $FF: synthetic field
   final int case;
   // $FF: synthetic field
   final int long;
   // $FF: synthetic field
   final int goto;
   // $FF: synthetic field
   final ade else;

   adc(ade var1, ajg var2, int var3, int var4, int var5, y6 var6, int var7, int var8, int var9) {
      super(var2, var3, var4, var5);
      this.else = var1;
      this.char = var6;
      this.case = var7;
      this.long = var8;
      this.goto = var9;
   }

   public boolean if(abp var1) {
      return false;
   }

   public boolean a(aek var1) {
      return (var1.fY.new || var1.fX >= this.else.g) && this.else.g > 0 && this.do();
   }

   public void a(aek var1, abp var2) {
      if (!var1.fY.new) {
         var1.D(-this.else.g);
      }

      ade.if(this.else).if(0, (abp)null);
      if (ade.a(this.else) > 0) {
         abp var3 = ade.if(this.else).do(1);
         if (var3 != null && var3.if > ade.a(this.else)) {
            var3.if -= ade.a(this.else);
            ade.if(this.else).if(1, var3);
         } else {
            ade.if(this.else).if(1, (abp)null);
         }
      } else {
         ade.if(this.else).if(1, (abp)null);
      }

      this.else.g = 0;
      if (!var1.fY.new && !this.char.goto && this.char.new(this.case, this.long, this.goto) == pa.y.void && var1.bq().nextFloat() < 0.12F) {
         int var6 = this.char.for(this.case, this.long, this.goto);
         int var4 = var6 & 3;
         int var5 = var6 >> 2;
         ++var5;
         if (var5 > 2) {
            this.char.o(this.case, this.long, this.goto);
            this.char.for(1020, this.case, this.long, this.goto, 0);
         } else {
            this.char.do(this.case, this.long, this.goto, var4 | var5 << 2, 2);
            this.char.for(1021, this.case, this.long, this.goto, 0);
         }
      } else if (!this.char.goto) {
         this.char.for(1021, this.case, this.long, this.goto, 0);
      }

   }
}
