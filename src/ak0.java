import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ak0 {
   public aiw j;
   public int i;
   public int h;
   public int g;
   public int f;
   public int e;
   public int d;
   public int c;
   public int b;
   public double void;
   public double long;
   public double goto;
   public int else = 0;
   private double byte;
   private double try;
   private double new;
   private boolean int = false;
   private boolean for;
   private int do = 0;
   private aiw if;
   private boolean a = false;
   public boolean char = false;
   public Set case = new HashSet();

   public ak0(aiw var1, int var2, int var3, boolean var4) {
      this.j = var1;
      this.i = var2;
      this.h = var3;
      this.for = var4;
      this.g = ajs.a(var1.al * 32.0D);
      this.f = ajs.a(var1.ak * 32.0D);
      this.e = ajs.a(var1.aj * 32.0D);
      this.d = ajs.new(var1.a5 * 256.0F / 360.0F);
      this.c = ajs.new(var1.a4 * 256.0F / 360.0F);
      this.b = ajs.new(var1.ae() * 256.0F / 360.0F);
   }

   public boolean equals(Object var1) {
      return var1 instanceof ak0 ? ((ak0)var1).j.av == this.j.av : false;
   }

   public int hashCode() {
      return this.j.av;
   }

   public void a(List var1) {
      this.char = false;
      if (!this.int || this.j.if(this.byte, this.try, this.new) > 16.0D) {
         this.byte = this.j.al;
         this.try = this.j.ak;
         this.new = this.j.aj;
         this.int = true;
         this.char = true;
         this.if(var1);
      }

      if (this.if != this.j.ar || this.j.ar != null && this.else % 60 == 0) {
         this.if = this.j.ar;
         this.if((an7)(new anl(this.j, this.j.ar)));
      }

      if (this.j instanceof aih && this.else % 10 == 0) {
         aih var23 = (aih)this.j;
         abp var24 = var23.fU();
         if (var24 != null && var24.d() instanceof abn) {
            s3 var26 = abr.aZ.a(var24, this.j.ap);
            Iterator var29 = var1.iterator();

            while(var29.hasNext()) {
               aek var30 = (aek)var29.next();
               ak2 var31 = (ak2)var30;
               var26.a(var31, var24);
               if (var31.pV.for() <= 5) {
                  an7 var32 = abr.aZ.try(var24, this.j.ap, var31);
                  if (var32 != null) {
                     var31.pV.if(var32);
                  }
               }
            }
         }

         ah4 var27 = this.j.ab();
         if (var27.do()) {
            this.a((an7)(new ans(this.j.av, var27, false)));
         }
      } else if (this.else % this.h == 0 || this.j.ba || this.j.ab().do()) {
         int var2;
         int var3;
         if (this.j.ar == null) {
            ++this.do;
            var2 = this.j.a1.a(this.j.al);
            var3 = ajs.a(this.j.ak * 32.0D);
            int var25 = this.j.a1.a(this.j.aj);
            int var28 = ajs.new(this.j.a5 * 256.0F / 360.0F);
            int var6 = ajs.new(this.j.a4 * 256.0F / 360.0F);
            int var7 = var2 - this.g;
            int var8 = var3 - this.f;
            int var9 = var25 - this.e;
            Object var10 = null;
            boolean var11 = Math.abs(var7) >= 4 || Math.abs(var8) >= 4 || Math.abs(var9) >= 4 || this.else % 60 == 0;
            boolean var12 = Math.abs(var28 - this.d) >= 4 || Math.abs(var6 - this.c) >= 4;
            if (this.else > 0) {
               if (var7 >= -128 && var7 < 128 && var8 >= -128 && var8 < 128 && var9 >= -128 && var9 < 128 && this.do <= 400 && !this.a) {
                  if (var11 && var12) {
                     var10 = new aod(this.j.av, (byte)var7, (byte)var8, (byte)var9, (byte)var28, (byte)var6);
                  } else if (var11) {
                     var10 = new aoe(this.j.av, (byte)var7, (byte)var8, (byte)var9);
                  } else if (var12) {
                     var10 = new aoc(this.j.av, (byte)var28, (byte)var6);
                  }
               } else {
                  this.do = 0;
                  var10 = new ane(this.j.av, var2, var3, var25, (byte)var28, (byte)var6);
               }
            }

            if (this.for) {
               double var13 = this.j.ai - this.void;
               double var15 = this.j.ah - this.long;
               double var17 = this.j.ag - this.goto;
               double var19 = 0.02D;
               double var21 = var13 * var13 + var15 * var15 + var17 * var17;
               if (var21 > var19 * var19 || var21 > 0.0D && this.j.ai == 0.0D && this.j.ah == 0.0D && this.j.ag == 0.0D) {
                  this.void = this.j.ai;
                  this.long = this.j.ah;
                  this.goto = this.j.ag;
                  this.if((an7)(new anr(this.j.av, this.void, this.long, this.goto)));
               }
            }

            if (var10 != null) {
               this.if((an7)var10);
            }

            ah4 var33 = this.j.ab();
            if (var33.do()) {
               this.a((an7)(new ans(this.j.av, var33, false)));
            }

            if (var11) {
               this.g = var2;
               this.f = var3;
               this.e = var25;
            }

            if (var12) {
               this.d = var28;
               this.c = var6;
            }

            this.a = false;
         } else {
            var2 = ajs.new(this.j.a5 * 256.0F / 360.0F);
            var3 = ajs.new(this.j.a4 * 256.0F / 360.0F);
            boolean var4 = Math.abs(var2 - this.d) >= 4 || Math.abs(var3 - this.c) >= 4;
            if (var4) {
               this.if((an7)(new aoc(this.j.av, (byte)var2, (byte)var3)));
               this.d = var2;
               this.c = var3;
            }

            this.g = this.j.a1.a(this.j.al);
            this.f = ajs.a(this.j.ak * 32.0D);
            this.e = this.j.a1.a(this.j.aj);
            ah4 var5 = this.j.ab();
            if (var5.do()) {
               this.a((an7)(new ans(this.j.av, var5, false)));
            }

            this.a = true;
         }

         var2 = ajs.new(this.j.ae() * 256.0F / 360.0F);
         if (Math.abs(var2 - this.b) >= 4) {
            this.if((an7)(new any(this.j.av, (byte)var2)));
            this.b = var2;
         }

         this.j.ba = false;
      }

      ++this.else;
      if (this.j.aU) {
         this.a((an7)(new anr(this.j)));
         this.j.aU = false;
      }

   }

   public void if(an7 var1) {
      Iterator var2 = this.case.iterator();

      while(var2.hasNext()) {
         ak2 var3 = (ak2)var2.next();
         var3.pV.if(var1);
      }

   }

   public void a(an7 var1) {
      this.if(var1);
      if (this.j instanceof ak2) {
         ((ak2)this.j).pV.if(var1);
      }

   }

   public void a() {
      Iterator var1 = this.case.iterator();

      while(var1.hasNext()) {
         ak2 var2 = (ak2)var1.next();
         var2.pP.add(this.j.av);
      }

   }

   public void if(ak2 var1) {
      if (this.case.contains(var1)) {
         var1.pP.add(this.j.av);
         this.case.remove(var1);
      }

   }

   public void a(ak2 var1) {
      if (var1 != this.j) {
         double var2 = var1.al - (double)(this.g / 32);
         double var4 = var1.aj - (double)(this.e / 32);
         if (var2 >= (double)(-this.i) && var2 <= (double)this.i && var4 >= (double)(-this.i) && var4 <= (double)this.i) {
            if (!this.case.contains(var1) && (this.do(var1) || this.j.aq)) {
               this.case.add(var1);
               an7 var6 = this.if();
               var1.pV.if(var6);
               if (!this.j.ab().a()) {
                  var1.pV.if((an7)(new ans(this.j.av, this.j.ab(), true)));
               }

               this.void = this.j.ai;
               this.long = this.j.ah;
               this.goto = this.j.ag;
               if (this.for && !(var6 instanceof apr)) {
                  var1.pV.if((an7)(new anr(this.j.av, this.j.ai, this.j.ah, this.j.ag)));
               }

               if (this.j.ar != null) {
                  var1.pV.if((an7)(new anl(this.j, this.j.ar)));
               }

               if (this.j instanceof aig) {
                  for(int var7 = 0; var7 < 5; ++var7) {
                     abp var8 = ((aig)this.j).A(var7);
                     if (var8 != null) {
                        var1.pV.if((an7)(new anq(this.j.av, var7, var8)));
                     }
                  }
               }

               if (this.j instanceof aek) {
                  aek var10 = (aek)this.j;
                  if (var10.cg()) {
                     var1.pV.if((an7)(new aot(this.j, 0, ajs.a(this.j.al), ajs.a(this.j.ak), ajs.a(this.j.aj))));
                  }
               }

               if (this.j instanceof aig) {
                  aig var11 = (aig)this.j;
                  Iterator var12 = var11.bi().iterator();

                  while(var12.hasNext()) {
                     aiz var9 = (aiz)var12.next();
                     var1.pV.if((an7)(new am9(this.j.av, var9)));
                  }
               }
            }
         } else if (this.case.contains(var1)) {
            this.case.remove(var1);
            var1.pP.add(this.j.av);
         }
      }

   }

   private boolean do(ak2 var1) {
      return var1.eC().E().a(var1, this.j.be, this.j.bc);
   }

   public void if(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.a((ak2)var1.get(var2));
      }

   }

   private an7 if() {
      if (this.j.aR) {
         this.j.ap.char().if("Fetching addPacket for removed entity");
      }

      if (this.j instanceof afk) {
         return new apx(this.j, 2, 1);
      } else if (this.j instanceof ak2) {
         return new apn((aek)this.j);
      } else if (this.j instanceof afj) {
         afj var9 = (afj)this.j;
         return new apx(this.j, 10, var9.f3());
      } else if (this.j instanceof afm) {
         return new apx(this.j, 1);
      } else if (!(this.j instanceof aix) && !(this.j instanceof afr)) {
         if (this.j instanceof aee) {
            aek var7 = ((aee)this.j).dc;
            return new apx(this.j, 90, var7 != null ? var7.av : this.j.av);
         } else if (this.j instanceof aei) {
            aiw var5 = ((aei)this.j).cF;
            return new apx(this.j, 60, var5 != null ? var5.av : this.j.av);
         } else if (this.j instanceof aea) {
            return new apx(this.j, 61);
         } else if (this.j instanceof ad4) {
            return new apx(this.j, 73, ((ad4)this.j).a4());
         } else if (this.j instanceof ad5) {
            return new apx(this.j, 75);
         } else if (this.j instanceof ad6) {
            return new apx(this.j, 65);
         } else if (this.j instanceof aeh) {
            return new apx(this.j, 72);
         } else if (this.j instanceof aef) {
            return new apx(this.j, 76);
         } else {
            apx var1;
            if (this.j instanceof aeg) {
               aeg var8 = (aeg)this.j;
               var1 = null;
               byte var10 = 63;
               if (this.j instanceof aeb) {
                  var10 = 64;
               } else if (this.j instanceof ad3) {
                  var10 = 66;
               }

               if (var8.dr != null) {
                  var1 = new apx(this.j, var10, ((aeg)this.j).dr.av);
               } else {
                  var1 = new apx(this.j, var10, 0);
               }

               var1.d6 = (int)(var8.dq * 8000.0D);
               var1.d5 = (int)(var8.dp * 8000.0D);
               var1.d4 = (int)(var8.dn * 8000.0D);
               return var1;
            } else if (this.j instanceof ad7) {
               return new apx(this.j, 62);
            } else if (this.j instanceof afa) {
               return new apx(this.j, 50);
            } else if (this.j instanceof afs) {
               return new apx(this.j, 51);
            } else if (this.j instanceof afl) {
               afl var6 = (afl)this.j;
               return new apx(this.j, 70, var6.dN | var6.dM << 16);
            } else if (this.j instanceof ah7) {
               return new app((ah7)this.j);
            } else if (this.j instanceof aih) {
               aih var4 = (aih)this.j;
               var1 = new apx(this.j, 71, var4.rY);
               var1.d9 = ajs.new((float)(var4.rX * 32));
               var1.d8 = ajs.new((float)(var4.r1 * 32));
               var1.d7 = ajs.new((float)(var4.r0 * 32));
               return var1;
            } else if (this.j instanceof aik) {
               return new apv((aik)this.j);
            } else {
               Iterator var2 = ModLoader.a().values().iterator();

               g var3;
               do {
                  if (!var2.hasNext()) {
                     throw new IllegalArgumentException("Don't know how to add " + this.j.getClass() + "!");
                  }

                  var3 = (g)var2.next();
               } while(!var3.a.isAssignableFrom(this.j.getClass()));

               return var3.if.a(this.j, var3.new);
            }
         }
      } else {
         this.b = ajs.new(this.j.ae() * 256.0F / 360.0F);
         return new apr((aig)this.j);
      }
   }

   public void for(ak2 var1) {
      if (this.case.contains(var1)) {
         this.case.remove(var1);
         var1.pP.add(this.j.av);
      }

   }
}
