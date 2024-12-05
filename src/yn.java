import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class yn {
   public static final yn[] G = new yn[256];
   public static final yn F = (new x8(0)).if(112).a("Ocean").if(-1.0F, 0.4F);
   public static final yn E = (new x7(1)).if(9286496).a("Plains").a(0.8F, 0.4F);
   public static final yn D = (new yh(2)).if(16421912).a("Desert").long().a(2.0F, 0.0F).if(0.1F, 0.2F);
   public static final yn C = (new yg(3)).if(6316128).a("Extreme Hills").if(0.3F, 1.5F).a(0.2F, 0.3F);
   public static final yn B = (new ye(4)).if(353825).a("Forest").a(5159473).a(0.7F, 0.8F);
   public static final yn A = (new x4(5)).if(747097).a("Taiga").a(5159473).byte().a(0.05F, 0.8F).if(0.1F, 0.4F);
   public static final yn z = (new x5(6)).if(522674).a("Swampland").a(9154376).if(-0.2F, 0.1F).a(0.8F, 0.9F);
   public static final yn y = (new x6(7)).if(255).a("River").if(-0.5F, 0.0F);
   public static final yn x = (new yd(8)).if(16711680).a("Hell").long().a(2.0F, 0.0F);
   public static final yn w = (new x3(9)).if(8421631).a("Sky").long();
   public static final yn v = (new x8(10)).if(9474208).a("FrozenOcean").byte().if(-1.0F, 0.5F).a(0.0F, 0.5F);
   public static final yn u = (new x6(11)).if(10526975).a("FrozenRiver").byte().if(-0.5F, 0.0F).a(0.0F, 0.5F);
   public static final yn t = (new yb(12)).if(16777215).a("Ice Plains").byte().a(0.0F, 0.5F);
   public static final yn s = (new yb(13)).if(10526880).a("Ice Mountains").byte().if(0.3F, 1.3F).a(0.0F, 0.5F);
   public static final yn r = (new x9(14)).if(16711935).a("MushroomIsland").a(0.9F, 1.0F).if(0.2F, 1.0F);
   public static final yn q = (new x9(15)).if(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).if(-1.0F, 0.1F);
   public static final yn p = (new yo(16)).if(16440917).a("Beach").a(0.8F, 0.4F).if(0.0F, 0.1F);
   public static final yn o = (new yh(17)).if(13786898).a("DesertHills").long().a(2.0F, 0.0F).if(0.3F, 0.8F);
   public static final yn n = (new ye(18)).if(2250012).a("ForestHills").a(5159473).a(0.7F, 0.8F).if(0.3F, 0.7F);
   public static final yn m = (new x4(19)).if(1456435).a("TaigaHills").byte().a(5159473).a(0.05F, 0.8F).if(0.3F, 0.8F);
   public static final yn l = (new yg(20)).if(7501978).a("Extreme Hills Edge").if(0.2F, 0.8F).a(0.2F, 0.3F);
   public static final yn k = (new ya(21)).if(5470985).a("Jungle").a(5470985).a(1.2F, 0.9F).if(0.2F, 0.4F);
   public static final yn j = (new ya(22)).if(2900485).a("JungleHills").a(5470985).a(1.2F, 0.9F).if(1.8F, 0.5F);
   public String i;
   public int h;
   public byte g;
   public byte f;
   public int e;
   public float d;
   public float c;
   public float b;
   public float void;
   public int long;
   public yj goto;
   protected List else;
   protected List char;
   protected List case;
   protected List byte;
   private boolean if;
   private boolean a;
   public final int try;
   protected wg new;
   protected w9 int;
   protected w8 for;
   protected wi do;

   protected yn(int var1) {
      this.g = (byte)pa.i.void;
      this.f = (byte)pa.g.void;
      this.e = 5169201;
      this.d = 0.1F;
      this.c = 0.3F;
      this.b = 0.5F;
      this.void = 0.5F;
      this.long = 16777215;
      this.else = new ArrayList();
      this.char = new ArrayList();
      this.case = new ArrayList();
      this.byte = new ArrayList();
      this.a = true;
      this.new = new wg(false);
      this.int = new w9(false);
      this.for = new w8(false);
      this.do = new wi();
      this.try = var1;
      G[var1] = this;
      this.goto = this.new();
      this.char.add(new ym(af2.class, 12, 4, 4));
      this.char.add(new ym(af3.class, 10, 4, 4));
      this.char.add(new ym(af8.class, 10, 4, 4));
      this.char.add(new ym(af7.class, 8, 4, 4));
      this.else.add(new ym(aeu.class, 10, 4, 4));
      this.else.add(new ym(aes.class, 10, 4, 4));
      this.else.add(new ym(aew.class, 10, 4, 4));
      this.else.add(new ym(ae7.class, 10, 4, 4));
      this.else.add(new ym(aev.class, 10, 4, 4));
      this.else.add(new ym(ae6.class, 1, 1, 4));
      this.case.add(new ym(afz.class, 10, 4, 4));
      this.byte.add(new ym(aga.class, 10, 8, 8));
   }

   protected yj new() {
      return new yj(this);
   }

   private yn a(float var1, float var2) {
      if (var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.b = var1;
         this.void = var2;
         return this;
      }
   }

   private yn if(float var1, float var2) {
      this.d = var1;
      this.c = var2;
      return this;
   }

   private yn long() {
      this.a = false;
      return this;
   }

   public w2 if(Random var1) {
      return (w2)(var1.nextInt(10) == 0 ? this.int : this.new);
   }

   public w2 a(Random var1) {
      return new wh(pa.b3.void, 1);
   }

   protected yn byte() {
      this.if = true;
      return this;
   }

   protected yn a(String var1) {
      this.i = var1;
      return this;
   }

   protected yn a(int var1) {
      this.e = var1;
      return this;
   }

   protected yn if(int var1) {
      this.h = var1;
      return this;
   }

   public int a(float var1) {
      var1 /= 3.0F;
      if (var1 < -1.0F) {
         var1 = -1.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return Color.getHSBColor(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F).getRGB();
   }

   public List a(ah9 var1) {
      if (var1 == ah9.char) {
         return this.else;
      } else if (var1 == ah9.case) {
         return this.char;
      } else if (var1 == ah9.try) {
         return this.case;
      } else {
         return var1 == ah9.byte ? this.byte : null;
      }
   }

   public boolean goto() {
      return this.if;
   }

   public boolean if() {
      return this.if ? false : this.a;
   }

   public boolean do() {
      return this.void > 0.85F;
   }

   public float char() {
      return 0.1F;
   }

   public final int else() {
      return (int)(this.void * 65536.0F);
   }

   public final int a() {
      return (int)(this.b * 65536.0F);
   }

   public final float for() {
      return this.void;
   }

   public final float int() {
      return this.b;
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      this.goto.a(var1, var2, var3, var4);
   }

   public int try() {
      double var1 = (double)ajs.a(this.int(), 0.0F, 1.0F);
      double var3 = (double)ajs.a(this.for(), 0.0F, 1.0F);
      return y7.a(var1, var3);
   }

   public int case() {
      double var1 = (double)ajs.a(this.int(), 0.0F, 1.0F);
      double var3 = (double)ajs.a(this.for(), 0.0F, 1.0F);
      return zf.a(var1, var3);
   }
}
