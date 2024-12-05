import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class agc extends s0 {
   private y6 goto;
   private final List else = new ArrayList();
   private final List b = new ArrayList();
   private final List void = new ArrayList();
   private int long = 0;

   public agc(String var1) {
      super(var1);
   }

   public agc(y6 var1) {
      super("villages");
      this.goto = var1;
      this.a();
   }

   public void a(y6 var1) {
      this.goto = var1;
      Iterator var2 = this.void.iterator();

      while(var2.hasNext()) {
         agf var3 = (agf)var2.next();
         var3.a(var1);
      }

   }

   public void do(int var1, int var2, int var3) {
      if (this.else.size() <= 64) {
         if (!this.new(var1, var2, var3)) {
            this.else.add(new apg(var1, var2, var3));
         }

      }
   }

   public void int() {
      ++this.long;
      Iterator var1 = this.void.iterator();

      while(var1.hasNext()) {
         agf var2 = (agf)var1.next();
         var2.a(this.long);
      }

      this.for();
      this.do();
      this.new();
      if (this.long % 400 == 0) {
         this.a();
      }

   }

   private void for() {
      Iterator var1 = this.void.iterator();

      while(var1.hasNext()) {
         agf var2 = (agf)var1.next();
         if (var2.case()) {
            var1.remove();
            this.a();
         }
      }

   }

   public List try() {
      return this.void;
   }

   public agf a(int var1, int var2, int var3, int var4) {
      agf var5 = null;
      float var6 = Float.MAX_VALUE;
      Iterator var7 = this.void.iterator();

      while(var7.hasNext()) {
         agf var8 = (agf)var7.next();
         float var9 = var8.void().if(var1, var2, var3);
         if (!(var9 >= var6)) {
            int var10 = var4 + var8.if();
            if (!(var9 > (float)(var10 * var10))) {
               var5 = var8;
               var6 = var9;
            }
         }
      }

      return var5;
   }

   private void do() {
      if (!this.else.isEmpty()) {
         this.a((apg)this.else.remove(0));
      }
   }

   private void new() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         agg var2 = (agg)this.b.get(var1);
         boolean var3 = false;
         Iterator var4 = this.void.iterator();

         while(var4.hasNext()) {
            agf var5 = (agf)var4.next();
            int var6 = (int)var5.void().if(var2.if, var2.a, var2.byte);
            int var7 = 32 + var5.if();
            if (var6 <= var7 * var7) {
               var5.a(var2);
               var3 = true;
               break;
            }
         }

         if (!var3) {
            agf var8 = new agf(this.goto);
            var8.a(var2);
            this.void.add(var8);
            this.a();
         }
      }

      this.b.clear();
   }

   private void a(apg var1) {
      byte var2 = 16;
      byte var3 = 4;
      byte var4 = 16;

      for(int var5 = var1.if - var2; var5 < var1.if + var2; ++var5) {
         for(int var6 = var1.a - var3; var6 < var1.a + var3; ++var6) {
            for(int var7 = var1.do - var4; var7 < var1.do + var4; ++var7) {
               if (this.for(var5, var6, var7)) {
                  agg var8 = this.if(var5, var6, var7);
                  if (var8 == null) {
                     this.int(var5, var6, var7);
                  } else {
                     var8.int = this.long;
                  }
               }
            }
         }
      }

   }

   private agg if(int var1, int var2, int var3) {
      Iterator var4 = this.b.iterator();

      agg var5;
      do {
         if (!var4.hasNext()) {
            var4 = this.void.iterator();

            agg var6;
            do {
               if (!var4.hasNext()) {
                  return null;
               }

               agf var7 = (agf)var4.next();
               var6 = var7.do(var1, var2, var3);
            } while(var6 == null);

            return var6;
         }

         var5 = (agg)var4.next();
      } while(var5.if != var1 || var5.byte != var3 || Math.abs(var5.a - var2) > 1);

      return var5;
   }

   private void int(int var1, int var2, int var3) {
      int var4 = ((rg)pa.co).b(this.goto, var1, var2, var3);
      int var5;
      int var6;
      if (var4 != 0 && var4 != 2) {
         var5 = 0;

         for(var6 = -5; var6 < 0; ++var6) {
            if (this.goto.j(var1, var2, var3 + var6)) {
               --var5;
            }
         }

         for(var6 = 1; var6 <= 5; ++var6) {
            if (this.goto.j(var1, var2, var3 + var6)) {
               ++var5;
            }
         }

         if (var5 != 0) {
            this.b.add(new agg(var1, var2, var3, 0, var5 > 0 ? -2 : 2, this.long));
         }
      } else {
         var5 = 0;

         for(var6 = -5; var6 < 0; ++var6) {
            if (this.goto.j(var1 + var6, var2, var3)) {
               --var5;
            }
         }

         for(var6 = 1; var6 <= 5; ++var6) {
            if (this.goto.j(var1 + var6, var2, var3)) {
               ++var5;
            }
         }

         if (var5 != 0) {
            this.b.add(new agg(var1, var2, var3, var5 > 0 ? -2 : 2, 0, this.long));
         }
      }

   }

   private boolean new(int var1, int var2, int var3) {
      Iterator var4 = this.else.iterator();

      apg var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (apg)var4.next();
      } while(var5.if != var1 || var5.a != var2 || var5.do != var3);

      return true;
   }

   private boolean for(int var1, int var2, int var3) {
      int var4 = this.goto.new(var1, var2, var3);
      return var4 == pa.co.void;
   }

   public void if(aqv var1) {
      this.long = var1.goto("Tick");
      aqm var2 = var1.void("Villages");

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         agf var5 = new agf();
         var5.a(var4);
         this.void.add(var5);
      }

   }

   public void a(aqv var1) {
      var1.a("Tick", this.long);
      aqm var2 = new aqm("Villages");
      Iterator var3 = this.void.iterator();

      while(var3.hasNext()) {
         agf var4 = (agf)var3.next();
         aqv var5 = new aqv("Village");
         var4.if(var5);
         var2.a((aqd)var5);
      }

      var1.a("Villages", (aqd)var2);
   }
}
