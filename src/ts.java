public class ts {
   public static final ts z;
   public static final ts y;
   public static final ts x;
   public static final ts w;
   public static final ts v;
   public static final ts u;
   public static final ts t;
   public static final ts s;
   public static final ts r;
   public static final ts q;
   public static final ts p;
   public static final ts o;
   public static final ts n;
   public static final ts m;
   public static final ts l;
   public static final ts k;
   public static final ts j;
   public static final ts i;
   public static final ts h;
   public static final ts g;
   public static final ts f;
   public static final ts e;
   public static final ts d;
   public static final ts c;
   public static final ts b;
   public static final ts void;
   public static final ts long;
   public static final ts goto;
   public static final ts else;
   public static final ts char;
   public static final ts case;
   public static final ts byte;
   private boolean new;
   private boolean int;
   private boolean for;
   public final tq try;
   private boolean do = true;
   private int if;
   private boolean a;

   public ts(tq var1) {
      this.try = var1;
   }

   public boolean case() {
      return false;
   }

   public boolean for() {
      return true;
   }

   public boolean d() {
      return true;
   }

   public boolean void() {
      return true;
   }

   private ts else() {
      this.for = true;
      return this;
   }

   protected ts long() {
      this.do = false;
      return this;
   }

   protected ts char() {
      this.new = true;
      return this;
   }

   public boolean byte() {
      return this.new;
   }

   public ts int() {
      this.int = true;
      return this;
   }

   public boolean c() {
      return this.int;
   }

   public boolean goto() {
      return this.for ? false : this.void();
   }

   public boolean try() {
      return this.do;
   }

   public int b() {
      return this.if;
   }

   protected ts new() {
      this.if = 1;
      return this;
   }

   protected ts do() {
      this.if = 2;
      return this;
   }

   protected ts if() {
      this.a = true;
      return this;
   }

   public boolean a() {
      return this.a;
   }

   static {
      z = new tu(tq.c);
      y = new ts(tq.b);
      x = new ts(tq.new);
      w = (new ts(tq.do)).char();
      v = (new ts(tq.int)).long();
      u = (new ts(tq.char)).long();
      t = (new ts(tq.char)).long().do();
      s = (new tt(tq.for)).new();
      r = (new tt(tq.goto)).new();
      q = (new ts(tq.case)).char().else().new();
      p = (new tv(tq.case)).new();
      o = (new tv(tq.case)).char().new().int();
      n = new ts(tq.long);
      m = (new ts(tq.long)).char();
      l = (new tu(tq.c)).new();
      k = new ts(tq.void);
      j = (new tv(tq.c)).new();
      i = (new ts(tq.c)).else().if();
      h = (new ts(tq.c)).if();
      g = (new ts(tq.goto)).char().else();
      f = (new ts(tq.case)).new();
      e = (new ts(tq.else)).else().if();
      d = (new tv(tq.byte)).int().else().long().new();
      c = (new ts(tq.byte)).long();
      b = (new ts(tq.case)).else().new();
      void = new ts(tq.try);
      long = (new ts(tq.case)).new();
      goto = (new ts(tq.case)).new();
      else = (new tp(tq.c)).do();
      char = (new ts(tq.c)).new();
      case = (new tr(tq.long)).long().new();
      byte = (new ts(tq.int)).do();
   }
}
