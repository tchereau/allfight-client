public class aiz {
   private int if;
   private int a;
   private int new;
   private boolean int;
   private boolean for;
   private boolean do;

   public aiz(int var1, int var2) {
      this(var1, var2, 0);
   }

   public aiz(int var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public aiz(int var1, int var2, int var3, boolean var4) {
      this.if = var1;
      this.a = var2;
      this.new = var3;
      this.for = var4;
   }

   public aiz(aiz var1) {
      this.if = var1.if;
      this.a = var1.a;
      this.new = var1.new;
   }

   public void a(aiz var1) {
      if (this.if != var1.if) {
         System.err.println("This method should only be called for matching effects!");
      }

      if (var1.new > this.new) {
         this.new = var1.new;
         this.a = var1.a;
      } else if (var1.new == this.new && this.a < var1.a) {
         this.a = var1.a;
      } else if (!var1.for && this.for) {
         this.for = var1.for;
      }

   }

   public int byte() {
      return this.if;
   }

   public int do() {
      return this.a;
   }

   public int int() {
      return this.new;
   }

   public boolean if() {
      return this.int;
   }

   public void if(boolean var1) {
      this.int = var1;
   }

   public boolean for() {
      return this.for;
   }

   public boolean if(aig var1) {
      if (this.a > 0) {
         if (ai0.A[this.if].if(this.a, this.new)) {
            this.a(var1);
         }

         this.a();
      }

      return this.a > 0;
   }

   private int a() {
      return --this.a;
   }

   public void a(aig var1) {
      if (this.a > 0) {
         ai0.A[this.if].a(var1, this.new);
      }

   }

   public String try() {
      return ai0.A[this.if].byte();
   }

   public int hashCode() {
      return this.if;
   }

   public String toString() {
      String var1 = "";
      if (this.int() > 0) {
         var1 = this.try() + " x " + (this.int() + 1) + ", Duration: " + this.do();
      } else {
         var1 = this.try() + ", Duration: " + this.do();
      }

      if (this.int) {
         var1 = var1 + ", Splash: true";
      }

      return ai0.A[this.if].a() ? "(" + var1 + ")" : var1;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof aiz)) {
         return false;
      } else {
         aiz var2 = (aiz)var1;
         return this.if == var2.if && this.new == var2.new && this.a == var2.a && this.int == var2.int && this.for == var2.for;
      }
   }

   public aqv if(aqv var1) {
      var1.a("Id", (byte)this.byte());
      var1.a("Amplifier", (byte)this.int());
      var1.a("Duration", this.do());
      var1.a("Ambient", this.for());
      return var1;
   }

   public static aiz a(aqv var0) {
      byte var1 = var0.else("Id");
      byte var2 = var0.else("Amplifier");
      int var3 = var0.goto("Duration");
      boolean var4 = var0.if("Ambient");
      return new aiz(var1, var3, var2, var4);
   }

   public void a(boolean var1) {
      this.do = var1;
   }

   public boolean new() {
      return this.do;
   }
}
