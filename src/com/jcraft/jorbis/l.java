package com.jcraft.jorbis;

class l {
   int int;
   int new;
   int[] if;
   int else;
   int case;
   int for;
   int goto;
   int do;
   int[] byte;
   static final int char = 10;
   static final int try = 21;
   static final int a = 768;

   int a(com.jcraft.a.e var1) {
      boolean var3 = false;
      var1.a(5653314, 24);
      var1.a(this.int, 16);
      var1.a(this.new, 24);

      int var2;
      for(var2 = 1; var2 < this.new && this.if[var2] >= this.if[var2 - 1]; ++var2) {
      }

      if (var2 == this.new) {
         var3 = true;
      }

      int var4;
      if (var3) {
         var4 = 0;
         var1.a(1, 1);
         var1.a(this.if[0] - 1, 5);

         for(var2 = 1; var2 < this.new; ++var2) {
            int var5 = this.if[var2];
            int var6 = this.if[var2 - 1];
            if (var5 > var6) {
               for(int var7 = var6; var7 < var5; ++var7) {
                  var1.a(var2 - var4, com.jcraft.jorbis.m.do(this.new - var4));
                  var4 = var2;
               }
            }
         }

         var1.a(var2 - var4, com.jcraft.jorbis.m.do(this.new - var4));
      } else {
         var1.a(0, 1);

         for(var2 = 0; var2 < this.new && this.if[var2] != 0; ++var2) {
         }

         if (var2 == this.new) {
            var1.a(0, 1);

            for(var2 = 0; var2 < this.new; ++var2) {
               var1.a(this.if[var2] - 1, 5);
            }
         } else {
            var1.a(1, 1);

            for(var2 = 0; var2 < this.new; ++var2) {
               if (this.if[var2] == 0) {
                  var1.a(0, 1);
               } else {
                  var1.a(1, 1);
                  var1.a(this.if[var2] - 1, 5);
               }
            }
         }
      }

      var1.a(this.else, 4);
      switch(this.else) {
      case 1:
      case 2:
         if (this.byte == null) {
            return -1;
         } else {
            var1.a(this.case, 32);
            var1.a(this.for, 32);
            var1.a(this.goto - 1, 4);
            var1.a(this.do, 1);
            var4 = 0;
            switch(this.else) {
            case 1:
               var4 = this.if();
               break;
            case 2:
               var4 = this.new * this.int;
            }

            for(var2 = 0; var2 < var4; ++var2) {
               var1.a(Math.abs(this.byte[var2]), this.goto);
            }
         }
      case 0:
         return 0;
      default:
         return -1;
      }
   }

   int if(com.jcraft.a.e var1) {
      if (var1.for(24) != 5653314) {
         this.a();
         return -1;
      } else {
         this.int = var1.for(16);
         this.new = var1.for(24);
         if (this.new == -1) {
            this.a();
            return -1;
         } else {
            int var2;
            int var3;
            label89:
            switch(var1.for(1)) {
            case 0:
               this.if = new int[this.new];
               if (var1.for(1) != 0) {
                  var2 = 0;

                  while(true) {
                     if (var2 >= this.new) {
                        break label89;
                     }

                     if (var1.for(1) != 0) {
                        var3 = var1.for(5);
                        if (var3 == -1) {
                           this.a();
                           return -1;
                        }

                        this.if[var2] = var3 + 1;
                     } else {
                        this.if[var2] = 0;
                     }

                     ++var2;
                  }
               } else {
                  var2 = 0;

                  while(true) {
                     if (var2 >= this.new) {
                        break label89;
                     }

                     var3 = var1.for(5);
                     if (var3 == -1) {
                        this.a();
                        return -1;
                     }

                     this.if[var2] = var3 + 1;
                     ++var2;
                  }
               }
            case 1:
               var3 = var1.for(5) + 1;
               this.if = new int[this.new];
               var2 = 0;

               while(true) {
                  if (var2 >= this.new) {
                     break label89;
                  }

                  int var4 = var1.for(com.jcraft.jorbis.m.do(this.new - var2));
                  if (var4 == -1) {
                     this.a();
                     return -1;
                  }

                  for(int var5 = 0; var5 < var4; ++var2) {
                     this.if[var2] = var3;
                     ++var5;
                  }

                  ++var3;
               }
            default:
               return -1;
            }

            switch(this.else = var1.for(4)) {
            case 1:
            case 2:
               this.case = var1.for(32);
               this.for = var1.for(32);
               this.goto = var1.for(4) + 1;
               this.do = var1.for(1);
               var3 = 0;
               switch(this.else) {
               case 1:
                  var3 = this.if();
                  break;
               case 2:
                  var3 = this.new * this.int;
               }

               this.byte = new int[var3];

               for(var2 = 0; var2 < var3; ++var2) {
                  this.byte[var2] = var1.for(this.goto);
               }

               if (this.byte[var3 - 1] == -1) {
                  this.a();
                  return -1;
               }
            case 0:
               return 0;
            default:
               this.a();
               return -1;
            }
         }
      }
   }

   private int if() {
      int var1 = (int)Math.floor(Math.pow((double)this.new, 1.0D / (double)this.int));

      while(true) {
         int var2 = 1;
         int var3 = 1;

         for(int var4 = 0; var4 < this.int; ++var4) {
            var2 *= var1;
            var3 *= var1 + 1;
         }

         if (var2 <= this.new && var3 > this.new) {
            return var1;
         }

         if (var2 > this.new) {
            --var1;
         } else {
            ++var1;
         }
      }
   }

   void a() {
   }

   float[] do() {
      if (this.else != 1 && this.else != 2) {
         return null;
      } else {
         float var2 = a(this.case);
         float var3 = a(this.for);
         float[] var4 = new float[this.new * this.int];
         int var5;
         float var6;
         int var7;
         switch(this.else) {
         case 1:
            int var1 = this.if();

            for(var5 = 0; var5 < this.new; ++var5) {
               var6 = 0.0F;
               var7 = 1;

               for(int var11 = 0; var11 < this.int; ++var11) {
                  int var9 = var5 / var7 % var1;
                  float var10 = (float)this.byte[var9];
                  var10 = Math.abs(var10) * var3 + var2 + var6;
                  if (this.do != 0) {
                     var6 = var10;
                  }

                  var4[var5 * this.int + var11] = var10;
                  var7 *= var1;
               }
            }

            return var4;
         case 2:
            for(var5 = 0; var5 < this.new; ++var5) {
               var6 = 0.0F;

               for(var7 = 0; var7 < this.int; ++var7) {
                  float var8 = (float)this.byte[var5 * this.int + var7];
                  var8 = Math.abs(var8) * var3 + var2 + var6;
                  if (this.do != 0) {
                     var6 = var8;
                  }

                  var4[var5 * this.int + var7] = var8;
               }
            }
         }

         return var4;
      }
   }

   static long a(float var0) {
      int var1 = 0;
      if (var0 < 0.0F) {
         var1 = Integer.MIN_VALUE;
         var0 = -var0;
      }

      int var2 = (int)Math.floor(Math.log((double)var0) / Math.log(2.0D));
      int var3 = (int)Math.rint(Math.pow((double)var0, (double)(20 - var2)));
      var2 = var2 + 768 << 21;
      return (long)(var1 | var2 | var3);
   }

   static float a(int var0) {
      float var1 = (float)(var0 & 2097151);
      float var2 = (float)((var0 & 2145386496) >>> 21);
      if ((var0 & Integer.MIN_VALUE) != 0) {
         var1 = -var1;
      }

      return a(var1, (int)var2 - 20 - 768);
   }

   static float a(float var0, int var1) {
      return (float)((double)var0 * Math.pow(2.0D, (double)var1));
   }
}
