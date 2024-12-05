import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ai5 {
   private final List if = new ArrayList();
   private final aig a;
   private int new = 0;
   private boolean int = false;
   private boolean for = false;
   private String do;

   public ai5(aig var1) {
      this.a = var1;
   }

   public void do() {
      this.new();
      if (this.a.bZ()) {
         int var1 = this.a.ap.new(ajs.a(this.a.al), ajs.a(this.a.aZ.a), ajs.a(this.a.aj));
         if (var1 == pa.cn.void) {
            this.do = "ladder";
         } else if (var1 == pa.Z.void) {
            this.do = "vines";
         }
      } else if (this.a.ap()) {
         this.do = "water";
      }

   }

   public void a(ai4 var1, int var2, int var3) {
      this.for();
      this.do();
      ai6 var4 = new ai6(var1, this.a.bl, var2, var3, this.do, this.a.aK);
      this.if.add(var4);
      this.new = this.a.bl;
      this.for = true;
      this.int |= var4.new();
   }

   public String a() {
      if (this.if.size() == 0) {
         return this.a.at() + " died";
      } else {
         ai6 var1 = this.if();
         ai6 var2 = (ai6)this.if.get(this.if.size() - 1);
         String var3 = "";
         String var4 = var2.if();
         aiw var5 = var2.do().new();
         if (var1 != null && var2.do() == ai4.c) {
            String var6 = var1.if();
            if (var1.do() != ai4.c && var1.do() != ai4.b) {
               if (var6 == null || var4 != null && var6.equals(var4)) {
                  if (var4 != null) {
                     abp var9 = var5 instanceof aig ? ((aig)var5).bW() : null;
                     if (var9 != null && var9.g()) {
                        var3 = aqz.a("death.fell.finish.item", this.a.at(), var4, var9.void());
                     } else {
                        var3 = aqz.a("death.fell.finish", this.a.at(), var4);
                     }
                  } else {
                     var3 = aqz.a("death.fell.killer", this.a.at());
                  }
               } else {
                  aiw var7 = var1.do().new();
                  abp var8 = var7 instanceof aig ? ((aig)var7).bW() : null;
                  if (var8 != null && var8.g()) {
                     var3 = aqz.a("death.fell.assist.item", this.a.at(), var4, var8.void());
                  } else {
                     var3 = aqz.a("death.fell.assist", this.a.at(), var6);
                  }
               }
            } else {
               var3 = aqz.a("death.fell.accident." + this.a(var1), this.a.at());
            }
         } else {
            var3 = var2.do().if(this.a);
         }

         return var3;
      }
   }

   public aig int() {
      aig var1 = null;
      aek var2 = null;
      int var3 = 0;
      int var4 = 0;
      Iterator var5 = this.if.iterator();

      while(true) {
         ai6 var6;
         do {
            do {
               if (!var5.hasNext()) {
                  if (var2 != null && var4 >= var3 / 3) {
                     return var2;
                  }

                  return var1;
               }

               var6 = (ai6)var5.next();
               if (var6.do().new() instanceof aek && (var2 == null || var6.a() > var4)) {
                  var4 = var6.a();
                  var2 = (aek)var6.do().new();
               }
            } while(!(var6.do().new() instanceof aig));
         } while(var1 != null && var6.a() <= var3);

         var3 = var6.a();
         var1 = (aig)var6.do().new();
      }
   }

   private ai6 if() {
      ai6 var1 = null;
      ai6 var2 = null;
      byte var3 = 0;
      float var4 = 0.0F;

      for(int var5 = 0; var5 < this.if.size(); ++var5) {
         ai6 var6 = (ai6)this.if.get(var5);
         ai6 var7 = var5 > 0 ? (ai6)this.if.get(var5 - 1) : null;
         if ((var6.do() == ai4.c || var6.do() == ai4.b) && var6.int() > 0.0F && (var1 == null || var6.int() > var4)) {
            if (var5 > 0) {
               var1 = var7;
            } else {
               var1 = var6;
            }

            var4 = var6.int();
         }

         if (var6.for() != null && (var2 == null || var6.a() > var3)) {
            var2 = var6;
         }
      }

      if (var4 > 5.0F && var1 != null) {
         return var1;
      } else if (var3 > 5 && var2 != null) {
         return var2;
      } else {
         return null;
      }
   }

   private String a(ai6 var1) {
      return var1.for() == null ? "generic" : var1.for();
   }

   private void new() {
      this.do = null;
   }

   private void for() {
      int var1 = this.int ? 300 : 100;
      if (this.for && this.a.bl - this.new > var1) {
         this.if.clear();
         this.for = false;
         this.int = false;
      }

   }
}
