import java.util.ArrayList;
import java.util.List;

class ak7 {
   private final List a;
   private final zi try;
   private short[] new;
   private int int;
   private int for;
   final ak8 if;
   public boolean do;

   public ak7(ak8 var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public ak7(ak8 var1, int var2, int var3, boolean var4) {
      this.do = false;
      this.if = var1;
      this.a = new ArrayList();
      this.new = new short[64];
      this.int = 0;
      this.try = new zi(var2, var3);
      boolean var5 = var4 && qs.B();
      if (var5 && !var1.if().T.for(var2, var3)) {
         this.if.do.if(this.try);
         this.do = false;
      } else {
         var1.if().T.if(var2, var3);
         this.do = true;
      }

   }

   public void if(ak2 var1) {
      if (this.a.contains(var1)) {
         throw new IllegalStateException("Failed to add player. " + var1 + " already is in chunk " + this.try.if + ", " + this.try.a);
      } else {
         this.a.add(var1);
         var1.pQ.add(this.try);
      }
   }

   public void a(ak2 var1) {
      this.a(var1, true);
   }

   public void a(ak2 var1, boolean var2) {
      if (this.a.contains(var1)) {
         if (var2) {
            var1.pV.if((an7)(new aom(ak8.a(this.if).byte(this.try.if, this.try.a), true, 0)));
         }

         this.a.remove(var1);
         var1.pQ.remove(this.try);
         if (vf.j.do()) {
            vf.a(vf.W, this.try, var1);
         }

         if (this.a.isEmpty()) {
            long var3 = (long)this.try.if + 2147483647L | (long)this.try.a + 2147483647L << 32;
            ak8.do(this.if).new(var3);
            if (this.int > 0) {
               ak8.if(this.if).remove(this);
            }

            if (this.do) {
               this.if.if().T.int(this.try.if, this.try.a);
            }
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      if (this.int == 0) {
         ak8.if(this.if).add(this);
      }

      this.for |= 1 << (var2 >> 4);
      if (this.int < 64) {
         short var4 = (short)(var1 << 12 | var3 << 8 | var2);

         for(int var5 = 0; var5 < this.int; ++var5) {
            if (this.new[var5] == var4) {
               return;
            }
         }

         this.new[this.int++] = var4;
      }

   }

   public void a(an7 var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ak2 var3 = (ak2)this.a.get(var2);
         if (!var3.pQ.contains(this.try)) {
            var3.pV.if(var1);
         }
      }

   }

   public void a() {
      if (this.int != 0) {
         int var1;
         int var2;
         int var3;
         if (this.int == 1) {
            var1 = this.try.if * 16 + (this.new[0] >> 12 & 15);
            var2 = this.new[0] & 255;
            var3 = this.try.a * 16 + (this.new[0] >> 8 & 15);
            this.a((an7)(new ana(var1, var2, var3, ak8.a(this.if))));
            if (ak8.a(this.if).r(var1, var2, var3)) {
               this.a(ak8.a(this.if).if(var1, var2, var3));
            }
         } else {
            int var4;
            if (this.int != 64) {
               this.a((an7)(new apd(this.try.if, this.try.a, this.new, this.int, ak8.a(this.if))));

               for(var1 = 0; var1 < this.int; ++var1) {
                  var2 = this.try.if * 16 + (this.new[var1] >> 12 & 15);
                  var3 = this.new[var1] & 255;
                  var4 = this.try.a * 16 + (this.new[var1] >> 8 & 15);
                  if (ak8.a(this.if).r(var2, var3, var4)) {
                     this.a(ak8.a(this.if).if(var2, var3, var4));
                  }
               }
            } else {
               var1 = this.try.if * 16;
               var2 = this.try.a * 16;
               this.a((an7)(new aom(ak8.a(this.if).byte(this.try.if, this.try.a), false, this.for)));

               for(var3 = 0; var3 < 16; ++var3) {
                  if ((this.for & 1 << var3) != 0) {
                     var4 = var3 << 4;
                     List var5 = ak8.a(this.if).try(var1, var4, var2, var1 + 16, var4 + 16, var2 + 15);

                     for(int var6 = 0; var6 < var5.size(); ++var6) {
                        this.a((n4)var5.get(var6));
                     }
                  }
               }
            }
         }

         this.int = 0;
         this.for = 0;
      }

   }

   private void a(n4 var1) {
      if (var1 != null) {
         an7 var2 = var1.char();
         if (var2 != null) {
            this.a(var2);
         }
      }

   }

   static zi if(ak7 var0) {
      return var0.try;
   }

   static List a(ak7 var0) {
      return var0.a;
   }

   public void if() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         ak2 var2 = (ak2)this.a.get(var1);
         xx var3 = ak8.a(this.if).byte(this.try.if, this.try.a);
         ArrayList var4 = new ArrayList(1);
         var4.add(var3);
         var2.pV.if((an7)(new aok(var4)));
      }

   }
}
