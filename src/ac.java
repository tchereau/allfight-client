public class ac implements amd {
   private final aa else;
   private final afj char;
   private final dq case;
   private boolean byte = false;
   private boolean try = false;
   private boolean new = false;
   private boolean int = false;
   private float for = 0.0F;
   private float do = 0.0F;
   private float if = 0.0F;
   private double a = 0.0D;

   public ac(aa var1, afj var2, dq var3) {
      this.else = var1;
      this.char = var2;
      this.case = var3;
   }

   public void a() {
      boolean var1 = false;
      boolean var2 = this.byte;
      boolean var3 = this.try;
      boolean var4 = this.new;
      float var5 = this.do;
      float var6 = this.for;
      float var7 = this.if;
      double var8 = this.a;
      this.byte = this.case != null && this.char.as == this.case;
      this.try = this.char.aR;
      this.a = (double)ajs.int(this.char.ai * this.char.ai + this.char.ag * this.char.ag);
      this.new = this.a >= 0.01D;
      if (var2 && !this.byte) {
         this.else.if(this.case);
      }

      if (this.try || !this.int && this.do == 0.0F && this.if == 0.0F) {
         if (!var3) {
            this.else.if(this.char);
            if (var2 || this.byte) {
               this.else.if(this.case);
            }
         }

         this.int = true;
         if (this.try) {
            return;
         }
      }

      if (!this.else.a((aiw)this.char) && this.do > 0.0F) {
         this.else.a("minecart.base", this.char, this.do, this.for, false);
         this.int = false;
         var1 = true;
      }

      if (this.byte && !this.else.a((aiw)this.case) && this.if > 0.0F) {
         this.else.a("minecart.inside", this.case, this.if, 1.0F, true);
         this.int = false;
         var1 = true;
      }

      if (this.new) {
         if (this.for < 1.0F) {
            this.for += 0.0025F;
         }

         if (this.for > 1.0F) {
            this.for = 1.0F;
         }

         float var10 = ajs.a((float)this.a, 0.0F, 4.0F) / 4.0F;
         this.if = 0.0F + var10 * 0.75F;
         var10 = ajs.a(var10 * 2.0F, 0.0F, 1.0F);
         this.do = 0.0F + var10 * 0.7F;
      } else if (var4) {
         this.do = 0.0F;
         this.for = 0.0F;
         this.if = 0.0F;
      }

      if (!this.int) {
         if (this.for != var6) {
            this.else.if(this.char, this.for);
         }

         if (this.do != var5) {
            this.else.a((aiw)this.char, this.do);
         }

         if (this.if != var7) {
            this.else.a((aiw)this.case, this.if);
         }
      }

      if (!var1 && (this.do > 0.0F || this.if > 0.0F)) {
         this.else.do(this.char);
         if (this.byte) {
            this.else.a((aiw)this.case, (aiw)this.char);
         }
      } else {
         if (this.else.a((aiw)this.char)) {
            this.else.if(this.char);
         }

         if (this.byte && this.else.a((aiw)this.case)) {
            this.else.if(this.case);
         }
      }

   }
}
