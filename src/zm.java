public class zm {
   private abp if;
   private abp a;
   private abp int;
   private int for;
   private int do;

   public zm(aqv var1) {
      this.a(var1);
   }

   public zm(abp var1, abp var2, abp var3) {
      this.if = var1;
      this.a = var2;
      this.int = var3;
      this.do = 7;
   }

   public zm(abp var1, abp var2) {
      this(var1, (abp)null, var2);
   }

   public zm(abp var1, abr var2) {
      this(var1, new abp(var2));
   }

   public abp byte() {
      return this.if;
   }

   public abp for() {
      return this.a;
   }

   public boolean try() {
      return this.a != null;
   }

   public abp if() {
      return this.int;
   }

   public boolean if(zm var1) {
      if (this.if.new == var1.if.new && this.int.new == var1.int.new) {
         return this.a == null && var1.a == null || this.a != null && var1.a != null && this.a.new == var1.a.new;
      } else {
         return false;
      }
   }

   public boolean a(zm var1) {
      return this.if(var1) && (this.if.if < var1.if.if || this.a != null && this.a.if < var1.a.if);
   }

   public void a() {
      ++this.for;
   }

   public void a(int var1) {
      this.do += var1;
   }

   public boolean new() {
      return this.for >= this.do;
   }

   public void int() {
      this.for = this.do;
   }

   public void a(aqv var1) {
      aqv var2 = var1.char("buy");
      this.if = abp.for(var2);
      aqv var3 = var1.char("sell");
      this.int = abp.for(var3);
      if (var1.try("buyB")) {
         this.a = abp.for(var1.char("buyB"));
      }

      if (var1.try("uses")) {
         this.for = var1.goto("uses");
      }

      if (var1.try("maxUses")) {
         this.do = var1.goto("maxUses");
      } else {
         this.do = 7;
      }

   }

   public aqv do() {
      aqv var1 = new aqv();
      var1.a("buy", this.if.if(new aqv("buy")));
      var1.a("sell", this.int.if(new aqv("sell")));
      if (this.a != null) {
         var1.a("buyB", this.a.if(new aqv("buyB")));
      }

      var1.a("uses", this.for);
      var1.a("maxUses", this.do);
      return var1;
   }
}
