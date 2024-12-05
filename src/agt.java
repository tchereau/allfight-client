public class agt extends ahk {
   private ah5 b;
   private float void;
   private double long;
   private double goto;
   private double else;
   private double char;
   private double case;
   private aek byte;
   private int try = 0;
   private boolean new;
   private int int;
   private boolean for;
   private boolean do;

   public agt(ah5 var1, float var2, int var3, boolean var4) {
      this.b = var1;
      this.void = var2;
      this.int = var3;
      this.for = var4;
      this.a(3);
   }

   public boolean do() {
      if (this.try > 0) {
         --this.try;
         return false;
      } else {
         this.byte = this.b.ap.if(this.b, 10.0D);
         if (this.byte == null) {
            return false;
         } else {
            abp var1 = this.byte.cD();
            if (var1 == null) {
               return false;
            } else {
               return var1.new == this.int;
            }
         }
      }
   }

   public boolean try() {
      if (this.for) {
         if (this.b.for(this.byte) < 36.0D) {
            if (this.byte.if(this.long, this.goto, this.else) > 0.010000000000000002D) {
               return false;
            }

            if (Math.abs((double)this.byte.a4 - this.char) > 5.0D || Math.abs((double)this.byte.a5 - this.case) > 5.0D) {
               return false;
            }
         } else {
            this.long = this.byte.al;
            this.goto = this.byte.ak;
            this.else = this.byte.aj;
         }

         this.char = (double)this.byte.a4;
         this.case = (double)this.byte.a5;
      }

      return this.do();
   }

   public void a() {
      this.long = this.byte.al;
      this.goto = this.byte.ak;
      this.else = this.byte.aj;
      this.new = true;
      this.do = this.b.bl().char();
      this.b.bl().for(false);
   }

   public void new() {
      this.byte = null;
      this.b.bl().case();
      this.try = 100;
      this.new = false;
      this.b.bl().for(this.do);
   }

   public void int() {
      this.b.b9().a(this.byte, 30.0F, (float)this.b.bJ());
      if (this.b.for(this.byte) < 6.25D) {
         this.b.bl().case();
      } else {
         this.b.bl().a((aig)this.byte, this.void);
      }

   }

   public boolean byte() {
      return this.new;
   }
}
