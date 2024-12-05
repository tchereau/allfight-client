public class ald extends ak1 {
   private boolean f = false;
   private boolean e = false;
   private int d = 0;
   private int c = 0;

   public ald(y6 var1) {
      super(var1);
   }

   public void if() {
      super.if();
      ++this.c;
      long var1 = this.b.m();
      long var3 = var1 / 24000L + 1L;
      if (!this.f && this.c > 20) {
         this.f = true;
         this.void.pV.if((an7)(new aoq(5, 0)));
      }

      this.e = var1 > 120500L;
      if (this.e) {
         ++this.d;
      }

      if (var1 % 24000L == 500L) {
         if (var3 <= 6L) {
            this.void.a(this.void.a((String)("demo.day." + var3), (Object[])(new Object[0])));
         }
      } else if (var3 == 1L) {
         if (var1 == 100L) {
            this.void.pV.if((an7)(new aoq(5, 101)));
         } else if (var1 == 175L) {
            this.void.pV.if((an7)(new aoq(5, 102)));
         } else if (var1 == 250L) {
            this.void.pV.if((an7)(new aoq(5, 103)));
         }
      } else if (var3 == 5L && var1 % 24000L == 22000L) {
         this.void.a(this.void.a((String)"demo.day.warning", (Object[])(new Object[0])));
      }

   }

   private void for() {
      if (this.d > 100) {
         this.void.a(this.void.a((String)"demo.reminder", (Object[])(new Object[0])));
         this.d = 0;
      }

   }

   public void a(int var1, int var2, int var3, int var4) {
      if (this.e) {
         this.for();
      } else {
         super.a(var1, var2, var3, var4);
      }
   }

   public void a(int var1, int var2, int var3) {
      if (!this.e) {
         super.a(var1, var2, var3);
      }
   }

   public boolean for(int var1, int var2, int var3) {
      return this.e ? false : super.for(var1, var2, var3);
   }

   public boolean a(aek var1, y6 var2, abp var3) {
      if (this.e) {
         this.for();
         return false;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public boolean a(aek var1, y6 var2, abp var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (this.e) {
         this.for();
         return false;
      } else {
         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
   }
}
