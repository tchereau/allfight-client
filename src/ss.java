import java.util.concurrent.Callable;

public class ss {
   private long k;
   private yx j;
   private String i;
   private int h;
   private int g;
   private int f;
   private long e;
   private long d;
   private long c;
   private long b;
   private aqv void;
   private int long;
   private String goto;
   private int else;
   private boolean char;
   private int case;
   private boolean byte;
   private int try;
   private yz new;
   private boolean int;
   private boolean for;
   private boolean do;
   private boolean if;
   private ze a;

   protected ss() {
      this.j = yx.case;
      this.i = "";
      this.a = new ze();
   }

   public ss(aqv var1) {
      this.j = yx.case;
      this.i = "";
      this.a = new ze();
      this.k = var1.long("RandomSeed");
      if (var1.try("generatorName")) {
         String var2 = var1.new("generatorName");
         this.j = yx.a(var2);
         if (this.j == null) {
            this.j = yx.case;
         } else if (this.j.a()) {
            int var3 = 0;
            if (var1.try("generatorVersion")) {
               var3 = var1.goto("generatorVersion");
            }

            this.j = this.j.a(var3);
         }

         if (var1.try("generatorOptions")) {
            this.i = var1.new("generatorOptions");
         }
      }

      this.new = yz.a(var1.goto("GameType"));
      if (var1.try("MapFeatures")) {
         this.int = var1.if("MapFeatures");
      } else {
         this.int = true;
      }

      this.h = var1.goto("SpawnX");
      this.g = var1.goto("SpawnY");
      this.f = var1.goto("SpawnZ");
      this.e = var1.long("Time");
      if (var1.try("DayTime")) {
         this.d = var1.long("DayTime");
      } else {
         this.d = this.e;
      }

      this.c = var1.long("LastPlayed");
      this.b = var1.long("SizeOnDisk");
      this.goto = var1.new("LevelName");
      this.else = var1.goto("version");
      this.case = var1.goto("rainTime");
      this.char = var1.if("raining");
      this.try = var1.goto("thunderTime");
      this.byte = var1.if("thundering");
      this.for = var1.if("hardcore");
      if (var1.try("initialized")) {
         this.if = var1.if("initialized");
      } else {
         this.if = true;
      }

      if (var1.try("allowCommands")) {
         this.do = var1.if("allowCommands");
      } else {
         this.do = this.new == yz.try;
      }

      if (var1.try("Player")) {
         this.void = var1.char("Player");
         this.long = this.void.goto("Dimension");
      }

      if (var1.try("GameRules")) {
         this.a.a(var1.char("GameRules"));
      }

   }

   public ss(y0 var1, String var2) {
      this.j = yx.case;
      this.i = "";
      this.a = new ze();
      this.k = var1.if();
      this.new = var1.case();
      this.int = var1.int();
      this.goto = var2;
      this.for = var1.byte();
      this.j = var1.do();
      this.i = var1.char();
      this.do = var1.a();
      this.if = false;
   }

   public ss(ss var1) {
      this.j = yx.case;
      this.i = "";
      this.a = new ze();
      this.k = var1.k;
      this.j = var1.j;
      this.i = var1.i;
      this.new = var1.new;
      this.int = var1.int;
      this.h = var1.h;
      this.g = var1.g;
      this.f = var1.f;
      this.e = var1.e;
      this.d = var1.d;
      this.c = var1.c;
      this.b = var1.b;
      this.void = var1.void;
      this.long = var1.long;
      this.goto = var1.goto;
      this.else = var1.else;
      this.case = var1.case;
      this.char = var1.char;
      this.try = var1.try;
      this.byte = var1.byte;
      this.for = var1.for;
      this.do = var1.do;
      this.if = var1.if;
      this.a = var1.a;
   }

   public aqv try() {
      aqv var1 = new aqv();
      this.a(var1, this.void);
      return var1;
   }

   public aqv a(aqv var1) {
      aqv var2 = new aqv();
      this.a(var2, var1);
      return var2;
   }

   private void a(aqv var1, aqv var2) {
      var1.a("RandomSeed", this.k);
      var1.a("generatorName", this.j.byte());
      var1.a("generatorVersion", this.j.do());
      var1.a("generatorOptions", this.i);
      var1.a("GameType", this.new.new());
      var1.a("MapFeatures", this.int);
      var1.a("SpawnX", this.h);
      var1.a("SpawnY", this.g);
      var1.a("SpawnZ", this.f);
      var1.a("Time", this.e);
      var1.a("DayTime", this.d);
      var1.a("SizeOnDisk", this.b);
      var1.a("LastPlayed", System.currentTimeMillis());
      var1.a("LevelName", this.goto);
      var1.a("version", this.else);
      var1.a("rainTime", this.case);
      var1.a("raining", this.char);
      var1.a("thunderTime", this.try);
      var1.a("thundering", this.byte);
      var1.a("hardcore", this.for);
      var1.a("allowCommands", this.do);
      var1.a("initialized", this.if);
      var1.a("GameRules", this.a.if());
      if (var2 != null) {
         var1.a("Player", var2);
      }

   }

   public long case() {
      return this.k;
   }

   public int h() {
      return this.h;
   }

   public int int() {
      return this.g;
   }

   public int b() {
      return this.f;
   }

   public long if() {
      return this.e;
   }

   public long else() {
      return this.d;
   }

   public long j() {
      return this.b;
   }

   public aqv byte() {
      return this.void;
   }

   public int e() {
      return this.long;
   }

   public void if(int var1) {
      this.h = var1;
   }

   public void new(int var1) {
      this.g = var1;
   }

   public void for(int var1) {
      this.f = var1;
   }

   public void if(long var1) {
      this.e = var1;
   }

   public void a(long var1) {
      this.d = var1;
   }

   public void a(int var1, int var2, int var3) {
      this.h = var1;
      this.g = var2;
      this.f = var3;
   }

   public String l() {
      return this.goto;
   }

   public void a(String var1) {
      this.goto = var1;
   }

   public int goto() {
      return this.else;
   }

   public void a(int var1) {
      this.else = var1;
   }

   public long k() {
      return this.c;
   }

   public boolean do() {
      return this.byte;
   }

   public void a(boolean var1) {
      this.byte = var1;
   }

   public int g() {
      return this.try;
   }

   public void int(int var1) {
      this.try = var1;
   }

   public boolean a() {
      return this.char;
   }

   public void do(boolean var1) {
      this.char = var1;
   }

   public int long() {
      return this.case;
   }

   public void do(int var1) {
      this.case = var1;
   }

   public yz f() {
      return this.new;
   }

   public boolean for() {
      return this.int;
   }

   public void a(yz var1) {
      this.new = var1;
   }

   public boolean void() {
      return this.for;
   }

   public yx new() {
      return this.j;
   }

   public void a(yx var1) {
      this.j = var1;
   }

   public String d() {
      return this.i;
   }

   public boolean char() {
      return this.do;
   }

   public boolean i() {
      return this.if;
   }

   public void if(boolean var1) {
      this.if = var1;
   }

   public ze c() {
      return this.a;
   }

   public void a(apu var1) {
      var1.a((String)"Level seed", (Callable)(new sr(this)));
      var1.a((String)"Level generator", (Callable)(new sq(this)));
      var1.a((String)"Level generator options", (Callable)(new sp(this)));
      var1.a((String)"Level spawn location", (Callable)(new so(this)));
      var1.a((String)"Level time", (Callable)(new sn(this)));
      var1.a((String)"Level dimension", (Callable)(new sm(this)));
      var1.a((String)"Level storage version", (Callable)(new sl(this)));
      var1.a((String)"Level weather", (Callable)(new sk(this)));
      var1.a((String)"Level game mode", (Callable)(new sj(this)));
   }

   // $FF: synthetic method
   static yx byte(ss var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static boolean int(ss var0) {
      return var0.int;
   }

   // $FF: synthetic method
   static String long(ss var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static int try(ss var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int b(ss var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static int do(ss var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static long goto(ss var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static long a(ss var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static int char(ss var0) {
      return var0.long;
   }

   // $FF: synthetic method
   static int d(ss var0) {
      return var0.else;
   }

   // $FF: synthetic method
   static int new(ss var0) {
      return var0.case;
   }

   // $FF: synthetic method
   static boolean else(ss var0) {
      return var0.char;
   }

   // $FF: synthetic method
   static int if(ss var0) {
      return var0.try;
   }

   // $FF: synthetic method
   static boolean case(ss var0) {
      return var0.byte;
   }

   // $FF: synthetic method
   static yz c(ss var0) {
      return var0.new;
   }

   // $FF: synthetic method
   static boolean for(ss var0) {
      return var0.for;
   }

   // $FF: synthetic method
   static boolean void(ss var0) {
      return var0.do;
   }
}
