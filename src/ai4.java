public class ai4 {
   public static ai4 j = (new ai4("inFire")).if();
   public static ai4 i = (new ai4("onFire")).c().if();
   public static ai4 h = (new ai4("lava")).if();
   public static ai4 g = (new ai4("inWall")).c();
   public static ai4 f = (new ai4("drown")).c();
   public static ai4 e = (new ai4("starve")).c();
   public static ai4 d = new ai4("cactus");
   public static ai4 c = (new ai4("fall")).c();
   public static ai4 b = (new ai4("outOfWorld")).c().void();
   public static ai4 void = (new ai4("generic")).c();
   public static ai4 long = (new ai4("magic")).c().b();
   public static ai4 goto = (new ai4("wither")).c();
   public static ai4 else = new ai4("anvil");
   public static ai4 char = new ai4("fallingBlock");
   private boolean byte = false;
   private boolean try = false;
   private float new = 0.3F;
   private boolean int;
   private boolean for;
   private boolean do;
   private boolean if = false;
   private boolean a = false;
   public String case;

   public static ai4 a(aig var0) {
      return new ai3("mob", var0);
   }

   public static ai4 a(aek var0) {
      return new ai3("player", var0);
   }

   public static ai4 a(aei var0, aiw var1) {
      return (new ai2("arrow", var0, var1)).d();
   }

   public static ai4 a(aeg var0, aiw var1) {
      return var1 == null ? (new ai2("onFire", var0, var0)).if().d() : (new ai2("fireball", var0, var1)).if().d();
   }

   public static ai4 a(aiw var0, aiw var1) {
      return (new ai2("thrown", var0, var1)).d();
   }

   public static ai4 if(aiw var0, aiw var1) {
      return (new ai2("indirectMagic", var0, var1)).c().b();
   }

   public static ai4 a(aiw var0) {
      return (new ai3("thorns", var0)).b();
   }

   public static ai4 a(zg var0) {
      return var0 != null && var0.do() != null ? (new ai3("explosion.player", var0.do())).try().goto() : (new ai4("explosion")).try().goto();
   }

   public boolean int() {
      return this.for;
   }

   public ai4 d() {
      this.for = true;
      return this;
   }

   public boolean long() {
      return this.a;
   }

   public ai4 goto() {
      this.a = true;
      return this;
   }

   public boolean a() {
      return this.byte;
   }

   public float case() {
      return this.new;
   }

   public boolean for() {
      return this.try;
   }

   protected ai4(String var1) {
      this.case = var1;
   }

   public aiw byte() {
      return this.new();
   }

   public aiw new() {
      return null;
   }

   protected ai4 c() {
      this.byte = true;
      this.new = 0.0F;
      return this;
   }

   protected ai4 void() {
      this.try = true;
      return this;
   }

   protected ai4 if() {
      this.int = true;
      return this;
   }

   public String if(aig var1) {
      aig var2 = var1.bN();
      String var3 = "death.attack." + this.case;
      String var4 = var3 + ".player";
      return var2 != null && aqz.a(var4) ? aqz.a(var4, var1.at(), var2.at()) : aqz.a(var3, var1.at());
   }

   public boolean do() {
      return this.int;
   }

   public String else() {
      return this.case;
   }

   public ai4 try() {
      this.do = true;
      return this;
   }

   public boolean char() {
      return this.do;
   }

   public boolean e() {
      return this.if;
   }

   public ai4 b() {
      this.if = true;
      return this;
   }
}
