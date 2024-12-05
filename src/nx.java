import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class nx extends n4 {
   private int else;
   private int char;
   private int d;
   private boolean c;
   private boolean b;
   private float void;
   private float long;
   private List goto = new ArrayList();

   public nx() {
   }

   public nx(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.else = var1;
      this.char = var2;
      this.d = var3;
      this.c = var4;
      this.b = var5;
   }

   public int i() {
      return this.else;
   }

   public int try() {
      return this.char;
   }

   public boolean h() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public boolean f() {
      return this.b;
   }

   public float a(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return this.long + (this.void - this.long) * var1;
   }

   public float for(float var1) {
      return this.c ? (this.a(var1) - 1.0F) * (float)api.a[this.d] : (1.0F - this.a(var1)) * (float)api.a[this.d];
   }

   public float do(float var1) {
      return this.c ? (this.a(var1) - 1.0F) * (float)api.int[this.d] : (1.0F - this.a(var1)) * (float)api.int[this.d];
   }

   public float if(float var1) {
      return this.c ? (this.a(var1) - 1.0F) * (float)api.for[this.d] : (1.0F - this.a(var1)) * (float)api.for[this.d];
   }

   private void a(float var1, float var2) {
      if (this.c) {
         var1 = 1.0F - var1;
      } else {
         --var1;
      }

      nw var3 = pa.bT.if(this.try, this.new, this.int, this.for, this.else, var1, this.d);
      if (var3 != null) {
         List var4 = this.try.a((aiw)null, (nw)var3);
         if (!var4.isEmpty()) {
            this.goto.addAll(var4);
            Iterator var5 = this.goto.iterator();

            while(var5.hasNext()) {
               aiw var6 = (aiw)var5.next();
               var6.do((double)(var2 * (float)api.a[this.d]), (double)(var2 * (float)api.int[this.d]), (double)(var2 * (float)api.for[this.d]));
            }

            this.goto.clear();
         }
      }

   }

   public void e() {
      if (this.long < 1.0F && this.try != null) {
         this.long = this.void = 1.0F;
         this.try.b(this.new, this.int, this.for);
         this.c();
         if (this.try.new(this.new, this.int, this.for) == pa.bT.void) {
            this.try.int(this.new, this.int, this.for, this.else, this.char, 3);
            this.try.try(this.new, this.int, this.for, this.else);
         }
      }

   }

   public void long() {
      this.long = this.void;
      if (this.long >= 1.0F) {
         this.a(1.0F, 0.25F);
         this.try.b(this.new, this.int, this.for);
         this.c();
         if (this.try.new(this.new, this.int, this.for) == pa.bT.void) {
            this.try.int(this.new, this.int, this.for, this.else, this.char, 3);
            this.try.try(this.new, this.int, this.for, this.else);
         }

      } else {
         this.void += 0.5F;
         if (this.void >= 1.0F) {
            this.void = 1.0F;
         }

         if (this.c) {
            this.a(this.void, this.void - this.long + 0.0625F);
         }

      }
   }

   public void a(aqv var1) {
      super.a(var1);
      this.else = var1.goto("blockId");
      this.char = var1.goto("blockData");
      this.d = var1.goto("facing");
      this.long = this.void = var1.b("progress");
      this.c = var1.if("extending");
   }

   public void do(aqv var1) {
      super.do(var1);
      var1.a("blockId", this.else);
      var1.a("blockData", this.char);
      var1.a("facing", this.d);
      var1.a("progress", this.long);
      var1.a("extending", this.c);
   }
}
