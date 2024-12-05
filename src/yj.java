import java.util.Random;

public class yj {
   protected y6 z;
   protected Random x;
   protected int w;
   protected int v;
   protected yn u;
   protected w2 t = new w5(4);
   protected w2 s;
   protected w2 r;
   protected w2 q;
   protected w2 p;
   protected w2 o;
   protected w2 n;
   protected w2 m;
   protected w2 l;
   protected w2 k;
   protected w2 j;
   protected w2 i;
   protected w2 h;
   protected w2 g;
   protected w2 f;
   protected w2 e;
   protected w2 d;
   protected w2 c;
   protected w2 b;
   protected int void;
   protected int long;
   protected w2 y;
   protected w2 goto;
   protected int else;
   protected int char;
   protected int case;
   protected int byte;
   protected int try;
   protected int new;
   protected int int;
   protected int for;
   protected int do;
   protected int if;
   public boolean a;

   public yj(yn var1) {
      this.s = new wm(7, pa.a1.void);
      this.r = new wm(6, pa.aY.void);
      this.q = new wq(pa.g.void, 32);
      this.p = new wq(pa.aY.void, 32);
      this.o = new wq(pa.aP.void, 16);
      this.n = new wq(pa.aS.void, 8);
      this.m = new wq(pa.aV.void, 8);
      this.l = new wq(pa.cf.void, 7);
      this.k = new wq(pa.cw.void, 7);
      this.j = new wq(pa.aA.void, 6);
      this.i = new w1(pa.bR.void);
      this.h = new w1(pa.bP.void);
      this.g = new w1(pa.bN.void);
      this.f = new w1(pa.bL.void);
      this.e = new wv();
      this.d = new wn();
      this.c = new w6();
      this.b = new x1();
      this.void = 0;
      this.long = 0;
      this.else = 2;
      this.char = 1;
      this.case = 0;
      this.byte = 0;
      this.try = 0;
      this.new = 0;
      this.int = 1;
      this.for = 3;
      this.do = 1;
      this.y = new w1(mod_rajouts.P.void);
      this.goto = new w1(mod_rajouts.ac.void);
      this.if = 0;
      this.a = true;
      this.u = var1;
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      if (this.z != null) {
         throw new RuntimeException("Already decorating!!");
      } else {
         this.z = var1;
         this.x = var2;
         this.w = var3;
         this.v = var4;
         this.if();
         this.z = null;
         this.x = null;
      }
   }

   protected void if() {
      this.a();

      int var1;
      int var2;
      int var3;
      for(var1 = 0; var1 < this.for; ++var1) {
         var2 = this.w + this.x.nextInt(16) + 8;
         var3 = this.v + this.x.nextInt(16) + 8;
         this.s.a(this.z, this.x, var2, this.z.case(var2, var3), var3);
      }

      for(var1 = 0; var1 < this.do; ++var1) {
         var2 = this.w + this.x.nextInt(16) + 8;
         var3 = this.v + this.x.nextInt(16) + 8;
         this.t.a(this.z, this.x, var2, this.z.case(var2, var3), var3);
      }

      for(var1 = 0; var1 < this.int; ++var1) {
         var2 = this.w + this.x.nextInt(16) + 8;
         var3 = this.v + this.x.nextInt(16) + 8;
         this.s.a(this.z, this.x, var2, this.z.case(var2, var3), var3);
      }

      var1 = this.long;
      if (this.x.nextInt(10) == 0) {
         ++var1;
      }

      int var4;
      for(var2 = 0; var2 < var1; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.v + this.x.nextInt(16) + 8;
         w2 var5 = this.u.if(this.x);
         var5.a(1.0D, 1.0D, 1.0D);
         var5.a(this.z, this.x, var3, this.z.do(var3, var4), var4);
      }

      for(var2 = 0; var2 < this.if; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.v + this.x.nextInt(16) + 8;
         this.e.a(this.z, this.x, var3, this.z.do(var3, var4), var4);
      }

      int var7;
      for(var2 = 0; var2 < this.else; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.x.nextInt(128);
         var7 = this.v + this.x.nextInt(16) + 8;
         this.i.a(this.z, this.x, var3, var4, var7);
         if (this.x.nextInt(4) == 0) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.x.nextInt(128);
            var7 = this.v + this.x.nextInt(16) + 8;
            this.h.a(this.z, this.x, var3, var4, var7);
         }

         if (this.x.nextInt(4) == 0) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.x.nextInt(128);
            var7 = this.v + this.x.nextInt(16) + 8;
            this.y.a(this.z, this.x, var3, var4, var7);
         }

         if (this.x.nextInt(4) == 0) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.x.nextInt(128);
            var7 = this.v + this.x.nextInt(16) + 8;
            this.goto.a(this.z, this.x, var3, var4, var7);
         }
      }

      for(var2 = 0; var2 < this.char; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.x.nextInt(128);
         var7 = this.v + this.x.nextInt(16) + 8;
         w2 var6 = this.u.a(this.x);
         var6.a(this.z, this.x, var3, var4, var7);
      }

      for(var2 = 0; var2 < this.case; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.x.nextInt(128);
         var7 = this.v + this.x.nextInt(16) + 8;
         (new w4(pa.b1.void)).a(this.z, this.x, var3, var4, var7);
      }

      for(var2 = 0; var2 < this.void; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.v + this.x.nextInt(16) + 8;

         for(var7 = this.x.nextInt(128); var7 > 0 && this.z.new(var3, var7 - 1, var4) == 0; --var7) {
         }

         this.b.a(this.z, this.x, var3, var7, var4);
      }

      for(var2 = 0; var2 < this.byte; ++var2) {
         if (this.x.nextInt(4) == 0) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.v + this.x.nextInt(16) + 8;
            var7 = this.z.do(var3, var4);
            this.g.a(this.z, this.x, var3, var7, var4);
         }

         if (this.x.nextInt(8) == 0) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.v + this.x.nextInt(16) + 8;
            var7 = this.x.nextInt(128);
            this.f.a(this.z, this.x, var3, var7, var4);
         }
      }

      if (this.x.nextInt(4) == 0) {
         var2 = this.w + this.x.nextInt(16) + 8;
         var3 = this.x.nextInt(128);
         var4 = this.v + this.x.nextInt(16) + 8;
         this.g.a(this.z, this.x, var2, var3, var4);
      }

      if (this.x.nextInt(8) == 0) {
         var2 = this.w + this.x.nextInt(16) + 8;
         var3 = this.x.nextInt(128);
         var4 = this.v + this.x.nextInt(16) + 8;
         this.f.a(this.z, this.x, var2, var3, var4);
      }

      for(var2 = 0; var2 < this.try; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.v + this.x.nextInt(16) + 8;
         var7 = this.x.nextInt(128);
         this.d.a(this.z, this.x, var3, var7, var4);
      }

      for(var2 = 0; var2 < 10; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.x.nextInt(128);
         var7 = this.v + this.x.nextInt(16) + 8;
         this.d.a(this.z, this.x, var3, var4, var7);
      }

      if (this.x.nextInt(32) == 0) {
         var2 = this.w + this.x.nextInt(16) + 8;
         var3 = this.x.nextInt(128);
         var4 = this.v + this.x.nextInt(16) + 8;
         (new wo()).a(this.z, this.x, var2, var3, var4);
      }

      for(var2 = 0; var2 < this.new; ++var2) {
         var3 = this.w + this.x.nextInt(16) + 8;
         var4 = this.x.nextInt(128);
         var7 = this.v + this.x.nextInt(16) + 8;
         this.c.a(this.z, this.x, var3, var4, var7);
      }

      if (this.a) {
         for(var2 = 0; var2 < 50; ++var2) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.x.nextInt(this.x.nextInt(120) + 8);
            var7 = this.v + this.x.nextInt(16) + 8;
            (new wk(pa.bb.void)).a(this.z, this.x, var3, var4, var7);
         }

         for(var2 = 0; var2 < 20; ++var2) {
            var3 = this.w + this.x.nextInt(16) + 8;
            var4 = this.x.nextInt(this.x.nextInt(this.x.nextInt(112) + 8) + 8);
            var7 = this.v + this.x.nextInt(16) + 8;
            (new wk(pa.a7.void)).a(this.z, this.x, var3, var4, var7);
         }
      }

   }

   protected void a(int var1, w2 var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.w + this.x.nextInt(16);
         int var7 = this.x.nextInt(var4 - var3) + var3;
         int var8 = this.v + this.x.nextInt(16);
         var2.a(this.z, this.x, var6, var7, var8);
      }

   }

   protected void if(int var1, w2 var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.w + this.x.nextInt(16);
         int var7 = this.x.nextInt(var4) + this.x.nextInt(var4) + (var3 - var4);
         int var8 = this.v + this.x.nextInt(16);
         var2.a(this.z, this.x, var6, var7, var8);
      }

   }

   protected void a() {
      this.a(20, this.q, 0, 128);
      this.a(10, this.p, 0, 128);
      this.a(20, this.o, 0, 128);
      this.a(20, this.n, 0, 64);
      this.a(2, this.m, 0, 32);
      this.a(8, this.l, 0, 16);
      this.a(1, this.k, 0, 16);
      this.if(1, this.j, 16, 16);
   }
}
